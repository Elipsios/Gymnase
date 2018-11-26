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
public class Salle
{
    private Integer surface ;
    private String refSalle ;
    private String typeRevetement ;

    public Salle(String refSalle, Integer surface, String typeRevetement)
    {
        this.refSalle = refSalle;
        this.surface = surface;
        this.typeRevetement = typeRevetement;
    }

    public Integer getSurface()
    {
        return surface;
    }

    public void setSurface(Integer surface)
    {
        this.surface = surface;
    }

    public String getRefSalle()
    {
        return refSalle;
    }

    public void setRefSalle(String refSalle)
    {
        this.refSalle = refSalle;
    }

    public String getTypeRevetement()
    {
        return typeRevetement;
    }

    public void setTypeRevetement(String typeRevetement)
    {
        this.typeRevetement = typeRevetement;
    }
        public String toString()
    {
        return String.valueOf(refSalle);
    }
}
