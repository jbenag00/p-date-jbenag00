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
//•The isSame method
	public boolean isSame(Date date2)
	{
		boolean isSame=false;
		if(isSameDay(date2)&&isSameMonth(date2)&&isSameYear(date2))
		{
			isSame=true;
		}
		return isSame;
	}
	
//•A method that prints the name of  the month	
	
	public String printMonthName(int month)
	{
		String op= new String();

		switch(month)
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
		return op;
	}
//•A method that checks if  the day of  the month is right
	public boolean checkDaysOfMonth(int month)//necesito un int
	{	_month=month;
		boolean checkDaysOfMonth=true;
		int days;
		switch(_month)
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
		if(days<1||days>31)//NO FUNCIONA
		{
			checkDaysOfMonth=false;
			System.out.println("Write a correct number of the day.\n");
		}
		return checkDaysOfMonth;
	}


//•A method that prints the season of  this month	
	public String seasonOfYear()
	{
		String seasonOfYear=new String();
		switch(getMonth())
		{
			case 1:
			case 2:
				seasonOfYear=("Winter.");
				break;
			case 3:
				if(getDay()<21)
				{
					seasonOfYear=("Winter.");
				}
					else
					{
						seasonOfYear=("Spring.");
					}
				break;
			case 4:
			case 5:	
				seasonOfYear=("Spring.");
				break;
			case 6:
				if(getDay()<21)
				{
					seasonOfYear=("Spring.");
				}
					else
					{
						seasonOfYear=("Summer.");
					}
				break;
			case 7:
			case 8:
				seasonOfYear=("Summer.");
			case 9:
				if(getDay()<23){
					seasonOfYear=("Summer.");
				}
				else{
					seasonOfYear=("Autumn.");
				}
				break;
			case 10:
			case 11:	
				seasonOfYear=("Autumn.");
				break;
			case 12:
				if(getDay()<22){
					seasonOfYear=("Autumn.");
				}
					else
					{
						seasonOfYear=("Winter.");		
					}
				break;
		}
		return seasonOfYear;
	}	


	
//•Write a method in Date class that prints a date.
	public String printDate()
	{
		StringBuffer date=new StringBuffer();
		date.append(getDay()+"/"+printMonthName(getMonth())+"/"+getYear());
		return date.toString();
	}



//For a date, print the months left until the end of the year.
	public String monthUntilEndYear()
	{
		StringBuffer output=new StringBuffer();
		int month=getMonth();;
		for(int i=month+1;i<=12;i++)
		{
			output.append(printMonthName(i)+"\n");
		}
		return output.toString();
	}
		
}

