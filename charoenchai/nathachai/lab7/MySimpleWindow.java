package charoenchai.nathachai.lab7;

import javax.swing.*;

class MySimpleWindow extends JFrame {
	protected JButton cancelButton, resetButton, submitButton;
	protected JPanel mainPanel, buttonPanel;

	public MySimpleWindow(String title) {
		super(title);
	}

	public static void createAndShowGUI() {
		MySimpleWindow msw = new MySimpleWindow("My Simple Window");
		msw.addComponents();
		msw.setFrameFeatures();
	}

	protected void setFrameFeatures() {
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(MySimpleWindow.EXIT_ON_CLOSE);
	}

	protected void addComponents() {
		buttonPanel = new JPanel();

		cancelButton = new JButton("Cancel");
		buttonPanel.add(cancelButton);

		resetButton = new JButton("Reset");
		buttonPanel.add(resetButton);

		submitButton = new JButton("Submit");
		buttonPanel.add(submitButton);

		this.add(buttonPanel);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
