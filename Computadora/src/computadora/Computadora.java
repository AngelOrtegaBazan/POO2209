/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;
import ico.fes.partes.CPU;
import ico.fes.partes.Monitor;
import ico.fes.partes.Mouse;
import ico.fes.partes.Teclado;
/**
 *
 * @author Usuario
 */
public class Computadora {

//    /**
     
    public static void main(String[] args) {
        
        CPU cpu1= new CPU ("Intel","i5 10400",4300);
        System.out.print(cpu1);
        Monitor m1 = new Monitor ("Acer", "R221Q", 15);
        System.out.print(m1);
        Mouse mo1 = new Mouse ("Logitech", "G600", "Alambrico");
        System.out.print(mo1);
        Teclado t1 = new Teclado ("Yeyian", "2000", 128, 15);
        System.out.print(t1);;
    }
    
}
