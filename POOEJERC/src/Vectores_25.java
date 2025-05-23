import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Vectores_25 extends JFrame {
    JCheckBox vCuadros[];
    JButton btnAceptar;

    public Vectores_25() {
        initComponents();
        crearVentana();
    }

    void crearVentana() {
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300, 600);
        this.setLayout(null); // Necesario para usar setBounds
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        vCuadros = new JCheckBox[10];
        String vTextos[] = {"Rojo", "Verde", "Azul", "Rosa", "Celeste", "Morado",
                "Amarillo", "Marrón", "Naranja", "Blanco"};

        for (int i = 0; i < vCuadros.length; i++) {
            vCuadros[i] = new JCheckBox(vTextos[i]);
            vCuadros[i].setBounds(10, 10 + 30 * i, 100, 20);
            this.add(vCuadros[i]);
        }

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(10, 360, 100, 20);
        this.add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
    }

    private void btnAceptarActionPerformed(ActionEvent evt) {
        int cont = 0;
        for (JCheckBox cuadro : vCuadros) {
            if (cuadro.isSelected()) {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay " + cont + " cuadros seleccionados");
    }

    private void initComponents() {
        // Este método puede estar vacío si no usas un editor gráfico de interfaces como NetBeans
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Vectores_25().setVisible(true);
        });
    }
}
