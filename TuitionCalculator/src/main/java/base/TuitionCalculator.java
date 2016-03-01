package base;
//Imports
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.*; //Imported JAR

public class TuitionCalculator
/**
 * Assigns variables.
 */
{
	private static double initialCost;
	private static double percentageIncrease;
	private static double repaymentAPR;
	private static double repaymentTerm;
	private static double tuitionCost;
	private static double monthlyPayment;
/**
 * Encapsulation
*/	
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the initial tuition cost:");
	initialCost = input.nextDouble();

	System.out.print("Please enter the percentage increase:");
	percentageIncrease = input.nextDouble();

	System.out.print("Please enter the repayment APR:");
	repaymentAPR = input.nextDouble();

	System.out.print("Please enter the repayment term:");
	repaymentTerm = input.nextDouble();

	input.close();

	tuitionCost = calculateTotalTuition(initialCost, percentageIncrease);
	
	monthlyPayment = calculateMonthlyPayments(repaymentAPR,repaymentTerm,tuitionCost);
	
	System.out.printf("Total tuition cost: $%.2f. Monthly payment at the end,"
			+ " when graduating will be $%.2f", tuitionCost, monthlyPayment);
	}

	public static double calculateTotalTuition(double initialCost, double percentageIncrease) 
	/**
	 * Calculations for 4 years of university
	 */
	{
		double totalTuition = initialCost;
		for(int x = 0; x <= 2;x++)
		{
			totalTuition = totalTuition + (initialCost * (1 + percentageIncrease/100));
		}		
		totalTuition = Math.round(totalTuition * 100.00) / 100.00;
		return totalTuition;
	}
	
	public static double calculateMonthlyPayments(double APR, double repaymentTerm, double totalTuition) 
	/**
	 * Calculates the the monthly payment using Amortization
	 */
	{
		
		return Math.round(FinanceLib.pmt(APR / (100*12), repaymentTerm * 12, -1 * totalTuition, 0, false) * 100.00) / 100.00;
	}	
}