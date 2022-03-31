//Read Me: There is a concern of not being able to add in elements to a normal array 3/29, look into it and see if ArrayList better option
//If this issue is confirmed to be true it will be a problem to that empty array in the bothLists() method
public class JvaProgress {
   //convert this from main task to a side task
   //all methods are automatically public btw
   static void bothLists() 
      {
         System.out.println("Java Code Progress as of 3/30/2022");
         String[] violatorsList = {};
         String[] nonviolatorsList = {};
      
      
      //This two are going to help me print out what is in those two arrays at line 2 and line 3
      //Side Note: Combined for loop is for multidimensional arrays, don't forget to seperate them
      for (var i = 0; i < violatorsList.length; i++) 
         {
            System.out.println(i);
         }
      
      for (var v = 0; v < nonviolatorsList.length; v++)
         {
            System.out.println(v);
         }
      
   }
   static void theList(String name, String gender, int age, String YesOrNoForCriminal) 
   {
      if (YesOrNoForCriminal == "Y")
      {
         
         System.out.println("Suspect " + name + " " + gender + " "  + "(age: " + age + ") tested Positive on test for Criminals");
      }
      else if (YesOrNoForCriminal == "N")
      {
         System.out.println("Suspect " + name + " " + gender + " " + "(age:" + age + ") tested Negative on test for Criminals");
      }
      else 
      {
         System.out.println("Error, Please insert the appropiate response Y or N");
      }
      
   }

      //this will be the new main where the code will focus upon first 
      public static void main (String args[]) {
      bothLists(); //Call the method to activate those empty arrays
      System.out.println("This is in bulleted list format of everyone");
      theList("Sarah Lee","Female",40,"Y"); //Call the conditional method 
      theList("Rose Ana","Female",19,"N");
      theList("John Blue","Male",27,"Y");
      theList("Eberhault Wick","Male",40,"B");

      
      
      

      }
} 