package iset.dsi2.animalerie;

public class Chien extends Animal{
	private String race;
	Chien(){};
	Chien(String r,String c,int p){
		super(c,p);
		this.race = r;
	}
	
	public String toString() {
		return (" Je suis un objet de " +this.getClass()+", je suis de couleur "+ super.couleur +" et je pèse " + super.poids+" kg mon rance est :"+race); 
	}
	public void boire(){
		System.out.println("je bois de l'eau");
	}
	public void manger(){
		System.out.println(" je mange de la nourriture");
	}
	public void crier(){
		System.out.println(" J aboie ");
	}
	public void decrisToi(){
		System.out.println(this.toString());
	}
}
