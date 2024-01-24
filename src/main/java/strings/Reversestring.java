package strings;

public class Reversestring {
	public static final String s = "PrasadBabburi";
	public static void main(String[] args) {

	}
	public static String reverse(String s)
	{
		if(s == null)
			throw new IllegalArgumentException("Null is not valid input");
		
		StringBuilder out = new StringBuilder();
		
		char[] ch = s.toCharArray();
		for(int i= ch.length-1; i>=0; i--)
			out.append(ch[i]);
			
		return out.toString();
		
	}

}
