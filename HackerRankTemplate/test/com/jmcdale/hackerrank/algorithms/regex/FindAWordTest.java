package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class FindAWordTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "1\nfoo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.\n1\nfoo";
		String out = "6\n";
		runTest(in,out);
	}
	
	@Test
	public void test2() {
		String in = "2\nfoo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.\nfoo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.\n2\nfoo\nbar";
		String out = "12\n12\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		FindAWord.main(null);
		assertEquals(expected, this.getOut());
	}
}
