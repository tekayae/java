public class testSalleCinema{
    public static void main(String [] args){
    SalleCinema s1= new SalleCinema(2,"chat blanc",50,8);
    System.out.println("salle 1");
    System.out.println(s1);
    System.out.println("nombre de places disponibles:"+s1.nbPlacesDisponibles());
    s1.vendrePlaces(2, false);
    System.out.println("le chiffre d affaire:"+s1.chiffreAffaire());
    System.out.println("Le taux de remplissage de la salle 1:"+s1.tauxRemplissage());
    System.out.println(s1);

    
    }

   }
