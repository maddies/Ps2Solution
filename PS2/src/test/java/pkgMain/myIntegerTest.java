package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class myIntegerTest {

	@Test
	public void testEven() {
		
		MyInteger myInt = new MyInteger(2);
		MyInteger myInt2 = new MyInteger(3);

		assertTrue(myInt.isEven());
		assertFalse(myInt2.isEven());
	}

	@Test
	public void testOdd() {
		
		MyInteger myInt = new MyInteger(11);
		MyInteger myInt2 = new MyInteger(100);

		assertTrue(myInt.isOdd());
		assertFalse(myInt2.isOdd());
	}
	
	@Test
	public void testEquals() {
		
		MyInteger myInt = new MyInteger(5);
		MyInteger myInt2 = new MyInteger(7);

		assertTrue(myInt.isEquals(5));
		assertFalse(myInt2.isEquals(5));
	}
	
	@Test
	public void testPrime() {
		
		MyInteger myInt = new MyInteger(1);
		MyInteger myInt2 = new MyInteger(50);

		assertTrue(myInt.isPrime());
		assertFalse(myInt2.isPrime());
	}
}