package org.zipwords;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zipwords {
	
	static Map<Character,Integer> alphabet = new HashMap<>();
	static {
		alphabet.put('a',-13);
		alphabet.put('b',-12);
		alphabet.put('c',-11);
		alphabet.put('d',-10);
		alphabet.put('e',-9);
		alphabet.put('f',-8);
		alphabet.put('g',-7);
		alphabet.put('h',-6);
		alphabet.put('i',-5);
		alphabet.put('j',-4);
		alphabet.put('k',-3);
		alphabet.put('l',-2);
		alphabet.put('m',-1);
		alphabet.put('n',1);
		alphabet.put('o',2);
		alphabet.put('p',3);
		alphabet.put('q',4);
		alphabet.put('r',5);
		alphabet.put('s',6);
		alphabet.put('t',7);
		alphabet.put('u',8);
		alphabet.put('v',9);
		alphabet.put('w',10);
		alphabet.put('x',11);
		alphabet.put('y',12);
		alphabet.put('z',13);
		}

	static String FILE_NAME = "/words.txt";
	
	public static void main(String[] args) throws Exception {
		File file = new File(Zipwords.class.getResource(FILE_NAME).getFile());
	    List<String> lines = Files.readAllLines(file.toPath());

	     for (String word : lines) {
	    	word = word.trim().toLowerCase();
	    	 if (word.length()==0) {
	    		 break;
	    	 }
	    	int zipScore = 0;
			for (Character c : word.toCharArray()) {
				if (!alphabet.containsKey(c)) {
					continue;
				}
				 zipScore += alphabet.get(c);
			 }
	    	 if (zipScore == 0) {
	    		 System.out.println(word);
	    	 }
	    	 
	     }		
	}

}
