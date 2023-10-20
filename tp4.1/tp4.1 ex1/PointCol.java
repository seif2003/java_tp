
public class PointCol extends Point {
	private String couleur;
	PointCol(){
		super();
	};
	PointCol(String col,char ch,int x,int y){
		super(ch,x,y);
		this.couleur = col;
	}
	void setCouleur(String col) {
		this.couleur = col;
	}
	void affiche() {
		System.out.println(toString()+" Couleur : "+this.couleur);
	}
}
