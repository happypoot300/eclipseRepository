import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import SettingsTabPackage.SettingsJTree;

public class MainMenu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtFieldInput;
	private JButton btnSubmit;
	private JTextArea txtAComplaints;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblStatus;
	private JButton btnOpenCalcu;
	public static JTabbedPane tabbedPane;
	private JPanel pnlJOption;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtFieldMessage;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnJOptionOption;
	private JButton btnJOptionInput;
	private JTextField textFieldAlert;
	private JButton btnJOptionMessage;
	private JButton btnJOptionAlert;
	private JComboBox comboBox;
	private JLabel lblNewLabel_10;
	private JComboBox cboSettings;
	private JPanel pnlTree;

	public MainMenu() {
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 537);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 645, 476);
		contentPane.add(tabbedPane);

		JPanel pnlHome = new JPanel();
		tabbedPane.addTab("Home", null, pnlHome, null);
		pnlHome.setLayout(null);

		JLabel lblNewLabel = new JLabel("H O M E");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Swamp Witch", Font.BOLD, 50));
		lblNewLabel.setBounds(57, 126, 504, 166);
		pnlHome.add(lblNewLabel);

		JPanel pnlComplaints = new JPanel();
		tabbedPane.addTab("Complaints", null, pnlComplaints, null);
		pnlComplaints.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("TEXT AREA FOR COMPLAINTS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 11, 435, 52);
		pnlComplaints.add(lblNewLabel_1);

		txtAComplaints = new JTextArea();
		txtAComplaints.setWrapStyleWord(true);
		txtAComplaints.setEditable(false);
		txtAComplaints.setForeground(Color.BLACK);
		txtAComplaints.setBackground(new Color(250, 235, 215));
		txtAComplaints.setBounds(11, 75, 433, 361);
		pnlComplaints.add(txtAComplaints);

		btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(0, 128, 0));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 20));
		btnSubmit.setBorder(null);
		btnSubmit.setBackground(new Color(143, 188, 143));
		btnSubmit.setBounds(455, 380, 175, 57);
		btnSubmit.addActionListener(this);
		pnlComplaints.add(btnSubmit);

		txtFieldInput = new JTextField();
		txtFieldInput.setForeground(new Color(139, 69, 19));
		txtFieldInput.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFieldInput.setBounds(454, 330, 176, 30);
		pnlComplaints.add(txtFieldInput);
		txtFieldInput.setColumns(10);

		String[] comboBoxItems = { "A", "B", "C", "D", "E", "F", "G", "H" };
		comboBox = new JComboBox(comboBoxItems);
		comboBox.setForeground(new Color(255, 255, 0));
		comboBox.setBackground(new Color(128, 128, 0));
		comboBox.setSelectedIndex(-1);
		comboBox.setBounds(454, 41, 176, 22);
		pnlComplaints.add(comboBox);

		lblNewLabel_10 = new JLabel(":Select from the letters below:");
		lblNewLabel_10.setForeground(new Color(128, 0, 0));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(455, 11, 175, 22);
		pnlComplaints.add(lblNewLabel_10);

		JPanel pnlCalcu = new JPanel();
		pnlCalcu.setBackground(new Color(255, 228, 181));
		tabbedPane.addTab("Calcu", null, pnlCalcu, null);
		pnlCalcu.setLayout(null);

		btnOpenCalcu = new JButton("Open Calculator");
		btnOpenCalcu.setForeground(new Color(255, 69, 0));
		btnOpenCalcu.setFont(new Font("Arial Black", Font.BOLD, 39));
		btnOpenCalcu.setBounds(113, 152, 433, 135);
		btnOpenCalcu.addActionListener(this);
		pnlCalcu.add(btnOpenCalcu);

		JPanel pnlLoginPass = new JPanel();
		pnlLoginPass.setBackground(new Color(128, 128, 128));
		tabbedPane.addTab("Login Password", null, pnlLoginPass, null);
		pnlLoginPass.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 11, 286, 57);
