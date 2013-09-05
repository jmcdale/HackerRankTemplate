package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class FindHackerrankTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "4\ni love hackerrank\nhackerrank is an awesome place for programmers\nhackerrank\ni think hackerrank is a great place to hangout";
		String out = "2\n1\n0\n-1\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		FindHackerrank.main(null);
		assertEquals(expected, this.getOut());
	}
}
