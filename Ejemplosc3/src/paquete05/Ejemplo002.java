/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                if (f == c) {
                    suma = suma + arreglo1[f][c];
                }
            }
        }
        System.out.printf("La suma de los valores es: %d\n", suma);
    }
}
/*
Se crea un arreglo y se le da valores, se crea una variable suma inicializada en
0. Con 2 ciclos for vamos iterando todos los valores del arreglo y escoger con
un condicional los que tengan la misma posicion de fila y columna para sumarlos
y presentar el resultado.
*/
