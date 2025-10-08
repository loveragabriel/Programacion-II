/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioDependenciaUso12;

import java.math.BigDecimal;

/**
 *
 * @author Gabriel
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        if (impuesto == null) return;
        BigDecimal base = impuesto.getMonto();
        String titular = (impuesto.getContribuyente() != null) 
                ? impuesto.getContribuyente().getNombre() : "(sin contribuyente)";
        System.out.println("Calculando impuesto para " + titular + " - Monto base: " + base);
    }
}
