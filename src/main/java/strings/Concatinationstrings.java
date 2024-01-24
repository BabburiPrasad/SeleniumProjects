package strings;

public class Concatinationstrings {

	public static void main(String[] args) {
		String test = new String("Babbu");
	      String temp = new String("Prasad");
	      
	      String s = "Mr. " + test;
	      
	      System.out.println(s);// Mr. Babbu
	      
	      String ss = temp + 116;
	      System.out.println(ss);// Babbu116
	      
	      String temps = test.concat(temp);
	      
	      System.out.println(temps);// BabbuPrasad

	}

}
