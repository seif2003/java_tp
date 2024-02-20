import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Promotion {
    LocalDate debutPromo = LocalDate.of(2022, 3, 19);
    LocalDate finPromo = LocalDate.of(2022, 3, 31);

    float prixDeVente(String dateStr);

    default boolean estPeriodePromo(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        return (date.compareTo(debutPromo) >= 0) && (date.compareTo(finPromo) <= 0);
    }
    
    static double calculerRemise(double prixAvantRemise, double prixApresRemise){
    	return (( prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
    }
}