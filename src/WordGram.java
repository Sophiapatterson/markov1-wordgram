/**
 * A WordGram represents a sequence of strings
 * just as a String represents a sequence of characters
 * 
 * @author Sophia Patterson
 *
 */
public class WordGram {
	
	private String[] myWords;   
	private String myToString;  // cached string
	private int myHash;         // cached hash value

	/**
	 * Create WordGram, initialize myWords, myToString, myHash
	 * @param source
	 * @param start
	 * @param size
	 */
	public WordGram(String[] source, int start, int size) {
		myWords = new String[size];
		myToString = "";
		myHash = 5;
		int dex = 0;
		for (int i = start; i < size + start; i++){
			myWords[dex] = source[i];
			dex++;
			
		}

		
		// TODO: initialize myWords and others as needed
	}

	/**
	 * Return string at specific index in this WordGram
	 * @param index in range [0..length() ) for string 
	 * @return string at index
	 */
	public String wordAt(int index) {
		if (index < 0 || index >= myWords.length) {
			throw new IndexOutOfBoundsException("bad index in wordAt "+index);
		}
		return myWords[index];
	}

	/**
	 * Create variable length
	 * @return length of myWords
	 */
	public int length(){
		int x = myWords.length;
		
		return x;
	}

	/**
	 * Test if new object is compatible with WordGram
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		if (! (o instanceof WordGram) || o == null){
			return false;
		}
	    // TODO: complete this method
		
		WordGram wg = (WordGram) o;
		if (o.toString().equals(this.toString())){
			return true;
		}
		return false;
	}
	
	/**
	 * Determine hashCode of myToString
	 * @return hashCode of myToString
	 */
	@Override
	public int hashCode(){
		// TODO: complete this method
		if (myHash == 5){
			myHash = this.toString().hashCode();
		}
		
		return myHash;
	}
	

	/**
	 * method shifts all items in array to the left, removes object at index 0
	 * fills the last index with parameter last
	 * @param last is last String of returned WordGram
	 * @return new array after shift is applied
	 */
	public WordGram shiftAdd(String last) {
		// TODO: Complete this method
		String [] same = new String [myWords.length];
		int dex1 = 0;
		for (int i = 0; i<(myWords.length-1); i++) {
			same[i] = myWords[i+1];
		}
		same[myWords.length-1] = last;
		WordGram wg = new WordGram(same,0,myWords.length);
		return wg;
	}
	/**
	 * Convert array (myWords) to string via spaces
	 * @return string of myWords, aka myToString
	 */
	@Override
	public String toString(){
		// TODO: Complete this method
		if (myToString.contentEquals("")){
			myToString = String.join(" ",  myWords);
		}
		
		return myToString;
	}
}

	