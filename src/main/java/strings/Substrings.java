package strings;

public class Substrings {

	public static void main(String[] args) {
		 /*
	      Substring
	        You can get substring from the given string object by one of the two methods:
	        1. public String substring(int startIndex): This method returns new String object
	        containing the substring of the given string from specified startIndex (inclusive).
	        2. public String substring(int startIndex, int endIndex): This method returns new String
	        object containing the substring of the given string from specified startIndex to
	        endIndex.
	        
	        In case of string:
	            • startIndex: inclusive
	            • endIndex: exclusive
	      */
		String s = "PrasadBabburi"; // length is 12 index starts from 0      
	      System.out.println(s.substring(6));// Babburi
	      System.out.println(s.substring(12));// i
	      System.out.println(s.substring(0));// PrasadBabburi
	      
	      
	      System.out.println(s.substring(0,6)); //Prasad
	      System.out.println(s.substring(0,5));// Prasa
	      System.out.println(s.substring(0,13));//PrasadBabburi
	      System.out.println(s.substring(0,12) + "\n");//PrasadBabbur
	      
	      
	      // charAt()
	      
	      System.out.println("chartAt() strats: \n");
	      
	      String ss = "Prasad Babburi";
	      
	      System.out.println(ss.charAt(5) + "\n");//d
	      
	      char ch = ss.charAt(0);
	      System.out.println(ch + "\n");//P
	      
	      char ch1 = ss.charAt(7);
	      System.out.println(ch1 + "\n");
	      
	      
	      // Contains() starts
	      
	      String cn = "learn automation with Java";
	      
	      System.out.println(cn.contains("learn"));// true
	      System.out.println(cn.contains("Learn"));// false
	      System.out.println();
	      
	      String ts = "if you want to move in automation learn java";
	      
	      if(ts.contains("learn java"))
	      {
	          System.out.println("I am in" + "\n");
	      }
	      else
	      {
	          System.out.println("Results not found");
	      }

	}

}
