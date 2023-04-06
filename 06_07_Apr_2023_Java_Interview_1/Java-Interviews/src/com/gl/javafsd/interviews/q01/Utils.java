package com.gl.javafsd.interviews.q01;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static boolean containsIgnoreCase(
			List<String> list, String targetElement) {
			
			for (String element : list) {
				
				if (element.equals(targetElement)) {
					
					return true;
				}else {
					
					if (element.equalsIgnoreCase(targetElement)) {
						return true;
					}else {
						continue;
					}
				}
			}
			return false;
			
		}
	
	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		
		if (!containsIgnoreCase(colors, "Blue")) {
			colors.add("Blue");
		}

		if (!containsIgnoreCase(colors, "BLUE")) {
			colors.add("BLUE");
		}

		if (!containsIgnoreCase(colors, "red")) {
			colors.add("red");
		}

		if (!containsIgnoreCase(colors, "RED")) {
			colors.add("RED");
		}


		if (!containsIgnoreCase(colors, "GREEN")) {
			colors.add("GREEN");
		}

		if (!containsIgnoreCase(colors, "Green")) {
			colors.add("Green");
		}
		
		System.out.println(colors);
		
	}
	
}
