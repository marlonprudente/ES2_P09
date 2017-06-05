
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
    public static void main(String[] args) throws Exception{
        
        Integer a = 0, b = 0, c = 0;
        Scanner teclado = new Scanner(System.in);
        Triangulos triangulo = new Triangulos();
//==================================================
        while(a == 0){
        System.out.println("Valor de A:");
        try {
            a = teclado.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("erro: " + ex + " digite apenas números!");
        }
        }
//==================================================
        while(b == 0){
        System.out.println("Valor de B:");
        try {
            b = teclado.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("erro: " + ex + " digite apenas números!");
        }
        }
//==================================================
        while(c == 0){
        System.out.println("Valor de C:");
        try {
            c = teclado.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("erro: " + ex + " digite apenas números!");
        }
        }
//==================================================
        System.out.print(triangulo.VerificarTipo(a, b, c));

    }

}
