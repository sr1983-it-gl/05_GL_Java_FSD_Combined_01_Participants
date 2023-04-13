package com.gl.javafsd.interviews.q25;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValueComparator 
	implements Comparator<Map.Entry<String, Float>>{

	@Override
	public int compare(Entry<String, Float> me1, Entry<String, Float> me2) {

		// asc order
		// o1 < o2 [-1]
		// o1 > o2 [+1]
		// o1 == o2 [0]
		
		if (me1.getValue() == me2.getValue()) {
			return 0;
		}else if (me1.getValue() < me2.getValue()) {
			return -1;
		}else {
			return +1;
		}
		
	}

}
