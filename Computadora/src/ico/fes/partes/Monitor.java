/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

/**
 *
 * @author Usuario
 */
public class Monitor {
    private String marca;
    private String modelo;
    private int pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, int pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
    }

    
    
}
