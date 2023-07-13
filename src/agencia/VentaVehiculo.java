/*
 -- Semana 9 --
fecha : 13/07/2023
 */
package agencia;

import javax.swing.JOptionPane;

public class VentaVehiculo {
    public void venta(Vehiculo matCarros[][]){
        for(int fila = 0; fila < matCarros.length; fila++){
            for(int col = 0; col<matCarros[fila].length;col++){
                matCarros[fila][col]= new Vehiculo ();
                matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
                matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[fila][col].setColor(JOptionPane.showInputDialog("Digite el color"));
                matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
                byte extra=(Byte.parseByte(JOptionPane.showInputDialog("1.Extra\n2.Sin extra\nDigite una opcion")));
                if(extra == 1)
                    matCarros[fila][col].setExtras(true);
                else 
                    matCarros[fila][col].setExtras(false);
            }//Cierra segundo for
        }//cierra primer for
    }//Cierra venta
    
    public void imprimeVenta (Vehiculo matCarros[][]){
        System.out.println("AUTOS VENDIDOS");    
    for(int fila = 0; fila < matCarros.length; fila++){
            for(int col = 0; col<matCarros[fila].length;col++){
                System.out.println("Placa: " + matCarros[fila][col].getPlaca());
                System.out.println("Modelo: " + matCarros[fila][col].getModelo());
                System.out.println("Precio: " + matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color: " + matCarros[fila][col].getColor());
                if(matCarros[fila][col].isExtras() == true)
                     System.out.println("Tiene extras");
                else 
                   System.out.println("No tiene extras");
                System.out.println(" ");
            }//Cierra segundo for
        }//cierra primer for
    }//Cierra imprimeVenta
    
    public void extras(Vehiculo matCarros[][]){
    System.out.println("LISTA DE VEHICULOS CON EXTRAS");
    for(int fila = 0; fila < matCarros.length; fila++)
        for(int col = 0; col<matCarros[fila].length;col++){
            if(matCarros[fila][col].isExtras()== true){
                System.out.println("Placa: " + matCarros[fila][col].getPlaca());
                System.out.println("Modelo: " + matCarros[fila][col].getModelo());
                System.out.println("Precio: " + matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color: " + matCarros[fila][col].getColor());
                System.out.println(" ");
            }//Cierra if
        }//Cierra for
    }//Cierra extras
    
    public void precio(Vehiculo matCarros[][]){
    System.out.println("LISTA DE VEHICULOS DE MAS DE 25M");
    for(int fila = 0; fila < matCarros.length; fila++)
        for(int col = 0; col<matCarros[fila].length;col++){
            if(matCarros[fila][col].getPrecioVehiculo()> 25){
                System.out.println("Placa: " + matCarros[fila][col].getPlaca());
                System.out.println("Modelo: " + matCarros[fila][col].getModelo());
                System.out.println("Precio: " + matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color: " + matCarros[fila][col].getColor());
                System.out.println(" ");
            }//Cierra if
        }//Cierra for
    }//Cierra precio
     
     public void color(Vehiculo matCarros[][]){
    System.out.println("LISTA DE VEHICULOS VERDES");
    for(int fila = 0; fila < matCarros.length; fila++)
        for(int col = 0; col<matCarros[fila].length;col++){
            if(matCarros[fila][col].getColor().equalsIgnoreCase("verde")) {
                System.out.println("Placa: " + matCarros[fila][col].getPlaca());
                System.out.println("Modelo: " + matCarros[fila][col].getModelo());
                System.out.println("Precio: " + matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color: " + matCarros[fila][col].getColor());
                System.out.println(" ");
            }//Cierra 
        }//Cierra for
    }//Cierra color
     
     public void carroCaro(Vehiculo matCarros[][]){
     System.out.println("CARRO MAS CARO");
     float preCaro = matCarros[0][0].getPrecioVehiculo();
     int x = 0,i = 0;
     for(int fila = 0; fila < matCarros.length; fila++)
        for(int col = 0; col<matCarros[fila].length;col++){
            if(matCarros[fila][col].getPrecioVehiculo()> preCaro){
                preCaro = matCarros[fila][col].getPrecioVehiculo();
                x = fila;
                i = col;
            }//Cierra if
        }//Cierra for
        System.out.println("Placa: " + matCarros[x][i].getPlaca());
        System.out.println("Modelo: " + matCarros[x][i].getModelo());
        System.out.println("Precio: " + matCarros[x][i].getPrecioVehiculo());
        System.out.println("Color: " + matCarros[x][i].getColor());
        System.out.println(" ");
     }//Cierra carroCaro
}//Cierra clase
