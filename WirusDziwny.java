import java.util.Random;


public class WirusDziwny extends Wirus {
	private Random rand = new Random();


	WirusDziwny(String dna, int liczbaMutacjiNaMiesiac) {
		super(dna, liczbaMutacjiNaMiesiac);
	}


	public void mutuj() {
		int a = rand.nextInt(dna.length());
		int b = rand.nextInt(dna.length());
		while (b == a) {
			b = rand.nextInt(dna.length());
		}

		char tablicaDna[] = dna.toCharArray();
		char zamiennik = tablicaDna[a];
		tablicaDna[a] = tablicaDna[b];
		tablicaDna[b] = zamiennik;
		dna = String.valueOf(tablicaDna);
	}
}
