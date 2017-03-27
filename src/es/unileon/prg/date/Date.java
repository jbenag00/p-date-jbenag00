package es.unileon.prg.date;

//Develop a Date class defined by day, month and year.
public class Date
{
	private int _day;
	private int _month;
	private int _year;
	
	public Date(int day, int month, int year)
	{       
		this._day=day;
		this._month=month;
		this._year=year;
	}	

	public int getDay()
	{
		return this._day;
	}
	
	public int getMonth()
	{
		return this._month;
	}
	
	public int getYear()
	{
		return this._year;
	}
	
	public void setDay(int newDay)
	{
		this._day=newDay;
	}
	
	public void setMonth(int newMonth)
	{
		this._month=newMonth;
	}
	
	public void setYear(int newYear)
	{
		this._year=newYear;
	}
	


//•The isSameDay method
	public boolean isSameDay(Date date2)
	{
		boolean isSameDay=false;
		if(_day==date2.getDay())
		{
			isSameDay=true;
		}
		return isSameDay;
	}



//•The isSameMonth method	
	public boolean isSameMonth(Date date2)
	{
		boolean isSameMonth=false;
		if(_month==date2.getMonth())
		{
			isSameMonth=true;
		}
		return isSameMonth;
	}
//•The isSameYear method	
	public boolean isSameYear(Date date2)
	{
		boolean isSameYear=false;
		if(_year==date2.getYear())
		{
			isSameYear=true;
		}
		return isSameYear;
	}
/*/•The isSame method
	public boolean isSame(Date date2)
	{
		boolean isSameDay=isSameDay();
		boolean isSameMonth=isSameMonth();
		boolean isSameYear=isSameYear();
		boolean isSame=false;
		if(isSameDay==true&&isSameMonth==true&&isSameYear==true)
		{
			isSame=true;
		}
		return isSame;
	}
*/	
//•A method that prints the name of  the month	
	
	public String printMonthName(int month)
	{
		_month=month;
		String op= new String();

		switch(_month)
		{
			case 1:
				op="January";
				break;
			case 2:
				op="February";
				break;
			case 3:
				op="March";
				break;
			case 4:
				op="April";
				break;
			case 5:
				op="May";
				break;
			case 6:
				op="June";
				break;
			case 7:
				op="July";
				break;
			case 8:
				op="Augoust";
				break;
			case 9:
				op="September";
				break;
			case 10:
				op="October";
				break;
			case 11:
				op="November";
				break;
			case 12:
				op="December";
				break;
		}
		System.out.println("The name of month "+month+" is: "+op);
		return op.toString();
	}
//•A method that checks if  the day of  the month is right
	public boolean checkDayOfMonth(int month)
	{	
		boolean checkDayOfMonth=true;
		int days;
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:	
			case 10:
			case 12:
				days=31;
				break;
			case 2:
				days=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default:
				days=0;
		}
		if(days<1||days>31)
		{
			checkDayOfMonth=false;
			System.out.println("Write a correct number of the day.\n");
		}
		return checkDayOfMonth;
	}






		
}

