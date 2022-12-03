public class test_emp {
   public static void main (String [] args){
   
    employe e1 = new employe("malek", "hsin", 54962436);
    fonctionnel f = new fonctionnel("malek", "jerbi", 53695234, "Formation");
     
    executif e = new executif("ahmed", "bensallah");
    enseignant eg = new enseignant("mohamed", "bensallah", 52648965, "domaine2", "java");
    chercheur c = new chercheur("fathi", "hamdi", 53654962, "domaine3", "pole numero 1", 0);
    System.out.println(e1.toString());
    System.out.println(f.toString());
    System.out.println(e.toString());
    System.out.println(eg.toString());
    System.out.println(c.toString());
    c.nb_publication();

   } 
}
