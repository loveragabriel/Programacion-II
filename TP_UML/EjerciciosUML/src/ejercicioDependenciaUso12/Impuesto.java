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
public class Impuesto {
    private  BigDecimal monto;
    private  Contribuyente contribuyente; 

    public Impuesto(BigDecimal monto, Contribuyente contribuyente) {
        this.monto = (monto != null) ? monto : BigDecimal.ZERO;
        this.contribuyente = contribuyente;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
}
