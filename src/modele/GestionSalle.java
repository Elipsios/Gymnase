/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Rabelais
 */
public class GestionSalle
{
     private ObservableList<Salle> lesSalles=FXCollections.observableArrayList();
     private Connection conn;
     private Statement stmt;
     private ResultSet rs;
     private String pilote = "org.gjt.mm.mysql.Driver";
     private String url ="jdbc:mysql://localhost/cregymnase";	
     public GestionSalle()
     {
         try
       {
          Class.forName(pilote);
 
          conn=DriverManager.getConnection(url,"root","");
          stmt = conn.createStatement();

          rs=stmt.executeQuery("select * from salle ");
      
          while(rs.next())
          {
              lesSalles.add(new Salle(rs.getString("refSalle"),rs.getInt("surface"),rs.getString("typeRevetement")));
          }
         
           rs.close();
           stmt.close();
           conn.close();
            
       } 
       catch(SQLException e)
       {
           System.out.println("erreur sql"+e.getMessage());
       }
       catch(ClassNotFoundException ei)
       {
            System.out.println("erreur driver"+ei.getMessage());
       }
    }
    public ObservableList<Salle> getSalleDonnees()
    {
        return lesSalles;
    }
  
}
