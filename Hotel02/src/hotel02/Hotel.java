/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel02;
import javax.swing.JOptionPane;


/**
 *
 * @author sazaf
 */
public class Hotel {
    private String[][] habitacionesEstado;  //Esta matrioz es para el estado de los cuartos
    private String[][] habitacionesTipo;    //Esta otra matriz es para el tipo de cuarto 
    private double [][] habitacionesPrecios; //Esta otra matriz es para el precio de los cuartos 
    
    public Hotel(){
        habitacionesEstado = new String [5][4]; //Esto es para especificar que son 5 pisos con 4 cuartos cada uno
        habitacionesTipo = new String [5][4];
        habitacionesPrecios = new double [5][4];
        inicializarHabitaciones();
    }
    
    private void inicializarHabitaciones(){
        for (int piso = 0; piso < 5; piso ++){
            for (int hab = 0; hab < 4 ; hab++){
                habitacionesEstado[piso][hab] = "Libre";  //Este va a ser el estado inicial de cada cuarto
                if (piso == 2 && hab = 0){
                    habitacionesEstado[piso][hab] = "Sucia";    
                } else if (piso == 3 && hab == 0){
                    habitacionesEstado[piso][hab] = "Sucia";
                } else if (piso == 4 && hab == 0){
                   habitacionesEstado[piso][hab] = "Ocupada"; 
                }
                
                // Aca voy a colocar el precio de cada habitacion y el tipo de habitacion
                if (hab == 0 || hab == 2){
                    habitacionesTipo[piso][hab] = "Simple";
                    habitacionesPrecios[piso][hab] = 30.0;
                } else {
                    habitacionesTipo[piso][hab] = "Doble";
                    habitacionesPrecios[piso][hab] = 50.0;
                }
            }
        }
    }
    
    public void mostrarHabitaciones(){  // esto lo voy a utilizar para mosrtar las habitaciones del hotel
        String mensaje = "El estado de las habitaciones es: \n";
        for (int piso = 4; piso >= 0; piso--){
            mensaje += "Numero de Piso: " +(piso +1) + ":\n";
            for (int hab = 0; hab < 4; hab++){
                String numeroHabitacion = "P" + (piso + 1) + "H" + (hab + 1);
                mensaje += "Habitacion" + numeroHabitacion + "\n";
                mensaje += "Estado" + habitacionesEstado[piso][hab] + "\n";
                mensaje += "Tipo" + habitacionesTipo[piso][hab] + "\n";
                mensaje += "Precio $" + habitacionesPrecios[piso][hab] + "\n";

            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void modificarHabitacion(){  // este lo voy a utilizar para que se puedan modificar las habitaciones 
        int piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso (1-5)"));
        int hab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la habitación (1-4)"));
        
        if (piso >= 0 && piso 5 && hab >= 0 hab < 4){
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (Libre, Ocupada, Sucia):");
        String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo (Simple, Doble):");
        double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio:"));
        
        habitacionesEstado[piso][hab] = nuevoEstado;
        habitacionesTipo[piso][hab] = nuevoTipo;
        habitacionesPrecios[piso][hab] = nuevoPrecio;
        
        JOptionPane.showMessageDialog(null, "Habitación actualizada correctamente.");
        } else {
        JOptionPane.showMessageDialog(null, "Datos inválidos. Intente de nuevo.");
        }
    }
    
    public void generarResumen() {       // esto genera un resumen para que vean el estado de cada habitacion del hotal
        int libres = 0, ocupadas = 0, sucias = 0;

        for (int piso = 0; piso < 5; piso++) {
            for (int hab = 0; hab < 4; hab++) {
                switch (habitacionesEstado[piso][hab].toLowerCase()) {
                    case "libre": libres++; break;
                    case "ocupada": ocupadas++; break;
                    case "sucia": sucias++; break;
                }
            }
        }
    }
       public void ejecutar() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú del Hotel:\n" +
                "1. Mostrar habitaciones\n" +
                "2. Modificar habitación\n" +
                "3. Generar resumen\n" +
                "4. Salir\n\n" +
                "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1: mostrarHabitaciones(); break;
                case 2: modificarHabitacion(); break;
                case 3: generarResumen(); break;
                case 4: JOptionPane.showMessageDialog(null, "Saliendo del sistema."); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}

