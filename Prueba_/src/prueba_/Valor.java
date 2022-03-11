/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_;

/**
 *
 * @author Lucia y Toñi
 */
public class Valor {
    
    protected int valor;
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void Visualizacion(int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
    
}
