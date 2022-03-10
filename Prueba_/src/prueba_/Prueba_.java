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
public class Prueba_ {

    public static void main(String[] args) {
// TODO code application logic here
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        v[3] = 8;
        Prueba p = new Prueba();
        p.valor = 10;
        p.mo(v);
        p.bo(v);
        p.in(v);
    }
}
