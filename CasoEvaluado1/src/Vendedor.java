/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sazaf
 */
//Primero definir los caracteres del vendedor 
public class Vendedor {

    public String name;
    public String id;
    public String codigo;
    public String empresa;
    public String Carro; //lo coloco aca para definir el carro y asi poder preguntar 
    public int puntos = 0;
    public double comiciones = 0;

    public Vendedor() {
    }

    //En esta parte coloque el contructor para asi asignar un valor a cada variable 
    public Vendedor(String name, String id, String Nfactura, String sucursal, String Carro) {
        this.name = name;
        this.id = id;
        this.codigo = codigo;
        this.empresa = empresa;
        this.Carro = Carro;
    }

    public void setagregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void setagregarComiciones(double comiciones) {
        this.comiciones += comiciones;
    }

    public String getName() {
        return name;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarro() {
        return Carro;
    }

    public int getPuntos() {
        return puntos;
    }

    public double getComiciones() {
        return comiciones;
    }

}
