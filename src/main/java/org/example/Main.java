package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(binarySearch(n));


    }

    public static int binarySearch( int item) {
       int baixo = 0;
       int alto = item;

       int resultado = 0;


       while (baixo <= alto) {
           int meio = (baixo + alto) / 2;
           long quadrado = (long) meio * meio;

           if(quadrado == item ) {
              return meio;
           }
           if (quadrado < item) {
               baixo = meio + 1;
               resultado = meio;
               return resultado;
           }
           else {
               alto = meio - 1;
           }

       }
    return resultado;
    };


}