package algorithmicMusic;

import jm.music.data.*;
import jm.util.*;
import jm.JMC;

public class music implements JMC{

	public static void main(String[] args) {
		Score score = new Score("Random Rhythm");
		Part inst = new Part ("Snare", 0, 9);
		Phrase phrase = new Phrase(0.0);
		
		for(short i=0; i<24; i++){
			Note note = new Note(38, Math.random()*4);
			phrase.addNote(note);
		}
		
		inst.addPhrase(phrase);
			score.addPart(inst);
		Write.midi(score, "randomRhythm.mid");

	}

	private final void first(){
		Score s = new Score(new Part(new Phrase(new Note(C4, MINIM))));
		Write.midi(s, "Test.mid");
	}
}
