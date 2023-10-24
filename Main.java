package ds2020;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jcc jcc1= new Jcc(2,2021 );
		Film d1= new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
		Film f1= new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
		f1.setNbPlaces(30);
		d1.setNbPlaces(45);
		jcc1.ajoutFilm(f1);
		jcc1.ajoutFilm(d1);
		jcc1.listeFilmsJCC();
		System.out.println();
		System.out.println("Total Vente Documentaire: " +d1.totalVenteBillets() + " Dt.");
		System.out.println("Total Vente Film: " +f1.totalVenteBillets() + " Dt.");
		System.out.println("Total VenteJcc : " +jcc1.totalVenteBilletsJCC() + " Dt.");
	}

}
