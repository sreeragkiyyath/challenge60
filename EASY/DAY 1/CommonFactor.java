package com.challenge.day1;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.*;

public class CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two numbers :-");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();	
		int runResult = new CommonFactor().doRun(str);
		System.out.println(runResult + "]]]]]]]");
		sc.close();
	}
	
	public int doRun(String str) {
		int count=0;
		String[] numbers = (str.split(" "));;
		ArrayList a1 = calculate(Integer.parseInt(numbers[0]));
		ArrayList a2 = calculate(Integer.parseInt(numbers[1]));
		if(a1.size()>a2.size()) {
			for (Object object : a1) {
				if(a2.contains(object)) {
					count++;
				}
			}
		}else {	
			for (Object object : a2) {
				if(a1.contains(object)) {
					count++;		
				}
			}
		}
	return count;
	}

	private ArrayList<Integer> calculate(int parseInt) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(int i = 1 ; i<=parseInt/2; ++i) {
		if(parseInt % i==0) {
			tmp.add(i);
		}

		}
		System.out.println("Numbers --> "+tmp.size());
		return tmp;
	}

}
