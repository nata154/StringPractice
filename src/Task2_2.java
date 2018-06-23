
public class Task2_2 {
	
		 public static void main(String[] args) {
		  String alfabet = "abcdefghijklmnopqrstuvwxyz";

		  String text = "in a Some text";

		  StringBuffer textWithSpace = new StringBuffer();
		  StringBuffer textAsNumber = new StringBuffer();

		  for (int i = 0; i < text.length(); i++) {
		   char symbol = text.toLowerCase().charAt(i);
		   int numberLetterInAlfabet = alfabet.indexOf(symbol) + 1;
		   if (symbol != ' ') {
		    textWithSpace.append(symbol);
		    textWithSpace.append("  ");
		    if (numberLetterInAlfabet >= 10) {
		     textAsNumber.append(numberLetterInAlfabet);
		     textAsNumber.append(" ");
		    } else {
		     textAsNumber.append(numberLetterInAlfabet);
		     textAsNumber.append("  ");
		    }
		   } else {
		    textWithSpace.append(symbol);
		    textAsNumber.append(" ");

		   }
		  }
		  System.out.println(textWithSpace);
		  System.out.println(textAsNumber);
		 }

		}