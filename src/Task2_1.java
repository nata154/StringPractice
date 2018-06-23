
public class Task2_1 {

		 public static void main(String[] args) {
		  String alfabet = "abcdefghijklmnopqrstuvwxyz";

		  String text = "in a Some text";

		  String textWithSpace = "";
		  String textAsNumber = "";

		  for (int i = 0; i < text.length(); i++) {
		   char symbol = text.toLowerCase().charAt(i);
		   int numberLetterInAlfabet = alfabet.indexOf(symbol) + 1;
		   if (symbol != ' ') {
		    textWithSpace = textWithSpace + symbol + "  ";
		    if(numberLetterInAlfabet >= 10) {
		     textAsNumber = textAsNumber + numberLetterInAlfabet + " ";
		    } else {
		     textAsNumber = textAsNumber + numberLetterInAlfabet + "  ";
		    }
		   } else {
		    textWithSpace =  textWithSpace + symbol;
		    textAsNumber = textAsNumber + " ";

		   }
		  }
		  System.out.println(textWithSpace);
		  System.out.println(textAsNumber);
		 }

		}


