
public class MitarbeiterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mitarbeiter MaxMustermann = new Mitarbeiter("Max", "Mustermann", 28000/12.0);
		
		System.out.println(MaxMustermann.monatsAbrechnung());
		System.out.println(MaxMustermann.jahresAbrechnung());

	}

}
