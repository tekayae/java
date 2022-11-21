public class testComplexe {
    public static void main(String args[]){
        
     SalleCinema [] salle=new SalleCinema[3];
     salle[0]=new SalleCinema(2, null, 0, 0);
     salle[1]=new SalleCinema(5, null, 0, 0);
     salle[2]=new SalleCinema(6, null, 0, 0);
     
     int i;
     for(i=0;i<3;i++){
        System.out.println(salle[i]);
     }
     boolean venteTermine=false;
     while(! venteTermine){
        
         System.out.println("le numero de la salle est:"+numero);
         if((salle[i].numero>0) && (numero<salle.length)){
             System.out.println("les informations de la salles sont:"+salle[i].nom+salle[i].numero+salle[i].NBsalle);
 
         }
     }

    }
    
}
