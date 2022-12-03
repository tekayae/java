public class CorpsEnseignant extends employe{
    private String domaine;
    
public CorpsEnseignant(String nom, String prenom,int tel,String domaine){
    super(nom,prenom,tel);
    this.domaine=domaine;
}
  
    public String toString(){
        super.toString();
        return("Domaine de prédilection :"+domaine);
    }
}
