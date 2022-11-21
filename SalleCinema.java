public class SalleCinema {
   public static String numero;
public static String nom;
public static String NBsalle;
public static String n;
private final int numSalle;
   private String titreFilm;
   private int nb_places;
   private float prix;
   private int placestarifNormal;
   private int placestarifReduit;
   public void setTitre(String titre){
    this.titreFilm=titre;
   }
public SalleCinema(int numSalle,String t,int NP, float p){
    System.out.println("Création d'une nouvelle salle");
    this.numSalle=numSalle;
    this.titreFilm=t;
    this.nb_places=NP;
    this.prix=p;
    placestarifNormal=0;
    placestarifReduit=0;

   }
   public int nbPlacesDisponibles(){
    
    return(nb_places-(placestarifNormal + placestarifReduit));
   }
   public void vendrePlaces(int nbr, boolean tarifReduit){

    if (nbr>placestarifReduit)
        System.out.println("la vente n est pas possible il n'y a plus de places \n");
        else{
        float prixVente;
        if(tarifReduit){
            placestarifReduit=placestarifReduit+nbr;
            prixVente=prix * (float)0.8 * nbr;
            System.out.println("Salle"+this.numSalle+" :place vendues :"+nbr+"prix="+prixVente+"à tarif reduit");
        }
    else{
        placestarifNormal=placestarifNormal+nbr;
        prixVente=prix * nbr;
        System.out.println("Salle"+this.numSalle+" :places vendues:"+nbr+"prix ="+prixVente+"à tarif normale");
    }
}
}
   
   
    public void remiseAZero(){
        placestarifNormal=0;
        placestarifReduit=0;
        
    }
   public double chiffreAffaire(){
    return(prix*placestarifNormal+prix*(float)0.8*placestarifReduit);
   }
   public double tauxRemplissage(){
    return(placestarifNormal+placestarifReduit)*100/nb_places;
   }
   public String toString(){
    return("Film joué:"+titreFilm+"\n"
    +"Nombre de places:"+nb_places+"\n"
    +"Prix d une place"+prix+"\n"
    +placestarifNormal+"places vendues au tarif normal \n"
    +placestarifReduit+"places vendu au tarif réduit \n");

   }
    }

