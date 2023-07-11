import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOpen;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pnlButtons = new JPanel();
		pnlButtons.setOpaque(false);
		pnlButtons.setPreferredSize(new Dimension(100, 0));
		contentPane.add(pnlButtons, BorderLayout.WEST);
		pnlButtons.setLayout(null);

		btnOpen = new JButton("Open");
		btnOpen.setBounds(0, 156, 100, 40);
		btnOpen.setFocusable(false);
		btnOpen.setFont(new Font("Arial", Font.BOLD, 20));
		btnOpen.addActionListener(this);
		pnlButtons.add(btnOpen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {

			MainMenu mainMenu = new MainMenu();
//			JSwingComprogTestFrame calcuFrame = new JSwingComprogTestFrame();
			this.dispose();
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
