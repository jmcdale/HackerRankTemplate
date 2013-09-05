package com.jmcdale.hackerrank.ai.botbuilding;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jmcdale.hackerrank.BaseHackerRankTest;

public class BotSavesPrincessTest2 extends BaseHackerRankTest{

	@Test
	public void botTest1() {
		String in = "5\n2 3\n-----\n-----\np--m-\n-----\n-----";
		String out = "LEFT\n";
		runTest(in,out);
	}
	
	@Override
	public void runTest(String in, String expected) {
		super.runTest(in,expected);
		BotSavesPrincess2.main(null);
		assertEquals(expected, this.getOut());
	}

}
