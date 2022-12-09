package com.mycompany.t3_p1;

import java.util.Scanner;
 
public class T3_P1 {

    public static void main(String[] args) {
        //DECLARACION DE DATOS
        int b,suma;
        double a,division;
        float raiz,potencia;
        //CLASE DE ENTRADA SCANNER
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el primer dato");
        a=entrada.nextDouble();
        
        System.out.println("Ingrese el segundo dato");
        b=entrada.nextInt();
        
        suma= (int) (a+b);
        //System.out.println("La suma es: " + a+b);  
        System.out.println("La suma es: " + suma);
        
        if (b != 0){
            division= a/b;
            System.out.println("El resultado de la division es="+ division);
        }else{
            System.out.println("Imposible dividir... Fue Cero");
        }//Fin del IF
        
        
        //La clase math para calcular raiz cuadrada sqrt
        if (a>0){
            raiz=(float) Math.sqrt(a);
            System.out.println("La raiz de [a] es= "+ raiz);
        }else{
            System.out.println("Imposible calcular raiz de [A]");
        }//Fin del IF
        potencia=(float) Math.pow(a, b);
        System.out.println("La potencia de [a] a la [b] es= "+potencia);
    }//Fin del main
}//Fin de la clase
