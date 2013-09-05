package com.jmcdale.hackerrank.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class InsertionSort1Test extends BaseHackerRankTest{

	@Test
	public void testMain() {
		String in = "5\n2 4 6 8 3";
		String out = "2 4 6 8 8 \n2 4 6 6 8 \n2 4 4 6 8 \n2 3 4 6 8 \n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		InsertionSort1.main(null);
		assertEquals(expected, this.getOut());
	}
}
