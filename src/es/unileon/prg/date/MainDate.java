package es.unileon.prg.date;

public class MainDate
{	
	public static void main(String args[])
	{
		try{
			Date date=new Date(5,1,2017);
			Date date2=new Date(14,1,2017);
			String firstofjanuary="domingo";

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
//revisar----->
		System.out.println(date.dateUntilEndMonth());
		System.out.println(date2.dateUntilEndMonth());

			System.out.println();

		System.out.println(date.sameDaysOfMonth());
		System.out.println(date2.sameDaysOfMonth());

			System.out.println();

		System.out.println("The number of days since the first day of the year until "+date.printDate()+" is: " +date.sinceFirstDayOfYear());
		System.out.println("The number of days since the first day of the year until "+date2.printDate()+" is: " +date2.sinceFirstDayOfYear());

			System.out.println();

		System.out.println("The number of attempts needed to generate a random date equals "+date.printDate()+" is: "+date.randomDate());
		System.out.println("The number of attempts needed to generate a random date equals "+date2.printDate()+" is: "+date2.randomDate());


			System.out.println();
		
		System.out.println("The day "+date.printDate()+" is: "+date.dayOfWeek(firstofjanuary));
		System.out.println("The day "+date2.printDate()+" is: "+date2.dayOfWeek(firstofjanuary));


	
		}catch (Exception error){
			System.err.println(error.getMessage());
		
	}
	}
}



