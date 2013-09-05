package com.jmcdale.hackerrank.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class QuickSortTest extends BaseHackerRankTest{

	@Test
	public void testMain() {
		String in = "7\n5 8 1 3 7 9 2";
		String out = "2 3 \n1 2 3 \n7 8 9 \n1 2 3 5 7 8 9\n";
		//TODO Output may be in a different order. The last line is all that really matters. 
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		QuickSort.main(null);
		assertEquals(expected, this.getOut());
	}
}
