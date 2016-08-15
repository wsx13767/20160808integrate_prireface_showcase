package controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import controller.BuildOrderBean;
 

public class BuildOrderBeanTest {
	BuildOrderBean component ;
	@Before
	public void setUp() throws Exception {
		component =new BuildOrderBean();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testAdd() throws Exception {
		int n = component.add();
		Assert.assertEquals(1, n);
	}

}
