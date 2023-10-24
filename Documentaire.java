package ds2020;

public class Documentaire extends Film {
	private String sujet;
	private final float tarif=2.0f;
	
	public Documentaire(String titre, String r, String pays, int d,String sujet) {
		super(titre, r, pays, d);
		this.sujet=sujet;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ " - "+sujet+" a "+tarif+" Dt ");
	}
	@Override
	public float totalVenteBillets () {
		return nbPlaces*tarif;
	}
	
}
