package com.jmcdale.hackerrank.algorithms.regex;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class SplitPhoneNumbersTest extends BaseHackerRankTest{

	@Test
	public void test() {
		String in = "2\n1 877 2638277\n91-011-23413627";
		String out = "CountryCode=1,LocalAreaCode=877,Number=2638277\nCountryCode=91,LocalAreaCode=011,Number=23413627\n";
		runTest(in,out);
	}
	
	@Test
	public void test2() {
		String in = "6\n148-809-2561957985\n188-547-5864327428\n891-454-9195497623\n648-42-380306686\n824-417-6460145493\n489-16-9839392781";
		String out = "CountryCode=148,LocalAreaCode=809,Number=2561957985\nCountryCode=188,LocalAreaCode=547,Number=5864327428\nCountryCode=891,LocalAreaCode=454,Number=9195497623\nCountryCode=648,LocalAreaCode=42,Number=380306686\nCountryCode=824,LocalAreaCode=417,Number=6460145493\nCountryCode=489,LocalAreaCode=16,Number=9839392781\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected){
		super.runTest(in, expected);
		SplitPhoneNumbers.main(null);
		assertEquals(expected, this.getOut());
	}
}
