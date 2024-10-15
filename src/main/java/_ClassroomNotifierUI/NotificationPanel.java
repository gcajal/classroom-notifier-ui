package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class NotificationPanel extends JPanel {

    private JRadioButton emailOption;
    private JRadioButton telegramOption;
    private ButtonGroup notificationGroup;
    private JLabel iconLabelEmail;
    private JLabel iconLabelTelegram;

    public NotificationPanel() {
        setLayout(null);

        emailOption = new JRadioButton("Email");
        emailOption.setBounds(50, 20, 100, 30);
        add(emailOption);

        telegramOption = new JRadioButton("Telegram");
        telegramOption.setBounds(50, 60, 100, 30);
        add(telegramOption);

        notificationGroup = new ButtonGroup();
        notificationGroup.add(emailOption);
        notificationGroup.add(telegramOption);

        ImageIcon emailIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Email_logo.png")));
        Image imgEmail = emailIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        iconLabelEmail = new JLabel(new ImageIcon(imgEmail));
        iconLabelEmail.setBounds(120, 25, 20, 20);
        add(iconLabelEmail);

        ImageIcon telegramIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Telegram_logo.png")));
        Image imgTelegram = telegramIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        iconLabelTelegram = new JLabel(new ImageIcon(imgTelegram));
        iconLabelTelegram.setBounds(140, 65, 20, 20);
        add(iconLabelTelegram);
    }
}
