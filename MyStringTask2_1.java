
public class MyStringTask2_1 {

	public static void main(String[] args) {
		String alfabet = "abcdefghijklmnopqrstuvwxyz";
		String text= "I like my work";
		
		String textWithLetters="";
		String textWithNumber="";
		
		for (int i=0; i<text.length(); i++) {
			char symbol=text.toLowerCase().charAt(i);
			int numLetterInAlfabet=alfabet.indexOf(symbol)+1;
			
			if (symbol!= ' ') {
				textWithLetters= textWithLetters+symbol+"  ";
				if (numLetterInAlfabet>=10) {
					textWithNumber=textWithNumber+numLetterInAlfabet+" ";
				} else {
					textWithNumber=textWithNumber+numLetterInAlfabet+"  ";
				}
			} else {
				textWithLetters= textWithLetters+symbol;
				textWithNumber=textWithNumber+"";
			}
		}
		System.out.println(textWithLetters);
		System.out.println(textWithNumber);
	}

}
