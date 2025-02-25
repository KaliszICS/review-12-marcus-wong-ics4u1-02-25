public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word) {
		word = word.replaceAll("\\s+", "").toLowerCase();
		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return ages[i];
		}
		
		}
		return -1;

	}
	public static int countWords(String word, char c) {
		String[] wordArray = word.split(" ");
		int count = 0;
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].indexOf(c) != -1) {
				count++;

			}

		}
		return count;


	}
	
}
