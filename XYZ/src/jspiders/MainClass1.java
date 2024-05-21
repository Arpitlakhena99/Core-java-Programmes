package jspiders;

import java.util.*;

//import java.util.LinkedList;

public class MainClass1 {
	public static void main(String[] args) {
		try {
			System.out.println("Loading......");
			Class.forName("java.util.LinkedList");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LinkedList l1 ;
	}
}
