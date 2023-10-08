package tp3;

public class Compte {
	private static int lastId = 1;
	private int id;
	private Personne titulaire;
	private double solde;
	private double decouvertMax;
	private double debitMax;
	private boolean estaDecouvert = false;
	Compte(Personne P){
		this.id = lastId;
		this.lastId = lastId+1;
		this.titulaire = P;
		this.decouvertMax = 800;
		this.debitMax = 1000;
	}
	Compte(Personne p,double s,double dbm,double dcm){
		this.id = lastId;
		this.lastId = lastId+1;
		this.titulaire = p;
		this.solde = s;
		this.debitMax = dbm;
		this.decouvertMax = dcm;
	}
	public String toString() {
		return(titulaire+" Solde : "+solde+" Decouvert max : "+decouvertMax+" Debit max : "+debitMax);
	}
	int getId() {
		return(id);
	}
	double getSolde() {
		return(solde);
	}
	double getDecouvertMax() {
		return(decouvertMax);
	}
	double getDebitMax() {
		return(debitMax);
	}
	Personne getTitulaire() {
		return(titulaire);
	}
	void setSolde(double s) {
		if(s>(-1*decouvertMax)) {
			this.solde = s;
		}
		if(this.solde>0) {
			this.estaDecouvert = false;
		}
		if(this.solde<0) {
			this.estaDecouvert = true;
		}
	}
	void setDecouvertMax(double d) {
		this.decouvertMax = d;
	}
	void setDebitMax(double d) {
		this.debitMax = d;
	}
	void crediter(double s) {
		if(s>0) {
			this.solde += s;
		}
		if(this.solde>0) {
			this.estaDecouvert = false;
		}
	}
	boolean retrait(double s) {
		if(s < this.debitMax && s>0) {
			return this.debiter(s);
		}
		return false;
	}
	private boolean debiter(double s) {
		if((this.solde-s)>(-1*this.decouvertMax)) {
			this.solde -= s;
			if(this.solde<0) {
				this.estaDecouvert = true;
			}
			return true;
		}
		return false;
	}
	boolean estaDecouvert() {
		return this.solde <0;
	}
	double MontantDecouvert() {
		if(this.estaDecouvert()) {
			return (this.solde*-1);
		}
		return 0;
		
	}
	void Virement(double s,Compte c) {
		if (this.retrait(s)) {
			c.crediter(s);
		}
	}
	static void Virement(double s,Compte c,Compte c2) {
		if (c.retrait(s)) {
			c2.crediter(s);
		}
	}
}
