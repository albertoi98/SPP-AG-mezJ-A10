/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a10.p2;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJA10P2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
    int [][]a,b,r,S;
    int tamano;
    tamano=SolicitarTamano();
    a=CrearMatriz("A", tamano);
    b=CrearMatriz("B", tamano);
    r=restaMatrices(a,b);
    muestraResultado(r);
    }
    static int validacionEntero(){
        Scanner teclado=new Scanner(System.in);
        boolean flag;
        int n=0;
        do{
            try{
                n=teclado.nextInt();
                flag=false;
            }catch(Exception er){
                System.out.println("No es un entero");
                flag=true;
            }
        }while(flag);
        return n;
    }
    public static int SolicitarTamano(){
        System.out.println("Introduce el tamaño de la matriz");
        int tamano;
        tamano=validacionEntero();
        return tamano;
}
    public static int [][]CrearMatriz(String nom, int tamano){
        System.out.println("Introduce las matrices");
        int [][]miMatriz=new int[tamano][tamano];
        for(int i = 0; i<miMatriz.length;i++){
        for(int j=0; j<miMatriz[i].length;j++){
            miMatriz[i][j]=validacionEntero();
} 
        }
        return miMatriz;
    }
    public static int[][]restaMatrices(int[][]a,int[][]b){
        int [][]r=new int [a.length][b.length];
        for(int i=0; i<r.length;i++){
            for(int j=0; j<r[i].length;j++){
                r[i][j]=a[i][j]-b[i][j];
}
        }
        return r;
    }
    public static int [][]multiplicacionDeMatrices(int[][]A, int[][]B, int m,int n){
        int [][]r=new int[m][n];
        for(int i=0; i<r.length;i++){
        for(int j=0; j<r[i].length;j++){
         for(int k=0; k<r.length;k++){
             r[i][j]+=A[i][k]*B[k][j];
         }   
        }
        }
        return r;
}
    public static void muestraResultado(int [][]matriz){
        for(int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print("["+matriz[i][j]+"]");
                if (j+2>matriz[i].length){
                    System.out.println();
}
    }
        }}}

    
    

