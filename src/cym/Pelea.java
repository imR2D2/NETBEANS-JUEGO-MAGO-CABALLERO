
package cym;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Pelea {
    public Pelea(){

        Scanner scan = new Scanner(System.in);
        Metodos metodos= new Metodos();
        Caballero caballero = new Caballero();
        Enemigo enemigo = new Enemigo();
        Mago mago = new Mago();

        int i;
        
        
        int op = metodos.menuPrincipal();
        while(op < 4){
            switch(op){
                //COMENZAR LA GUERRA
                case 1:
                    System.out.println("\n\n\n");
                    i= metodos.seleccionPersonaje();
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                                                System.out.println("");
                        System.out.println("");
                                                System.out.println("");
                        System.out.println("");
                     metodos.personaliza();
   
                    //CUANDO ELIGE LA OPCION 2 ES LA DE CABALLERO
                    if (i==2)
                    {
                        System.out.println("INGRESA EL NOMBRE DEL CABALLERO: ");
                        caballero.setNombre(scan.nextLine());
                        System.out.println("INGRESA LA VIDA: ");
                        caballero.setVida(scan.nextInt());
                        enemigo.setVida(caballero.vida*2);
                        int i1= (int)caballero.vida;
                        int i2= (int)enemigo.vida;
                        System.out.println("INGRESA LA DEFENSA: ");
                        caballero.setDefensa(scan.nextInt());
                        caballero.setEscudoextra((int)caballero.defensa*.20);
                        caballero.defensa= caballero.defensa + caballero.escudoextra;
                        enemigo.setDefensa((int)caballero.defensa*2);
                        System.out.println("INGRESA EL ATAQUE: ");
                        caballero.setAtaque(scan.nextInt());
                        caballero.setRayoo(caballero.ataque*2);
                        //pelea
                        if(i1>0){
                            if(i2>0){
                                enemigo.setAtaque(Math.random()*100);
                                op=metodos.menuCaballero();
                                while(op<5){
                                    switch(op){
                                        case 1:
                                            enemigo.vida=(int)enemigo.vida-(caballero.ataque-(enemigo.defensa*.50));
                                            caballero.vida= (int)caballero.vida-(enemigo.ataque-(caballero.defensa*.50));
                                            System.out.println("\n\n\nEl enemigo hizo "+((int)enemigo.ataque-(caballero.defensa*.50))+" puntos de daño\n"+caballero.nombre+" hizo "+((int)caballero.ataque-(caballero.defensa*.50))+" puntos de daño");
                                            enemigo.setAtaque((int)(Math.random()*100));
                                            i1= (int)caballero.vida;
                                            i2= (int)enemigo.vida;
                                            
                                            if(i1<0){
                                                metodos.gameOver();
                                                op=10;
                                                
                                            }
                                            else
                                            {
                                                if(i2<0){
                                                metodos.youWin();
                                                op=10;
                                                }
                                                else{
                                        
                                                    op=metodos.menuCaballero(); 
                                                }
                                            } 
                                        break;
                                        case 2://especial
                                            enemigo.vida=(int)enemigo.vida-(caballero.rayoo);
                                            caballero.vida= (int)caballero.vida-enemigo.ataque-(enemigo.ataque-(caballero.defensa*.50));
                                            System.out.println("\n\n\nEnemigo hizo "+((int)enemigo.ataque-(caballero.defensa*.50))+" puntos de daño\n"+caballero.nombre+" hizo "+(caballero.rayoo)+" puntos de daño");
                                            enemigo.setAtaque(Math.random()*100);
                                            i1= (int)caballero.vida;
                                            i2= (int)enemigo.vida;
                                            
                                            if(i1<0){
                                                metodos.gameOver();
                                                op=10;
                                                
                                            }
                                            else
                                            {
                                                if(i2<0){
                                                metodos.youWin();
                                                op=10;
                                                }
                                                else{
                                                   
                                                    op=metodos.menuCaballero(); 
                                                }
                                            } 
                                            break;

                                        case 3:
                                                caballero.vida= (int)caballero.vida-enemigo.ataque-(enemigo.ataque-(caballero.defensa));
                                                System.out.println("\n\n\nEnemigo hizo "+((int)enemigo.ataque-(caballero.defensa)));
                                                enemigo.setAtaque(Math.random()*100);
                                                i1= (int)caballero.vida;
                                                i2= (int)enemigo.vida;

                                                if(i1<0){
                                                    metodos.gameOver();
                                                    op=10;

                                                }
                                                else
                                                {
                                                    if(i2<0){
                                                    metodos.youWin();
                                                    op=10;
                                                    }
                                                    else{
                                                       
                                                        op=metodos.menuCaballero(); 
                                        break;
                                    }
                                }
                            }
                        }
                    }}}
//////////////////////////////////////////////////////////////////////////////// MAGO
                    else
                    {
                        System.out.println("INGRESA EL NOMBRE DEL MAGO: ");
                        mago.setNombre(scan.nextLine());
                        System.out.println("INGRESA LA VIDA: ");
                        mago.setVida(scan.nextInt());
                        enemigo.setVida(mago.vida*2);
                        int i1= (int)mago.vida;
                        int i2= (int)enemigo.vida;
                        System.out.println("INGRESA LA DEFENSA: ");
                        mago.setDefensa(scan.nextInt());
                        enemigo.setDefensa(mago.defensa*2);
                        System.out.println("INGRESA EL DAÑO DE ATAQUE: ");
                        mago.setAtaque(scan.nextInt());
                        mago.setHechizo(mago.ataque*2);
                        //pelea
                        if(i1>0){
                            if(i2>0){
                                enemigo.setAtaque(Math.random()*100);
                                op=metodos.menuMago();
                                while(op<5){
                                    switch(op){
                                        case 1:
                                            enemigo.vida=(int)enemigo.vida-(mago.ataque-(enemigo.defensa*.50));
                                            mago.vida= (int)mago.vida-(enemigo.ataque-(mago.defensa*.50));
                                            System.out.println("\n\n\nEnemigo hizo "+((int)enemigo.ataque-(mago.defensa*.50))+" puntos de daño\n"+mago.nombre+" hizo "+((int)mago.ataque-(mago.defensa*.50))+" puntos de daño");
                                            enemigo.setAtaque((int)(Math.random()*100));
                                            i1= (int)mago.vida;
                                            i2= (int)enemigo.vida;
                                            
                                            if(i1<0){
                                                metodos.gameOver();
                                                op=10;
                                                
                                            }
                                            else
                                            {
                                                if(i2<0){
                                                metodos.youWin();
                                                op=10;
                                                }
                                                else{
                                                   
                                                    op=metodos.menuMago(); 
                                                }
                                            } 
                                        break;
                                        case 2:
                                            enemigo.vida=(int)enemigo.vida-(mago.ataque*2);
                                            mago.vida= (int)mago.vida-enemigo.ataque-(enemigo.ataque-(mago.defensa*.50));
                                            System.out.println("\n\n\nEnemigo hizo "+((int)enemigo.ataque-(mago.defensa*.50))+" puntos de daño\n"+mago.nombre+" hizo "+(mago.ataque*2)+" puntos de daño");
                                            enemigo.setAtaque(Math.random()*100);
                                            i1= (int)mago.vida;
                                            i2= (int)enemigo.vida;
                                            
                                            if(i1<0){
                                                metodos.gameOver();
                                                op=10;
                                                
                                            }
                                            else
                                            {
                                                if(i2<0){
                                                metodos.youWin();
                                                op=10;
                                                }
                                                else{
                                                    
                                                    op=metodos.menuMago(); 
                                                }
                                            } 
                                            break;
                                     
                                        case 3:
                                                mago.vida= (int)mago.vida-enemigo.ataque-(enemigo.ataque-(mago.defensa));
                                                System.out.println("\n\n\nEnemigo hizo "+((int)enemigo.ataque-(mago.defensa)));
                                                enemigo.setAtaque(Math.random()*100);
                                                i1= (int)mago.vida;
                                                i2= (int)enemigo.vida;

                                                if(i1<0){
                                                    metodos.gameOver();
                                                    op=10;

                                                }
                                                else
                                                {
                                                    if(i2<0){
                                                    metodos.youWin();
                                                    op=10;
                                                    }
                                                    else{
                                                       
                                                        op=metodos.menuMago(); 
                                        break;
                                    }
                                }
                            }
                        }
                    }}
                    }
                    break;

                case 2:
                    System.out.println("\n\n\n\n");
                    metodos.instrucciones();
                     op = metodos.menuPrincipal();
                    break;
            }
        }
    }
    
}
        
