public class employe {
    public String nom;
    public String prenom;
    public int tel;
    
    public employe(String nom, String prenom,int tel){
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
    }
    public String toString(){
        return("les propiete d un employe sont :"+nom+"\n"+prenom+"\n")+("le numero de telephone:"+tel);
        
    }
  
    
    public int getTel(){
        return tel;
    }
    public void setTel(int tel){
        this.tel=tel;
    }
    
}
