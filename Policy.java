Public Policy{
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
   
   public void setPolicyHolderFirstName(String phFirstName){
      policyHolderFirstName = phFirstName;
   }
   
   public void setPolicyHolderLastName(String phLastName){
      policyHolderLastName = phLastName;
   }
   
   public void setPolicyHolderAge(int phAge){
      policyHolderAge = phAge;
   }
   
   public void setPolicyHolderSmokingStatus(String phSmokingStatus){
      policyHolderSmokingStatus = phSmokingStatus;
   }
   
   public void setPolicyHolderHeight(double phHeight){
      policyHolderHeight = phHeight;
   }
   
   public void setPolicyHolderWeight(double phWeight){
      policyHolderWeight = phWeight;
   }
   
   public int getPolicyNum(){    // init all getter methods 
      return policyNum;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public String getPolicyHolderFirstName(){
      return policyHolderFirstName;
   }
   
   public String getPolicyHolderLastName(){
      return policyHolderLastName;
   }
   
   public int getPolicyHolderAge(){
      return policyHolderAge;
   }
   
   public String getPolicyHolderSmokingStatus(){
      return policyHolderSmokingStatus;
   }
   
   public double getPolicyHolderHeight(){
      return policyHolderHeight;
   }
   
   public double getPolicyHolderWeight(){
      return policyHolderWeight;
   }

   public double getBMI(){       // method that calculates the users BMI and returns it
      return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
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
   
      return totalFee += additionalFees;     // returns the additional fee plus the totalFee 
   }
}