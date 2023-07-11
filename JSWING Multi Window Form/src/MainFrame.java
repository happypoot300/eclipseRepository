import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel contentPane;
	ImageIcon icon = new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\FemaleIcon.png");

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 643, 446);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Home",
				new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\FemaleIcon.png"), panel,
				null);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Settings", null, panel_1, null);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("EHE", null, panel_2, null);

//		=======================TABBED PANE===================
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedTab = tabbedPane.getSelectedIndex();
				System.out.println("selectedINdex: " + selectedTab);

				if (selectedTab == 0) {
					tabbedPane.setIconAt(0,
							new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\FemaleIcon.png"));
				} else {
					tabbedPane.setIconAt(0, new ImageIcon(
							"C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\familySimbolNoCopyright.jpg"));
				}

			}
		});

	}// end constructor

}
