package ds2020;
public class Jcc {
	private Film [] competition;
	private int annee;
	private final int NBFMAX=30;
	private int nbF=0;
	
	public Jcc(int taille, int annee) {
		this.annee=annee;
		if(taille<NBFMAX) {
		this.competition=new Film[taille];
		}
		else System.out.println("donner un nbr < 30 !");
		
	}
	
	void ajoutFilm(Film f) {
		if (nbF<competition.length) {
			competition[nbF]=f;
			nbF++;
		}
		else 
			System.out.println(" Impossible d'ajouter !");
	}
	 void listeFilmsJCC (){
		for(int i=0; i<competition.length;i++)
		{
			System.out.println(competition[i].toString()+" et il y'a "+competition[i].nbPlaces+" places. ");
		}
	 }
	 
	 public double totalVenteBilletsJCC () {
		 double totalV=0;
		 for(int i=0; i<competition.length;i++) {
			 totalV+=competition[i].totalVenteBillets();
		 }
		 return totalV;
	 }
	 
	
}
