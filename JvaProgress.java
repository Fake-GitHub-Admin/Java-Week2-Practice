public class JvaProgress {
      System.out.println("Java Code Progress as of 3/27/2022");
      String[] violatorsList = {};
      String[] nonviolatorsList = {};
   
      
      public static void main(String[] args) {
    myMethod();
 
      
      
      
      
      
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
} 