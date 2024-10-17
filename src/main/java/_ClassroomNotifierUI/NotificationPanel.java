package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class NotificationPanel extends JPanel {

    private JComboBox<String> notificationOptions;
    private JLabel label;

    public NotificationPanel(Set<String> lsOptions) {
        setLayout(null);
        setBackground(new Color(211, 211, 211));

        label = new JLabel("Tipo de Notificación:");
        label.setBounds(10, 10, 150, 20);
        label.setForeground(Color.DARK_GRAY);
        add(label);

        String[] options = new String[lsOptions.size()];
        options = lsOptions.toArray(options); //{"Email", "Telegram"};

        notificationOptions = new JComboBox<>(options);
        notificationOptions.setBounds(10, 40, 230, 30);
        add(notificationOptions);

        setBackground(new Color(211, 211, 211));
    }

    public String getSelectedOption() {
        return (String) notificationOptions.getSelectedItem();
    }

    public void addNotificationOption(String newOption) {
        notificationOptions.addItem(newOption);
    }
}
