package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class NotificationPanel extends JPanel {

    private JComboBox<String> notificationOptions;
    private JLabel label;
    private ListaController controller;

    public NotificationPanel(Set<String> lsOptions, ListaController controller) {
        setLayout(null);
        setBackground(new Color(211, 211, 211));
        this.controller = controller;

        label = new JLabel("Tipo de Notificación:");
        label.setBounds(10, 10, 150, 20);
        label.setForeground(Color.DARK_GRAY);
        add(label);

        String[] options = new String[lsOptions.size()];
        options = lsOptions.toArray(options); //{"Email", "Telegram"};

        notificationOptions = new JComboBox<>(options);
        notificationOptions.setBounds(10, 40, 230, 30);
        add(notificationOptions);
        notificationOptions.addActionListener(changeValue(notificationOptions)); ;
        setBackground(new Color(211, 211, 211));
    }

    public String getSelectedOption() {
        return (String) notificationOptions.getSelectedItem();
    }

    private ActionListener changeValue(JComboBox comboBox){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String seleccion = (String) comboBox.getSelectedItem();
                controller.actualizarNotificador(seleccion);
                System.out.println("Elemento seleccionado: " + seleccion);
            }
        };
    }
}
