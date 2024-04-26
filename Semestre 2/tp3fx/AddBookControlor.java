package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddBookControlor implements Initializable {
	@FXML
	private TextField tfLastName;
	@FXML
	private TextField tfFirstName;
	@FXML
	private TextField tfEmail;
	@FXML
	private Button addBtn;
	@FXML
	private Button exportBtn;
	@FXML
	private Button importBtn;
	@FXML
	private Button removeBtn;
	@FXML
	private Button quitBtn;
	@FXML
	private TableView<Person> table;
	@FXML
	private TableColumn<Person, String> emailCol;
	@FXML
	private TableColumn<Person, String> firstNameCol;
	@FXML
	private TableColumn<Person, String> lastNameCol;
	
	private DataClass data;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    data = new DataClass();

	    firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
	    lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
	    emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

	    for (Person person : data.getImportList()) {
	        table.getItems().add(person);
	    }
	}
	public static boolean isEmailAdress(String email){
		Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$" );
		Matcher m = p.matcher(email.toUpperCase()); 
		return m.matches();
	} 
	
	public void remove() {
		Person selectedPerson = table.getSelectionModel().getSelectedItem();
		table.getItems().remove(selectedPerson);
	}
	
    public void add() {
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String email = tfEmail.getText();
        
        if(firstName.equals("")||lastName.equals("") ||firstName.equals("")) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Champ vide");
            alert.setHeaderText(null);
            alert.setContentText("Remplir tout les champs");
            alert.showAndWait();
        	return;
        }

        if (isEmailAdress(email)) {
            Person person = new Person(firstName, lastName, email);
            table.getItems().add(person);
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Email Incorrect");
            alert.setHeaderText(null);
            alert.setContentText(email + " : Email Incorrect !");
            alert.showAndWait();
        }
    }
    
    public void importer() {
        List<Person> importList = data.getImportList();
        for (Person person : importList) {
            table.getItems().add(person);
        }
    }
    
    public void exporter() {
        List<Person> exportList = new ArrayList<>(table.getItems());
        data.setExportList(exportList);
    }

    
    public void quiter() {
    	System.exit(0);
    }
	
}