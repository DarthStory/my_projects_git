package salary;
public class Salary {                         
	   public static void main(String[] args) { 
	      int hourlyWage;
	      int workHoursPerWeek;  
	      int annualSalary;
	      int workHoursPerYear;
	      int monthlySalary;
	      
	      workHoursPerYear = 50;
	      hourlyWage = 20;
	      workHoursPerWeek = 35;
	      
	       
	      annualSalary = hourlyWage * workHoursPerWeek * workHoursPerYear; 
	      System.out.print("Annual salary is: ");         
	      System.out.println(annualSalary);  
	      
	      monthlySalary = annualSalary / 12;
	      System.out.print("Monthly salary is: ");
	      System.out.println(monthlySalary); 
	   } 
	}