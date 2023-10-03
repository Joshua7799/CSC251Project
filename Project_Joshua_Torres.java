import java.util.Scanner;
import java.util.*; 
import java.io.*;

public class Project_Joshua_Torres{

   public static void main(String[] args){
   
   try{
   
   File file = new File("PolicyInformation.txt"); //File to be input
    
   Scanner fileInput = new Scanner(file); //file input scanner
   
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
   
   int smokerCount = 0;
   
   int nonSmokerCount = 0;
   
   ArrayList<Policy> demo = new ArrayList<Policy>(); //array list for policies
   
   while(fileInput.hasNext()){
         
      //gets all information from file and assigns to variable
      
      policyNumber = fileInput.nextInt();
      fileInput.nextLine();
   
      providerName = fileInput.nextLine();

      firstName = fileInput.next();
      
      lastName = fileInput.next();
      
      age = fileInput.nextInt();
   
      smokingStatus = fileInput.next();
      
      if(smokingStatus.equals("smoker")){
      
      smokerCount = smokerCount + 1;
      
      }
      else if(smokingStatus.equals("non-smoker")){
      
      nonSmokerCount = nonSmokerCount + 1;
      
      }
   
      height = fileInput.nextDouble();
   
      weight = fileInput.nextDouble();
         
         if(fileInput.hasNext()){ 
         
            fileInput.nextLine();
            fileInput.nextLine();
            
         }
         
         Policy d = new Policy(policyNumber, providerName, firstName, lastName , age, smokingStatus, height, weight); //pass all the inputs to constructor
                 
         demo.add(d); //adds to arraylist
         
         }
      
         fileInput.close();
         
         
         for(int i =0; i < demo.size(); i++){ 
            System.out.println("\n\nPolicy Number: " + demo.get(i).getPolicyNumber()); //outputs everything
            System.out.println("\nProvider Name: " + demo.get(i).getProviderName());
            System.out.println("\nPolicyholder’s First Name: " + demo.get(i).getFirstName());
            System.out.println("\nPolicyholder’s Last Name: " + demo.get(i).getLastName());
            System.out.println("\nPolicyholder’s Age: " + demo.get(i).getAge());
            System.out.println("\nPolicyholder’s Smoking Status: " + demo.get(i).getSmokingStatus());
            System.out.println("\nPolicyholder’s Height: " + demo.get(i).getHeight());
            System.out.println("\nPolicyholder’s Weight: " + demo.get(i).getWeight());
            System.out.printf("\nPolicyholder’s BMI: " + "%,.2f",demo.get(i).getBMI());
            System.out.printf("\n\nPolicy Price: $" + "%,.2f",demo.get(i).getPrice());           
            System.out.println();
         } 
         
         System.out.println("\n\nThe number of policies with a smoker is: " + smokerCount);
         System.out.println("\nThe number of policies with a non-smoker is: " + nonSmokerCount); 
    }
   
   //catch for try
   catch(IOException ex){
                  
      System.out.println("Something went wrong reading the file: " + ex.getMessage());
   }    
 
   }
}