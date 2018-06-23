
public class Task4_1 {
	
		 public static void main(String[] args) {
		  String line = "Now that the string is converted to char array";
		  String subLine = "***";
		  int kSymbol = 5;
		  
		  String newLineHowString = line.substring(0, kSymbol) + subLine + line.substring(kSymbol, line.length());

		  System.out.println(newLineHowString);
		 }

		}


