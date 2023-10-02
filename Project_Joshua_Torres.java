import java.util.Scanner;

public class Project_Joshua_Torres{

   public static void main(String[] args){
   
   Scanner keyboard = new Scanner(System.in); //scanner for input
   
   int policyNumber = 0; //variables declared and initialized
   
   String providerName = "";

   String firstName = "";

   String lastName = "";

   int age = 0;

   String smokingStatus = "";
   
   double height = 0.0;

   double weight = 0.0;
   
   double bmi = 0.0;
   
   double price = 0.0;
   
   System.out.println("Please enter the Policy Number: "); //gets all information and assigns to variable
   policyNumber = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.println("\nPlease enter the Provider Name: ");
   providerName = keyboard.nextLine();
   
   System.out.println("\nPlease enter the Policyholder’s First Name: ");
   firstName = keyboard.next();
   
   System.out.println("\nPlease enter the Policyholder’s Last Name: ");
   lastName = keyboard.next();
   
   System.out.println("\nPlease enter the Policyholder’s Age: ");
   age = keyboard.nextInt();
   
   System.out.println("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
   smokingStatus = keyboard.next();
   
   System.out.println("\nPlease enter the Policyholder’s Height (in inches): ");
   height = keyboard.nextDouble();
   
   System.out.println("\nPlease enter the Policyholder’s Weight (in pounds): ");
   weight = keyboard.nextDouble();
   
   Policy demo = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight); //makes new policy
      
   System.out.println("\n\nPolicy Number: " + demo.getPolicyNumber()); //outputs everything
   System.out.println("\nProvider Name: " + demo.getProviderName());
   System.out.println("\nPolicyholder’s First Name: " + demo.getFirstName());
   System.out.println("\nPolicyholder’s Last Name: " + demo.getLastName());
   System.out.println("\nPolicyholder’s Age: " + demo.getAge());
   System.out.println("\nPolicyholder’s Smoking Status: " + demo.getSmokingStatus());
   System.out.println("\nPolicyholder’s Height: " + demo.getHeight());
   System.out.println("\nPolicyholder’s Weight: " + demo.getWeight());
   System.out.printf("\nPolicyholder’s BMI: " + "%,.2f",demo.getBMI());
   System.out.printf("\n\nPolicy Price: $" + "%,.2f",demo.getPrice());
   
   }     

}