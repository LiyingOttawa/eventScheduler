/**
 * File name: EventSchedule.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 3
 * Date: 2023-10-07
 * Professor: Sandra Iroakazi
 * Purpose: The class is to Schedule an event on year,month and day
 */
package lab3;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Liying Guo. 
 */


/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-10-07
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of
	 */
	private int month;
	
	/**
	 * day component of the date of
	 */
	private int day;
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		//TO DO: write the proper constructor call and pass  parameters here
		this(2022,9,20);//call 3 parameter constructor with year month and day as given values
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */	
	public EventSchedule(int year) {
		//code rest of constructor here
		this(year,9,20);//call 3 parameter constructor with year as passed, month and day as given values
		System.out.println("EventSchedule(int) was called");
	}
		
	/**
	 * 
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */	
	public EventSchedule(int year, int month) {
		// TODO Auto-generated constructor stub
		this(year,month,20);//call 3 parameter constructor with year and month as passed and day as given value
		System.out.println("EventSchedule(int, int) was called");
	}
		

	/**
	 * 
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */	
	public EventSchedule(int year, int month, int day) {
		//set variables with passed values
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("EventSchedule(int, int, int) was called");
	}
	
	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}
	/**
	 * Returns true if this EventSchedule is hybrid, false if it is not.
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * 
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */	
	public void setMonth(int month) {
		this.month = month;
	}
		
	/**
	 * Returns the day for this EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}
	
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
