
public class LotissementPrivee extends Lotissement{
	LotissementPrivee(int i){
		super(i);
	}
	public boolean ajouter(Propriete p) {
		if(nombre<tabProp.length && p instanceof ProprietePrivee) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		return false;
	}
	public ProprietePrivee getProprieteByIndice(int i) {
		if(i>=0) {
			return ((ProprietePrivee)tabProp[i]);
		}
		System.out.println("impossible");
		return null;
	}
	int getnbPieces() {
		int nb=0;
		for(int i=0;i<nombre;i++) {
				nb+= ((ProprietePrivee)tabProp[i]).getNbPieces();
		}
		return nb;
	}
}
