package com.jmcdale.hackerrank.algorithms.search;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class PairsTest extends BaseHackerRankTest{

	@Test
	public void test1() {
		String in = "5 2 \n1 5 3 4 2 ";
		String out = "3\n";
		runTest(in,out);
	}
	
	@Test
	public void test2() {
		String in = "10 1  \n363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 ";
		String out = "0\n";
		runTest(in,out);
	}
	
	@Override
	public void runTest(String in,String expected){
		super.runTest(in, expected);
		Pairs.main(null);
		assertEquals(expected, this.getOut());
	}

}
