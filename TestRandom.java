import java.util.ArrayList;
public class TestRandom {
   //convert this from main task to a side task
   //all methods are automatically public btw
   static void bothLists() 
      {
         System.out.println("Java Code Progress as of 3/31/2022");
         //String[] violatorsList = {};
         String[] nonviolatorsList = {};
         
      
      
      //This two are going to help me print out what is in those two arrays at line 2 and line 3
      //Side Note: Combined for loop is for multidimensional arrays, don't forget to seperate them
      /* for (var i = 0; i < violatorsList.size(); i++) 
         {
            System.out.println(i);
         }
      */
      for (var v = 0; v < nonviolatorsList.length; v++)
         {
            System.out.println(v);
         }
      
   }
   static void theList(String name, String gender, int age, String YesOrNoForCriminal) 
   {
      ArrayList<String> violatorsList = new ArrayList<String>();
      ArrayList<String> nonviolatorsList = new ArrayList<String>();
      if (YesOrNoForCriminal == "Y")
      {
         violatorsList.add(name);
         //System.out.println("Suspect " + name + " " + gender + " "  + "(age: " + age + ") tested Positive on test for Criminals");
         for (String i: violatorsList) 
         {
            System.out.println("Print out all suspects in the ArrayList:");
            System.out.println(i + " ");
         }
 
      }
      else if (YesOrNoForCriminal == "N")
      {
         nonviolatorsList.add(name);
         //System.out.println("Suspect " + name + " " + gender + " " + "(age:" + age + ") tested Negative on test for Criminals");
           for (String i: nonviolatorsList) 
         {
            System.out.println("Print out all nonsuspects in the ArrayList:");
            System.out.println(i + " ");
         }
      }
      else 
      {
         
         //System.out.println("Error, Please insert the appropiate response Y or N");
      }   

   }

      //this will be the new main where the code will focus upon first 
      public static void main (String args[]) {
      bothLists(); //Call the method to activate those empty arrays
      //System.out.println("This is in bulleted list format of everyone");
      theList("Sarah Lee","Female",40,"Y"); //Call the conditional method 
      theList("Rose Ana","Female",19,"N");
      theList("John Blue","Male",27,"Y");
      theList("Eberhault Wick","Male",40,"B");

      
      
      

      }
} 