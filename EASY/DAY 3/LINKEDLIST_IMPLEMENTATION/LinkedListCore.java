package com.challenge.day3;

public class LinkedListCore {
	
	LinkedListCore start, firstNode;	
	int data;
	LinkedListCore link = null;
	
	public LinkedListCore() {	
	}
	
	public LinkedListCore(int data) {
		this(data,null);
	}
	
	public LinkedListCore(int data, LinkedListCore next) {
		super();
		this.data = data;
		this.link = next;
		firstNode =  this;
		start = this;
	}
	
	@Override
	public String toString() {
		return "LinkedListCore [data=" + data + ", link=" + link + "]";
	}

	public void addElement(int nodeData) {
		if(start==null) {
			return;
		} else {
		LinkedListCore	item = new LinkedListCore(nodeData);
			while(start.link!=null) {
				start = start.link;				
			}
			start.link = item;
			if(firstNode.link==null) {
				firstNode.link=item;
			}
		}	
	}
	
	public void addFirst(int nodeData) {
		if(start==null) {
			return;
		}
		LinkedListCore	item = new LinkedListCore(nodeData);
		item.link= firstNode;
		firstNode=item;
	}
	
	public void process() {
		LinkedListCore temp= firstNode;
		while (temp.link!=null) {
			System.out.println(temp.data + "  -->");
			temp = temp.link;
		}
		System.out.println(temp.data + " : is the linkedlist");
	}
	
	public void getNumberOfElements() {
		int size = 0;
		LinkedListCore temp= firstNode;
		while (temp.link!=null) {
			//System.out.println(temp.data + "  -->");
			temp = temp.link;
			size++;
		}
		System.out.println((size + 1 )+ "is the linked list size" );
	}
	
}

