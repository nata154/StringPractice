
public class MyStringBuilderTask1_2 {

	public static void main(String[] args) {
		String text="I love my job";
		int numReplaceLetter=2;
		String symbol="*";

		StringBuilder textMassBuilder=new StringBuilder();
		String[] wordsMass=text.split(" ");

		for (int i=0; i<wordsMass.length; i++) {
			StringBuilder wordsMassBuilder=new StringBuilder(wordsMass[i]);
			if(wordsMassBuilder.length()>=numReplaceLetter) {
				wordsMassBuilder.replace(numReplaceLetter, numReplaceLetter+1, symbol);
			}
			textMassBuilder.append(wordsMassBuilder);
			textMassBuilder.append(" ");
		}
		
		System.out.println(textMassBuilder.toString().trim());
	}

}
