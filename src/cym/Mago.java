
package cym;

/**
 *
 * @author artur
 */
public class Mago extends SuperClase
{
    //CREAMOS LOS ATRIBUTOS
    protected double hechizo;
    protected double regeneracion;
  
    //LES DAMOS VALORES A LOS ATRIBUTOS
public Mago(){
    super();
    hechizo = 0; 
    regeneracion = 0; 
    }
//GETTER
    public double getHechizo() {return hechizo;}
    public double getRegeneracion() {return regeneracion;}
//SETTER
    public void setHechizo(double hechizo) {this.hechizo = hechizo;}
    public void setRegeneracion(double regeneracion) {this.regeneracion = regeneracion;}
}
