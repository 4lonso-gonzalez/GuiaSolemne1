/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiasolemne1;

import java.util.Scanner;

/**
 *
 * @author alons
 */
public class GuiaSolemne1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("GUIA SOLEMNE 1");
            System.out.println("1. Suma de numeros naturales");
            System.out.println("2. Factorial de un valor");
            System.out.println("3. Potencia de un numero");
            System.out.println("4. Numero entero es o no primo(Ciclos)");
            System.out.println("5. Año bisiesto recursivo");
            System.out.println("6. Numero entero es o no primo (Recursivo)");
            System.out.println("7. Año bisiesto ciclos");
            System.out.println("8. Suma de digitos pares");
            System.out.println("9. Producto de los digitos");
            System.out.println("10. Cerrar el programa");
            System.out.println("Eliga una opcion: ");
            opcion = leer.nextInt();

            Funciones operacion;
            int num1, num2;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    int suma = operacion.SumaNaturales(num1);
                    System.out.println("La suma de los numeros es " + suma);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    int factorial = operacion.Factorial(num1);
                    System.out.println("El factorial del valor es " + factorial);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese el valor de la base: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el valor de la exponente: ");
                    num2 = leer.nextInt();
                    operacion = new Funciones();
                    int potencia = operacion.Potencia(num1, num2);
                    System.out.println("El valor de la potencia es " + potencia);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    operacion.PrimoIt(num1);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ingrese el año deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    operacion.AñoBisiestoRe(num1);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    operacion.PrimoRe(num1, 1);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Ingrese el año deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    operacion.AñoBisiestoIt(num1);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    int sumapar = operacion.SumaPares(num1);
                    System.out.println("La suma de los digitos pares del numero es " + sumapar);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Ingrese el valor deseado: ");
                    num1 = leer.nextInt();
                    operacion = new Funciones();
                    int productodig = operacion.ProductoDigitos(num1);
                    System.out.println("El producto de los digitos del numero es " + productodig);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Finalizando el Programa...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 10);
    }

}
