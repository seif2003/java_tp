package td3ex2;

public class MotDico {
	private static int lastNum = 0;
	private int num;
	private String mot;
	private String definition;
	
	MotDico(){
		this.num = lastNum;
		lastNum += 1;
	}
	MotDico(String m,String def){
		this.mot = m;
		this.definition = def; 
		this.num = lastNum;
		lastNum += 1;
	}
	String getMot(){
		return this.mot;
	}
	String getDefinition() {
		return this.definition;
	}
	void setDefinition(String s) {
		this.definition = s;
	}
	void setMot(String s) {
		this.mot = s;
	}
	public String toString() {
		return ("MOT : "+this.mot+"\nDEFINITION : "+this.definition);
	}
	boolean synonyme(MotDico m) {
		return m.getDefinition() == this.definition;
	}
}
