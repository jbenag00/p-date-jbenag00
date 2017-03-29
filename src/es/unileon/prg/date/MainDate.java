package es.unileon.prg.date;

public class MainDate
{	
	public static void main(String args[])
	{
		try{
			Date date=new Date(10,6,2017);
			Date date2=new Date(10,6,2017);

			System.out.println(date.getDay());
			System.out.println(date.getMonth());
			System.out.println(date.getYear());
	
			System.out.println();
		
			System.out.println(date2.getDay());
			System.out.println(date2.getMonth());
			System.out.println(date2.getYear());
	
			System.out.println();
			System.out.println("Are the days same?: "+date.isSameDay(date2));
			System.out.println("Are the months same?: "+date.isSameMonth(date2));
			System.out.println("Are the years same?: "+date.isSameYear(date2));
			System.out.println("Are the dates same?: "+date.isSame(date2));

			System.out.println();
		
			System.out.println("The name of month "+date.getMonth()+" is: "+date.printMonthName(date.getMonth()));
			System.out.println("The name of month "+date2.getMonth()+" is: "+date2.printMonthName(date2.getMonth()));

			System.out.println();
			System.out.println("it is right the day "+date.getDay()+"?"+date.checkDaysOfMonth(date.getDay()));
System.out.println("it is right the day "+date2.getDay()+"?"+date2.checkDaysOfMonth(date2.getDay()));

			System.out.println();

			System.out.println("The season of "+date.printDate()+" is: "+date.seasonOfYear());
			System.out.println("The season of "+date2.printDate()+" is: "+date2.seasonOfYear());

			System.out.println();

			System.out.println("The first date is "+date.printDate());
			System.out.println("The second date is "+date2.printDate());

			System.out.println();

			System.out.println("Months since "+date.printMonthName(date.getMonth())+" until the end of the year:\n"+date.monthUntilEndYear());
			System.out.println("Months since "+date2.printMonthName(date2.getMonth())+" until the end of the year:\n"+date2.monthUntilEndYear());

			System.out.println();

		System.out.println(date.dateUntilEndMonth());
		System.out.println(date2.dateUntilEndMonth());

			System.out.println();

		System.out.println(date.sameDaysOfMonth());
		System.out.println(date2.sameDaysOfMonth());

			System.out.println();

		System.out.println(date.sinceFirstDayOfYear());
		System.out.println(date2.sinceFirstDayOfYear());

			System.out.println();

	
		}catch (Exception error){
			System.out.println(error.getMessage());
		
	}
	}
}



