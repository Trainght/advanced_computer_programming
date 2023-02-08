/**
 * This program is call MySimpleWindow will show 3 buttom Cancel Reset and Submit.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 9, 2023
 */
package charoenchai.nathachai.lab7;

import javax.swing.*; // Import all Javax.swing

import java.awt.*; // Import all Java.awt

class MySimpleWindow extends JFrame { // This class MySimpleWindown extends from JFrame

	protected JButton cancelButton, resetButton, submitButton; // protected JButtom
	protected JPanel mainPanel, buttonPanel; // protected JPanel

	public MySimpleWindow(String title) {
		super(title); // sent string to JFrame
	}

	public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents and setFrameFeatures
		MySimpleWindow msw = new MySimpleWindow("My Simple Window"); // JFrame title is "My Simple Window"
		msw.addComponents();
		msw.setFrameFeatures();
	}

	protected void setFrameFeatures() {
		pack(); // display all components in JFrame
		setVisible(true); // for show JFrame
		setLocationRelativeTo(null); // set location to center display
		setDefaultCloseOperation(MySimpleWindow.EXIT_ON_CLOSE); // when close JFrame it is will stop runnig
	}

	protected void addComponents() { // Method addComponents is to creat components

		buttonPanel = new JPanel(); // creat buttom panel

		cancelButton = new JButton("Cancel"); // creat cancel buttom
		buttonPanel.add(cancelButton); // add buttom to panel

		resetButton = new JButton("Reset"); // creat reset buttom
		buttonPanel.add(resetButton); // add buttom to panel

		submitButton = new JButton("Submit"); // creat submit buttom
		buttonPanel.add(submitButton); // add buttom to panel

		this.add(buttonPanel); // add buttomPanel to JFrame
	}

	public static void main(String[] args) { // main method
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
