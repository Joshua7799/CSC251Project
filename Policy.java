public class Policy
{

   private int policyNumber; 
   
   private String providerName;

   private String firstName;

   private String lastName;

   private int age;

   private String smokingStatus;

   private double height;

   private double weight;

   private double bmi;

   private double price = 500;

   /**
   
   default constructor for policy class
   
   sets default values and calculates bmi and price
   
   */

   public Policy(){ 

      policyNumber = 0;

      providerName = "Unentered";

      firstName = "Unentered";

      lastName = "Unentered";

      age = 0;

      smokingStatus = "Unentered";

      height = 0.0;

      weight = 0.0;
      
      calculateBMI();
      
      calculatePrice();

   }
   
   
   /**
   
   constructor for use with paramters
   
   initalizes with given values and calculates bmi and price
   
   @param policy Policy number
   @param provider Provider name
   @param nameFirst First name
   @param nameLast Last name
   @param ageNumber age
   @param smoker smoking status
   @param heightInches height in inches
   @param weightLbs weight in pounds
   
   */
   public Policy(int policy, String provider, String nameFirst, String nameLast, int ageNumber, String smoker, double heightInches, double weightLbs){ 
   
      policyNumber = policy;

      providerName = provider;

      firstName = nameFirst;

      lastName = nameLast;

      age = ageNumber;

      smokingStatus = smoker;

      height = heightInches;

      weight = weightLbs;
      
      calculateBMI();
            
      calculatePrice();
     
   }
   
   /**
   method to set new policy number
   @param policy the new policy number
   
   */
   public void setPolicyNumber(int policy){ 

      policyNumber = policy;

   }
   
   /**
   method to get policy number
   @return the policy number
   */

   public int getPolicyNumber(){

      return policyNumber;

   }
   
   /**
   
   method to set new provider name
   @param nameOfProvider the provider name
   */
   
   public void setProviderName(String nameOfProvider){

      providerName = nameOfProvider;

   }
   /**
   method to return provider name
   @return provider name
   */

   public String getProviderName(){

      return providerName;

   }
   
   /**
   method to set first name
   @param nameFirst first name
   */

   public void setFirstName(String nameFirst){

      firstName = nameFirst;

   }

   /**
   method to return first name
   @return the first name
   */

   public String getFirstName(){

      return firstName;

   }

   /**
   method to set the last name
   @param nameLast the last name
   */

   public void setLastName(String nameLast){

      lastName = nameLast;

   }
   /**
   method to get last name
   @return the last name
   */

   public String getLastName(){

      return lastName;

   }
   
   /**
   method to set age
   @param ageNumber the age in years
   */

   public void setAge(int ageNumber){

      age = ageNumber;

   }
   
   /**
   method to return age
   @return the age
   */

   public int getAge(){

      return age;

   }
   
   /**
   method to set the smoking status 
   @param smoker if the person is a smoker or not
   */

   public void setSmokingStatus(String smoker){

      smokingStatus = smoker;

   }
   
   /**
   method to return if the person is a smoker or not
   @return the smoking status of the person
   */

   public String getSmokingStatus(){

      return smokingStatus;

   }
   
   /**
   method to set the height of the person
   @param heightInches the height of the person in inches

   */

   public void setHeight(int heightInches){

      height = heightInches;
   
   }
   
   /**
   method to return the height of the person
   @return the height of the person in pounds
   */

   public double getHeight(){

      return height;

   }
   
   /**
   method to set weight
   @param weight the weight in pounds
   */

   public void setWeight(int weightLbs){

      weight = weightLbs;

   }
   
   /**
   method to return weight
   @return the weight in pounds
   */

   public double getWeight(){

      return weight;

   }
   
   /**
   method to calculate bmi based on height and weight provided
   */

   private void calculateBMI(){

      bmi = (weight* 703)/ (height * height);
      
   }
   
   /**
   method to return bmi
   @return the bmi
   */

   public double getBMI(){
      
      return bmi;
   
   }
   /**
   calculates the price of the policy based on age, bmi, and smoking status
   */

   private void calculatePrice(){

      if(age > 50){

         price = price + 70;

      }

      if(smokingStatus.equals("smoker")){

         price = price + 75;

      }

      if(bmi > 35){

         price = price + ((bmi - 35) * 20);

      }
      
     
}
   /**
   method to return the policy price
   @return the policy price
   */

   public double getPrice(){

      return price;

   }

}

