package ds2020;
import java.util.Scanner;

public class Film {
	protected String titre;
	protected String realisteur;
	protected String pays;
	protected int durée;
	protected int nbPlaces;
	
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	
	public Film(String titre, String r, String pays, int d) {
		this.titre=titre;
		this.realisteur=r;
		this.pays=pays;
		this.durée=d;
	}
	@Override
	public String toString() {
		return (this.titre+" de "+ this.realisteur+" ("+this.pays+") - "+this.durée+"min. ");
	}
	
	public float totalVenteBillets () {
		System.out.println("Donner nbPLaceEtudiane : ");
		Scanner sc= new Scanner(System.in);
		int placeE=0;
		while(true) {
			int p=sc.nextInt();
			if(p<=nbPlaces)
			{
				placeE=p;
			}
			else 
				System.out.println("Invalide.");
		
		int placePub=nbPlaces-placeE;
		return placeE*2+placePub*3;
		
	}}
	
	
}
