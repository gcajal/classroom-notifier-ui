package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class PanelNotificacion extends JPanel {

    private JComboBox<String> notificationOptions;
    private JLabel label;
    private ListaController controller;

    private String previousSelection = "ListaView";

    public PanelNotificacion(Set<String> lsOptions, ListaController controller) {
        setLayout(null);
        setBackground(new Color(211, 211, 211));
        this.controller = controller;

        label = new JLabel("Notificadores:");
        label.setBounds(10, 10, 150, 20);
        label.setForeground(Color.DARK_GRAY);
        add(label);

        String[] options = lsOptions.stream()
                .filter(option -> !"logger".equalsIgnoreCase(option))
                .toArray(String[]::new);

        notificationOptions = new JComboBox<>(options);
        notificationOptions.setBounds(10, 40, 230, 30);
        add(notificationOptions);
        notificationOptions.addActionListener(changeValue(notificationOptions)); ;
        setBackground(new Color(211, 211, 211));
    }

    private ActionListener changeValue(JComboBox comboBox){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (previousSelection != null){
                    controller.eliminarNotificador(previousSelection);
                }

                String seleccion = (String) comboBox.getSelectedItem();
                previousSelection = seleccion;
                controller.actualizarNotificador(seleccion);
                System.out.println("Elemento seleccionado: " + seleccion);

            }
        };
    }
}
