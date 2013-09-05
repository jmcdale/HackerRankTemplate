package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class UtopianIDTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "2\nabc012333ABCDEEEE\n0123AB";
		String out = "VALID\nINVALID\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		UtopianID.main(null);
		assertEquals(expected, this.getOut());
	}
}
