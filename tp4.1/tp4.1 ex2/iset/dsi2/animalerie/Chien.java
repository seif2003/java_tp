package iset.dsi2.animalerie;

public class Chien extends Animal{
	private String race;
	Chien(){};
	Chien(String r,String c,int p){
		super(c,p);
		this.race = r;
	}
}
