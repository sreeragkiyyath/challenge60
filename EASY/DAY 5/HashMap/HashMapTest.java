package com.challenge.day5;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(10, 100);
		map.put(11, 121);
		map.put(20, 123);
		map.put(30, 134);
		
		System.out.println(map);
		for (Map.Entry<Integer,Integer> entry : map.entrySet() ){ 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		}
		
		
		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<Integer, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }
        
        map.forEach(
        		
        		(k,v) 
        		
        		->
        		
        		
        		System.out.println("Key = "
                + k + ", Value = " + v));
	
	
	
	}

}
