/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import modele.Salle;
import modele.GestionSalle;

/**
 * FXML Controller class
 *
 * @author Rabelais
 */
public class Fen_GymnaseController implements Initializable
{
        //remarque inutile
 @FXML 
 private ComboBox cmbChoixSalle;
 @FXML
 private Label lbSalle;
 @FXML
 private Label lbSurface;
 @FXML
 private Label lbTypeRevetement;

 private final GestionSalle lesSalles=new GestionSalle();
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        ObservableList<Salle> obs=lesSalles.getSalleDonnees();
        cmbChoixSalle.setItems(obs);
        // TODO
    }    
    
    @FXML
    public void handleChangementSalle()
    {
        Salle s = (Salle)cmbChoixSalle.getSelectionModel().getSelectedItem();
       
       lbSurface.setText(s.getSurface().toString());
       lbTypeRevetement.setText(s.getTypeRevetement());
        
    }
    
}

