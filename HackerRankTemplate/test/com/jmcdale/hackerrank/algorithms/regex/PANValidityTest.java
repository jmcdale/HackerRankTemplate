package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class PANValidityTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "3\nABCDS1234Y\nABAB12345Y\navCDS1234Y";
		String out = "YES\nNO\nNO\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		PANValidity.main(null);
		assertEquals(expected, this.getOut());
	}
}
