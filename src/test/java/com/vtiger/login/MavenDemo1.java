package com.vtiger.login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenDemo1 {
	
	public static  int a=10;
	int b= 20;

		
	@Test
	public void add() {
		System.out.println("SUM");
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub() {
		System.out.println("SUB = "+a);
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void mul() {
		System.out.println("MUL");
		Assert.assertEquals(200, a*b);
	}

}
