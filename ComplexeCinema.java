public class ComplexeCinema {
    private String nom;
    private int NBsalle;
    private int numero;
    SalleCinema [] salle=new SalleCinema[NBsalle];

    
    public ComplexeCinema(String nom,int nbp,int numero,SalleCinema[]salle){
        this.nom=nom;
        NBsalle=nbp;
        this.numero=numero;
        this.salle=salle;

    }
    public void afficheSalle(int n){
                System.out.println("les propiété de la salle sont:"+salle[n]);
        
    }

    public int getNBsalle(){
        return NBsalle;
    }
    public void affiche(){
        System.out.println("le nom du complexe:"+nom+"le numéro de la salle:"+numero+"le nombre de salle:"+NBsalle);

    }
    public double chiffreAffaire(){
        double a=0;
        int i;
        for(i=0;i<salle.length;i++){
            a=a+salle[i].chiffreAffaire();
        }
        return a;

    }
    public double chiffreAffaireMoy(){
        return chiffreAffaire()/NBsalle;
    }
    public double tauxRemplissageSalle(int n){
        return salle[n].tauxRemplissage();
    }
    public double tauxRemplissageGlobal(int n){
        double taux=0;
        int i;
        for(i=0;i<salle.length;i++){
            taux=taux+salle[i].tauxRemplissage();
               }
    return taux;
    }
    public void remiseAzero(){
        int i;
        for(i=0;i<salle.length;i++){
            salle[i].remiseAZero();
        }
    }
    public int nbPlacesDisponibles(int n){
        return salle[n].nbPlacesDisponibles();
    }
    public void vendrePlaces(int numS,int nb,boolean reduit){
        salle[numS].vendrePlaces(nb, reduit);
    }
    
    
    
    
}
