
public class Task1_2 {

		 public static void main(String[] args) {
		  String text = "Now that the string is converted to char array, i would like to replace the letter â€ eâ€™ by â€ yâ€™, this is done as follows:";
		  int numberReplaceSimbol = 3;
		  String simbol = "*";
		  
		  StringBuffer textWithNewWord = new StringBuffer();
		  
		  String[] words = text.split(" ");
		  
		  for(int i = 0; i < words.length; i++) {
		   StringBuffer wordStrBuffer = new StringBuffer(words[i]);
		   if(wordStrBuffer.length() >= numberReplaceSimbol) {
		    wordStrBuffer.replace(numberReplaceSimbol, numberReplaceSimbol+1, simbol);
		   }
		   textWithNewWord.append(wordStrBuffer);
		   textWithNewWord.append(" ");
		  }
		  
		  System.out.println(textWithNewWord.toString().trim());
		  }
		}

