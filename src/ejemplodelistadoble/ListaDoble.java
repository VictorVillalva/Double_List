package ejemplodelistadoble;

import java.util.Scanner;

public class ListaDoble {
    Nodo primero;
    Nodo ultimo;
    
    Scanner teclado= new Scanner(System.in);


    public ListaDoble(){
        primero= null;
        ultimo=null;
    }   
    
    
    public void agregar(int dato){
        Nodo nuevo= new Nodo ();
        nuevo.dato=dato;
        if (primero == null){
        primero=nuevo;
        primero.siguiente=null;
        primero.anterior=null;
        ultimo=primero;
        }
        else {
            ultimo.siguiente=nuevo;
            nuevo.anterior= ultimo;
            nuevo.siguiente=null;
            ultimo=nuevo;
            
        }

    }

    
    public void mostrar(){
        Nodo actual = new Nodo();
        actual=primero;
        while(actual != null){
            System.out.println(actual.dato);
            
            actual=actual.siguiente;
            
        }
        
        
    }


    public void buscar(int dato){
         Nodo actual = new Nodo();
         actual = primero;
         while(actual!=null){
             if(actual.dato==dato){
                 System.out.println(" Matricula encontrada");
                 
             }
            
             actual=actual.siguiente;
         }
        }

    
    public void modificar (int dato){
        Nodo actual = new Nodo();
        actual= primero;
        while(actual != null){
            if(actual.dato ==dato){
                System.out.println("Introduzca nueva matricula");
                actual.dato=teclado.nextInt();
            }
            actual=actual.siguiente;
            
        } 
    }

    public void eliminar(int dato){
        Nodo actual = new Nodo();
        Nodo atras= new Nodo();
        actual=primero;
        atras =null;
        
        
        while(actual != null){
        
            if(actual.dato == dato){
                if (actual == primero){
                    primero=primero.siguiente;
                    primero.anterior=null;
                }
                else {
                        atras.siguiente= actual.siguiente;
                        actual.siguiente.anterior=actual.anterior;
                }
            }
            atras=actual;
            actual=actual.siguiente;
                
        }
    
    }    
}
