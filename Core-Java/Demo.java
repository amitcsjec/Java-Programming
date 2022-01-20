package com.hcl.assessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Demo {
	
	public static String getString(List<Integer> list) {
		return list.stream()
				.map(i -> i % 2 == 0 ? "e" + i : "o" + i)
				.collect(Collectors.joining(","));
	}
	
	public static Map<String, Integer> getNumberOfWords(String input) {
		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = input.split(" ");
		
		for (String word : words) {
			Integer integer = hashMap.get(word);
			
			if (integer == null) {
				hashMap.put(word, 1);
			} else {
				hashMap.put(word, integer+1);
			}
		}
		return hashMap;
	}
	
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];
	
	/* calculate count of characters in the passed string */
	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}
	
	public static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1, i;
		
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length-1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}
	
	public static void printAnagrams(String arr[])
    {
        HashMap<String, List<String> > map = new HashMap<>();
 
        // loop over all words
        for (int i = 0; i < arr.length; i++) {
 
            // convert to char array, sort and
            // then re-convert to string
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
 
            // calculate hashcode of string
            // after sorting
            if (map.containsKey(newWord)) {
 
                map.get(newWord).add(word);
            }
            else {
 
                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
 
        // print all the values where size is > 1
        // If you want to print non-anagrams,
        // just print the values having size = 1
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
    }
}