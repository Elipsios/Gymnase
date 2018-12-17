/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import static java.sql.DriverManager.println;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modele.Salle;
import modele.Sport;

/**
 *
 * @author Rabelais
 */
public class MainApp extends Application
{
    private Stage primaryStage;
    private AnchorPane rootLayout;
    private final ObservableList<Salle> SalleDonnees  = FXCollections.observableArrayList();
    private final ObservableList<Sport> SportDonnees  = FXCollections.observableArrayList();  
    
      @Override
    public void start(Stage primaryStage)
    {
   try{
    FXMLLoader loader = new FXMLLoader (MainApp.class.getResource("/vue/Fen_Gymnase.fxml"));        
    rootLayout=(AnchorPane)loader.load();         
    Scene scene=new Scene(rootLayout, 600, 300);        
    primaryStage.setScene(scene);         
    primaryStage.show();        
      }   
   catch (IOException e)
        {
            System.out.println("Erreur accueil"+e.getMessage());
        }
    }

    public static void main(String[] args)
    {
     launch(args);
    }
}