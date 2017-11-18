import java.util.ArrayList;

public class Random {
	/**
	 * Hier definieren Sie die Attribute Ihrer Klasse Beispiel: private <Typ>
	 * Name_des_Attributs
	 */
	/* Hier stehen die Karten, die noch nicht gespielt wurden */
	private ArrayList<Integer> nochNichtGespielt = new ArrayList<Integer>();

	/**
	 * Hier definieren Sie den Konstruktor fuer Objekte Ihrer Klasse (falls Sie
	 * einen eigenen brauchen) Random
	 */
	public Random() {
		// Meine Karten
		for (int i = 1; i <= 15; i++)
			nochNichtGespielt.add(i);
	}

	/**
	 * Spiele zufaellig eine Karte
	 */
	private int spieleZufallskarte() {
		int nochVorhanden = nochNichtGespielt.size();
		int index = (int) (Math.random() * nochVorhanden);
		int ret = nochNichtGespielt.remove(index);
		return ret;
	}

	public int gibKarte(int naechsteKarte) {

		return spieleZufallskarte();

	}
}
