import java.util.Scanner;

public class Project_Joshua_Torres{

   public static void main(String[] args){
   
   Scanner keyboard = new Scanner(System.in);
   
   int policyNumber = 0;
   
   String providerName = "";

   String firstName = "";

   String lastName = "";

   int age = 0;

   String smokingStatus = "";
   
   double height = 0.0;

   double weight = 0.0;
   
   double bmi = 0.0;
   
   double price = 0.0;
   
   System.out.println("Please enter the Policy Number: ");
   policyNumber = keyboard.nextInt();
   
   System.out.println("\nPlease enter the Provider Name: ");
   providerName = keyboard.next();
   
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
   
   Policy demo = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
   System.out.println("\n\nPolicy Number: " + policyNumber);
   System.out.println("\nProvider Name: " + providerName);
   System.out.println("\nPolicyholder’s First Name: " + firstName);
   System.out.println("\nPolicyholder’s Last Name: " + lastName);
   System.out.println("\nPolicyholder’s Age: " + age);
   System.out.println("\nPolicyholder’s Smoking Status: " + smokingStatus);
   System.out.println("\nPolicyholder’s Height: " + height);
   System.out.println("\nPolicyholder’s Weight: " + weight);
   System.out.println("\nPolicyholder’s BMI: " + bmi);
   System.out.println("\nPolicy Price: " + price);
   
   }     

}