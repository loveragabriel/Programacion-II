/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Gabriel
 */
public class GeneradorQR {
   public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("QR generado para: " + usuario.getNombre());
        System.out.println("Valor del QR: " + qr.getValor());
    }
}
