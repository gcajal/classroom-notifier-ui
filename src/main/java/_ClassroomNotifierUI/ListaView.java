package _ClassroomNotifierUI;



import java.awt.*;
import javax.swing.JFrame;

import classroom.notifier.aplicacion.ClassroomNotifier;
import classroom.notifier.interfaces.Observer;


public class ListaView implements Observer {

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
		this.listaController = new ListaController(classroomNotifier);
		//init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void init() {

		this.suscribirseClassroom();

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
		panelAviso.setFont(new Font("Arial", Font.PLAIN, 16));
		frame.getContentPane().add(panelAviso);

		//panelNotificacion = new PanelNotificacion(this.classroomNotifier.getNotificador().getNotificadores(),this.listaController);
		panelNotificacion = new PanelNotificacion(this.classroomNotifier.getAllObserversNames(),this.listaController);
		panelNotificacion.setBounds(50, 430, 250, 80);
		panelNotificacion.setBackground(new Color(211, 211, 211));
		frame.getContentPane().add(panelNotificacion);

		frame.setVisible(true);
	}

	private void suscribirseClassroom() {
		this.classroomNotifier.addObserver(this);
		this.classroomNotifier.addCurrentObservers(this.getClass().getSimpleName());
	}


	@Override
	public void update(Object s) {
		panelAviso.getPanel().setText((String) s);
		panelAviso.getPanel().setVisible(true);
	}
}
