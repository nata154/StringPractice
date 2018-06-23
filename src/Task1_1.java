
public class Task1_1 {


		 public static void main(String[] args) {
		  String text = "Now that the string is converted to char array, i would like to replace the letter â€ eâ€™ by â€ yâ€™, this is done as follows:";
		  int numberReplaceWord = 3;
		  char simbol = '*';
		  
		  String[] words = text.split(" ");
		  
		  for(int i = 0; i < words.length; i++) {
		   String word = words[i];
		   if(word.length() >= numberReplaceWord) {
		    char[] chars = word.toCharArray();
		    chars[numberReplaceWord-1] = simbol;
		    String wordWithReplaceSimbol = "";
		    for(int j = 0; j < chars.length; j++) {
		     wordWithReplaceSimbol = wordWithReplaceSimbol + chars[j];
		    }
		    words[i] = wordWithReplaceSimbol;
		   }
		  }
		  
		  String textWithNewWord = "";
		  
		  for(int i = 0; i < words.length; i++) {
		   textWithNewWord = textWithNewWord + words[i] + " ";
		  }
		  
		  System.out.println(textWithNewWord.trim());
		  }

		}


