import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i=0; i<eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
		
	}
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i=0; i<oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				count ++;
			}
		}
		return count;
		
	}
	public static double findTallest(List<Double> heights) {
		double tallest = heights.get(0);
		for (int i=0; i<heights.size()-1; i++) {
			for (int j=0; j<heights.size()-1; j++) {
				if (heights.get(j+1) > heights.get(j)) {
					tallest = heights.get(j+1);
				}
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i=0; i<words.size()-1; i++) {
			for (int j=0; j<words.size()-1; j++) {
				if (words.get(i).length() > longest.length()) {
					longest = words.get(i);
				}
			}
		}
		return longest;
	}
	public static boolean containsSOS(List<String> messages) {
		for (int i=0; i<messages.size();i++) {
			if (messages.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> scores) {
		for (int i=0; i<scores.size()-1; i++) {
			for (int j=0; j<scores.size()-1; j++) {
				if (scores.get(j+1) < scores.get(j)) {
					double temp = scores.get(j+1);
					scores.set(j+1, scores.get(j));
					scores.set(j, temp);
				}
			}
		}
		return scores;
	}
	
	public static List<String> sortDNA(List<String> sequence){
		for (int i=0; i<sequence.size()-1; i++) {
			for (int j=0; j<sequence.size()-1; j++) {
				if (sequence.get(j+1).length() < sequence.get(j).length()) {
					String temp = sequence.get(j+1);
					sequence.set(j+1, sequence.get(j));
					sequence.set(j, temp);
				}
			}
		}
		return sequence;
	}
	
	public static List<String> sortWords(List<String> words){
		for (int i=0; i<words.size()-1; i++) {
			for (int j=0; j<words.size()-1; j++) {
				if (words.get(j+1).compareTo(words.get(j)) < 0) {
					String temp = words.get(j+1);
					words.set(j+1, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}
}
