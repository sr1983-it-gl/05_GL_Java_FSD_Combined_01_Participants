package balance.checker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import views.ApplicationConstants;

public class AccountBalanceChecker {

	public static void main(String[] args) {
		
		String mySqlDriverClassName 
		= ApplicationConstants.DRIVER_CLASS_NAME;
		
		try {
			Class.forName(mySqlDriverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String connectionUrl = ApplicationConstants.CONNECTION_URL;
		
		Connection connection = null;
		Statement statement = null;
//		PreparedStatement pStatement = null;
		ResultSet resultSet = null;
		try {
			
			connection = DriverManager.getConnection(
				connectionUrl,
				ApplicationConstants.USERNAME,
				ApplicationConstants.PASSWORD);

			System.out.println("Database Connection DONE");

			
			statement = connection.createStatement();
			
			int fromAccount = 12345;
			int toAccount = 23456;
			
			String selectQuery = String.format(
					"SELECT ACCOUNT_NO, BALANCE_AMOUNT FROM SAVINGS_ACCOUNT "
					+ "WHERE ACCOUNT_NO IN (%d, %d)", fromAccount, toAccount);		
			
			System.out.println(selectQuery);
			
			resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()) {

				int accountNo = resultSet.getInt(1);
				
				float balanceAmount = resultSet.getFloat(2);
			
				System.out.println(
					String.format("Balance for account no %d is %f", 
						accountNo, balanceAmount));
			}
									
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
			
	}
}
