package AyaKathem_assing3.Exercises3_7;

public class Word implements Comparable<Word> {

	private String word;

	public Word(String str) {
		this.word = str;
	}

	public String toString() {

		return word;
	}

	public int hashCode() {
		int hCode = word.hashCode(); //getting hash code
		if (hCode<0) 
			/*
			 * less the 0 make it positive
			 */
			hCode = -hCode;
		

		return hCode;

	}

	public boolean equals(Object OBJECT) {
		if (OBJECT instanceof Word) {
			 //check if it is instance
			Word ord = (Word) OBJECT;
			return	(ord.compareTo(this) == 0 )&& (ord.hashCode() == this.hashCode() );
		}
		return false;
	}

	
	
	
	public int compareTo(Word w) {
		 // make all string to lower case 
	    w.toString().toLowerCase();
		if (w == null || this.word == null){ 
			//exception 
			throw new NullPointerException("object is null");
		}else if (!(w instanceof Word)){ // it is not a word 
			throw new ClassCastException("It not a Word");
		}else
		{
			if (w.word.toLowerCase().compareTo(this.word.toLowerCase()) == 0)
				return 0;
			if ((w.word.toLowerCase().compareTo(this.word.toLowerCase()) > 0))
				return -1;
			else
				return 1;
	}

}
}