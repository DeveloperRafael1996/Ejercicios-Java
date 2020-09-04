
package cubo;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Cubo {
    private static Object math;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 4.16
        Scanner dato= new Scanner(System.in);
        int n=0;
        int numero=0;
        int cubo=0;
        int suma=0;
        
        System.out.println("Ingresar n Numeros:");
        n=dato.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("Ingresar Numero:"+i);
            numero=dato.nextInt();
            
            suma=suma+numero;
            cubo= (int) Math.pow(suma, 3);
        }
        System.out.println("La Suma es:"+suma);
        System.out.println("El Resultado al Cubo es:"+cubo);
    }
}
