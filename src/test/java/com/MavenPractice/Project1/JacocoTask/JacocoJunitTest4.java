package com.MavenPractice.Project1.JacocoTask;

import static org.junit.Assert.*;

import org.junit.Test;

import PackJacoco.JacocoClass;

public class JacocoJunitTest4 {

	@Test
	public void remtest() {
		JacocoClass obj4= new JacocoClass();
		int result = obj4.rem(4,3);
		assertEquals(1,result);
	}

}
