package com.challenge.day3;

public class LinkedListCore {
	int data;
	LinkedListCore link;
	
	
	public LinkedListCore() {
		
	}
	
	public LinkedListCore(int data) {
		this(data,null);
	}
	
	public LinkedListCore(int data, LinkedListCore lnkLst) {
		super();
		this.data = data;
		link = lnkLst;
	}

	@Override
	public String toString() {
		return "LinkedListCore [data=" + data + ", link=" + link + "]";
	}

	public void addElement(int i) {
		// TODO Auto-generated method stub
		if(data == 0) {
			return;
		}
		else {		
				data = i;
				link = new LinkedListCore(i);
			}		
			link = link;
			
		}
	}
