package classes;

import java.util.ArrayList;

public class Palavras {

	public ArrayList<Palavra> palavras;
	
	public Palavras() {
		this.palavras = new ArrayList<Palavra>();
	}
	
	public void addPalavra(Palavra p) {
		this.palavras.add(p);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Palavra palavra: this.palavras) {
			sb.append(palavra.toString() + "\n");
		}
		
		return sb.toString();
		
	}
	
	}
