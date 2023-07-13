/*
 -- Semana 9 --
fecha : 13/07/2023
 */
package agencia;

import javax.swing.JOptionPane;

public class Agencia {
public void menu(){
    byte opc = 1;
    VentaVehiculo obj = new VentaVehiculo();
    Vehiculo matCarros[][] = new Vehiculo[2][2];
    while (opc >=1 &&opc <4){
       opc=Byte.parseByte(JOptionPane.showInputDialog("1.Realizar Venta\n2.Impresión\n3.Listado de vehiculos con extras\n4.Listado 25M\n5.Vehiculos verdes\n6.Salir\nDigite una opcion"));
       switch(opc){
           case 1: obj.venta(matCarros);
           break;
           case 2: obj.imprimeVenta(matCarros);
           break;
           case 3: obj.extras(matCarros);
           break;
           case 4: obj.precio(matCarros);
           break;
           case 5:obj.color(matCarros);
           break;
           default:System.out.println("Saliendo del programa");
       }//Cierra cases
}//Cierra while
}//Cierra menu
  
    public static void main(String[] args) {
        Agencia objAgencia= new Agencia();
        objAgencia.menu();
    }//Cierra main
    
}//Cierra clase
