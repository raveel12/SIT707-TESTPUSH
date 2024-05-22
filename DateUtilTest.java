package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223302973";
		Assert.assertNull("s223302973", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Raveel Kashif";
		Assert.assertNull("Raveel Kashif", studentName);
	}
//
//	@Test
//	public void testMaxJanuary31ShouldIncrementToFebruary1() {
//		// January max boundary area: max+1
//		DateUtil date = new DateUtil(31, 1, 2024);
//        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
//        date.increment();
//        System.out.println(date);
//        Assert.assertEquals(2, date.getMonth());
//        Assert.assertEquals(1, date.getDay());
//	}
//	
//	@Test
//	public void testMaxJanuary31ShouldDecrementToJanuary30() {
//		// January max boundary area: max-1
//		DateUtil date = new DateUtil(31, 1, 2024);
//        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
//        date.decrement();
//        System.out.println(date);
//        Assert.assertEquals(30, date.getDay());
//        Assert.assertEquals(1, date.getMonth());
//	}
//	
//	@Test
//	public void testNominalJanuary() {
//		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
//        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
//        System.out.println("testJanuaryNominal > " + date);
//        date.increment();
//        System.out.println(date);
//	}
//	
//	/*
//	 * Complete below test cases.
//	 */
//	
//	@Test
//	public void testDayD1Increment()
//	{
//		DateUtil date = new DateUtil(15, 1, 2024);
//		date.increment();
//		Assert.assertEquals(16, date.getDay());
//	}
//	@Test
//	public void testDayD1Decrement()
//	{
//		DateUtil date = new DateUtil(15, 1, 2024);
//		date.decrement();
//		Assert.assertEquals(14, date.getDay());
//	}
//	@Test
//	public void testDayD2Increment()
//	{
//		DateUtil date = new DateUtil(29, 1, 2024);
//		date.increment();
//		Assert.assertEquals(30, date.getDay());
//	}
//	@Test
//	public void testDayD2Decrement()
//	{
//		DateUtil date = new DateUtil(29, 1, 2024);
//		date.decrement();
//		Assert.assertEquals(28, date.getDay());
//	}
//	@Test
//	public void testDayD3Increment()
//	{
//		DateUtil date = new DateUtil(30, 1, 2024);
//		date.increment();
//		Assert.assertEquals(31, date.getDay());
//	}
//	@Test
//	public void testDayD3Decrement()
//	{
//		DateUtil date = new DateUtil(30, 1, 2024);
//		date.decrement();
//		Assert.assertEquals(29, date.getDay());
//	}
//	@Test
//	public void testDayD4Increment()
//	{
//		DateUtil date = new DateUtil(31, 1, 2024);
//		date.increment();
//		Assert.assertEquals(1, date.getDay());
//		Assert.assertEquals(2, date.getMonth());
//	}
//	@Test
//	public void testDayD4Decrement()
//	{
//		DateUtil date = new DateUtil(31, 1, 2024);
//		date.decrement();
//		Assert.assertEquals(30, date.getDay());
//	}
//	@Test
//	public void testMonthM1Increment()
//	{
//		DateUtil date = new DateUtil(15, 4, 2024);
//		date.increment();
//		Assert.assertEquals(16, date.getDay());
//	}
//	@Test
//	public void testMonthM1Decrement()
//	{
//		DateUtil date = new DateUtil(15, 4, 2024);
//		date.decrement();
//		Assert.assertEquals(14, date.getDay());
//	}
//	@Test
//	public void testMonthM2Increment()
//	{
//		DateUtil date = new DateUtil(15, 5, 2024);
//		date.increment();
//		Assert.assertEquals(16, date.getDay());
//	}
//	@Test
//	public void testMonthM2Decrement()
//	{
//		DateUtil date = new DateUtil(15, 5, 2024);
//		date.decrement();
//		Assert.assertEquals(14, date.getDay());
//	}
//	@Test
//	public void testMonthM3Increment()
//	{
//		DateUtil date = new DateUtil(28, 2, 2024);
//		date.increment();
//		Assert.assertEquals(29, date.getDay());
//		
//	}
//	@Test
//	public void testMonthM3Decrement()
//	{
//		DateUtil date = new DateUtil(28, 2, 2024);
//		date.decrement();
//		Assert.assertEquals(27, date.getDay());
//	}
//	@Test
//	public void testYearY1Increment()
//	{
//		DateUtil date = new DateUtil(28, 2, 2021);
//		date.increment();
//		Assert.assertEquals(1, date.getDay());
//		Assert.assertEquals(3, date.getMonth());
//	}
//	@Test
//	public void testYearY1Decrement()
//	{
//		DateUtil date = new DateUtil(28, 2, 2021);
//		date.decrement();
//		Assert.assertEquals(27, date.getDay());
//	}
//	@Test
//	public void testYearY2Increment()
//	{
//		DateUtil date = new DateUtil(15, 1, 2024);
//		date.increment();
//		Assert.assertEquals(16, date.getDay());
//	}
//	@Test
//	public void testYearY2Decrement()
//	{
//		DateUtil date = new DateUtil(15, 1, 2024);
//		date.decrement();
//		Assert.assertEquals(14, date.getDay());
//	}
}
