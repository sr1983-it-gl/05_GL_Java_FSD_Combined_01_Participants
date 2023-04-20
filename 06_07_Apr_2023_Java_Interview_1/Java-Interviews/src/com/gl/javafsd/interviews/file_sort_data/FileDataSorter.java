package com.gl.javafsd.interviews.file_sort_data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDataSorter {

	public static void main(String[] args) {
		
		String filename = ".\\\\sample-numbers.txt";
		List<Integer> fileContents 
			= readContentsFromFile(filename);
	
		System.out.println(fileContents);
		
		Collections.sort(fileContents);
		
		System.out.println("After Sorting ->");
		System.out.println(fileContents);
		
		writeContentsToFile(filename, fileContents);
//		writeContentsToFile("sample-numbers-v2.txt", fileContents);
	}
	
	
	static List<Integer> readContentsFromFile(String filename) {
		
		List<Integer> intList = new ArrayList<>();
		
		FileReader fReader = null;
		BufferedReader bReader = null;
		
		try {
			fReader = new FileReader(filename);
			bReader = new BufferedReader(fReader);
			
			while (true) {
			
				String aLineFromFile = bReader.readLine();
				if (aLineFromFile == null) {
					break;
				}
				
				aLineFromFile = aLineFromFile.trim();
				
				Integer intObj = Integer.parseInt(aLineFromFile);
				intList.add(intObj);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (bReader != null) {
					bReader.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if (fReader != null) {
					fReader.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return intList;
	}
	
	static void writeContentsToFile(String filename, List<Integer> intList) {
		
		FileWriter fWriter = null;
		PrintWriter pWriter = null;
		
		try {
			fWriter = new FileWriter(filename);			
			pWriter = new PrintWriter(fWriter);
			
			for (Integer element : intList) {
				pWriter.println(element);				
			}						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if (pWriter != null) {
				pWriter.close();				
			}
			
			try {
				
				if (fWriter != null) {
					fWriter.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
