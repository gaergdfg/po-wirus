public class Doswiadczenie {
	public void main(String[] args) {
		int[] pozycjePodatneNaMutacje = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
		char[] mozliweNukleotydyPoMutacji = new char[] {'A', 'C', 'G', 'T'};
		Wirus wirus = new WirusSpecyficzny(
			"AAAAAAAAA",
			3,
			pozycjePodatneNaMutacje,
			mozliweNukleotydyPoMutacji
		);
		String dnaSzczepionki = "AA";
		int liczbaMiesiecy = 10;

		symuluj(wirus, dnaSzczepionki, liczbaMiesiecy);
	}


	/**
	 * Funkcja symulujaca przebieg mutacji wirusa oraz sprawdzajaca, czy 
	 * podana szczepionka bedzie skuteczna przed a takze po zakonczeniu
	 * mutacji.
	 * Funkcja zmienia dna wirusa.
	 */
	private void symuluj(Wirus wirus, String dnaSzczepionki, int liczbaMiesiecy) {
		System.out.println(wirus.sprawdzCzySzczepionkaZadziala(dnaSzczepionki));

		for (int miesiac = 0; miesiac < liczbaMiesiecy; miesiac++) {
			for (int i = 0; i < wirus.dajLiczbeMutacjiNaMiesiac(); i++) {
				wirus.mutuj();
			}
		}

		System.out.println(wirus.sprawdzCzySzczepionkaZadziala(dnaSzczepionki));
	}
}
