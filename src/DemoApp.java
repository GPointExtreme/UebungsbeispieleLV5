
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anlage tisch = new Anlage("tisch", 899, 7);
		tisch.abschreibung();
		tisch.simulate(5, 200);
		
		System.out.println(tisch.getRestWert());
		
		tisch.simulate(6, 500);
		Anlage newAnlage = tisch.renew(1000, 3);
		System.out.println(newAnlage.getRestWert());

	}

}
