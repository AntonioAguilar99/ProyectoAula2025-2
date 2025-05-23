/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salario1;

/**
 *
 * @author HP
 */
public class Operaciones {
    public Operaciones(){ }
    
    public static int calsalario(int va_horas, int ho_tra){
        int salario = 0;
        salario = ho_tra * va_horas;
        return salario;
    }
    public static double salariodiario(double salario){
        double salario_dia = 0;
        salario_dia = salario/30;
        return salario;
    }
    }
    

