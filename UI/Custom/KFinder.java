package UI.Custom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class KFinder extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton findButton;
	private JButton cancelButton;
	private JTextField txtToFind;
	private String strToFind;
	private JTextArea textArea;
	private int findIdx;
	private String direction;
	ButtonGroup bgDirection;
	/**
	 * Launch the application.
	 */

	/*
	 * public static void main(String[] args) { try { KFinder dialog = new
	 * KFinder(); dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */
	/**
	 * Create the dialog.
	 */
	public KFinder(JTextArea textArea) {
		this.textArea = textArea;
		findIdx = -1;
		strToFind = "";
		setTitle("Find");
		setBounds(100, 100, 594, 223);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			findButton = new JButton("Find Next");
			findButton.addActionListener(e->{
				
			});
			//okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(findButton);
		}
		{
			cancelButton = new JButton("Cancel");
			//cancelButton.setActionCommand("Cancel");
			cancelButton.addActionListener(e->setVisible(false));
		}
		
		JLabel lblNewLabel = new JLabel("Find");
		
		txtToFind = new JTextField();
		txtToFind.setColumns(10);
		txtToFind.getDocument().addDocumentListener(new DocumentListener() {
			private void update() {
				strToFind = txtToFind.getText();
			}

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				update();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				update();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				update();
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Direction", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JRadioButton rdbtnUp = new JRadioButton("Up");
		rdbtnUp.addActionListener(e->direction = "Up");
		JRadioButton rdbtnDown = new JRadioButton("Down");
		rdbtnDown.addActionListener(e->direction = "Down");
		rdbtnDown.setSelected(true);
		this.direction = "Down";
		bgDirection = new ButtonGroup();
		bgDirection.add(rdbtnUp);
		bgDirection.add(rdbtnDown);

		JCheckBox chckbxUpperlower = new JCheckBox("Upper/Lower");
		chckbxUpperlower.setEnabled(false);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(txtToFind, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(chckbxUpperlower)
							.addGap(48)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(cancelButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
						.addComponent(findButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(txtToFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(findButton))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(cancelButton)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
							.addComponent(chckbxUpperlower)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(rdbtnUp)
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addComponent(rdbtnDown)
					.addGap(42))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnUp)
						.addComponent(rdbtnDown))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
	}

	public void showDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (!strToFind.equals("")) {
			String source = textArea.getText();
			if(direction.equals("Up")) {
				
			}
			else if(direction.equals("Down")) {
				
			}

		} else {
			if (!this.isVisible()) {
				showDialog();
			}
			// JOptionPane.showMessageDialog(null, "Nothing");
		}
	}
}
