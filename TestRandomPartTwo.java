import java.util.ArrayList;
public class TestRandomPartTwo {
   static void bothLists() 
      {
         System.out.println("Java Code Progress as of 4/6/2022");   
      }
   static void theList(String name, String gender, int age, String YesOrNoForCriminal) 
   {
      ArrayList<String> violatorsList = new ArrayList<String>();
      ArrayList<String> nonviolatorsList = new ArrayList<String>();
      ArrayList<String> errorList = new ArrayList<String>();
      if (YesOrNoForCriminal == "Y")
      {
         violatorsList.add(name);
         //Ommitted for just the for loop style print
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
         //Ommitted for just the for loop style print
         //System.out.println("Suspect " + name + " " + gender + " " + "(age:" + age + ") tested Negative on test for Criminals");
         

           for (String i: nonviolatorsList) 
         {
            System.out.println("Print out all nonsuspects in the ArrayList:");
            System.out.println(i + " ");
         }
         
      }
      else 
      {
         errorList.add(name);
         //System.out.println("Error, Please insert the appropiate response Y or N");
           for (String i: errorList)
         {
            System.out.println("Print out the names that caused an error");
            System.out.println(i + " ");
         }

      }   

   }

      
      public static void main (String args[]) {
      bothLists(); //This method useless now, but nice to have though
      theList("Sarah Lee","Female",40,"Y"); //Call the conditional method 
      theList("Rose Ana","Female",19,"N");
      theList("John Blue","Male",27,"Y");
      theList("Eberhault Wick","Male",40,"B");
      
    
      

      }
} 