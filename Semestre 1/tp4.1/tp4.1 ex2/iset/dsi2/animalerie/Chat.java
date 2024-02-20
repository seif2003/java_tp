package iset.dsi2.animalerie;

public class Chat extends Animal {
	private boolean sauvage;
	Chat(){};
	Chat(boolean s,String c,int p){
		super(c,p);
		this.sauvage = s;
	}
	public String toString() {
		if(sauvage){
			return (" Je suis un objet de " +this.getClass()+", je suis de couleur "+ super.couleur +" et je pèse " + super.poids+" kg je suis sauvage"); 
		}
		return (" Je suis un objet de " +this.getClass()+", je suis de couleur "+ super.couleur +" et je pèse " + super.poids+" kg je suis domestique"); 
	}
	public void boire(){
		System.out.println("je bois de l'eau");
	}
	public void manger(){
		System.out.println(" je mange de la nourriture");
	}
	public void crier(){
		System.out.println(" Je Miauler ");
	}
	public void decrisToi(){
		System.out.println(this.toString());
	}
}
