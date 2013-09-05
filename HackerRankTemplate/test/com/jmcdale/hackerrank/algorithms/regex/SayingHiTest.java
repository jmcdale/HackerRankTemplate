package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class SayingHiTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "5\nHi Alex how are you doing\nhI dave how are you doing\nGood by Alex\nhidden agenda\nAlex greeted Martha by saying Hi Martha";
		String out = "Hi Alex how are you doing\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		SayingHi.main(null);
		assertEquals(expected, this.getOut());
	}
}
