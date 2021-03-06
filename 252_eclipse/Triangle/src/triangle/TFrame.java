package triangle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TFrame frame = new TFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 150, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//	build components
		JLabel side1 = new JLabel("Side1");
		side1.setBounds(12, 12, 200, 14);
		add(side1);
		
		final JTextField  input1 = new JTextField();
		input1.setBounds(12, 28, 100, 20);
		add(input1);
		
		JLabel side2 = new JLabel("Side2");
		side2.setBounds(12, 45, 200, 14);
		add(side2);
		
		final JTextField  input2 = new JTextField();
		input2.setBounds(12, 60, 100, 20);
		add(input2);
		
		JLabel side3 = new JLabel("Side3");
		side3.setBounds(12, 80, 200, 14);
		add(side3);
		
		final JTextField  input3 = new JTextField();
		input3.setBounds(12, 96, 100, 20);
		add(input3);
		
		JButton btn = new JButton("check");
		btn.setBounds(30, 126, 70, 15);
		add(btn);
		
		final JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 160, 120, 80);
		txtArea.setText("Answer");
		add(txtArea);
		
//		 add event listeners
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = input1.getText();
				String b = input2.getText();
				String c = input3.getText();
				Triangle t = new Triangle();
				txtArea.setText(t.computeType(a, b, c));
				txtArea.setLineWrap(true);
			}
			
			
			
		});

	}

}
