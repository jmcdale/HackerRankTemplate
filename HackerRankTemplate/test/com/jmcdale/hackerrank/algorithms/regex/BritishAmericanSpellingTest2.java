package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class BritishAmericanSpellingTest2 extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "2\nthe odour coming out of the left over food was intolerable\nammonia has a very pungent odor\n1\nodour";
		String out = "2\n";
		runTest(in,out);
	}
	
	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		BritishAmericanSpelling2.main(null);
		assertEquals(expected, this.getOut());
	}
}
