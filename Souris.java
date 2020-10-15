public class Souris extends Animal{
    private String cri;

   public Souris(String nom,int poid,boolean etat,int age,String cri){
        super(nom, poid, etat, age);
        this.cri=cri;
    }

    public String getCri() {
        return this.cri;
    }

    public String typeAnimal(){
        return "souris";
    }

    public void affiche(){
        super.affiche();
        System.out.println("son cri est : "+cri);
    }    
    
}