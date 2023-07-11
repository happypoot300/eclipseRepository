package SettingsTabPackage;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class SettingsJTree {

	static DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");// root

	/**
	 * @wbp.parser.entryPoint
	 */
	public static JTree CreateJTreeSetting() {

//		@formatter:off
		DefaultMutableTreeNode general = new DefaultMutableTreeNode("General");// parent
		String[] underGeneral = { "Color", "Font", "Size" };
		
			DefaultMutableTreeNode godz = new DefaultMutableTreeNode("godz");// parent
			String[] underGodz = { "Riyis", "BossChamp", "Jones" };

		DefaultMutableTreeNode jdk = new DefaultMutableTreeNode("jdk");// parent
		String[] underJdk = { "jdk 15", "jdk 17", "jdk 20" };
		
		root.add(general);// parent
			createChildTree(general,underGeneral);// child
			
				general.add(godz);// parent 
					createChildTree(godz, underGodz);// child
				
		root.add(jdk);// parent
			createChildTree(jdk, underJdk);// child
//		@formatter:on

		JTree tree = new JTree(root);
		tree.setFont(new Font("Tahoma", Font.BOLD, 11));
		tree.setRootVisible(false);

		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
		Icon closedIcon = new ImageIcon("C:\\Download\\PHOTOSHOP PROJECTS\\JTreeArrow.png");
		Icon openIcon = new ImageIcon("C:\\\\Download\\\\PHOTOSHOP PROJECTS\\\\JTreeArrow.png");
//		Icon leafIcon = new ImageIcon("C:\\\\Download\\\\PHOTOSHOP PROJECTS\\\\JTreeArrow.png");
		renderer.setClosedIcon(closedIcon);
		renderer.setOpenIcon(openIcon);
		renderer.setLeafIcon(null);

		return tree;
	}

	public static void createChildTree(DefaultMutableTreeNode parentName, String[] arrayName) {

		for (String node : arrayName) {
			DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(node);
			parentName.add(childNode);
		}
	}// end method
}
