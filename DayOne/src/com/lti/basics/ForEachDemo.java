package com.lti.basics;

public class ForEachDemo {

	public static void main(String[] args) {
		int arr[] = {1,5,8,9,10};
//		for(int i = 0;i<5;i++) {
//		System.out.println(arr[i]);
//		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		}
}