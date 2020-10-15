import java.io.*;
import java.util.*;

//import jdk.nashorn.internal.runtime.ListAdapter;
//viellir tuer et choix type
public class Gestion{

    public static void main(final String[] args) {

        Vector<Animal> ListeARemplir = new Vector<Animal> ();
        //ArrayList<Animal> ListeARemplir = new ArrayList<Animal>() ;

        while (true){
            menu();
            int choix = saisie_entier();
            if (choix == 1)
            {
                TableauAnimaux(ListeARemplir);
            }
            else if (choix == 2)
            {
                afficherList(ListeARemplir);
                
            }
            else if (choix == 3)
            {
                changerPoid(ListeARemplir);
            }
            else if (choix == 4)
            {
                changerEtat(ListeARemplir);
            }
            else 
            {
                System.exit(0);
            }
        }
        
        

    }

    public static void menu(){
        System.out.println("1.saisie info");
        System.out.println("2.afficher");
        System.out.println("3.changer le poid");
        System.out.println("4.changer etat");
        System.out.println("Pour quitter cliquer n'importe quelle touche");
    }
    public static Vector<Animal> TableauAnimaux(Vector<Animal>ListeARemplir){
    //public static ArrayList <Animal> TableauAnimaux(ArrayList<Animal> ListeARemplir){

        System.out.println("Quelle type ?");
        System.out.println("1.Animal");
        System.out.println("2.Souris");
        int type=saisie_entier();

        if (type==1)
        {
        System.out.println("combien de fois");
        int nombredefois=saisie_entier();

        for (int i=0;i<nombredefois;i++)
        {
            Animal pokemon = CreerAnimal();
            ListeARemplir.add(pokemon);
        }
        }
        else if (type==2)
        {
            System.out.println("combien de fois");
            int nombredefois=saisie_entier();

            for (int i=0;i<nombredefois;i++){
                Souris pokemon = CreerSouris();
                ListeARemplir.add(pokemon);
        }
        }
        
        return ListeARemplir;

    }

    public static Souris CreerSouris(){

        System.out.println("donne nom");
        String nom = saisie_chaine();
        System.out.println("donne poid");
        int poid = saisie_entier();
        System.out.println("donne age");
        int age = saisie_entier();
        boolean etat = true;
        System.out.println("quelle genre de cri ?");
        String cri = saisie_chaine();
        Souris pokemon = new Souris (nom,poid,etat,age,cri);
        return pokemon;
    }

    public static Animal CreerAnimal(){
        
        System.out.println("donne nom");
        String nom = saisie_chaine();
        System.out.println("donne poid");
        int poid = saisie_entier();
        System.out.println("donne age");
        int age = saisie_entier();
        boolean etat = true;
        Animal pokemon = new Animal(nom,poid,etat,age);
        return pokemon;

    }
    
    public static void afficherList(Vector<Animal> ListeARemplir){
    //public static void afficherList(ArrayList<Animal> ListeARemplir){

        
        for (int i=0;i<ListeARemplir.size();i++){
            //System.out.println("l'animal s'appelle "+ListeARemplir.get(i).getNom()+" et son poid est "+ListeARemplir.get(i).getPoid());//d'abord le nom de la list . recupere l'objet a l'index . on ajoute le getteur du nom 
            //System.out.println("il a "+ListeARemplir.get(i).getAge()+" ans et son etat est "+ListeARemplir.get(i).isEtat()+" et c'est un.e "+ListeARemplir.get(i).typeAnimal());
            //System.out.println("cette souris a un cri : "+ListeARemplir.get(i).getCri());
            ListeARemplir.get(i).affiche();
        }
    }
    
    public static Vector<Animal> changerPoid (Vector<Animal> ListeARemplir){
    //public static ArrayList <Animal> changerPoid(ArrayList<Animal> ListeARemplir){
        System.out.println("quelle animal voulez vous changer le poid");
        String nomchoisie = saisie_chaine();

        for (int i = 0;i<ListeARemplir.size();i++){
            if (nomchoisie.equals(ListeARemplir.get(i).getNom()))
            {
                System.out.println("quelle est son nouveau poid a "+ListeARemplir.get(i).getNom());
                int nouveaupoid = saisie_entier();
                ListeARemplir.get(i).setPoid(nouveaupoid);
            }
            else
            {
                System.out.println("l'animal n'existe pas!!!");
            }
        }
        return ListeARemplir;
    }

    public static Vector<Animal> changerEtat(Vector<Animal>ListeARemplir){
    //public static ArrayList <Animal> changerEtat(ArrayList<Animal> ListeARemplir){
        System.out.println("quelle animal voulez vous tuer ?");
        String nomchoisie = saisie_chaine();

        for (int i = 0;i<ListeARemplir.size();i++){
            if (nomchoisie.equals(ListeARemplir.get(i).getNom()))
            {
                
                System.out.println("Cette animal est mort ! :"+ListeARemplir.get(i).getNom());
                ListeARemplir.get(i).setEtat(false);
            }
            else
            {
                System.out.println("l'animal n'existe pas!!!");
            }
        }
        return ListeARemplir;
    }
    public static int saisie_entier()
    {
    try
    {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String chaine = buff .readLine();
            int num = Integer.parseInt(chaine);
            return num;
    }   
    catch(IOException e){return 0;}
    }
    public static String saisie_chaine ()
    {
        try{
            BufferedReader buff = new BufferedReader (new InputStreamReader (System.in));
            String chaine = buff.readLine();
            return chaine ;
        }
        catch(IOException e) {
            System.out.println("impossible de travailler"+ e);
            return null ;
        }
        
    }

}