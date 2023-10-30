public class Policy
{
   
   private int policyNumber; 
   
   private String providerName;
      
   public double price = 500;
   
   private PolicyHolder policyHolder;
   
   /**
   
   default constructor for policy class
   
   sets default values and calculates bmi and price
   
   */

   public Policy(){ 

      policyNumber = 0;

      providerName = "Unentered";
      
      policyHolder = new PolicyHolder();
      
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

      policyHolder = new PolicyHolder(nameFirst, nameLast, ageNumber, smoker, heightInches, weightLbs);
                  
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
   calculates the price of the policy based on age, bmi, and smoking status
   */

   private void calculatePrice(){
   
   
      if(policyHolder.getAge() > 50){

         price += price + 70;

      }

      if(policyHolder.getSmokingStatus().equals("smoker")){

         price += price + 75;

      }

      if(policyHolder.getBMI() > 35){

         price += ((policyHolder.getBMI() - 35) * 20);

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

