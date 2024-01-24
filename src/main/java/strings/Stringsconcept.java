package strings;

public class Stringsconcept {

	public static void main(String[] args) {
		
		String test = new String("Babbu");
	      String test1 = "Babbu";
	      String test3 = "Babbu";
	      String test2 = "BABBU";
	      
	      String test4 = new String("Babbu");
	      
	      
	      if(test1 == test2)
	      {
	          System.out.println("test1 and test2 strings are having same reference" + "\n");
	      }
	      
	      else
	      {
	          System.out.println("test1 and test2 strings are having different reference" + "\n");
	      }
	      
	      
	      if(test == test1)
	      {
	          System.out.println("Both strings are having same reference" + "\n");
	      }
	      
	      else
	      {
	          System.out.println("Both strings are having different reference" + "\n");
	      }
	      
	      if(test1 == test2)
	      {
	          System.out.println("test1 and test2 strings are having same reference" + "\n");
	      }
	      
	      else
	      {
	          System.out.println("test1 and test2 strings are having different reference" + "\n");
	      }
	      
	      if(test1 == test3)
	      {
	          System.out.println("test1 and test3 strings are having same reference" + "\n");
	      }
	      
	      else
	      {
	          System.out.println("test1 and test3 strings are having different reference" + "\n");
	      }
	      
	      if(test == test4)
	      {
	          System.out.println("test and test4 strings are having same reference" + "\n");
	      }
	      
	      else
	      {
	          System.out.println("test and test4 strings are having different reference" + "\n");
	      }
	      
	      if(test.equals(test4))
	      {
	          System.out.println("test and test4 strings are same" + "\n");
	      }
	      else
	      {
	          System.out.println("test and test4 are not same" + "\n");
	      }
	      
	      if(test.equals(test2))
	      {
	          System.out.println("test and test2 strings are same" + "\n");
	      }
	      else
	      {
	          System.out.println("test and test2 are not same" + "\n");
	      }
	      
	      if(test.equalsIgnoreCase(test2))
	      {
	          System.out.println("test and test2 strings are same" + "\n");
	      }
	      else
	      {
	          System.out.println("test and test2 are not same" + "\n");
	      }

	}

}
