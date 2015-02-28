package algorithmicMusic;

import jm.music.data.*;
import jm.music.tools.Mod;
import jm.util.*;
import jm.JMC;

public class music implements JMC{
	
	static Score ascore = new Score("testing");
	static int partCounter = 1;

	public static void main(String[] args) {
		double[] phraseOne = {C4, QUARTER_NOTE, WHOLE_NOTE};
		double[] phraseTwo = {REST, EIGHTH_NOTE, E4, EIGHTH_NOTE, QUARTER_NOTE};
		double[] phraseThree = {F4, EIGHTH_NOTE, QUARTER_NOTE};
		double[] phraseFour = {FS2, SIXTEENTH_NOTE, REST};
		double[] phraseFive = {C4, QUARTER_NOTE, E4, QUARTER_NOTE, EIGHTH_NOTE};
		
		notesToPart(phraseOne, 0.0, 48, CLARINET);
		notesToPart(phraseTwo, 4.0, 9, FLUTE);
		notesToPart(phraseThree, 0.0, 10, NYLON_GUITAR);
		notesToPart(phraseTwo, 20.0, 7, FLUTE);
		notesToPart(phraseThree, 32.0, 7, HORN);

		
		//ascore.setTempo(140.0);
		
		Write.midi(ascore, "manyInst3.mid");
	}
	
	private static void notesToPart(double[] notes, double startTime, int repeats, int instrument){
		//new phrase, and loop
		Phrase phrase = new Phrase(startTime);
		phrase.addNoteList(notes);
		Mod.repeat(phrase, repeats);
		
		Part part = new Part("Part " + partCounter, instrument);
		part.addPhrase(phrase);
		
		partCounter++;
		
		ascore.addPart(part);

	}

	private final void first(){
		Score s = new Score(new Part(new Phrase(new Note(C4, MINIM))));
		Write.midi(s, "Test.mid");
	}
	
	private final void randomRhythm(){
		Score score = new Score("Random Rhythm");
		Part inst = new Part ("Steel_Drum", 0, 9);
		Phrase phrase = new Phrase(0.0);
		
		
		Part violin = new Part ("Violin", 0, 9);
		Phrase violinPhrase = new Phrase(0.0);
		
		for(short i=0; i<24; i++){
			Note note = new Note(38, Math.random()*4);
			phrase.addNote(note);
		}
		
		for(int i=0; i<24; i++){
			Note note = new Note(C4, QUARTER_NOTE);
			violinPhrase.addNote(note);
		}
		
		inst.addPhrase(phrase);
		inst.addPhrase(violinPhrase);
			score.addPart(inst);
		Write.midi(score, "randomRhythm5.mid");
	}
}
