package com.zeta.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.zeta.helper.Helper;

public class linkedList {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add(new Integer(22));
		ll.add(new Integer(44));
		ll.add(new String("Hello"));
		ll.add(new String("World"));
	    Helper.list(ll);
		Collections.shuffle(ll);
		Helper.list(ll);
		Iterator it=ll.iterator();
		while(it.hasNext()){
			Helper.obj(it.next());
		}
		Iterator it1=ll.descendingIterator();
		while(it1.hasNext()){
			Helper.obj(it1.next());
		}
		// TODO Auto-generated method stub

	}

}
