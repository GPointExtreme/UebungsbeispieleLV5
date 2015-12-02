
public class Anlage {
	
	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter = 0;

	//Konstruktor muss gleich wie die Klasse heißen du Pfeife!!!
	public Anlage (String Bezeichnung, double initialWert, int nutzungsdauer) {
		this.Bezeichnung = Bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initialWert;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}
	
	public void abschreibung() {
		alter++;
		if (alter <= nutzungsdauer)	{
		restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}
	}
	
	public void simulate(int maxJahre, int minWert) {
		int i = 1;
		while (restWert > 0 && i <= maxJahre && restWert > minWert) {
		abschreibung();
		i++;
		System.out.println(restWert + "€ Rest ALter: " + alter);
		}
	}
	
	public Anlage renew(int zusatzWert, int zusatzJahre) {
		Anlage newAnlage = new Anlage (Bezeichnung, getRestWert() + zusatzWert,
				getNutzungsdauer() - getAlter() + zusatzJahre);
		return newAnlage;
	}
	
}

	