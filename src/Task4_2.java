
public class Task4_2 {

		 public static void main(String[] args) {
		  String line = "Now that the string is converted to char array";
		  String subLine = "***";
		  int kSymbol = 5;

		  StringBuffer newLineHowStringBuffer = new StringBuffer(line);
		  newLineHowStringBuffer.insert(kSymbol, subLine);

		  System.out.println(newLineHowStringBuffer);
		 }

		}

