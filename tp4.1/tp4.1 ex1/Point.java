
public class Point{
	char nom;
	int abs;
	int ord;
	public Point(){
		nom = 'O';
		abs = 0;
		ord = 0;
	}
	public Point(char ch,int x,int y){
		nom = ch;
		abs = x;
		ord = y;
	}
	public Point(Point p){
		nom = p.nom;
		abs = p.abs;
		ord = p.ord;
	}
	public void afficher(){
		System.out.println(nom+"("+abs+","+ord+")\n");
	}
	public void deplacer(int x,int y){
		abs += x;
		ord += y;
	}
	public void reset(){
		abs = 0;
		ord = 0;
	}
	public String toString(){
		return(nom+"("+abs+","+ord+")");
	}
	public boolean coïncide_V1(Point p){
		return (p.nom == nom && p.abs == abs && p.ord == ord);
	}
	public boolean coincide_V2(Point a,Point b){
		return (a.nom == b.nom && a.abs == b.abs && a.ord == b.ord);
	}

}