/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiasolemne1;

/**
 *
 * @author alons
 */
public class Funciones {

    // 1.
    public int SumaNaturales(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // 2.
    public int Factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
    }

    // 3.
    public int Potencia(int num1, int num2) {
        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }
        return resultado;
    }

    // 4.
    public void PrimoIt(int num) {
        if (num <= 1) {
            System.out.println("El numero " + num + " no es primo");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("El numero " + num + " no es primo");
                return;
            }
        }
        System.out.println("El numero " + num + " es primo");
    }

    // 5.
    public void AñoBisiestoRe(int año) {
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            System.out.println("El año " + año + " si es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto, el siguiente año bisiesto seria:");
            AñoBisiestoRe(año + 1);
        }
    }

    // 6.
    public void PrimoRe(int num, int divisor) {
        if (num <= 1) {
            System.out.println("El numero " + num + " no es primo");
            return;
        }
        if (divisor == 1) {
            System.out.println("El numero " + num + " es primo");
            return;
        }
        if (num % divisor == 0) {
            System.out.println("El numero " + num + " no es primo");
            return;
        }
        PrimoRe(num, divisor - 1);
    }

    // 7.
    public void AñoBisiestoIt(int año) {
        int divisor = 4;
        int bisiesto = 0;
        while (divisor <= año) {
            if (año % divisor == 0) {
                if (año % 100 == 0 && año % 400 != 0) {
                    bisiesto = 0;
                    break;
                }
                bisiesto = 1;
                break;
            }
            divisor += 4;
        }
        if (bisiesto == 1) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }

    // 8.
    public int SumaPares(int num) {
        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            num /= 10;
        }
        return suma;
    }

    // 9.
    public int ProductoDigitos(int num) {
        if (num < 10) {
            return num;
        }
        return (num % 10) * ProductoDigitos(num / 10);
    }
    
}
