package com.zeta.helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import org.apache.log4j.Logger;

public class Helper {
	static Logger lg=Logger.getLogger(Helper.class);
	public static void err(){
		lg.warn("Error");
	}
	public static void msg(String str){
		lg.info(str);
	}
	public static void arr1(ArrayList arr){
		lg.info(arr);
	}
	public static void vec(Vector vec){
		lg.info(vec);
	}
	public static void list(LinkedList vec){
		lg.info(vec);
	}
	public static void num(int a){
		lg.info(a);
	}
	public static void obj(Object a){
		lg.info(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
