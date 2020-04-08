import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Searchjob extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searchjob frame = new Searchjob();
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
	public Searchjob() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// background panel 
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Search job Label
		
		JLabel lblNewLabel = new JLabel("SEARCH JOB");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("Job_Search.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(271, 63, 195, 71);
		panel.add(lblNewLabel);
		
		// text field to search job
		
		textField = new JTextField();
		textField.setBounds(230, 204, 133, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		// Search button 
		
		JButton btnSearch = new JButton("Search ");
		
		// Action of Search button
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Job j=new Job();
				j.setVisible(true);
			}
		});
		
		// set search button  icon 
		btnSearch.setIcon(new ImageIcon(getClass().getResource("search.png")));
		btnSearch.setBounds(413, 199, 120, 39);
		panel.add(btnSearch);
		
		// Text Area // Matched Jobs will be here related to our provided data
		JTextArea textArea = new JTextArea();
		textArea.setBounds(230, 331, 303, 85);
		panel.add(textArea);
		
		//Label for Text Area
		JLabel lblMatchedJob = new JLabel("Matched Jobs");
		lblMatchedJob.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMatchedJob.setForeground(Color.BLACK);
		lblMatchedJob.setBounds(113, 295, 91, 24);
		panel.add(lblMatchedJob);
		
		//Menu bar
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.LIGHT_GRAY);
		menuBar.setBorder(new LineBorder(Color.WHITE, 2, true));
		menuBar.setBounds(0, 0, 722, 48);
		panel.add(menuBar);
		
		//Menu item Recommended
		JMenuItem mntmNewMenuItem = new JMenuItem("Recommended");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.setBackground(Color.BLACK);
		
		// Action of menu item when mouse clicked it
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobRecommender jr=new JobRecommender();
				jr.setVisible(true);
			
			}
		});
		
		// icon of Recommended menu item
		
		mntmNewMenuItem.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmNewMenuItem.setIcon(new ImageIcon(getClass().getResource("recommended.png")));
		menuBar.add(mntmNewMenuItem);
		
		//Menu item 'Application'
		
		JMenuItem mntmApplication = new JMenuItem("Application");
		mntmApplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobApplication ja=new JobApplication();
				ja.setVisible(true);
			}
		});
		mntmApplication.setForeground(Color.LIGHT_GRAY);
		mntmApplication.setBackground(Color.BLACK);
		mntmApplication.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmApplication.setIcon(new ImageIcon(getClass().getResource("application.png")));
		menuBar.add(mntmApplication);
		
		//Menu item 'Search Job'
		
		JMenuItem mntmSearchJob = new JMenuItem("Search Job");
		mntmSearchJob.setForeground(Color.LIGHT_GRAY);
		mntmSearchJob.setBackground(Color.BLACK);
		
		
		// Action of menu item when mouse clicked it
		
		mntmSearchJob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
			
		});
		
		
		// Set Icon For Job 
		
		mntmSearchJob.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmSearchJob.setIcon(new ImageIcon(getClass().getResource("JobIcon.png")));
		menuBar.add(mntmSearchJob);
		
		// Set Icon for item 'Data Analysis'
		
		JMenuItem mntmDataAnalysis = new JMenuItem("Data Analysis");
		
		// Action of menu item 'Data Analysis'
		
		
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
		
		// Label for input type text to search job
		
		JLabel lblNewLabel_1 = new JLabel("Search Job");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(114, 161, 120, 28);
		panel.add(lblNewLabel_1);
		
		//Background Image for this GUI
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("jobSearchbackground.jpg")));
		lblNewLabel_2.setBounds(2, 50, 718, 402);
		panel.add(lblNewLabel_2);
	}
}
