package com.MyProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1()
	{
		LoginApp l = new LoginApp();
		Assert.assertEquals(0, l.validateLogin("abc", "abc@123"));
	}
	
	@Test
	public void test2()
	{
		LoginApp l = new LoginApp();
		Assert.assertEquals(1, l.validateLogin("abc", "abc123"));
		
	}

}
