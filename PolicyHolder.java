public class PolicyHolder
{
   private String firstName;

   private String lastName;

   private int age;

   private String smokingStatus;

   private double height;

   private double weight;

   private double bmi;
      
   /**
   
   default constructor for policy holder class
   
   sets default values and calculates bmi
   
   */

   public PolicyHolder(){ 

      firstName = "Unentered";

      lastName = "Unentered";

      age = 0;

      smokingStatus = "Unentered";

      height = 0.0;

      weight = 0.0;
      
      bmi = 0.0;     

   }
   
   
   /**
   
   constructor for use with paramters
   
   initalizes with given values and calculates bmi and price
   
   @param nameFirst First name
   @param nameLast Last name
   @param ageNumber age
   @param smoker smoking status
   @param heightInches height in inches
   @param weightLbs weight in pounds
   
   */
   public PolicyHolder(String nameFirst, String nameLast, int ageNumber, String smoker, double heightInches, double weightLbs){ 
   
      firstName = nameFirst;

      lastName = nameLast;

      age = ageNumber;

      smokingStatus = smoker;

      height = heightInches;

      weight = weightLbs;
      
      calculateBMI();
                 
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
 
}

