
import java.awt.Color;
import javax.swing.JButton;

public class VentanaObjetos27 extends javax.swing.JFrame {
    // JButton es la clase que permite crear botones.
    JButton btnEnviar;
    JButton btnSalir;

    public VentanaObjetos27() {
        initComponents();
        configurarVentana();
    }

    void configurarVentana() {
        this.setTitle("Ventana de Objetos");
        this.setSize(300, 200);

        // Creamos botones personalizados
        btnEnviar = new JButton();
        btnSalir = new JButton();

        // Métodos para cambiar propiedades (set)
        btnEnviar.setText("Enviar");
        btnSalir.setText("Salir");
        btnEnviar.setBounds(10, 75, 100, 20);
        btnSalir.setBounds(150, 75, 100, 20);
        btnEnviar.setBackground(Color.GREEN);
        btnSalir.setBackground(Color.ORANGE);

        // Métodos para obtener información (get)
        btnEnviar.getText();
        btnSalir.getText();
        btnEnviar.getBounds();
        btnSalir.getBounds();
        btnEnviar.getBackground();
        btnSalir.getBackground();

        // Métodos para dar órdenes (otros)
        btnEnviar.repaint();
        btnSalir.repaint();

        // Agregar los botones al contenido de la ventana
        this.getContentPane().add(btnEnviar);
        this.getContentPane().add(btnSalir);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(VentanaObjetos27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaObjetos27().setVisible(true);
            }
        });
    }

   
}
