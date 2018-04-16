
public class Main {

	public static void main(String[] args) {
		
		Date fecha =new Date(12,5,2018);
		System.out.println(fecha.isSameDay(12));
		System.out.println(fecha.isSameMonth(5));
		System.out.println(fecha.isSameYear(2018));
		System.out.println(fecha.isSame(fecha));
		
		fecha.dayToMonthEnd(fecha);
		fecha.daySinceFirstDayOfYear(fecha);
		fecha.intentsHitDateDoWhile();
		fecha.intentsHitDateWhile();
		fecha.remainingMonths(fecha);
		
		
		System.out.println(fecha.correctDate(12, 2,2000));
		
		fecha.knowDayIs(fecha, 5);
		System.out.println(fecha.passToString(11));
		
		
	}

}
