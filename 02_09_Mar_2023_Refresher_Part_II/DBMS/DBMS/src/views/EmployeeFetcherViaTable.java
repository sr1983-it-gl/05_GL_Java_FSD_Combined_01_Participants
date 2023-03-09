package views;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeFetcherViaTable {

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
		ResultSet resultSet = null;
		try {
			
			connection = DriverManager.getConnection(
				connectionUrl,
				ApplicationConstants.USERNAME,
				ApplicationConstants.PASSWORD);

			System.out.println("Database Connection DONE");
			
			statement = connection.createStatement();

			String selectQuery 
				= "SELECT EMPNO, ENAME, SAL FROM EMP";
			
			resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()) {
				
				int empNo = resultSet.getInt(1);
				String empName = resultSet.getString(2);
				Float salary = resultSet.getFloat(3);
				
				System.out.println(String.format(
					"Emp ID is %d, Emp Name Name is %s, Salary is %f", 
						empNo, empName, salary));
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
