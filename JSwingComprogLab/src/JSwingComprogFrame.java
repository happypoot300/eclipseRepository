import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JSwingComprogFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblBGpic;
	private JRadioButton rdoEasy;
	private JRadioButton rdoAverage;
	private JRadioButton rdoDifficult;
	private ButtonGroup difficultyGroup;
	private JTextField textUserAnswer;
	private JButton btnSubmit;
	private JButton btnNext;

	public JSwingComprogFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnNext = new JButton("Next");
		btnNext.setBounds(836, 219, 89, 23);
		contentPane.add(btnNext);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(110, 181, 89, 23);
		contentPane.add(btnSubmit);

		textUserAnswer = new JTextField();
		textUserAnswer.setBounds(594, 285, 325, 41);
		textUserAnswer.setBorder(null);
		contentPane.add(textUserAnswer);
		textUserAnswer.setColumns(10);

		rdoEasy = new JRadioButton("Easy");
		rdoEasy.setBackground(new Color(255, 255, 255));
		rdoEasy.setForeground(new Color(0, 0, 0));
		rdoEasy.setBounds(110, 52, 103, 21);
		contentPane.add(rdoEasy);

		rdoAverage = new JRadioButton("Average");
		rdoAverage.setBackground(new Color(255, 255, 255));
		rdoAverage.setBounds(110, 94, 103, 21);
		contentPane.add(rdoAverage);

		rdoDifficult = new JRadioButton("Difficult");
		rdoDifficult.setBackground(new Color(255, 255, 255));
		rdoDifficult.setBounds(110, 136, 103, 21);
		contentPane.add(rdoDifficult);

		difficultyGroup = new ButtonGroup();
		difficultyGroup.add(rdoEasy);
		difficultyGroup.add(rdoAverage);
		difficultyGroup.add(rdoDifficult);

		lblBGpic = new JLabel("");
		lblBGpic.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblBGpic.setForeground(new Color(0, 0, 0));
		lblBGpic.setIcon(new ImageIcon(this.getClass().getResource("Difficulty.png")));
		lblBGpic.setBounds(-475, -371, 1920, 1080);
		contentPane.add(lblBGpic);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSwingComprogFrame frame = new JSwingComprogFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}