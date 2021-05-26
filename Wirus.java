public abstract class Wirus {
	protected String dna;
	private int liczbaMutacjiNaMiesiac;


	Wirus(String dna, int liczbaMutacjiNaMiesiac) {
		this.dna = dna;
		this.liczbaMutacjiNaMiesiac = liczbaMutacjiNaMiesiac;
	}


	public int dajLiczbeMutacjiNaMiesiac() {
		return liczbaMutacjiNaMiesiac;
	}


	public abstract void mutuj();


	public boolean sprawdzCzySzczepionkaZadziala(String dnaSzczepionki) {
		for (int i = 0; i < dna.length() - dnaSzczepionki.length(); i++) {
			boolean czySzczepionkaZadziala = true;

			for (int j = 0; j < dnaSzczepionki.length(); j++) {
				if (dna.charAt(i + j) != dnaSzczepionki.charAt(j)) {
					czySzczepionkaZadziala = false;
				}
			}

			if (czySzczepionkaZadziala) {
				return true;
			}
		}

		return false;
	}
}
