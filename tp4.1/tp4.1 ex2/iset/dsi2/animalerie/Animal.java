package iset.dsi2.animalerie;


public class Animal {
	protected String couleur;
	protected int poids=20;
	Animal(){}
	Animal(String couleur, int poids){
		this.couleur= couleur;
		this.poids=poids;
	}
	public void boire(){
		System.out.println("je bois de l'eau");
	}
	public void manger(){
		System.out.println(" je mange de la nourriture");
	}
	public void crier(){
		System.out.println(" Je crie ");
	}
	public String toString() {
		return (" Je suis un objet de " +this.getClass()+", je suis de couleur "+ this.couleur +" et je pèse " + this.poids+" kg "); 
	}
	public void decrisToi(){
		System.out.println(this.toString());
	}
}