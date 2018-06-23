
public class MyStringTask1_1 {

	public static void main(String[] args) {

String text="I love my job";
int numReplaceLetter=2;
char symbol='*';

String[] wordsMass=text.split(" ");

for (int i=0; i<wordsMass.length; i++) {
	String word=wordsMass[i];
	if (word.length()>numReplaceLetter) {
		char[] chars=word.toCharArray();
		chars [numReplaceLetter-1]=symbol;
		
		String wordWithReplaceSymbal="";
		for (int j=0; j<chars.length; j++) {
			wordWithReplaceSymbal= wordWithReplaceSymbal+chars[j];
		}
		wordsMass[i]=wordWithReplaceSymbal;
	}
}

String textWithNewWods=" ";
for (int i=0; i<wordsMass.length; i++) {
	textWithNewWods=textWithNewWods+wordsMass[i]+" ";
}

System.out.println(textWithNewWods.trim());
	}

}
