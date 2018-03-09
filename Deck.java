package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;
import java.util.Collections;
//private Random random = new Random();


public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>(52);
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public Deck(int iNumOfDecks) throws Exception {
		if (iNumOfDecks <1)
			throw new Exception("NumOfDecks <1");
		for(int a = 0; a < iNumOfDecks; a++) {
			for(eSuit eSuit: eSuit.values()) {
				for(eRank eRank: eRank.values()) {
					cards.add(new Card(eRank,eSuit));
				}
			}
			Collections.shuffle(cards);
		}
//		for (Card c: cards) {
//			System.out.print(c.geteSuit());
//			System.out.print(' ');
//			System.out.print(c.geteRank());
//		}
//		Collections.sort(cards);
	}
	
	public Deck() throws Exception{
		this(1);

	}
	
	public Card draw() throws Exception {
		//return cards.get((int) Math.random()*cards.size());
		if (cards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
	}
}
