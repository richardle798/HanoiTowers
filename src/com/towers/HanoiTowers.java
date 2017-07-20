package com.towers;

import java.util.Stack;

import com.test.Tower;

public class HanoiTowers {
	public Tower left;
	public Tower center;
	public Tower right;
	
	public HanoiTowers(){
		left = new Tower();
		center = new Tower();
		right = new Tower();
	}
	
	public boolean pushToLeft(Integer i){
		try{
		left.push(i);
		return true;
		}
		catch(IllegalArgumentException e){
			return false;
		}
	}
	
	public void doHanoiTowers(){
		moveTowers(left,right,left.size());
	}
	
	private void moveTowers(Stack<Integer> to, Stack <Integer> from, int numToMove){
		for(int i=0;i<numToMove;i++){
			center.push(to.pop());
			moveTowers(from,to,i);
			from.push(center.pop());
			moveTowers(to,from,i);
		}
	}
	
	public String toString(){
		String str = "Right Tower:";
		while(!right.empty()){
			str += " "+ right.pop();
		}
		return str;
	}
}
