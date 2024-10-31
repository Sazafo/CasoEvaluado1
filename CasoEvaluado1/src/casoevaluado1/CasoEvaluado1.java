/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author sazaf
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vendedor vendedor = new Vendedor();

        //Aca se define todos los datos del vendedor 
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        String id = JOptionPane.showInputDialog("Ingrese su cedula");
        String codigo = JOptionPane.showInputDialog("Ingrese su codigo");
        String empresa = JOptionPane.showInputDialog("Ingrese la empresa a la que pertenese");
        String Carro = JOptionPane.showInputDialog("Tiene carro? Si / No");

        //preguntar la cantidad de facturas que va tener el vendedor
        int NumerodeFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas que realizo"));
        
        //Esto lo voy a colocar aca para que pueda imprimir el mes 
        String nombreMes = "";

        //Aca se van a pedir los datos necesario para crear la factura 
        for (int i = 0; i < NumerodeFacturas; i++) {
            String NombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
            String CedulaCliente = JOptionPane.showInputDialog("Ingrese la cedula del cliente");
            String CodigoFactura = JOptionPane.showInputDialog("Ingrese el numero de la factura");
            Double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes (1-12):"));

            //Esto lo coloco para asi determinar el mes en el que el vendedor factoro
            String Mes = "";
            if (mes == 1) {
                nombreMes = "Enero";
            } else if (mes == 2) {
                nombreMes = "Febrero";
            } else if (mes == 3) {
                nombreMes = "Marzo";
            } else if (mes == 4) {
                nombreMes = "Abril";
            } else if (mes == 5) {
                nombreMes = "Mayo";
            } else if (mes == 6) {
                nombreMes = "Junio";
            } else if (mes == 7) {
                nombreMes = "Julio";
            } else if (mes == 8) {
                nombreMes = "Agosto";
            } else if (mes == 9) {
                nombreMes = "Septiembre";
            } else if (mes == 10) {
                nombreMes = "Octubre";
            } else if (mes == 11) {
                nombreMes = "Noviembre";
            } else if (mes == 12) {
                nombreMes = "Diciembre";
            } else {
                nombreMes = "Mes no válido";
            }

            int PElectricos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos eléctricos:"));
            int PAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:"));
            int PConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construcción:"));

//Calcular los puntos y la bonificacion del vendedor
            double bono = 0;
            int puntos = 0;

            //Formulas para verificar si la factura contiene algo que le pueda dar puntos o bonificacion al vendedor
            if (PElectricos > 2) {
                bono += monto * 0.04;
                puntos += 1;
            } else {
                bono += monto * 0.02;
            }

            if (PAutomotrices > 4) {
                bono += monto * 0.04;
                puntos += 1;
            } else {
                bono += monto * 0.02;
            }

            if (PConstruccion > 0) {
                bono += monto * 0.08;
                puntos += 2;
            }

            if (PElectricos > 0 && PAutomotrices > 0 && PConstruccion > 0) {
                bono += monto * 0.10;
                puntos += 3;
            }

            if (monto > 50000) {
                bono += monto * 0.05;
                puntos += 1;
            }

            vendedor.comiciones = bono;
            vendedor.puntos = puntos;

        }

        //Aca voy a colocar los que se ocupa para imprimir el informe del vendedor       
        JOptionPane.showMessageDialog(null, "Este es el informe del vendedor");
        JOptionPane.showMessageDialog(null, "Nombre del Vendedor:" + vendedor.getName());
        JOptionPane.showMessageDialog(null, "Codigo Interno:" + vendedor.getCodigo());
        JOptionPane.showMessageDialog(null, "El mes de las facturas procesadas fue: " + nombreMes);
        JOptionPane.showMessageDialog(null, "Carro Propio:" + vendedor.getCarro());
        JOptionPane.showMessageDialog(null, "Total de las Comiciones:" + vendedor.getComiciones());
        JOptionPane.showMessageDialog(null, "Puntos Obtenido:" + vendedor.getPuntos());
        
    }
}
