package aula1;

/**
 * Resolvendo o exercício 1
 */
public class Calculadora {

    public static void soma(double n1, double n2) {

        double resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " mais " + n2 + " é " + resultado);
    }

    public static void subtracao(double n1, double n2) {

        double resultado = n1 - n2;

        System.out.println("A subtracao de " + n1 + " menos " + n2 + " é " + resultado);
    }

    public static void multiplicacao(double n1, double n2) {

        double resultado = n1 * n2;

        System.out.println("A multiplicacao de " + n1 + " vezes " + n2 + " é " + resultado);
    }

    public static void divisao(double n1, double n2) {

        double resultado = n1 / n2;

        System.out.println("A divisao de " + n1 + " por " + n2 + " é " + resultado);
    }
}



