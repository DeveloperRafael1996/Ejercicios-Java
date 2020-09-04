/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        int n=0;
        int tabla=0;
        System.out.println("Ingresar La Tabla Del:");
        n=dato.nextInt();
        
        for(int i=1;i<=12;i++)
        {
            tabla=n*i;
        }
        String j = null;
        System.out.println(n+"*"+j+"="+tabla);
    }
    
}
