
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Programa Java para pasar de decimal a binario
//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)
/**
 *
 * @author alumnot
 */
public class BinarioExamen {

    //Método para pasar de decimal a binario
    public static void decBin(int n) {

        if (n <= 2) {
            System.out.print(n);
        } else {
            
        }
    }

    // NO recuerdo como convertirlo a codigo binario lo siento
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;  // "n" no necesita estar inicializada

        //int i = 0; la variable i no es necesaria
        do {
            System.out.print("Introduzca un número que sea mayor que 0: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.print("\nBinario: ");
        decBin(n);
        System.out.println("");
    }
}
