/*******************************************************
* Author: David Lucero
* Class: CSE 360
* Class ID: 462
* Assignment: # 2
* Date: 2/21/2019
* Description: This class allows for mathematical
* operations on integers and is the second.  
********************************************************/
 
package cse360assign2;

public class Calculator 
{

	private int total;      //the total of mathematical operations
	private int firstInt;   //a marker for the first integer
	private String history; //the history of mathematical operations
	
	/**************************************************
	 * Constructor: Initializes the class variable
	 * total.
	 **************************************************/
	public Calculator () 
	{
		total = 0;    // not needed - included for clarity
		history = ""; // not needed - included for clarity
		firstInt = 0; // not needed - included for clarity
	}
	
	/**************************************************
	 * Method getTotal: template for returning total
	 * of the number.
	 **************************************************/
	public int getTotal () 
	{
		return total;
	}
	
	/**************************************************
	 * Method add: Adds integer values.
	 * @param value
	 **************************************************/
	public void add (int value) 
	{
		if ( 0 != firstInt )
			history += " + " + value;
		else
		{
			history = total + " + " + value;
			firstInt++;
		}
		total += value;
	}
	
	/**************************************************
	 * Method subtract: Subtracts integer values.
	 * @param value
	 **************************************************/
	public void subtract (int value) 
	{
		if ( 0 != firstInt )
			history += " - " + value;
		else
		{
			history = total + " - " + value;
			firstInt++;
		}
		total -= value;
	}
	
	/**************************************************
	 * Method multiply: Multiplies integer values.
	 * @param value
	 **************************************************/
	public void multiply (int value) 
	{
		
		if ( 0 != firstInt )
			history += " * " + value;
		else
		{
			history = total + " * " + value;
			firstInt++;
		}
		total *= value;
	}
	
	/**************************************************
	 * Method divide: template for dividing integer 
	 * values.
	 * @param value
	 **************************************************/
	public void divide (int value) 
	{
		if ( 0 != firstInt )
			history += " / " + value;
		else
		{
			history = total + " / " + value;
			firstInt++;
		}
			
	}
	
	/**************************************************
	 * Method getHistory: template for printing past 
	 * mathematical operations between integers.
	 * @return String
	 **************************************************/
	public String getHistory () 
	{
		return history;
	}
}
