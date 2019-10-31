package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg [] itab;
	private int nesteLedige;
	

	public Blogg() {
		
		itab = new Innlegg[20];
				
	}

	public Blogg(int lengde) {
		itab = new Innlegg [lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
	
			return nesteLedige;	
	}
	
	public Innlegg[] getSamling() {
		Innlegg [] samling = new Innlegg[itab.length];
		
		return samling;
		
	}

	public int finnInnlegg(Innlegg innlegg) {
	for(int i = 0; i <itab.length; i++) {
		if(innlegg==itab[i]) {
			return 1;
		}
	}
	return -1;
	}
	

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		
		if(finnInnlegg(innlegg) >= 0) {
			funnet = true;
		}
		return funnet;
		
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if(nesteLedige < itab.length) {
			ledig = true;
			
		}
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		boolean lagtTil = false;
		
		if(ledigPlass() && !finnes(innlegg)) {
			itab[nesteLedige] = innlegg;
			lagtTil = true;
			nesteLedige++;
			
		}
		return lagtTil;
	}
	
	public String toString() {
		
		String a = getAntall() + "\n"; 
		
		for(int i = 0; i  < itab.length; i++) {
			a += itab[i].toString();
		}
		
		System.out.print(a);
		return a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}