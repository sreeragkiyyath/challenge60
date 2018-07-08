package com.challenge.day4;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
  
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());         
      	int[] inputArray= new  int[size];
      	int[] outArray= new  int[size];
        String values = br.readLine();
        String[] input = values.split(" ");
        int i = 0;
        for (String string : input) {
        	inputArray[i]= Integer.parseInt(string);
        	i++;
		}

        processd(inputArray);
        processValues(inputArray, outArray);
    }

	private static void processd(int[] inputArray) {
		
		
	}

	private static void processValues(int[] inputArray,int[] out) {
		
		HashMap<Integer, Integer> hmp = new HashMap<>();
		for(int i = 0; i<inputArray.length; i++) {
			out[i] =Math.abs(inputArray[i]); 
			hmp.put(out[i], inputArray[i]);	
		}
		Arrays.sort(out);
		for(int i = 0; i<out.length; i++) {		 
			System.out.println(hmp.get(out[i]));
		}
	}
}

