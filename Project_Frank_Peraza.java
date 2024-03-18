import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Project_Frank_Peraza{
   public static void main(String[] args) throws IOException 
   {
      File file = new File("DownloadAttachment.txt"); // create the file ref obj
      Scanner keyboard = new Scanner(file);         // init the scanner class to read in file info
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      int nonSmokerCount = 0; // init smoker/non smoker counter variables
      int smokerCount = 0;
      
      
      while (keyboard.hasNextLine()){     // A while loop that runs until there is no more file info
         int policyNum = keyboard.nextInt();          // Read in the file info into file scanner and assign the info to the variables accordingly
         keyboard.nextLine();
         
         String providerName = keyboard.nextLine();
         String policyHolderFirstName = keyboard.nextLine();   
         String policyHolderLastName = keyboard.nextLine();
         
         int policyHolderAge = keyboard.nextInt();
         keyboard.nextLine();
         
         String policyHolderSmokingStatus = keyboard.nextLine();   
         
         double policyHolderHeight = keyboard.nextDouble();
         double policyHolderWeight = keyboard.nextDouble();   
         keyboard.nextLine();    // make sure to consume all the new lines when switching between types
         
         // Once we have all of our neccesary info create a policy object and add it into the policyList array
         policyList.add(new Policy(policyNum, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight));
      
      }
      for (int i = 0; i < policyList.size(); i++){    // Print out each respective policy objs attributes
         System.out.println("\nPolicy Number: " + policyList.get(i).getPolicyNum());
         System.out.println("\nProvider Name: " + policyList.get(i).getProviderName());
         System.out.println("\nPolicyholders first name: " + policyList.get(i).getPolicyHolderFirstName());
         System.out.println("\nPolicyholders last name: " + policyList.get(i).getPolicyHolderLastName());
         System.out.println("\nPolicyholders age: " + policyList.get(i).getPolicyHolderAge());
         System.out.println("\nPolicyholders smoking status: " + policyList.get(i).getPolicyHolderSmokingStatus());
         
         if (policyList.get(i).getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker")){   // if statements that check if the policy holder smokes or not and counts it towards the running total
            smokerCount++;
         }
         else{
            nonSmokerCount++;
         }
         
         System.out.println("\nPolicyholders height: " + policyList.get(i).getPolicyHolderHeight());
         System.out.println("\nPolicyholders weight: " + policyList.get(i).getPolicyHolderWeight());
         System.out.printf("\nPolicyholders BMI: %.2f\n", + policyList.get(i).getBMI());
         System.out.printf("\nPolicy Price: $%.2f\n", + policyList.get(i).getInsurancePolicyPrice());
      }
      System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
      System.out.println("\nThe number of policies with a non-smoker is: " + nonSmokerCount);
      keyboard.close();    // make sure to close the file! 
   }
}