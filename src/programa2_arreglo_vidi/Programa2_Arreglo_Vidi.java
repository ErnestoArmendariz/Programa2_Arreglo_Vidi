/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2_arreglo_vidi;

/**
 *
 * @author ernes
 */
public class Programa2_Arreglo_Vidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //int a [] []
        
        double a [] [] = {{2,5,6},
                          {2,2,2},
                          {3,5,6}};
        int b [] [] = new int [1000][1000];
        char c[] = {'h','o','l','a','s'};
        double d [] = {10.3,34,5};
        String nombre = "Ismael";
        System.out.println(d[0]);
        System.out.println(d[1]);
        
        int i,j,x=0;
        for (i=0;i<100;i++)
        {
            for (j=1;j<1000;j++)
            {
                x++;
                b [i][j]=x;
                System.out.println(b[i][j]);
            }
        }
        for (i=1;i<4;i++)
        {
            for (j=1;j<4;j++)
            {
                System.out.println(a[i][j]);
            }
        }
        
        for (i=0;i<5;i++)
        {
            System.out.println(b[i][i]);
            System.out.println(c[i]);
        }
        System.out.println(nombre);
        //imprime el tamaño del arreglo
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        //transformar la cadena de caracteres a arreglo
        System.out.println(nombre.length());
    }
    
}
