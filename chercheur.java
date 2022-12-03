public class chercheur extends CorpsEnseignant{
    private String pole;
    private int nb_publication;
    public chercheur(String nom, String prenom,int tel,String domaine,String pole,int nb_publication){
        super(nom,prenom,tel,domaine);
        this.pole=pole;
        this.nb_publication=nb_publication;
    }
    public int nb_publication(){
        return this.nb_publication;
    }
    public String toString(){
        super.toString();
        return("pole de recherche:"+pole+"\n le nombre de publication : "+nb_publication);
    }
}
