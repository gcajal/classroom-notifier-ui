package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;

import java.awt.Color;
import javax.swing.JFrame;

import classroom.notifier.entity.Observable;

public class ListaView implements classroom.notifier.implement.Observer<String> {

	private ClassroomNotifier classroomNotifier;
	private PanelAvisoMateria panelAviso;
	private PanelNotificacion panelNotificacion;
	private ListaController listaController;
	private Titulo titulo;

	/**
	 * Create the application.
	 */
	public ListaView(ClassroomNotifier classroomNotifier) {
		this.classroomNotifier = classroomNotifier;
		this.classroomNotifier.getNotificador().addObserver(this);
		this.listaController = new ListaController(classroomNotifier);
		inicilizar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void inicilizar() {
        JFrame frame = new JFrame();
		frame.setBounds(0, 0, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(245, 245, 245));

		titulo = new Titulo();
		titulo.setBounds(50, 20, 500, 50);
		titulo.setOpaque(false);
		frame.getContentPane().add(titulo);

		panelAviso = new PanelAvisoMateria();
		panelAviso.setBounds(50, 80, 500, 300);
		panelAviso.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(panelAviso);

		panelNotificacion = new PanelNotificacion(this.classroomNotifier.getNotificador().getNotificadores(),this.listaController);
		panelNotificacion.setBounds(50, 430, 250, 80);
		panelNotificacion.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(panelNotificacion);

		frame.setVisible(true);
	}


	@Override
	public void update(Observable<String> observable, String s) {
		panelAviso.getPanel().setText(s);
		panelAviso.getPanel().setVisible(true);
	}
}
