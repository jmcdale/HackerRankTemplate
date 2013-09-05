package com.jmcdale.hackerrank.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class InsertionSort2Test extends BaseHackerRankTest{

	@Test
	public void testMain() {
		String in = "6\n1 4 3 5 6 2";
		String out = "1 4 3 5 6 2 \n1 3 4 5 6 2 \n1 3 4 5 6 2 \n1 3 4 5 6 2 \n1 2 3 4 5 6 \n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		InsertionSort2.main(null);
		assertEquals(expected, this.getOut());
	}
}
