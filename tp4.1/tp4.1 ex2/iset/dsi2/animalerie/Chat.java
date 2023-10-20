package iset.dsi2.animalerie;

public class Chat extends Animal {
	private boolean sauvage;
	Chat(){};
	Chat(boolean s,String c,int p){
		super(c,p);
		this.sauvage = s;
	}
}
