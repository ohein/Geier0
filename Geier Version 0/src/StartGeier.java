
public class StartGeier {

	public static void main(String[] args) {
		HolsDerGeier hdg = new HolsDerGeier();
		try{
			hdg.ganzesSpiel();
		} catch (Exception e){
			System.out.println("Fehler!");
		}
	}
}
