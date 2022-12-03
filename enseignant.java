public class enseignant extends CorpsEnseignant {
    private String matiere;

    public enseignant(String nom, String prenom,int tel,String domaine,String matiere){
        super(nom,prenom,tel,domaine);
        this.matiere=matiere;
    }
    public String toString(){
        super.toString();
        return("matiere:"+matiere);

    }
}
