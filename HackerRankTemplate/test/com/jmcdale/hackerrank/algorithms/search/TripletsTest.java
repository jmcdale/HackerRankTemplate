package com.jmcdale.hackerrank.algorithms.search;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class TripletsTest extends BaseHackerRankTest{

	@Test
	public void test1() {
		runTest("6\n1 1 2 2 3 4","4\n");
	}
	
	@Test
	public void test2() {
		runTest("10\n1 1 5 4 3 6 6 5 9 10","28\n");
	}
	
	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		Triplets.main(null);
		String s = this.getOut();
		assertEquals(expected, s);
	}

}
