
package Programas;
/**
 * @author MICHAEL MAX CUSIHUAMAN CRUZ
 */
import java.util.Scanner;
public class ProyectoFinal {
    public static void main(String[] args){
        String nombre;
        Double compra1,compra2,compra3, totalCompras, promedioCompras;
        
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre=lectura.nextLine();
        System.out.println("Ingrese la primera compra: ");
        compra1=lectura.nextDouble();
        System.out.println("Ingrese la segunda compra: ");
        compra2=lectura.nextDouble();
        System.out.println("Ingrese la tercera compra: ");
        compra3=lectura.nextDouble();
        totalCompras=compra1+compra2+compra3;
        promedioCompras=totalCompras/3;
        
        System.out.println("");
        System.out.println("Total de compras: "+totalCompras);
        System.out.println("Promedio de compras: "+promedioCompras);
        System.out.println("archivo modificado");
    }
}
