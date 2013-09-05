package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class BritishAmericanSpellingTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "2\nhackerrank has such a good ui that it takes no time to familiarise its environment\nto familiarize oneself with ui of hackerrank is easy\n1\nfamiliarize";
		String out = "2\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		BritishAmericanSpelling.main(null);
		assertEquals(expected, this.getOut());
	}
}
