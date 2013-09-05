package com.jmcdale.hackerrank;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public abstract class BaseHackerRankTest {
	
	InputStream origIn;
	PrintStream origOut;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		origIn = System.in;
		origOut = System.out;
	}

	@After
	public void tearDown() throws Exception {
		System.setIn(origIn);
		System.setOut(origOut);
	}
	
	public void runTest(String in, String expected){
		setStringIn(in);
		initOut();
	}
	
	public void setStringIn(String in){
		try {
			System.setIn(new ByteArrayInputStream(in.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			fail("UnsupportedEncodingException");
		}
	}
	
	private ByteArrayOutputStream bos;
	
	public void initOut(){
		bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));
	}
	
	public String getOut(){
		try {
			return bos.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			fail("UnsupportedEncodingException");
			return null;
		}
	}

}
