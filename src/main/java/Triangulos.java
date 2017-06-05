/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marlon
 */
public class Triangulos {

    int VerificarTipo(Integer a, Integer b, Integer c) {

        if (!(a >= b || b >= c || a >= c)) {
            System.out.print("Valores não estão em ordem decrescente, return => ");
            return -1;
        }
        if (a + b < c || a + c < b || b + c < a) {
            System.out.print("valores não formam um triangulo, return => ");
            return 0;
        }
        if (a == b && b == c) {
            System.out.print("Triangulo equilátero, return => ");
            return 1;
        }
        if (a == b || b == c || a == c) {
            System.out.print("Triangulo Isóceles, return => ");
            return 2;
        } else {
            System.out.println("Triangulo Escaleno, return => ");
            return 3;
        }

    }
    int Retorna(){
        System.out.println("Valor Incorreto!");
        return -1;
    }

}
