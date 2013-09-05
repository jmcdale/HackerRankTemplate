package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class HackerrankLanguageTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "5\n11011 LUA\n11022 BRAINFUCK\n11044 X\n11111 CLUE\n11112 JAVASCRIPTS";
		String out = "VALID\nVALID\nINVALID\nINVALID\nINVALID\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		HackerrankLanguage.main(null);
		assertEquals(expected, this.getOut());
	}
}
