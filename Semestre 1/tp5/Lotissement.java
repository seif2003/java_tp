
public class Lotissement implements GestionPropriete{
	protected Propriete[] tabProp;
	protected int nombre;
	
	Lotissement(int capacite){
		if(capacite<MAX_PROPRIETES) {
			tabProp = new Propriete[capacite];
		}
	}
	public void afficherPropeietes() {
		for(int i=0;i<nombre;i++) {
			System.out.println(tabProp[i]);	
		}
	}
	public boolean ajouter(Propriete p) {
		if(nombre<tabProp.length) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		return false;
	}
	public boolean supprimer(Propriete p){
		int i=0;
		while(i<nombre && tabProp[i].getId()!=p.getId()) {
			i++;
		}
		if(i==nombre) {
			return false;
		}
		for(int j=i;j<(nombre-1);j++) {
			tabProp[j]=tabProp[j+1];
		}
		nombre--;
		return true;
	}
	Propriete getProprieteByIndice(int i) {
		if(i>=0) {
			return tabProp[i];
		}
		System.out.println("impossible");
		return null;
	}
	int getnbPieces() {
		int nb=0;
		for(int i=0;i<nombre;i++) {
			if(tabProp[i] instanceof ProprietePrivee) {
				nb+= ((ProprietePrivee)tabProp[i]).getNbPieces();
			}
		}
		return nb;
	}
	ProprietePrivee moinsImpots() {
		Propriete min = tabProp[0];
		int i=0;
		while(i!=nombre && !(min instanceof ProprietePrivee)) {
			i++;
			min = tabProp[i];
		}
		if(i==nombre) {
			System.out.println("accune propriete est privee");
			return null;
		}
		
		for(int j=i;j<nombre;j++) {
			if(tabProp[i] instanceof ProprietePrivee) {
				if (((ProprietePrivee)tabProp[i]).calculImpot()<min.calculImpot()){
					min = tabProp[i];
				}
			}
		}
		return ((ProprietePrivee)min);
	}
}
