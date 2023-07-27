package converterMetters.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGrafico extends JFrame {
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem option1;
    private JMenuItem option2;
    private JMenuItem option3;

    public ConversorGrafico() {
        setSize(600, 400);
        setTitle("Conversor One");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        mostrarMenu();
        panel.add(menuBar);
        add(panel);
    }

    public void mostrarMenu() {
        // inicializacion de los atributos
        menuBar = new JMenuBar();
        menu = new JMenu("Elija una opcion valida");
        option1 = new JMenuItem("Centimetros para metros");
        option2 = new JMenuItem("Metros a centimetros");
        option3 = new JMenuItem("Salida");

        menu.add(option1);
        menu.add(option2);
        menu.add(option3);

        menuBar.add(menu);

        option3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        ConversorGrafico ventana = new ConversorGrafico();
        ventana.setVisible(true);

    }
}
