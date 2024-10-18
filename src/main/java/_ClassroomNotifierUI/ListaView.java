package _ClassroomNotifierUI;

import classroom.notifier.Adapter;
import classroom.notifier.ClassroomNotifier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import classroom.notifier.entity.Observable;

public class ListaView implements classroom.notifier.implement.Observer {

	private ClassroomNotifier classroomNotifier;
	private ChangesLabelPanel changesLabelPanel;
	private NotificationPanel notificationPanel;
	private ListaController listaController;
	private TitlePanel titlePanel;
	private InputPanel inputPanel;
	private BotonPanel botonPanel;
	/**
	 * Create the application.
	 */
	public ListaView(ClassroomNotifier classroomNotifier) {
		this.classroomNotifier = classroomNotifier;
		this.classroomNotifier.getAdapter().addObserver(this);
		this.listaController = new ListaController(classroomNotifier);
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

		notificationPanel = new NotificationPanel(this.classroomNotifier.getNotificador().getNotificadores(),this.listaController);
		notificationPanel.setBounds(50, 430, 250, 80);
		notificationPanel.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(notificationPanel);

		frame.setVisible(true);
	}

		@Override
	public void update(Observable observable, Object o) {
		if(observable instanceof Adapter) {
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
