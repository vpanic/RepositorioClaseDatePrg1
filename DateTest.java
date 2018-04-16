import org.junit.Assert;
import org.junit.Test;




public class DateTest {
	
	Date d=new Date(1,1,2017);

	@Test
	public void testDate(){
		Date d=new Date(1,1,2017);
		Assert.assertEquals(1,d.getDay());
		Assert.assertEquals(1,d.getMonth());
		Assert.assertEquals(2017, d.getYear());
	}
	@Test
	public void testDateCloneDate(){
		Date fecha=new Date(1,1,2017);
		Date d=new Date(fecha);
		Assert.assertEquals(1,d.getDay());
		Assert.assertEquals(1,d.getMonth());
		Assert.assertEquals(2017, d.getYear());
	}
	@Test 
	public void testGetDay(){
		Date d=new Date(1,1,2017);
		Assert.assertEquals(1,d.getDay());
	}
	@Test
	public void testSetDay(){
		
		d.setDay(2);
		Assert.assertEquals(2,d.getDay());
	}
	@Test 
	public void testGetMonth(){
		Date d=new Date(1,1,2017);
		Assert.assertEquals(1,d.getMonth());
	}
	@Test
	public void testSetMonth(){
		
		d.setMonth(4);
		Assert.assertEquals(4,d.getMonth());
	}
	@Test 
	public void testGetYear(){
		Date d=new Date(1,1,2017);
		Assert.assertEquals(2017,d.getYear());
	}
	@Test
	public void testSetYear(){
		d.setYear(4);
		Assert.assertEquals(4,d.getYear());
	}
	
	@Test
	public void testIsSameDay(){
		Assert.assertTrue(d.isSameDay(1));
	}
	@Test
	public void testIsSameMonth(){
		Assert.assertTrue(d.isSameMonth(1));
	}
	@Test
	public void testIsSameYear(){
		Assert.assertTrue(d.isSameYear(2017));
	}
	@Test
	public void testIsSame(){
		Assert.assertTrue(d.isSame(d));
	}
	@Test
	public void getMonthDate(){
		Assert.assertEquals("Enero", d.printsMonth(1));
	}
	@Test
	public void testDaysOfMonth(){
		Assert.assertEquals(31,d.daysOfMonth(1));
	}
	@Test
	public void testSeason(){
		Assert.assertEquals("Winter", d.getSeason(1));
	}
	@Test
	public void testMonthsLeft(){
		Assert.assertEquals(12, d.remainingMonths(d));
	}
	
	@Test
	public void testDaysLeftOfMonth(){
		Date fecha=new Date(23,4,2017);
		Assert.assertEquals(8, d.dayToMonthEnd(fecha));
	}
	/*
	@Test
	public void numRamdomTriesEqualsDate(){
		Assert.assertEquals(89, d.intentsHitDateWhile());
	}*/
	@Test
	public void testDaySinceFirst(){
		Date fecha=new Date(2,2,2018);
		Assert.assertEquals(33,d.daySinceFirstDayOfYear(fecha));
	}
	@Test
	public void dayOfWeek(){
		Assert.assertEquals("Tuesday", d.knowDayIs(d, 1));
	}
	@Test 
	public void testToString(){
		Date fecha=new Date(2,2,2018);
		Assert.assertEquals("Day:"+fecha.getDay()+" Month:"+fecha.getMonth()+" Year:"+fecha.getYear(),fecha.toString(fecha));
	}


		
	

}
