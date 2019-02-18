
package dao;

import java.util.Scanner;


public class promedio {
public static void main(String[] args) {
Scanner num = new Scanner (System.in);

System.out.print("programa que calcule el promedio de tres numeros\n \n");

System.out.print("Ingrese NOTA1:");
int n1 = num.nextInt();

System.out.print("Ingrese NOTA2:");
int n2 = num.nextInt();

System.out.print("Ingrese NOTA3:");
int n3 = num.nextInt();

float Resultado = (float)(n1 + n2 + n3) / 3;
System.out.print("Su promedio es :" + Resultado);



}
}