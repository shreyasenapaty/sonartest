package com.training;

import com.zeta.helper.*;
import com.exception.*;

public class test2 {
	public static void divide(int a ,int b)throws customException {
		int i=a/b;
		if (b==1){
			throw new customException("Result is same number");
		}
		else {
			Helper.msg(Integer.toString(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
        	divide(5,2);
        		
        }
        catch(customException e){
        	Helper.err();
        	String err=e.getMessage();
        	Helper.msg(err);
        }
        
	}

}
