/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salario1;

import javax.swing.JTextField;

/**
 *
 * @author HP
 */
class Prestaciones {
   
    // Método para calcular DTS
    public double calcularDTS(double salario, JTextField dts) {
        // Convertir el texto de dts a un double
        double dtsValor = Double.parseDouble(dts.getText());
        return (salario * dtsValor) / 360;
    }

    // Método para calcular DTA
    public double calcularDTA(double salario, JTextField dta) {
        // Convertir el texto de dta a un double
        double dtaValor = Double.parseDouble(dta.getText());
        return (salario * dtaValor) / 360;
    }

    // Método para calcular Cesantía
    public double calcularCesantia(double salario, double cesantia, JTextField dta) {
        // Convertir el texto de dta a un double
        double dtaValor = Double.parseDouble(dta.getText());
        return cesantia + (cesantia * dtaValor * 0.12 / 360);
    }
}


