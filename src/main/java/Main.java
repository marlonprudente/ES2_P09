
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marlon
 */
public class Main {

    /**
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        Integer a = 0, b = 0, c = 0;
        Scanner teclado = new Scanner(System.in);
        Triangulos triangulo = new Triangulos();
//==================================================
        while (a <= 0) {
            System.out.println("Valor de A:");
            try {
                a = teclado.nextInt();
            } catch (Exception ex) {
                System.out.println("erro: " + ex + " digite apenas números inteiros positivos!");
                teclado.nextLine();
                a = -1;
            }
        }
//==================================================
        while (b <= 0) {
            System.out.println("Valor de B:");
            try {
                b = teclado.nextInt();
            } catch (Exception ex) {
                System.out.println("erro: " + ex + " digite apenas números inteiros positivos!");
                teclado.nextLine();
                b = -1;
            }
        }
//==================================================
        while (c <= 0) {
            System.out.println("Valor de C:");
            try {
                c = teclado.nextInt();
            } catch (Exception ex) {
                System.out.println("erro: " + ex + " digite apenas números Inteiros positivos!");
                teclado.nextLine();
                c = -1;
            }
        }
//==================================================
        System.out.print(triangulo.VerificarTipo(a, b, c));

    }

}
