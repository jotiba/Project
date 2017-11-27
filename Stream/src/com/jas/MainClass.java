package com.jas;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
	
	public static void main(String[] args) {
	
	List<String> data=new ArrayList<String>();
	data.add("A");
	data.add("B");
	data.add("C");
	data.add("D");
	data.add("E");
	data.add("F");
	data.add("G");
	/*for(String listData:data) {
		System.out.println(listData);
	}*/
	data.parallelStream().forEach(System.out::println);
	
	
	}
}
