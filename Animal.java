
public class Animal{

	
    private int poid;
    private String nom;
    private boolean etat;
    private int age;

	

	

    public boolean isEtat() {
        return this.etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoid() {
        return this.poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Animal(String nom,int poid,boolean etat,int age){
        this.nom=nom;
        this.poid=poid; 
        this.etat=etat;
        this.age=age;
    }
    public Animal(){
        this.nom="undefined";
        this.poid=0; 
        this.etat=true;
        this.age=0;
    }
    public Animal(String nom,int poid){
        this.nom=nom;
        this.poid=poid; 
        this.etat=true;
        this.age=0;
    }

    public void affiche(){
        System.out.println("l'animal s'appelle "+nom+" il a "+age+" ,pese "+poid+" et son etat est "+ etat);
    }

    public String typeAnimal(){
        return "animal";
    }
}