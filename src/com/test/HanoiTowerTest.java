package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.towers.HanoiTowers;

public class HanoiTowerTest {

	@Test
	public void testTowerPush(){
		Tower tower = new Tower();
		tower.push(5);
		tower.push(1);
		try{
			tower.push(4);
			fail("Should not allow pushing higher number on top of lower number");
		}
		catch(IllegalArgumentException e){
		}
	}
	
	@Test
	public void testThreeNumbers(){
		HanoiTowers hanoiTowers = new HanoiTowers();
		hanoiTowers.pushToLeft(5);
		hanoiTowers.pushToLeft(3);
		hanoiTowers.pushToLeft(1);
		
		hanoiTowers.doHanoiTowers();
		assertEquals("Right Tower did not match expected value","Right Tower: 1 3 5",hanoiTowers.toString());
	}
	
	@Test
	public void testFiveNumbers(){
		HanoiTowers hanoiTowers = new HanoiTowers();
		hanoiTowers.pushToLeft(5);
		hanoiTowers.pushToLeft(4);
		hanoiTowers.pushToLeft(3);
		hanoiTowers.pushToLeft(2);
		hanoiTowers.pushToLeft(1);
		
		hanoiTowers.doHanoiTowers();
		assertEquals("Right Tower did not match expected value","Right Tower: 1 2 3 4 5",hanoiTowers.toString());
	}
	
	@Test
	public void testTenNumbers(){
		HanoiTowers hanoiTowers = new HanoiTowers();
		hanoiTowers.pushToLeft(10);
		hanoiTowers.pushToLeft(9);
		hanoiTowers.pushToLeft(8);
		hanoiTowers.pushToLeft(7);
		hanoiTowers.pushToLeft(6);
		hanoiTowers.pushToLeft(5);
		hanoiTowers.pushToLeft(4);
		hanoiTowers.pushToLeft(3);
		hanoiTowers.pushToLeft(2);
		hanoiTowers.pushToLeft(1);
		
		hanoiTowers.doHanoiTowers();
		assertEquals("Right Tower did not match expected value","Right Tower: 1 2 3 4 5 6 7 8 9 10",hanoiTowers.toString());
	}
}
