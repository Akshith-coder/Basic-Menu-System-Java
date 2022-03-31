/*@author: Akshith Kachakayala @date: January 7th 2021

@description: menu system that opens and saves file
*/
import java.util.Scanner;//imports Scanner to get user input

class MenuSystem{//creates class

   public static void main(String []arg){
      //initialization of variables
      String strMyFileName = "";
      int intMyNum = 0;   
      Scanner keyboardInput = new Scanner(System.in);
      
      do {//creates basic file system with 4 different options
         System.out.println("====MENU --- PLEASE SELECT ONE --------------------");
         System.out.println("1. Load/Open a file");
         System.out.println("2. Save a file to disk");
         System.out.println("3. Sort Names Alphabetically");
         System.out.println("4. Exit Program");
      
         if(keyboardInput.hasNextInt()){
            intMyNum = keyboardInput.nextInt();
            keyboardInput.nextLine();
         }else{
            System.out.println("Please enter a valid number.");
            keyboardInput.nextLine();
            continue;
         }
      
         if (intMyNum == 1){
            System.out.println("Please enter a file name.");
            strMyFileName = keyboardInput.nextLine();
            if (strMyFileName.length()>10){
               System.out.printf("The file name %s is too long. Please try again.%n",strMyFileName);//regulates how long file name is
               System.out.println("Please enter a file name.");            
               keyboardInput.nextLine();
            }
            else if (strMyFileName.length()<10){
               System.out.printf("Opening %s\n",strMyFileName);
            }
         }
         if (intMyNum == 2){
            System.out.println("Please enter a file name.");
            strMyFileName = keyboardInput.nextLine();
            if (strMyFileName.length()>10){
               System.out.printf("The file name %s is too long. Please try again.%n",strMyFileName);
               System.out.println("Please enter a file name.");            
               keyboardInput.nextLine();
            }
            else if (strMyFileName.length()<10){
               System.out.printf("Saving %s\n",strMyFileName);
            }
         }

         else if(intMyNum == 3){
            System.out.println("Sorting Alphabetically.....");
         }
         else if(intMyNum < 1 && intMyNum > 4){
            System.out.print("\nPlease enter a number between 1 and 4.\n");
         }
      } while (intMyNum != 4);           
      System.out.println("G o o d - B y e"); 
      
   }//end main
   
}//end class