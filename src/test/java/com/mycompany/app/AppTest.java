package com.mycompany.app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    /* 
    public void testApp()
    {
        assertTrue( true );
    }
*/
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 3));
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("hello", "hello"));
      String str = "hell";
      assertTrue(new App().search(array, array1, strings, str));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(6,4,8,9,6,6,625));
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("car", "empty"));
      String str = "481";
      assertFalse(new App().search(array, array1, strings, str));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(8,58,21,96));
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("house", "com"));
      String str = "781";
      assertFalse(new App().search(array, array1, strings, str ));
    }

    public void testNull() {
      ArrayList<Integer> array = null;
      ArrayList<Integer> array1 = null;
      ArrayList<String> strings = null;
      String str = null;
      assertFalse(new App().search(array, array1, strings, str ));
    }

    public void testSubstrings() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 3));
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("araba", "arasokak","aracilik","karabas"));
      String str = "ara";
      assertTrue(new App().search(array, array1, strings, str));
    }


}
