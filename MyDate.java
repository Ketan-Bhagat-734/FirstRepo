import java.util.Scanner;

public class MyDate
{
	private int day,month,year;
	static Scanner s= new Scanner(System.in);
	MyDate()
	{
	   System.out.println("\n*****Default Values*****");
	   day=20; month=10; year=2020;
	}
	MyDate(int d,int m, int y)
	{
		System.out.println("\n*****Parameterized constructor*****");
		day=d; month=m; year= y;
	}	
	void setDay(int d){day=d;}
	void setMonth(int m){month=m;}
	void setYear(int y){year=y;}

	
	int getDay(){ return day;}
 	int getMonth(){ return month;}
	int getYear(){ return year;}
	
	void display(){System.out.println(day+"/"+month+"/"+year);}
	void accept(){
		System.out.println("\nEnter the Day, Month & Year");
		day= s.nextInt();
		month= s.nextInt();
		year= s.nextInt();
	}
	
	public static void main(String args[])
	{
		MyDate d= new MyDate();
		d.display();
		
		MyDate d1= new MyDate(01, 01, 2020);
		d1.display();
		d.setDay(21);
		d.setMonth(10);
		d.setYear(2020);
		System.out.println("\n*****Date set by setter*****");
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());	
		
		d.accept();
		System.out.println("\n*****Accepted values*****");
		d.display();
		
	}
}