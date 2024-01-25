package com.zeta.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import com.zeta.helper.*;

public class ArrList {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Integer(34));
		ls.add(new Integer(44));
		ls.add(new Integer(54));
		ls.add(new Integer(34));
		ls.add(new String("Zeta"));
		Helper.arr1(ls);
		Helper.num(ls.size());
		Helper.obj(ls.get(3));
		ArrayList ls1=new ArrayList();
		ls1.add(new Integer(34));
		ls.removeAll(ls1);
		ls.set(1, 100);
		Helper.arr1(ls);
		Helper.arr1(ls);
		ls.remove(2);
		ls.add(new Integer(54));
		Collections.sort(ls);
		Helper.arr1(ls);
		ListIterator lt=ls.listIterator();
		while(lt.hasNext()){
			Helper.obj(lt.next());
		}
		
		
		

	}

}
