public class Policy
{

   private int policyNumber;
   
   private string providerName;

   private string firstName;

   private string lastName;

   private int age;

   private string;

   private int height;

   private int weight;

   private double bmi;

   private double price;

   public Policy(){

      policyNumber = 0;

      providerName = "Unentered";

      firstName = "Unentered";

      lastName = "Unentered";

      age = 0;

      smokerStatus = "Unentered";

      height = 0;

      weight = 0;

   }
   
   public Policy(int policy, string provider, string nameFirst, string nameLast, int ageNumber, string smoker, int heightInches, int weightLbs){
   
      policyNumber = policy;

      providerName = provider;

      firstName = nameFirst;

      lastName = nameLast;

      age = ageYears;

      smokerStatus = smoker;

      height = heightInches;

      weight = weightLbs;
   }
   
   public void setPolicyNumber(int policy){

      policyNumber = policy;

   }

   public int getPolicyNumber(){

      return policyNumber;

   }

   public void setProviderName(string nameOfProvider){

      providerName = nameOfProvider;

   }

   public string getProviderName(){

      return providerName;

   }

   public void setFirstName(string nameFirst){

      firstName = nameFirst;

   }

   public string getFirstName(){

      return firstName;

   }

   public void setLastName(string nameLast){

      lastName = nameLast;

   }

   public string getLastName(){

      return lastName;

   }

   public void setAge(int ageNumber){

      age = ageNumber;

   }

   public int getAge(){

      return age;

   }

   public void setSmokingStatus(string smoker){

      smokingStatus = smoker;

   }

   public string getSmokingStatus(){

      return smokingStatus;

   }

   public void setHeight(int heightInches){

      height = heightInches;
   
   }

   public int getHeight(){

      return height;

   }

   public void setWeight(int weightLbs){

      weight = weightLbs;

   }

   public int getWeight(){

      return weight;

   }

   public void calculateBMI(){

      bmi = (weight* 703)/ (height * height);

   }

   public double getBMI{

      return bmi
   
   }

   public void calculatePrice

      if(age > 50){

         price = price + 70;

      }

      if(smokingStatus = "yes"){

         price = price + 75;

      }

      if(BMI > 35){

         price = price + ((BMI - 35) * 20);

      }

   public double getPrice(){

      return price;

   }

}