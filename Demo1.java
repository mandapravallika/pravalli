package com.jojuskills;

import java.util.ArrayList;

import java.util.stream.Collectors;


public class Demo1 {
 ArrayList<Integer>al =new ArrayList<Integer>();
	
static void storeEvenNumbers(ArrayList<Integer> al) {
	
	ArrayList<Integer> EvenNumbers=(ArrayList<Integer>) al.stream().filter(n->n%2==0).collect(Collectors.toList());
	
	System.out.println(EvenNumbers);
}
}





	

