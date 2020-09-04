
package aprobadosyreprobados;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Aprobadosyreprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 4.14
        Scanner dato= new Scanner(System.in);
        int cantidad=0;
        int alumno=0;
        int aprobados=0;
        int desaprobados=0;
        System.out.println("Ingresar Cantidad de Alumnos:");
        cantidad=dato.nextInt();
        for(int i=1;i<=cantidad;i++)
        {
            System.out.println("Ingresar Nota del Alumno:"+i);
            alumno=dato.nextInt();
            if(alumno>=11)
            {
                aprobados++;
            }
            else    
            {
                desaprobados++;
            }
        }
        System.out.println("La Cantidad de Aprobados son:"+aprobados);
        System.out.println("La Cantidad de Desaprobados son:"+desaprobados);
    }
}
