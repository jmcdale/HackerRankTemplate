package com.jmcdale.hackerrank.algorithms.search;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class MedianTest extends BaseHackerRankTest{

	
	@Test
	public void test() {
		String in = "7 \nr 1 \na 1 \na 2 \na 1 \nr 1 \nr 2 \nr 1";
		String out = "Wrong!\n1\n1.5\n1\n1.5\n1\nWrong!\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		Median.main(null);
		assertEquals(expected, this.getOut());
	}
}
