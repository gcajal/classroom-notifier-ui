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

    private ListaController controller;
	private ClassroomNotifier classroomNotifier;
	private BotonPanel botonPanel;
	private ChangesLabelPanel changesLabelPanel;
	private TitlePanel titlePanel;

	public void setController(ListaController controller) {
		this.controller = controller;
		botonPanel.getTestButton().addActionListener(e -> controller.handleTestButtonClick());
	}

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		titlePanel = new TitlePanel();
		titlePanel.setBounds(150, 10, 200, 30);
		frame.getContentPane().add(titlePanel);

		changesLabelPanel = new ChangesLabelPanel();
		changesLabelPanel.setBounds(220, 80, 250, 30);
		frame.getContentPane().add(changesLabelPanel);

		botonPanel = new BotonPanel();
		botonPanel.setBounds(50, 50, 90, 70);
		frame.getContentPane().add(botonPanel);

		frame.setVisible(true);
	}

	@Override
	public void update(Observable observable, Object o) {

	}

	public JLabel getChangesLabel() {
		return changesLabelPanel.getChangesLabel();
	}
}
