/**
 * File name: TestDemo.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 3
 * Date: 2023-10-07
 * Professor: Sandra Iroakazi
 * Purpose: The program class to test on EventSchedule.java
 */
package lab3;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Liying Guo
 * @version 1.0
 * @since 2023-10-07
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		System.out.println("Just creating 4 EventSchedules\n");
		System.out.println("EventSchedule1");
		//Reference type variable declaration and initialization by default constructor
		EventSchedule schedule1 = new EventSchedule();
		System.out.println(schedule1.createReport());
		
		System.out.println("EventSchedule2");
		//Reference type variable declaration and initialization by one parameter constructor 
		EventSchedule schedule2 = new EventSchedule(2023);
		System.out.println(schedule2.createReport());
		
		System.out.println("EventSchedule3");
		//Reference type variable declaration and initialization by 2 parameters constructor 
		EventSchedule schedule3 = new EventSchedule(2023,12);
		System.out.println(schedule3.createReport());
		
		System.out.println("EventSchedule4");
		//Reference type variable declaration and initialization by 3 parameters constructor 
		EventSchedule schedule4 = new EventSchedule(2023,12,15);
		System.out.println(schedule4.createReport());
	}

}
