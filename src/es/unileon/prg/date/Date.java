package es.unileon.prg.date;

//Develop a Date class defined by day, month and year.
public class Date
{
	private int _day;
	private int _month;
	private int _year;
	
	public Date(int day, int month, int year)throws Excepcion
	{
		StringBuffer message= new StringBuffer();
		if(day<1||day>31){
			message.append("Write a correct number of the day.\n");
		}

		if(month<1||month>12){
			message.append("Write a correct number of month.\n");
		}else if ((day>30)&&(month==4||month==6||month==9||month==11)){
			message.append("The month "+month+" only have 30 days\n");
		}else if ((day>28)&&(month==2)){
			message.append("The month "+month+" only have 28 days\n");
		}else if(year<1){
			message.append("The year "+year+" must be possitive.\n");
		}

		if(message.length()!=0){
			throw new Excepcion(message.toString());
		}else{
			this._day=day;
			this._month=month;
			this._year=year;
		}
	
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
	
//Para que utilizamos los set?modificar el que?
	public void setDay(int newDay)
	{
		this._day = newDay;

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
		if(this._day==date2.getDay()){
			isSameDay=true;
		}
		return isSameDay;
	}
/*SIN SENTENCIA IF DUDA PREGUNTAR	
	public boolean isSameDay(Date date2)
	{

		return this._day==date2.getDay();

	}
*/


//•The isSameMonth method	
	public boolean isSameMonth(Date date2)
	{
		boolean isSameMonth=false;
		if(this._month==date2.getMonth()){
			isSameMonth=true;
		}
		return isSameMonth;
	}
//•The isSameYear method	
	public boolean isSameYear(Date date2)
	{
		boolean isSameYear=false;
		if(_year==date2.getYear()){
			isSameYear=true;
		}
		return isSameYear;
	}
//•The isSame method
	public boolean isSame(Date date2)
	{
		boolean isSame=false;
		if(isSameDay(date2)&&isSameMonth(date2)&&isSameYear(date2)){
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
	public int daysOfMonth(int month)
	{
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
		return days;
	}
	public boolean checkDaysOfMonth(int day)
	{
		boolean checkDaysOfMonth=false;
		if(day>0&&day<this.daysOfMonth(getMonth())){
			checkDaysOfMonth=true;
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
		StringBuffer printdate=new StringBuffer();
		printdate.append(getDay()+"/"+printMonthName(getMonth())+"/"+getYear());
		return printdate.toString();
	}



//For a date, print the months left until the end of the year.
	public String monthUntilEndYear()
	{
		StringBuffer monthsEndYear=new StringBuffer();
		int month=getMonth();;
		
			for(int i=month+1;i<=12;i++)
			{
				monthsEndYear.append(printMonthName(i)+"\n");
			}
		return monthsEndYear.toString();
	}



//•For a date, print all dates until the end of  the month.	
	public String dateUntilEndMonth()
		{
		int i;
		StringBuffer dates=new StringBuffer();
		dates.append("The days to the end of the month "+printMonthName(getMonth())+" are;\n");
		for(i=getDay()+1;i<=daysOfMonth(getMonth());i++)
		{
			dates.append(i+","+printMonthName(getMonth())+","+getYear()+"\n");
		}
		return dates.toString();
	}



//•For a date, print the months with the same number of days as the month of  this date.	
	public String sameDaysOfMonth()
	{
		StringBuffer months=new StringBuffer();;
		int days=daysOfMonth(getMonth());
		int i=0;
		months.append("The months with same days than "+printMonthName(getMonth())+" are: \n");
		for(i=1;i<=12;i++)
		{
			if(daysOfMonth(i)==days)
			{
				months.append(printMonthName(i)+"\n");	
			}
		}
		return months.toString();
	}



//•For a date, count the number  of  days since the first day of  the year (do not consider leap years)	
	public String sinceFirstDayOfYear()
	{
		StringBuffer dates = new StringBuffer();
		int i,j,k;
		dates.append("The days since the first day of the year until "+printDate()+" are:\n");
		for(i=1;i<=getMonth();i++)
		{
			if(i!=getMonth())
			{
				for(j=1;j<=daysOfMonth(i);j++)
				{
					dates.append(j+","+printMonthName(i)+","+getYear()+"\n");
				}
			}
				else
				{
					for(k=1;k<getDay();k++)
					{
					dates.append(k+","+printMonthName(i)+","+getYear()+"\n");
					}
				}
		}
		return dates.toString();
	}
/*
•In the Date class build the following methods:
	•Build a method that counts the number of attempts needed to generate a random date equals to a given date(only inside the same year)
		•Do it using a while statement
		•Do it using a do-while statement
	•For a given date and knowing the day of the week of the first day of the year of that date, show the day of the week of the given date.
*/
		
}

