/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2.animales;

/**
 *
 * @author r3tro
 */
public class perro extends animales {
    
private String Raza;    
private String Habla;
private String Color;
private String Tamaño;

    public perro() {
    }

    public perro(String Raza, String Habla, String Color, String Tamaño) {
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.Tamaño = Tamaño;
    }

    public perro(String Raza, String Habla, String Color, String Tamaño, int NumerodePatas, String Pelo, int NumerodeColas) {
        super(NumerodePatas, Pelo, NumerodeColas);
        this.Raza = Raza;
        this.Habla = Habla;
        this.Color = Color;
        this.Tamaño = Tamaño;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getHabla() {
        return Habla;
    }

    public void setHabla(String Habla) {
        this.Habla = Habla;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Habla=" + Habla + ", Color=" + Color + ", Tamaño= " + Tamaño + '}';
    }

    
    
    
    
}
