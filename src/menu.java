import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {

    private JButton RETIRO;
    private JButton botonDep;
    private JButton VERSALDO;
    private JButton cambiarclave;
    private JButton SALIR;
    private JPanel panel;
    private String nombreUsuario;

    public void usuarios(String usuario) {
        this.nombreUsuario = usuario;

    }



    public menu() {
        super("Menu de opciones");
        setVisible(true);
        setSize(400, 400);
        setContentPane(panel);

        SALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir ? ","AVISO" ,JOptionPane.YES_NO_OPTION);

                try {
                    if (respuesta == JOptionPane.YES_OPTION) {
                        dispose();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        cambiarclave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarClave cambiarClave = new cambiarClave(nombreUsuario); // Pasar el nombre de usuario al constructor
                cambiarClave.setVisible(true); // Mostrar la ventana para cambiar la clave
            }
        });
        botonDep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositos depositos = new depositos();
                depositos.usuarios(nombreUsuario);
                depositos.setVisible(true);
            }

        });
        VERSALDO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verSaldos saldos = new verSaldos();
                saldos.usuarios(nombreUsuario);
                saldos.setVisible(true);
            }
        });
        RETIRO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retiros retiros=new retiros();
                retiros.usuarios(nombreUsuario);
                retiros.setVisible(true);
            }
        });


    }
}
