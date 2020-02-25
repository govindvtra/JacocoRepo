package com.MavenPractice.Project1.JacocoTask;

import static org.junit.Assert.*;

import org.junit.Test;

import PackJacoco.JacocoClass;

public class JacocoJunitTest1 {

	@Test
	public void addtest() {
		JacocoClass obj1= new JacocoClass();
		int result= obj1.add(3,4);
		assertEquals(7,result);
	}

}
