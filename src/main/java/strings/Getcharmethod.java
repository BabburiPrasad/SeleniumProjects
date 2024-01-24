package strings;

public class Getcharmethod {

	public static void main(String[] args) {
		/*
		getChars()
		Method copies the content of this string into specified char array
		public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginInde
		x)
		Throws
		It throws StringIndexOutOfBoundsException if beginIndex is greater than endIndex.
		*/
		String s = "PrasadBabburi"; // length is 12 index starts from 0     
	      
	      char[] ch = new char[13];
	      
	      try{
	          s.getChars(0, 13, ch, 0);
	          System.out.println(ch); // PrasadBabburi
	      }catch(Exception ex){
	          System.out.println(ex);
	      }
	}

}
