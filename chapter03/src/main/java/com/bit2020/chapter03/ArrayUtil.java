package com.bit2020.chapter03;

public class ArrayUtil {
	// int 배열을 double 배열로 변환
	public static double[] intToDouble(int[] source) {
		return null;
	}
	
	// double 배열을 int 배열로 변환
	public static int[] doubleToInt(double[] source) {
		return null;
	}
	
	// int 배열 두갤ㄹ 연결한 새로운 배열 리턴
	public static int[] concat(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			result[index++] = a[i];
		}
		
		for(int i = 0; i < b.length; i++) {
			result[index++] = b[i];
		}
		
		return result;
	}

}
