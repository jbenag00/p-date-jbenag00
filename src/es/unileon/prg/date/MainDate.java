package es.unileon.prg.date;

public class MainDate
{
	public static void main(String args[])
	{
		Date date=new Date(27,3,2017);
		Date date2=new Date(28,3,2018);
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());

		System.out.println();

		System.out.println(date2.getDay());
		System.out.println(date2.getMonth());
		System.out.println(date2.getYear());

	}
}



