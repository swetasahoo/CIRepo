package com.niit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    App app;
    
    @Before
    public void init()
    {
    	app=new App();
    }
    
    @Test
    public void positiveSumTest()
    {
    	int result=app.sum(10, 20);
    	assertEquals(30,result);
    }
    @Test
    public void negativeSumTest()
    {
    	int result=app.sum(10, 20);
    	assertNotEquals(50,result);
    }
}
