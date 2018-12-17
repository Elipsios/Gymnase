/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Rabelais
 */
public class Sport
{

    public Sport(String nomSport)
    {
        this.nomSport = nomSport;
    }

    public String getNomSport()
    {
        return nomSport;
    }

    public void setNomSport(String nomSport)
    {
        this.nomSport = nomSport;
    }
    private String nomSport  ;

    /**
     *
     * @return
     */
    @Override
       public String toString()
    {
        return String.valueOf(nomSport);
    }
}
