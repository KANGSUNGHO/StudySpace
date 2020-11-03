package com.bit2020.chapter03;

public class TestArrayUtil {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {100,200,300};
		
		int[] c = ArrayUtil.concat(a,b);
		if(c[0] == a[0] && c[3] == b[0]) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}

	}

}
