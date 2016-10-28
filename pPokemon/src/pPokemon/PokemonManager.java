package pPokemon;

import java.util.ArrayList;


public class PokemonManager {

	public static void main(final String[] args) {
		ArrayList<Pokemon> pok;
		
		Trainer ash = new Trainer("Ash", "Ketchum");
		Trainer maunzi = new Trainer("Maunzi", "The Cat");		
		
		Pokemon glumanda = new Pokemon("Glumanda", Type.FIRE);
		Pokemon bisasam = new Pokemon("Bisasam", Type.POISON);
		Pokemon smogon = new Pokemon("Smogon", Type.POISON);

		Pokemon vulpix = new Pokemon("Vulpix", Type.FIRE);
		Pokemon arbok = new Pokemon("Arbok", Type.POISON);
		Pokemon krabby = new Pokemon("Krabby", Type.WATER);
		
		System.out.println("Trainer und Pokemons erstellt.");	
		
		ash.addPokemon(glumanda);
		ash.addPokemon(bisasam);
		ash.addPokemon(smogon);
		
		System.out.println("Pokemons zu Ash zugeordnet.");
		
		maunzi.addPokemon(vulpix);
		maunzi.addPokemon(arbok);
		maunzi.addPokemon(krabby);
		
		System.out.println("Pokemons zu Maunzi zugeordnet.");

		
		System.out.println("Ash besitzt diese Pokemons:");
		pok = ash.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}

		System.out.println("Maunzi besitzt diese Pokemons:");
		pok = maunzi.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}

		Swap swap1 = new Swap("Tausch 1", ash, maunzi, bisasam, arbok);
		swap1.execute();
		Swap swap2 = new Swap("Tausch 2", ash, maunzi, bisasam, krabby);
		krabby.setSwapAllow(false);
		swap2.execute();
		
		Swap swap3 = new Swap("Tausch 3", ash, maunzi, smogon, vulpix);
		swap3.execute();
		
		System.out.println("Ash besitzt diese Pokemons:");
		pok = ash.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}

		System.out.println("Maunzi besitzt diese Pokemons:");
		pok = maunzi.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}
		
		Competition comp1 = new Competition("Kampf 1 ", ash, maunzi, 
				bisasam, krabby);
		comp1.execute();

		Competition comp2 = new Competition("Kampf 2 ", ash, maunzi, 
				glumanda, arbok);
		comp2.execute();

		System.out.println("Ash besitzt diese Pokemons:");
		pok = ash.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}

		System.out.println("Maunzi besitzt diese Pokemons:");
		pok = maunzi.getAllPokemons();
		for (int i = 0; i < pok.size(); i++) {
			System.out.println(pok.get(i).toString());
		}		
		
	}

}
