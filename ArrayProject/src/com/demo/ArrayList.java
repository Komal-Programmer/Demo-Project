package com.demo;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		List<String> obj=Arrays.asList("Vishal","Komal","Rohit","Pritish");
		
		System.out.println(obj);
		for(String str: obj) {
			System.out.println(str);
		}

	}

}
