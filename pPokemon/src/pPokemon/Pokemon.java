package pPokemon;

import java.util.List;

/**
 * @author manuel
 * This class incorporates all properties and methods of a Pokemon.
 */
public class Pokemon {
	

	/**
	 * The name of the Pokemon, e. g. Pikachu.
	 */
	private String name;
	/**
	 * This is the type of the pokemon in the enum Type.
	 */
	private Type type;
	private int number;
	
	private static int nextNumber;
	private List<Swap> swaps;
	private List<Competition> competitions;
	private boolean swapAllow = true;

	static {
		nextNumber = 1;
	}
  


	Pokemon(final String pName, final Type  pType) {
		this.name = pName;
		this.type = pType;
		this.number = nextNumber;
		nextNumber++;
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
	/**
	 * @return the swapAllow
	 */
	public final boolean isSwapAllow() {
		return swapAllow;
	}

	/**
	 * @param swapAllow the swapAllow to set
	 */
	public final void setSwapAllow(final boolean swapAllow) {
		this.swapAllow = swapAllow;
	}
	
	public final void addSwap(Swap pSwap) {
		this.swaps.add(pSwap);
	}

	public final List<Swap> getAllSwaps() {
		return this.swaps;
	}

	public final void addCompetition(Competition pCompetition) {
		this.swaps.add(pCompetition);
	}

	public final List<Competition> getAllCompetitions() {
		return this.competitions;
	}

}
