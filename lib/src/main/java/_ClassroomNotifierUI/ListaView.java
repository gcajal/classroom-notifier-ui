package _ClassroomNotifierUI;

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

public class ListaView {

    private ListaController controller;
	private JLabel changesLabel;


	public JLabel getChangesLabel() {
		return changesLabel;
	}

	public void setController(ListaController controller) {
		this.controller = controller;
	}

	/**
	 * Create the application.
	 */
	public ListaView() {
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

		JLabel titleLabel = new JLabel("ClassroomNotifier");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		titleLabel.setBounds(150, 10, 200, 30);
		frame.getContentPane().add(titleLabel);

		changesLabel = new JLabel("Se detectaron cambios de aulas");
		changesLabel.setBounds(220, 80, 200, 30);
		changesLabel.setVisible(false);
		frame.getContentPane().add(changesLabel);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 6));
		buttonPanel.setBounds(50, 50, 90, 70);
		buttonPanel.setBorder(new LineBorder(Color.BLACK, 2));
		frame.getContentPane().add(buttonPanel);

		buttonPanel.add(Box.createVerticalGlue());

		JButton testButton = new JButton("Test");
		testButton.setBackground(Color.RED);
		testButton.setForeground(Color.WHITE);
		testButton.setFocusPainted(false);
		testButton.setOpaque(true);
		testButton.setBorderPainted(false);
		testButton.setPreferredSize(new Dimension(80, 50));
		buttonPanel.add(testButton);

		buttonPanel.add(Box.createVerticalGlue());

		testButton.addActionListener(e -> controller.handleTestButtonClick());

		frame.setVisible(true);
	}
}
