
public class MyStringBuilderTask2_2 {

	public static void main(String[] args) {
		String alfabet = "abcdefghijklmnopqrstuvwxyz";
		String text= "I like my work";
		
		StringBuilder textWithLetters=new StringBuilder();
		StringBuilder textWithNumber=new StringBuilder();
		
		for (int i=0; i<text.length(); i++) {
			char symbol=text.toLowerCase().charAt(i);
			int numLetterInAlfabet=alfabet.indexOf(symbol)+1;
			
			if (symbol!= ' ') {
				textWithLetters.append(symbol+" ");
				textWithLetters.append(" ");
				if (numLetterInAlfabet>=10) {
					textWithNumber.append(numLetterInAlfabet);
					textWithNumber.append(" ");
				} else {
					textWithNumber.append(numLetterInAlfabet);
					textWithNumber.append(" ");
				}
			} else {
				textWithLetters.append(symbol);
				textWithNumber.append(" ");
			}
		}
		System.out.println(textWithLetters);
		System.out.println(textWithNumber);
	}
}
