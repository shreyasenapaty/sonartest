package com.zeta.util;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.println("Enter Paragraph");
		String para= user.next();
		char[] arr = para.toCharArray();
		for(int i=0;i<arr.length;i++){
			int asc=arr[i];
			if(48<asc && asc>57){
				int asc1=arr[i+1];
				if(48<asc1 && asc1>57){
					int asc2=arr[i+2];
					if(48<asc1 && asc1>57){
						
					}
					
					else{
						
					}
				}
			}
		}

	}

}
