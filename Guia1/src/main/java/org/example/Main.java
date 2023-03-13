package org.example;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        int inicio = 5;
        int fin = 14;
        char parOImpar;
        System.out.println("Ingrese si desea mostrar números pares o impares con P o I");
        Scanner teclado = new Scanner(System.in);
        parOImpar=teclado.next().charAt(0);
        System.out.println(parOImpar);
        while (inicio <= fin) {
            if((inicio%2)==0 && parOImpar=='P') {
                System.out.println(inicio);
            }
            else if(parOImpar=='I') {
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}
*/
public class Main {
    public static void main(String[] args) {
        int inicio = 5;
        int fin = 14;
        int i=0;
        char parOImpar;
        System.out.println("Ingrese si desea mostrar números pares o impares con P o I");
        Scanner teclado = new Scanner(System.in);
        parOImpar=teclado.next().charAt(0);
        System.out.println(parOImpar);
        for(i=fin;i>inicio;i--){
            if((i%2)==0 && parOImpar=='P') {
                System.out.println(i);
            }
        }
    }
}