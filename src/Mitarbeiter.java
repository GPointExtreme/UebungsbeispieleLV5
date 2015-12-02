
public class Mitarbeiter {

		// TODO Auto-generated method stub
		private String Vorname;
		private String Nachname;
		private int Mitarbeiternummer;
		private double Gehalt;
		private int Alter;
		private static int counter = 1;
	
	public Mitarbeiter(String Vorname, String Nachname, double Gehalt) {
	this.Vorname = Vorname;
	this.Nachname = Nachname;
	this.Mitarbeiternummer = counter++;
	this.Gehalt = Gehalt;
	}
	
	public double monatsAbrechnung() {
		double jahresGehalt = (Gehalt * 12) * 0.80;
		double steuer = 0;
		if (jahresGehalt > 50000) {
			steuer += (jahresGehalt - 50000) * 0.60;
			jahresGehalt = 50000;
		}
		if (jahresGehalt > 30000) {
			steuer += (jahresGehalt - 30000) * 0.45;
			jahresGehalt = 30000;
		}
		if (jahresGehalt > 20000) {
			steuer += (jahresGehalt - 20000) * 0.32;
			jahresGehalt = 20000;
		}
		if (jahresGehalt > 10000) {
			steuer += (jahresGehalt - 10000) * 0.20;
			jahresGehalt = 10000;
		}
		steuer += jahresGehalt * 0.10;
				
		return (Gehalt * 12 * 0.8 - steuer) / 12.0;
	}
	
	public double jahresAbrechnung(int monate) {
		return monatsAbrechnung() * monate;
	}
	
	public double jahresAbrechnung() {
		return monatsAbrechnung() * 12;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public double getGehalt() {
		return Gehalt;
	}

	public void setGehalt(double gehalt) {
		Gehalt = gehalt;
	}

	public String getVorname() {
		return Vorname;
	}

	public int getMitarbeiternummer() {
		return Mitarbeiternummer;
	}

	public int getAlter() {
		return Alter;
	}

}

