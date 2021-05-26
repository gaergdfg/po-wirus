import java.util.Random;


public class WirusSpecyficzny extends Wirus {
	private int[] pozycjePodatneNaMutacje;
	private char[] mozliweNukleotydyPoMutacji;

	private Random rand = new Random();


	WirusSpecyficzny(
		String dna,
		int liczbaMutacjiNaMiesiac,
		int[] pozycjePodatneNaMutacje,
		char[] mozliweNukleotydyPoMutacji
	) {
		super(dna, liczbaMutacjiNaMiesiac);
		this.pozycjePodatneNaMutacje = pozycjePodatneNaMutacje;
		this.mozliweNukleotydyPoMutacji = mozliweNukleotydyPoMutacji;
	}


	public void mutuj() {
		int pozycja = rand.nextInt(pozycjePodatneNaMutacje.length);
		char[] tablicaDna = dna.toCharArray();
		tablicaDna[pozycja] =
			mozliweNukleotydyPoMutacji[rand.nextInt(mozliweNukleotydyPoMutacji.length)];
		dna = String.valueOf(tablicaDna);
	}
}
