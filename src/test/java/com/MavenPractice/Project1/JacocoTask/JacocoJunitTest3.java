package com.MavenPractice.Project1.JacocoTask;

import static org.junit.Assert.*;

import org.junit.Test;

import PackJacoco.JacocoClass;

public class JacocoJunitTest3 {

	@Test
	public void multest() {
		JacocoClass obj3= new JacocoClass();
		int result = obj3.mul(4,3);
		assertEquals(12,result);
	}

}
