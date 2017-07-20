package com.test;

import java.util.Stack;

@SuppressWarnings("serial")
public class Tower extends Stack<Integer> {
	public Tower(){
		super();
	}
	
	@Override
	public Integer push(Integer i){
		if(!this.isEmpty() && i>=this.peek())
			throw new IllegalArgumentException();
		super.push(i);
		return i;
	}
}
