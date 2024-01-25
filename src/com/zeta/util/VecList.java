package com.zeta.util;

import java.util.Vector;

import com.zeta.helper.Helper;

public class VecList {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(new Integer(10));
		vec.add(new Integer(20));
		vec.add(new Integer(30));
		vec.add(new Integer(40));
		vec.add(new Integer(10));
		Helper.vec(vec);
		Vector<Integer> vec1=new Vector<Integer>();
		vec1.add(new Integer(10));
		Helper.vec(vec1);
		vec.removeAll(vec1);
		Helper.vec(vec);
		Vector<Integer> vec2=new Vector<Integer>();
		vec2.add(new Integer(20));
		vec2.add(new Integer(30));
		vec.retainAll(vec2);
		vec.add(null);
		Helper.vec(vec);
		Helper.vec(vec);
			
		// TODO Auto-generated method stub

	}

}
