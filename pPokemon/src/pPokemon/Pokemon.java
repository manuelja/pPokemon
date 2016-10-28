package pPokemon;

import java.util.ArrayList;

/**
 * @author manuel
 * This class incorporates all properties and methods of a Pokemon.
 */
public class Pokemon {
	

	private String name;
	private Type type;
	private int number;
	
	private static int nextNumber;
	private ArrayList<Swap> swaps;
	private ArrayList<Competition> competitions;
	private boolean swapAllow = true;

	static {
		nextNumber = 1;
	}
  


	Pokemon(final String pName, final Type  pType) {
		this.name = pName;
		this.type = pType;
		this.number = nextNumber;
		nextNumber++;
		this.swaps = new ArrayList<Swap>();
		this.competitions = new ArrayList<Competition>();		
	}

	public final String toString() {
		String returnString = name + ", " + type + ", "
				+ String.valueOf(number);
		return returnString;		
	}
	
	public final String getName() {
		return name;
	}

	public final void setName(final String pName) {
		// Von einer Klasse koennen mehrere Objekte initialisiert sein;
		// this ist eine objekt-interne Referenz (ein Zeiger) auf sich selbst.
		this.name = pName;
	}

	public final Type getType() {
		return type;
	}

	public final void setType(final Type pType) {
		this.type = pType;
	}

	public final boolean isSwapAllow() {
		return swapAllow;
	}

	public final void setSwapAllow(final boolean swapAllow) {
		this.swapAllow = swapAllow;
	}
	
	public final void addSwap(final Swap pSwap) {
		this.swaps.add(pSwap);
	}

	public final ArrayList<Swap> getAllSwaps() {
		return this.swaps;
	}

	public final void addCompetition(final Competition pCompetition) {
		this.swaps.add(pCompetition);
	}

	public final ArrayList<Competition> getAllCompetitions() {
		return this.competitions;
	}

}
