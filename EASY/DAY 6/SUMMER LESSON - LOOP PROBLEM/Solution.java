package com.challenge.day6;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) throws IOException {
    	  Scanner scan = new Scanner(System.in);
    	  
    	//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] c = new int[n];

        String[] cItems = scan.nextLine().split(" ");

        for (int cItr = 0; cItr < n; cItr++) {
            int cItem = Integer.parseInt(cItems[cItr].trim());
            c[cItr] = cItem;
        }

        int[] result = howManyStudents(m, c);
/*
        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();*/
    }
    
    public static int[] howManyStudents(int m, int[] c) {
        // Return an array denoting the number of students taking each class.
    	/*
 		4-students    3-subjects
		2 2 0 2       --->  each student like following subject;   ===  output is the count
		{ 0,0,2 }

    	  
    	 * */
    	
    	
    	System.out.println(m + "ds"+ c);  	
    	
    	int[] abac = new int [m];
    	int j=0;
    		
    		for (int i = 0; i <m;i++) {
    			// 0 1 2 3
			int like = 1;
			for(int val :c) {	    			
    			// 0 1 2 1
				if (val==i) {
    				abac[j] = like; 
    				like++;
    			}
    			
    		}
			j++;
    	}
    	System.out.println("{ ");
    	for(int i : abac) {
    		System.out.print(i+",");
    	}
    	System.out.println(" }");
    	return abac;
    }
}