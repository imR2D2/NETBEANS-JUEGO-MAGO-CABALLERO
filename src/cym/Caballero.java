
package cym;

/**
 *
 * @author artur
 */
public class Caballero extends SuperClase
{
    //CREAMOS LOS ATRIBUTOS
    protected double rayoo;
    protected double escudoextra;
    
    //LES DAMOS VALORES A LOS ATRIBUTOS
public Caballero(){
    super();
    rayoo = 0; 
    escudoextra = 0; 
    }
//GETTER
    public double getRayoo() {return rayoo;}
    public double getEscudoextra() {return escudoextra;}
//SETTER  
    public void setRayoo(double rayoo) {this.rayoo = rayoo;}
    public void setEscudoextra(double escudoextra) {this.escudoextra = escudoextra;}
}
