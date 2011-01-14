package com.sandwich.koans.suites;

import static com.sandwich.koans.KoanSuite.__;
import static org.junit.Assert.assertEquals;

import com.sandwich.koans.Koan;

public class AboutObjects {

	@Koan(order = 0)
	public void objectEqualsNull(){
		// does a new object instance equal the null keyword?
		assertEquals(new Object().equals(null), __);
	}
	
	@Koan(order = 1)
	public void objectEqualsSelf(){
		Object obj = new Object();
		// does a new object equal itself?
		assertEquals(obj.equals(obj), __);
	}
	
	@Koan(order = 2)
	public void objectIdentityEqualityIsTrueWhenReferringToSameObject(){
		Object objectReference = new Object();
		Object referenceToSameObject = objectReference;
		// does a new object == itself?
		assertEquals(objectReference == referenceToSameObject, __);
	}
	
	@Koan(order = 3)
	public void subclassesOfObjectEqualsMethodIsLooserThanDoubleEqualsOperator(){
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0);
		assertEquals(integer0.equals(integer1), __);
	}
	
	@Koan(order = 4)
	public void doubleEqualsOperatorEvalutesToTrueOnlyWithSameInstance(){
		Integer integer0 = new Integer(0);
		Integer integer1 = integer0; // <- assigning same instance to different reference
		assertEquals(integer0 == integer1, __);
	}
	
	@Koan(order = 5)
	public void doubleEqualsOperatorEvalutesToFalseWithDifferentInstances(){
		Integer integer0 = new Integer(0);
		Integer integer1 = new Integer(0); // <- new keyword is generating new object instance
		assertEquals(integer0 == integer1, __);
	}
}
