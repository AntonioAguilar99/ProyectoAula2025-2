package sistemaventas;

import java.util.*;
import javax.swing.*;

public class Sistemaventas {

    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de ventas");
        String usuario = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
        String contraseña = JOptionPane.showInputDialog(null, "Digite su contraseña");
        login(usuario, contraseña);
    }

    static void login(String usuario, String contraseña){
        if(usuario.equals("Carol") && contraseña.equals("123")){
            JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
            CostoProducto();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }

    static void CostoProducto(){
    }
}