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

   private double price;

   public Policy(){

      policyNumber = 0;

      providerName = "Unentered";

      firstName = "Unentered";

      lastName = "Unentered";

      age = 0;

      smokingStatus = "Unentered";

      height = 0.0;

      weight = 0.0;
      
      calculateBMI(height, weight);
      
      bmi = getBMI();
      
      calculatePrice(age, smokingStatus, bmi);
      
      price = getPrice();

   }
   
   public Policy(int policy, String provider, String nameFirst, String nameLast, int ageNumber, String smoker, double heightInches, double weightLbs){
   
      policyNumber = policy;

      providerName = provider;

      firstName = nameFirst;

      lastName = nameLast;

      age = ageNumber;

      smokingStatus = smoker;

      height = heightInches;

      weight = weightLbs;
      
      calculateBMI(height, weight);
      
      bmi = getBMI();
      
      calculatePrice(age, smokingStatus, bmi);
      
      price = getPrice();
   }
   
   public void setPolicyNumber(int policy){

      policyNumber = policy;

   }

   public int getPolicyNumber(){

      return policyNumber;

   }

   public void setProviderName(String nameOfProvider){

      providerName = nameOfProvider;

   }

   public String getProviderName(){

      return providerName;

   }

   public void setFirstName(String nameFirst){

      firstName = nameFirst;

   }

   public String getFirstName(){

      return firstName;

   }

   public void setLastName(String nameLast){

      lastName = nameLast;

   }

   public String getLastName(){

      return lastName;

   }

   public void setAge(int ageNumber){

      age = ageNumber;

   }

   public int getAge(){

      return age;

   }

   public void setSmokingStatus(String smoker){

      smokingStatus = smoker;

   }

   public String getSmokingStatus(){

      return smokingStatus;

   }

   public void setHeight(int heightInches){

      height = heightInches;
   
   }

   public double getHeight(){

      return height;

   }

   public void setWeight(int weightLbs){

      weight = weightLbs;

   }

   public double getWeight(){

      return weight;

   }

   public void calculateBMI(double height, double weight){

      bmi = (weight* 703)/ (height * height);
      
   }

   public double getBMI(){
      
      return bmi;
   
   }

   public void calculatePrice(int age, String smokingStatus, double bmi){

      if(age > 50){

         price = price + 70;

      }

      if(smokingStatus == "smoker"){

         price = price + 75;

      }

      if(bmi > 35){

         price = price + ((bmi - 35) * 20);

      }
      
     
}

   public double getPrice(){

      return price;

   }

}