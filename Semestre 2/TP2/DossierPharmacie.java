import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DossierPharmacie {
	private String nom ;
	private Patient p;
	private HashMap <String , Patient > patients ;
	public DossierPharmacie ( String n){
		nom = n;
		patients = new HashMap <String , Patient >();
	}
	void nouveauPatient ( String nom , String [] ord ){
		if(patients.get(nom.toLowerCase()) != null) {
			p = new Patient(nom.toLowerCase());
			for (String o : ord) {
				p.ajoutMedicament(o);
			}
			patients.put(nom.toLowerCase(), p);
		}
	}
	public boolean ajoutMedicament (String nom, String m){
		if(patients.get(nom) != null) {
			patients.get(nom).ajoutMedicament(m);
			return true;
		}
		return false;
	}
	public void affichePatient (String nom){
		System.out.println(patients.get(nom));
	}
	public void affiche (){
		System.out.println(this.nom+" "+patients);
	}
	public Collection<String > affichePatientAvecMedicament (String m){
		List<String> patientsAM = new ArrayList<>();
        for (String nom : patients.keySet()) {
            Patient patient = patients.get(nom);
            if (patient != null && patient.contientMedicament(m)) {
                patientsAM.add(nom);
            }
        }
        return patientsAM;
	}
	
}
