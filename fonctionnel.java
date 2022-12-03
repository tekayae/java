public class fonctionnel extends employe {
    private String service_attache;

    public fonctionnel(String nom, String prenom,int tel,String service_attache){
        super(nom,prenom,tel);
        this.service_attache=service_attache;
    }
    /*public String getServiceAttachge(){
        return service_attache;
    }
    public void setServiceAttachge(String service_attachage){
        this.service_attache=service_attache;
    }*/
    public String toString(){
        super.toString();
        return("service d attache :"+service_attache);
    }
}
