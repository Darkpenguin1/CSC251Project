public class Policy{
   private int policyNum;                    // init all neccesary fields
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   Policy(){                        // init no arg constructor to init all fields to a default val
      policyNum = -1;
      providerName = "default";
      policyHolderFirstName = "default";
      policyHolderLastName = "default";
      policyHolderAge = -1;
      policyHolderSmokingStatus = "default";
      policyHolderHeight = -1;
      policyHolderWeight = -1; 
   }
   
   Policy(int pNum, String provName, String phFirstName, String phLastName, int phAge, String phSmokingStatus, double phHeight, double phWeight){        // init an arg constructor
      policyNum = pNum;
      providerName = provName;
      policyHolderFirstName = phFirstName;
      policyHolderLastName = phLastName;
      policyHolderAge = phAge;
      policyHolderSmokingStatus = phSmokingStatus;
      policyHolderHeight = phHeight;
      policyHolderWeight = phWeight;
   }
   
   public void setPolicyNum(int pNum){          // init all mutator methods 
      policyNum = pNum;
   }
   
   public void setPolicyHolderFirstName(String phFirstName){   // @param The policy holders first name
      policyHolderFirstName = phFirstName;
   }
   
   public void setPolicyHolderLastName(String phLastName){     // @param The policy holders last name
      policyHolderLastName = phLastName;
   }
   
   public void setPolicyHolderAge(int phAge){         // @param The policy holders age
      policyHolderAge = phAge;
   }
   
   public void setPolicyHolderSmokingStatus(String phSmokingStatus){    // @param The policy holders smoking status
      policyHolderSmokingStatus = phSmokingStatus;
   }
   
   public void setPolicyHolderHeight(double phHeight){      // @param The policy holders height
      policyHolderHeight = phHeight;
   }
   
   public void setPolicyHolderWeight(double phWeight){      // @param The policy holders weight
      policyHolderWeight = phWeight;
   }
   
   public int getPolicyNum(){    // init all getter methods 
      return policyNum;    // @return The policy holders policy number
   }
   
   public String getProviderName(){
      return providerName; // @return The policy holders provider name
   }
   
   public String getPolicyHolderFirstName(){
      return policyHolderFirstName;       // @return The policy holders first name
   }
   
   public String getPolicyHolderLastName(){
      return policyHolderLastName;     // @return The policy holders last name
   }
   
   public int getPolicyHolderAge(){
      return policyHolderAge;          // @return The policy holders age
   }
   
   public String getPolicyHolderSmokingStatus(){
      return policyHolderSmokingStatus;      // @return The policy holders smoking status
   }
   
   public double getPolicyHolderHeight(){
      return policyHolderHeight;          // @return The policy holders height
   }
   
   public double getPolicyHolderWeight(){
      return policyHolderWeight;          // @return The policy holders weight
   }
   
   public double getBMI(){       // method that calculates the users BMI and returns it         
      return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);         // @return The policy holders bmi      
   }

   public double getInsurancePolicyPrice(){        // method that returns the users insurance policy price
      final double baseFee = 600.0;       // inits the base fee to 600, inits the additional fees and totalFee var
      double additionalFees = 0.0;
      double totalFee = baseFee;
      
      if (policyHolderAge > 50){       // series of if statements that when the condition is met adds a additional fee
         additionalFees += 75.0;
      }
      if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")){
         additionalFees += 100.0;
      } 
      if (getBMI() > 35){     
         additionalFees += (getBMI() - 35) * 20;
      }
   
      return totalFee += additionalFees;     // @return The policy holders additional fees plus the totalFee 
   }
}