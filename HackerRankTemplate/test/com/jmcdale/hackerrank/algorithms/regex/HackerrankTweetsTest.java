package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class HackerrankTweetsTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "4\nI love #hackerrank\nI just scored 27 points in the Picking Cards challenge on #HackerRank\nI just signed up for summer cup @hackerrank\ninteresting talk by hari, co-founder of hackerrank";
		String out = "4\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		HackerrankTweets.main(null);
		assertEquals(expected, this.getOut());
	}
}
