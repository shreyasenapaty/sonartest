package com.zeta.pojo;
import java.util.Scanner;

import com.zeta.helper.*;
public class zetapojo {
	
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	public void main (String [] args){
		
		Scanner user = new Scanner(System.in);
		Helper.msg("Enter Name");
		String Me= user.next();
		setName(Me);
		Helper.msg(getName());
		
	}

}
