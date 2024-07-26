package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //int n = 15;
        //System.out.println(binarySearchSquare(n));

        int[] lista = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int nList = 8;

        System.out.println(binarySearchList(lista, nList));


    }

    public static int binarySearchList(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;


        while(baixo <= alto) {
            int meio = (baixo + alto) / 2;

            int chute = lista[meio];

            if(chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            }
            else {
                baixo = meio + 1;
            }
        }
        return -1;
    };

    public static int binarySearchSquare( int item) {
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