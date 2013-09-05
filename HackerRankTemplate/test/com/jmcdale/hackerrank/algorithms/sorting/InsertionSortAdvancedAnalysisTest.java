package com.jmcdale.hackerrank.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;
import com.jmcdale.hackerrank.ai.botbuilding.BotSavesPrincess;

public class InsertionSortAdvancedAnalysisTest extends BaseHackerRankTest{

	@Test
	public void testMain() {
		String in = "2\n5\n1 1 1 2 2\n5\n2 1 3 1 2";
		String out = "0\n4\n";
		runTest(in,out);
	}

	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		InsertionSortAdvancedAnalysis.main(null);
		assertEquals(expected, this.getOut());
	}
}
