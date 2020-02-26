package com.MavenPractice.Project1.JacocoTask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void addtest() {
		App obj1= new App();
		int result= obj1.add(3,4);
		assertEquals(7,result);
	}
	@Test
	public void subtest() {
		App obj1= new App();
		int result= obj1.sub(4,3);
		assertEquals(1,result);
	}
	@Test
	public void multest() {
		App obj1= new App();
		int result= obj1.mul(3,4);
		assertEquals(12,result);
	}
	@Test
	public void remtest() {
		App obj1= new App();
		int result= obj1.rem(4,3);
		assertEquals(1,result);
	}
}
