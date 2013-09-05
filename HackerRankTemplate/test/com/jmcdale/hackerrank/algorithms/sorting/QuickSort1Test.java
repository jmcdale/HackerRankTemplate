package com.jmcdale.hackerrank.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class QuickSort1Test extends BaseHackerRankTest{

	@Test
	public void testMain() {
		String in = "5\n4 5 3 7 2";
		String out = "3 2 4 5 7 \n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		QuickSort1.main(null);
		assertEquals(expected, this.getOut());
	}
}
