import java.util.Scanner;

public class Project_Frank_Peraza{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);         // init the scanner class
            
      System.out.print("Please enter the Policy Number: ");          // Prompt the user to enter the respective field information, and assign the info to a variable
      int policyNum = keyboard.nextInt();
        
      keyboard.nextLine();
  
      System.out.print("\nPlease Enter the Provider Name: ");
      String providerName = keyboard.nextLine();
            
      System.out.print("\nPlease Enter the Policy Holder's First Name: ");
      String policyHolderFirstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policy Holder's Last Name: ");
      String policyHolderLastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policy Holder's Age: ");
      int policyHolderAge = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policy Holder's smoking status (smoker/non-smoker): ");
      String policyHolderSmokingStatus = keyboard.nextLine();
     
      System.out.print("\nPlease enter the Policy Holder's height (in inches): ");
      double policyHolderHeight = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policy Holder's weight (in pounds): ");
      double policyHolderWeight = keyboard.nextDouble();
      
      // initialize the Policy class with all the arguments with the information the user provided
      Policy demo = new Policy(policyNum, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
      
      
      // print out the respective information using the policy classes get methods
      System.out.println("Policy Number: " + demo.getPolicyNum());
      System.out.println("\nProvider Number: " + demo.getProviderName());
      System.out.println("\nPolicyholders first name: " + demo.getPolicyHolderFirstName());
      System.out.println("\nPolicyholders last name: " + demo.getPolicyHolderLastName());
      System.out.println("\nPolicyholders age: " + demo.getPolicyHolderAge());
      System.out.println("\nPolicyholders smoking status: " + demo.getPolicyHolderSmokingStatus());
      System.out.println("\nPolicyholders height: " + demo.getPolicyHolderHeight());
      System.out.println("\nPolicyholders weight: " + demo.getPolicyHolderWeight());
      System.out.printf("\nPolicyholders BMI: %.2f\n", + demo.getBMI());
      System.out.printf("\nPolicy Price: $%.2f\n", + demo.getInsurancePolicyPrice());
   
   
   }
}