//		passwordField.setEchoChar((char) 0);
		pnlLoginPass.add(passwordField);

		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(138, 43, 226));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(10, 79, 286, 38);
		btnLogin.addActionListener(this);
		pnlLoginPass.add(btnLogin);

		lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Arial", Font.BOLD, 46));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 255, 620, 182);
		pnlLoginPass.add(lblStatus);

		pnlJOption = new JPanel();
		tabbedPane.addTab("JOption", null, pnlJOption, null);
		pnlJOption.setLayout(null);

		lblNewLabel_2 = new JLabel("JOption Message");
		lblNewLabel_2.setForeground(new Color(255, 20, 147));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(158, 0, 164, 26);
		pnlJOption.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Input Message: ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 20, 147));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(10, 28, 164, 26);
		pnlJOption.add(lblNewLabel_3);

		txtFieldMessage = new JTextField();
		txtFieldMessage.setBounds(184, 30, 118, 26);
		pnlJOption.add(txtFieldMessage);
		txtFieldMessage.setColumns(10);

		lblNewLabel_4 = new JLabel("Input Alert: ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 20, 147));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 93, 164, 26);
		pnlJOption.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("JOption Alert");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 20, 147));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(158, 65, 164, 26);
		pnlJOption.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Input Something:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(255, 20, 147));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(10, 158, 164, 26);
		pnlJOption.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("JOption Input");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(255, 20, 147));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setBounds(158, 130, 164, 26);
		pnlJOption.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel(":Select Option:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(255, 20, 147));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setBounds(10, 225, 164, 26);
		pnlJOption.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("JOption Option");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(new Color(255, 20, 147));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_9.setBounds(158, 197, 164, 26);
		pnlJOption.add(lblNewLabel_9);

		btnJOptionOption = new JButton("OPEN");
		btnJOptionOption.setBounds(184, 229, 118, 26);
		btnJOptionOption.addActionListener(this);
		pnlJOption.add(btnJOptionOption);

		btnJOptionInput = new JButton("OPEN");
		btnJOptionInput.setBounds(184, 160, 118, 26);
		btnJOptionInput.addActionListener(this);
		pnlJOption.add(btnJOptionInput);

		textFieldAlert = new JTextField();
		textFieldAlert.setColumns(10);
		textFieldAlert.setBounds(184, 93, 118, 26);
		pnlJOption.add(textFieldAlert);

		btnJOptionMessage = new JButton("OPEN");
		btnJOptionMessage.setBounds(312, 30, 118, 26);
		btnJOptionMessage.addActionListener(this);
		pnlJOption.add(btnJOptionMessage);

		btnJOptionAlert = new JButton("OPEN");
		btnJOptionAlert.setBounds(312, 95, 118, 26);
		btnJOptionAlert.addActionListener(this);
		pnlJOption.add(btnJOptionAlert);

		JPanel pnlSettings = new JPanel();
		tabbedPane.addTab("Settings", null, pnlSettings, null);
		pnlSettings.setLayout(null);

		pnlTree = new JPanel();
		pnlTree.setBounds(0, 0, 131, 448);
		pnlSettings.add(pnlTree);
		pnlTree.setLayout(new BorderLayout(0, 0));

		pnlTree.add(SettingsJTree.CreateJTreeSetting());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String setPassword = "admin";
		if (e.getSource() == btnSubmit) {
			txtAComplaints.append(txtFieldInput.getText());
		} else if (e.getSource() == btnLogin) {

			String passwordString = new String(passwordField.getPassword());
			if (passwordString.equals(setPassword)) {
				lblStatus.setText("LOGIN SUCCESSFULL");
				lblStatus.setForeground(Color.green);
			} else {
				lblStatus.setText("LOGIN FAILED");
				lblStatus.setForeground(Color.red);
			}
		} else if (e.getSource() == btnOpenCalcu) {
			JSwingComprogTestFrame calcuFrame = new JSwingComprogTestFrame();

			this.dispose();
		} else if (e.getSource() == btnJOptionMessage) {
			JOptionPane.showMessageDialog(null, txtFieldMessage.getText());
		} else if (e.getSource() == btnJOptionAlert) {
			JOptionPane.showMessageDialog(null, txtFieldMessage.getText(), "Alert", JOptionPane.WARNING_MESSAGE);
		} else if (e.getSource() == btnJOptionInput) {
			JOptionPane.showInputDialog(null, "enter something");
		} else if (e.getSource() == btnJOptionOption) {
			int a = JOptionPane.showConfirmDialog(null, "are you sure?");
			if (a == JOptionPane.YES_OPTION) {
				this.dispose();
			}
		}

	}
}
