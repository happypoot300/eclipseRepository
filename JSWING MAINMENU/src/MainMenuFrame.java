import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainMenuFrame extends JFrame {

	private JPanel contentPane;
	private static JTable tblOfficials;
	private JTabbedPane tabbedPaneMain;
	private JPanel pnlDashboard;

	public MainMenuFrame() {

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPaneMain = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMain.setBackground(Color.WHITE);
		tabbedPaneMain.setBounds(0, 55, 1904, 986);
		tabbedPaneMain.setFont(new Font("Arial", Font.BOLD, 23));
		tabbedPaneMain.setFocusable(false);
		contentPane.add(tabbedPaneMain);

		pnlDashboard = new JPanel();
		pnlDashboard.setBackground(Color.white);
		tabbedPaneMain.addTab("Dashboard", null, pnlDashboard, null);
		tabbedPaneMain.setForegroundAt(0, new Color(30, 81, 146));
		pnlDashboard.setLayout(null);

		JPanel pnlCBOList = new JPanel();
		pnlCBOList.setBackground(Color.WHITE);
		pnlCBOList.setLayout(null);
		pnlCBOList.setBounds(1068, 37, 806, 814);
		pnlDashboard.add(pnlCBOList);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setBounds(6, 144, 786, 666);
		pnlCBOList.add(scrollPane);

		Icon profileICon = new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\Profile.png");

//		@formatter:off
		String[] columnHeader = {"Profile","Name","Position"};
		
		Object[][] data = {{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"},
		{profileICon,"Saymo", "President"}};
//		@formatter:on

		DefaultTableModel model = new DefaultTableModel(data, columnHeader) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Class getColumnClass(int column) {
				return getValueAt(0, column).getClass();
			}
		};

		tblOfficials = new JTable(model);
		tblOfficials.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		tblOfficials.setFocusable(false);
		tblOfficials.getTableHeader().setReorderingAllowed(false);
		tblOfficials.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));// JTable header font
		tblOfficials.setRowHeight(100);

		TableColumnModel columnModel = tblOfficials.getColumnModel();
		columnModel.getColumn(1).setPreferredWidth(305);// size you want, big number = smaller
		columnModel.getColumn(1).setMaxWidth(305);

		columnModel.getColumn(2).setPreferredWidth(305);// size you want, big number = smaller
		columnModel.getColumn(2).setMaxWidth(305);

		scrollPane.setViewportView(tblOfficials);

		JLabel lblCBOListBG = new JLabel("");
		lblCBOListBG.setFont(new Font("Segoe UI", Font.PLAIN, 7));
		lblCBOListBG.setHorizontalAlignment(SwingConstants.LEFT);
		lblCBOListBG.setIcon(new ImageIcon(
				"C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\TEST\\Current Barangay List BG-01.png"));
		lblCBOListBG.setBounds(0, 30, 806, 784);
		pnlCBOList.add(lblCBOListBG);

		JPanel panel = new JPanel();
		panel.setBounds(6, 31, 986, 913);
		pnlDashboard.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\test1-01.png"));
		lblNewLabel.setBounds(0, 0, 986, 913);
		panel.add(lblNewLabel);

//		==============Center the column 1 text===================
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		columnModel.getColumn(1).setCellRenderer(centerRenderer);

		JPanel pnlBlotterAndRecords = new JPanel();
		pnlBlotterAndRecords.setBackground(Color.WHITE);
		tabbedPaneMain.addTab("Blotter And Records", null, pnlBlotterAndRecords, null);
		tabbedPaneMain.setForegroundAt(1, Color.WHITE);
		pnlBlotterAndRecords.setLayout(null);

		JPanel pnlSettings = new JPanel();
		pnlSettings.setBackground(Color.WHITE);
		tabbedPaneMain.addTab("Settings", null, pnlSettings, null);
		tabbedPaneMain.setForegroundAt(2, Color.WHITE);
		pnlSettings.setLayout(null);

		JPanel pnlLogOut = new JPanel();
		tabbedPaneMain.addTab("Logout", null, pnlLogOut, null);
		tabbedPaneMain.setForegroundAt(3, Color.WHITE);

		JLabel lblBMS = new JLabel(" Barangay Management System");
		lblBMS.setForeground(Color.WHITE);
		lblBMS.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblBMS.setBounds(1052, 0, 826, 86);
		contentPane.add(lblBMS);

		JLabel lblBgTop = new JLabel("");
		lblBgTop.setIcon(new ImageIcon("C:\\Download\\ILLUSTRATOR PROJECT\\Adobe Illustrator 2023\\4.png"));
		lblBgTop.setOpaque(true);
		lblBgTop.setBackground(Color.RED);
		lblBgTop.setBounds(0, 0, 1904, 98);
		contentPane.add(lblBgTop);

		int tabCount = tabbedPaneMain.getTabCount();
		tabbedPaneMain.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				int selectedIndex = tabbedPaneMain.getSelectedIndex();
				tabbedPaneMain.setForegroundAt(selectedIndex, Color.decode("#1e5192"));// set tab text to white if
																						// selected

				for (int index = 0; index < tabCount; index++) {// scan which tab is not selected and set text to black
					if (selectedIndex != index) {
						tabbedPaneMain.setForegroundAt(index, Color.white);
					}
				}

				if (selectedIndex == 3) {// Logout
//					System.exit(0);
				}
			}
		});

	}

	public static void main(String[] args) {

		BMSTheme.setup();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuFrame frame = new MainMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
