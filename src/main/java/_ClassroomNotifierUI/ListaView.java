package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import classroom.notifier.entity.Observable;
import classroom.notifier.entity.implement.Observer;

public class ListaView implements Observer{

	private ClassroomNotifier classroomNotifier;
	private ChangesLabelPanel changesLabelPanel;
	private NotificationPanel notificationPanel;
	private TitlePanel titlePanel;
	private InputPanel inputPanel;
	private BotonPanel botonPanel;
	/**
	 * Create the application.
	 */
	public ListaView(ClassroomNotifier classroomNotifier) {
		this.classroomNotifier = classroomNotifier;
		this.classroomNotifier.addObserver(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        JFrame frame = new JFrame();
		frame.setBounds(0, 0, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(245, 245, 245));

		titlePanel = new TitlePanel();
		titlePanel.setBounds(50, 20, 500, 50);
		titlePanel.setOpaque(false);
		frame.getContentPane().add(titlePanel);

		changesLabelPanel = new ChangesLabelPanel();
		changesLabelPanel.setBounds(50, 80, 500, 300);
		changesLabelPanel.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(changesLabelPanel);

		notificationPanel = new NotificationPanel();
		notificationPanel.setBounds(50, 430, 250, 80);
		notificationPanel.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(notificationPanel);

		inputPanel = new InputPanel();
		inputPanel.setBounds(320, 430, 250, 60);
		frame.getContentPane().add(inputPanel);

		botonPanel = new BotonPanel();
		botonPanel.setBounds(385, 495, 130, 50);
		frame.getContentPane().add(botonPanel);

		frame.setVisible(true);
	}

		@Override
	public void update(Observable observable, Object o) {
		if(observable instanceof MateriasActuales) {
			if (o instanceof String) {
				changesLabelPanel.getChangesLabel().setText((String) o);
				changesLabelPanel.getChangesLabel().setVisible(true);
			} else if (o instanceof ArrayList<?>) {
				List<String> result = (List<String>) o;
				changesLabelPanel.getChangesLabel().setText("Se detectaron cambios de aula:\n" + result.getFirst());
				changesLabelPanel.getChangesLabel().setVisible(true);
			}
		}

	}


	public JLabel getChangesLabel() {
		return changesLabelPanel.getChangesLabel();
	}
}
