/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kilometros;
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuanto kilometros tiene el vehiculo");
        kilometros = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto meses tiene el vehiculo");
        mes = captu.nextInt();
        captu.nextLine();
        if(kilometros >= 5000 || mes  >= 6){
           System.out.println("Cambiar de aceite");
        }else{   
           System.out.println("esta nazi tu vehiculo");
           
         }  
    }
    
}
