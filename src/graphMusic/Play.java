package graphMusic;

import jm.music.data.*;
import jm.music.tools.*;
import jm.JMC;
import jm.util.*;

public class Play implements JMC {
	//iterate through the words in the string arg
	public static void main(String[] args){
		Phrase phr = new Phrase(0.0);
		Phrase phr2 = new Phrase(10.0);
		Part p = new Part("strings", STRING_ENSEMBLE_1);
		Part p2 = new Part("Piano", PIANO);
		//Part p2 = new Part("triangle", TRIANGLE);
		Score s = new Score();
		
		String word = "aaaabbbbbbbbccccccccccdddddeeeeeeeeeeeeeeeeeffffffffffffffaaaaaaaaaaaaaabbbbbbbb";
		String word2 = "af dsaj j alf jkal;f jdjabkj akvjkbbb bjewalj;j ccjeaiefejwfj aekljf;las jkvne jaj fel ajf;a";

		for(int j=0;j<word2.length();j++) {
			
			if(word2.charAt(j) == 'a') {
				Note n = new Note(a4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'b') {
				Note n = new Note(b4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'c') {
				Note n = new Note(c4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'd') {
				Note n = new Note(d4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'e') {
				Note n = new Note(e4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'f') {
				Note n = new Note(f4,Q);
				phr2.addNote(n);
			}
			
			if(word2.charAt(j) == 'g') {
				Note n = new Note(g4,Q);
				phr2.addNote(n);
			}
			if(word2.charAt(j) == ' '){
				Note n = new Note(REST, Q);
				phr2.addNote(n);
			}
			
		}
		
		for(int j=0;j<word.length();j++) {
		
			if(word.charAt(j) == 'a') {
				Note n = new Note(a4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'b') {
				Note n = new Note(b4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'c') {
				Note n = new Note(c4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'd') {
				Note n = new Note(d4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'e') {
				Note n = new Note(e4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'f') {
				Note n = new Note(f4,Q);
				phr.addNote(n);
			}
			
			else if(word.charAt(j) == 'g') {
				Note n = new Note(g4,Q);
				phr.addNote(n);
			}

			
		}



	Mod.repeat(phr2, 5);
	Mod.repeat(phr, 5);

	p.addPhrase(phr);
	p2.addPhrase(phr2);
	s.addPart(p);
	s.addPart(p2);
	
	View.sketch(s);
	Write.midi(s, "LetterMelody17.mid");
	
}
}