import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JobSeekerApplication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobSeekerApplication frame = new JobSeekerApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JobSeekerApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// heading of GUI
		JLabel lblRegisterForJob = new JLabel("REGISTER FOR  JOB");
		lblRegisterForJob.setIcon(new ImageIcon(getClass().getResource("designation.png")));
		lblRegisterForJob.setForeground(Color.WHITE);
		lblRegisterForJob.setBounds(253, 11, 246, 52);
		lblRegisterForJob.setFont(new Font("Tahoma", Font.ITALIC, 18));
		panel.add(lblRegisterForJob);
		
		// Name Label
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(85, 135, 74, 19);
		panel.add(lblNewLabel);
		
		//Phone Label
		JLabel lblNewLabel_1 = new JLabel("PHONE NO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(85, 182, 74, 19);
		panel.add(lblNewLabel_1);
		
		// Email Label
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(85, 241, 74, 19);
		panel.add(lblNewLabel_2);
		
		//Education label
		JLabel lblNewLabel_3 = new JLabel("Education");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(85, 291, 74, 19);
		panel.add(lblNewLabel_3);
		
		//Skill label
		JLabel lblNewLabel_4 = new JLabel("Skill/Certificate");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(69, 346, 90, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblWorkExperience = new JLabel("Work Experience");
		lblWorkExperience.setForeground(Color.WHITE);
		lblWorkExperience.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWorkExperience.setBounds(388, 135, 99, 19);
		panel.add(lblWorkExperience);
		
		JLabel lblExpectedSalary = new JLabel("Expected Salary");
		lblExpectedSalary.setForeground(Color.WHITE);
		lblExpectedSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExpectedSalary.setBounds(388, 182, 99, 19);
		panel.add(lblExpectedSalary);
		
		JLabel lblResumepdf = new JLabel("Resume/pdf");
		lblResumepdf.setForeground(Color.WHITE);
		lblResumepdf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResumepdf.setBounds(388, 251, 90, 19);
		panel.add(lblResumepdf);
		
		// Text_field for NAME
		textField = new JTextField();
		textField.setBounds(169, 135, 138, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		// Text_field for Phone
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 181, 138, 20);
		panel.add(textField_1);
		
		// Text_field for Email
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 240, 138, 20);
		panel.add(textField_2);
		
		
		// Text_field for Education
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 290, 138, 20);
		panel.add(textField_3);
		
		// Text_field for Skill
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 346, 138, 20);
		panel.add(textField_4);
		
		// Text_field for Work_Experience
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(497, 135, 138, 20);
		panel.add(textField_5);
		
		// Text_field for Expected_Salary
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(497, 182, 138, 20);
		panel.add(textField_6);
		
		// Button to Browse CV/Resume
		JButton btnBrowseFile = new JButton("Browse File");
		btnBrowseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser=new JFileChooser();
		        chooser.showOpenDialog(null);
		        File f=chooser.getSelectedFile();
			}
			
		});
		
		// Set Icon to Search button
		btnBrowseFile.setIcon(new ImageIcon(getClass().getResource("search.png")));
		btnBrowseFile.setBounds(497, 233, 138, 36);
		panel.add(btnBrowseFile);
		
		//Button to register for job
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("oie_3121421TKrYPbuP.png")));		//icon of register button
		
		// Action of Register Button
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Searchjob sj=new Searchjob();
				sj.setVisible(true);
			}
		});
		
		// Set register button axis
		
		btnNewButton.setBounds(530, 378, 151, 52);
		panel.add(btnNewButton);
		
		// Top right label for job title
		
		JLabel lblJobsTitle = new JLabel("JOB'S TITLE");
		lblJobsTitle.setForeground(Color.WHITE);
		lblJobsTitle.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblJobsTitle.setBounds(34, 78, 74, 20);
		panel.add(lblJobsTitle);
		
		// Cancel Button 
		
		JButton btnNewButton_1 = new JButton("Cancel");
		
		//Action of Cancel Button
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
		btnNewButton_1.setBounds(317, 378, 138, 52);
		panel.add(btnNewButton_1);
		
		// FOR BACKGROUND IMAGE OF THIS GUI
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("registerBackground.jpg")));
		lblNewLabel_5.setBounds(0, 0, 748, 503);
		panel.add(lblNewLabel_5);
	}
}
