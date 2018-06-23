
public class Task3_2 {

	 public static void main(String[] args) {
	  String text = "I love my pap a new pap";
	  StringBuffer textStrBuf = new StringBuffer(text);

	  String substring = "pa";
	  String replacement = "po";

	  int position = textStrBuf.lastIndexOf(substring);

	  while (position != -1) {
	   textStrBuf.replace(position, position + substring.length(), replacement);
	   position = textStrBuf.lastIndexOf(substring);
	  }
	  
	  System.out.println(textStrBuf);
	 }
	}

