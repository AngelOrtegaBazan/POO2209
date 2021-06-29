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
public class animales {
   
    private int NumerodePatas;


    public animales() {
    }
    
    public String Pelo;
    public int NumerodeColas;
    
    public animales(int NumerodePatas, String Pelo, int NumerodeColas) {
        this.NumerodePatas = NumerodePatas;
        this.Pelo = Pelo;
        this.NumerodeColas = NumerodeColas;
    }

    public int getNumeroPatas() {
        return NumerodePatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumerodePatas = NumeroPatas;
    }

    public String getTipo() {
        return Pelo;
    }

    public void setTipo(String Pelo) {
        this.Pelo = Pelo;
    }

    public int getNumerodeColas() {
        return NumerodeColas;
    }

    public void setNumerodeColas(int NumerodeColas) {
        this.NumerodeColas = NumerodeColas;
    }

    @Override
    public String toString() {
        return "animales{" + "Numero de Patas= " + NumerodePatas + ", Pelo= " + Pelo + ", NumerodeColas= " + NumerodeColas + '}';
    }

    public static void main(String[] args) {

        
         animales clase1 = new animales( 4 , "si", 1);
        System.out.println(clase1);
        
        perro herencia1 = new perro (" shih tzu "," Ladrido"," Negro ", "30 cm");
        System.out.println(herencia1);
        
        gato herencia2 = new gato (" Chausie "," Maullido","Blanco ", " 46 cm");
        System.out.println(herencia2);
        
        
    }
    
}
