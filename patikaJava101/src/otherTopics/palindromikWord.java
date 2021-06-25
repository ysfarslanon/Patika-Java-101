package otherTopics;

public class palindromikWord {

	public static void main(String[] args) {
		// Kodluyoruz patika.dev Java patikas� di�er konular pratik 2
		// Palindromik Kelimleri Bulan Program
		// E�er bir kelimenin tersten okunu�u yine ayn� kelimeyi veriyorsa o
		// kelimen"Palindromik Kelime'dir".
		// �rnek : abba , asa , kavak, kayak

		System.out.println(isPalindrome("abBa"));
		System.out.println(isPalindrome("asa"));
		System.out.println(isPalindrome2("kavak"));
		System.out.println(isPalindrome2("kayaK"));
		
		System.out.println(isPalindrome("yusuf"));
		System.out.println(isPalindrome2("arslan"));

	}

	static boolean isPalindrome(String word) {
		
		int startIndex = 0;
		int lastIndex = word.length() - 1;
		while (startIndex < lastIndex) {
			if (word.toLowerCase().charAt(startIndex) != word.toLowerCase().charAt(lastIndex))
				return false;
			startIndex++;
			lastIndex--;
		}

		return true;
	}

	static boolean isPalindrome2(String word) {
		String reverseWord = "";
		for (int i = word.length()-1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}

		return word.toLowerCase().equals(reverseWord.toLowerCase());
	}

}
