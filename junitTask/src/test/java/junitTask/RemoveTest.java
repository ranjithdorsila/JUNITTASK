package junitTask;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RemoveTest {
	Remove obj;
	@Before
	public void setup()
	{
		obj=new Remove();
	}

	@Test
	public void test1() 
	{
		assertEquals("BCD",obj.removeA("ABCD"));
	}
	@Test
	public void test2() 
	{
		assertEquals("CD",obj.removeA("AACD"));
	}
	    
}
