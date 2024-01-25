package com.zeta.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.zeta.helper.Helper;

public class set {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Integer(34));
		ls.add(new Integer(44));
		ls.add(new Integer(54));
		ls.add(new Integer(34));
		HashSet h= new HashSet();
		h.addAll(ls);
		Helper.obj(h);
		
		TreeSet ts=new TreeSet();
		ts.add(40);
		ts.add(50);
		ts.add(32);
		Helper.obj(ts.headSet(55));
	 
		
		// TODO Auto-generated method stub

	}

}
