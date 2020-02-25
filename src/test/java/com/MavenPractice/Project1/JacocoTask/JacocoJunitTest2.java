package com.MavenPractice.Project1.JacocoTask;

import static org.junit.Assert.*;

import org.junit.Test;

import PackJacoco.JacocoClass;

public class JacocoJunitTest2 {

	@Test
	public void subtest() {
		JacocoClass obj2= new JacocoClass();
		int result = obj2.sub(4,3);
		assertEquals(1,result);
	}

}
