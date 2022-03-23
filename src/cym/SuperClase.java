
package cym;

/**
 *
 * @author artur
 */
public class SuperClase {
 
//ATRIBUTOS
protected double ataque;    
protected double defensa; 
protected double vida; 
protected String nombre; 

//DAR VALORES A LOS ATRUBUTOS
public SuperClase (){
    ataque=0;   
    defensa=0;
    vida = 0;
    nombre=null;
}

//METODO GETTER
    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public double getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }
    
//METODOS SETTER

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
}
    
    
   
