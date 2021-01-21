package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Layers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		new Layers().setVisible(true);
	}

	public Layers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
                
                this.setResizable(false);

		JLayeredPane pane = new JLayeredPane();
		contentPane.add(pane, BorderLayout.CENTER);
		pane.setLayout(null);

		JLabel l1 = new JLabel("Isaura A");
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		pane.setLayer(l1, 0);
		l1.setBounds(82, 65, 315, 132);
		pane.add(l1);

		JLabel l2 = new JLabel("Manico ");
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		pane.setLayer(l2, 1);
		l2.setBounds(58, 80, 302, 148);
		pane.add(l2);
	}
}