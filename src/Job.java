import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Job extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Job frame = new Job();
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
	public Job() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Background panel
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Label for JOD ID
		
		JLabel lblNewLabel = new JLabel("Job ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(110, 181, 46, 14);
		panel.add(lblNewLabel);
		
		// Label for title
		
		JLabel lblNewLabel_1 = new JLabel("Title");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(110, 241, 46, 14);
		panel.add(lblNewLabel_1);
		
	// Label for Location
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setBounds(110, 295, 66, 26);
		panel.add(lblLocation);
		
		// Label for Salary
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(110, 356, 46, 14);
		panel.add(lblNewLabel_2);
		
		// Label for Jobs's discription
		
		JLabel lblNewLabel_3 = new JLabel("Job's Discription");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(391, 181, 125, 31);
		panel.add(lblNewLabel_3);
		
		// Label for Employment type
		JLabel lblEmploymentType = new JLabel("Employment Type");
		lblEmploymentType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmploymentType.setForeground(Color.WHITE);
		lblEmploymentType.setBounds(391, 238, 125, 31);
		panel.add(lblEmploymentType);
		
		//label for Company Name
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompanyName.setForeground(Color.WHITE);
		lblCompanyName.setBounds(391, 293, 125, 31);
		panel.add(lblCompanyName);
		
		// label for Post Date
		JLabel lblPost = new JLabel("Post Date");
		lblPost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPost.setForeground(Color.WHITE);
		lblPost.setBounds(422, 360, 92, 26);
		panel.add(lblPost);
		
		// Text field for Job ID
		
		textField = new JTextField();
		textField.setBounds(191, 178, 132, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		// Text field for Title
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(191, 234, 132, 29);
		panel.add(textField_1);
		
		// Text field for Location
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(191, 294, 132, 29);
		panel.add(textField_2);
		
		// Text field for Salary
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(191, 350, 132, 29);
		panel.add(textField_3);
		
		// Text field for Post Date
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(526, 357, 132, 29);
		panel.add(textField_4);
		
		// Text field for Company  Name
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(526, 293, 132, 29);
		panel.add(textField_5);
		
		
		// Text field for Employment type
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(526, 242, 132, 29);
		panel.add(textField_6);
		
		
		// Text field for Job's discrption
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(526, 184, 132, 29);
		panel.add(textField_7);
		
	// Heading of this GUI
		
		JLabel lblJob = new JLabel("    JOB");
		
	// Icon of Heading Label JOB
		
		lblJob.setIcon(new ImageIcon(getClass().getResource("Job.png")));
		lblJob.setForeground(Color.WHITE);
		lblJob.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblJob.setBounds(286, 75, 172, 62);
		panel.add(lblJob);
		
		//Menu bar
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 722, 48);
		panel.add(menuBar);
		
		// Menu Item 'Recommended'
		
		JMenuItem mntmRecommended_1 = new JMenuItem("Recommended");
		mntmRecommended_1.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmRecommended_1.setBackground(Color.BLACK);
		mntmRecommended_1.setForeground(Color.LIGHT_GRAY);
		
		// Action on the click of 'Recommended' Item
		
		mntmRecommended_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobRecommender jr=new JobRecommender();
				jr.setVisible(true);
			
			}
		});
		
		// Icon for Recommended Item
		
		mntmRecommended_1.setIcon(new ImageIcon(getClass().getResource("recommended.png")));
		menuBar.add(mntmRecommended_1);
		
		// Menu Item 'Application'
		
		JMenuItem mntmApplication = new JMenuItem("Application");
		
		// Action on the click of Application 
		
		mntmApplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobApplication ja=new JobApplication();
				ja.setVisible(true);
			}
		});
		mntmApplication.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmApplication.setBackground(Color.BLACK);
		mntmApplication.setForeground(Color.LIGHT_GRAY);
		
		// Icon for Application Item
		
		mntmApplication.setIcon(new ImageIcon(getClass().getResource("application.png")));
		menuBar.add(mntmApplication);
		
		// Menu Item 'Search Job'
		
		JMenuItem mntmRecommended = new JMenuItem("Search Job");
		mntmRecommended.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmRecommended.setBackground(Color.BLACK);
		mntmRecommended.setForeground(Color.LIGHT_GRAY);
		
		// Action on the click of 'Search' Item
		mntmRecommended.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Searchjob sj=new Searchjob();
				sj.setVisible(true);
			}
		});
		
		// Icon for JobIcon Item
		
		mntmRecommended.setIcon(new ImageIcon(getClass().getResource("JobIcon.png")));
		menuBar.add(mntmRecommended);
		
		
	// Menu bar item 'Data Analysis'
		
		JMenuItem mntmDataAnalysis = new JMenuItem("Data Analysis");
		
		// Action on menu item 'Data Analysis'
		
		mntmDataAnalysis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				DataAnalysis d=new DataAnalysis();
				d.setVisible(true);
			}
		});
		mntmDataAnalysis.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmDataAnalysis.setBackground(Color.BLACK);
		mntmDataAnalysis.setForeground(Color.LIGHT_GRAY);
		mntmDataAnalysis.setIcon(new ImageIcon(getClass().getResource("search.png")));
		menuBar.add(mntmDataAnalysis);
		
		 // Menu bar item 'Filter Job'
		
		JMenuItem mntmFilterJob = new JMenuItem("Filter Job");
		mntmFilterJob.addMouseListener(new MouseAdapter() {
		
			// Action on the Click of menu item 'filter  By'
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				FilterBy f=new FilterBy();
				f.setVisible(true);
			}
		});
		mntmFilterJob.setForeground(Color.LIGHT_GRAY);
		mntmFilterJob.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmFilterJob.setBackground(Color.BLACK);
		
		// Icon for menu item 'Filter Job'
		
		mntmFilterJob.setIcon(new ImageIcon(getClass().getResource("SortMenu.png")));
		menuBar.add(mntmFilterJob);
		
		
		// text field for Dead Line of Job
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(191, 400, 132, 29);
		panel.add(textField_8);
		
		//label for Dead Line text field
		
		JLabel lblDeadLine = new JLabel("Dead Line");
		lblDeadLine.setForeground(Color.WHITE);
		lblDeadLine.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeadLine.setBounds(108, 403, 73, 20);
		panel.add(lblDeadLine);
		
		// Background image for this GUI
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("JobBackground.jpg")));
		lblNewLabel_4.setBounds(2, 50, 718, 402);
		panel.add(lblNewLabel_4);
	}
}
