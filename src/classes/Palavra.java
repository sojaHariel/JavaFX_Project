package classes;

public class Palavra {

	String wordEnglish;
	String wordPortuguese;
	String phraseEnglish;
	String phrasePortuguese;
	
	//Builders methods
	public Palavra(String wordEnglish, String wordPortuguese) {
		this.wordEnglish = wordEnglish;
		this.wordPortuguese = wordPortuguese;
	}
	
	public Palavra(String wordEnglish, String wordPortuguese, String phraseEnglish, String phrasePortuguese) {
		this.wordEnglish = wordEnglish;
		this.wordPortuguese = wordPortuguese;
		this.phraseEnglish = phraseEnglish;
		this.phrasePortuguese = phrasePortuguese;
	}
	
	//Get methods
	public String getWordEnglish() {
		return this.wordEnglish;
	}
	
	public String getPhraseEnglish() {
		return this.phraseEnglish;
	}
	
	public String getWordPortuguese() {
		return this.wordPortuguese;
	}

	public String getPhrasePortuguese() {
		return this.phrasePortuguese;
	}
	
	//Set methods
	public void setWordEnglish(String newWord) {
		this.wordEnglish = newWord;
	}
	
	public void setPhraseEnglish(String newPhrase) {
		this.phraseEnglish = newPhrase;
	}
	
	public void setWordPortuguese(String newWord) {
		this.wordPortuguese = newWord;
	}
	
	public void setPhrasePortuguese(String newPhrase) {
		this.phrasePortuguese = newPhrase;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("English Word: " + this.wordEnglish + "\n" 
				+ "Portuguese Word: " + this.wordPortuguese + "\n" 
				+ "English Phrase: " + this.phraseEnglish + "\n" 
				+ "Portuguese Phrase: " + this.phrasePortuguese + "\n");
		return sb.toString();
	}
	
	
	
	
	
	
	
	
}
