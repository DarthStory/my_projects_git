package lessons;

public class Player {
	
	 public static void printPoints(String name, int age, int totalPoints) {
	      System.out.println(name + " is " + age);
	      System.out.println(name + " made " + totalPoints + " points");
	   }
	   
	   public static void main (String [] args) {
	      String userName = "Ron";
	      int userAge = 18;
	      int regularTimePoints = 25;
	      int overtimePoints = 6;
	      
	      printPoints(userName, userAge, regularTimePoints + overtimePoints);
	   }
	}
