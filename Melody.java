package melodies;

import jm.music.data.*;
import jm.music.tools.*;
import jm.JMC;
import jm.util.*;

public class Melody1 implements JMC {
	//iterate through the words in the string arg
	public static void main(String[] args){
		Phrase phr = new Phrase();
		Part p = new Part("piano", PIANO);
		Score s = new Score();
		
		String[] sentence= {"I", "love", "cats", "so", "much", "seriously", "omg", "and", "dogs"
				, "and", "everyone", "I", "know"};
		
	for(int i=0; i<sentence.length;i++) {
		System.out.println("Word "+i+" is "+sentence[i]);
		String word = sentence[i];
		for(int j=0;j<word.length();j++) {
		
			if(word.charAt(j) == 'a') {
				Note n = new Note(a4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'b') {
				Note n = new Note(b4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'c') {
				Note n = new Note(c4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'd') {
				Note n = new Note(d4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'e') {
				Note n = new Note(e4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'f') {
				Note n = new Note(f4,Q);
				phr.addNote(n);
			}
			
			if(word.charAt(j) == 'g') {
				Note n = new Note(g4,Q);
				phr.addNote(n);
			}
		}

	}
	Mod.repeat(phr, 5);
	p.addPhrase(phr);
	s.addPart(p);
	Write.midi(s, "LetterMelody4.mid");
	
}
}
