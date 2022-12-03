public class executif extends fonctionnel {
    private int tel;

    public executif(String nom, String prenom){
        super(nom,prenom,0,"service_interuer");
       
        
    }
    public int getTel(){
        return(this.tel);
    }
    public void setTel(int num_tel){
        this.tel =num_tel;
    }
    public String toString(){
        super.toString();
        return("");
    }
    
}
