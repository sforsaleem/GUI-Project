import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JobApplication extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobApplication frame = new JobApplication();
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
	public JobApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		// background panel for GUI
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		

		
		// Menu bar on the Top of GUI
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 722, 48);
		panel.add(menuBar);
		
		// Menu item 'Recommended'
		JMenuItem mntmRecommended = new JMenuItem("Recommended");
		
		// Action on the click of 'Recommended' item
		
		mntmRecommended.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobRecommender jr=new JobRecommender();
				jr.setVisible(true);
			}
			
		});
		mntmRecommended.setBackground(Color.BLACK);
		mntmRecommended.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmRecommended.setForeground(Color.LIGHT_GRAY);
		
		// SET ICON FOR MENU ITEM 'RECOMMENDED'
		
		mntmRecommended.setIcon(new ImageIcon(getClass().getResource("recommended.png")));
		menuBar.add(mntmRecommended);
		
		// Menu item 'Application' 
		
		JMenuItem mntmApplication = new JMenuItem("Application");
		
		// Action on the click of 'Application' item
		
		mntmApplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobApplication ja=new JobApplication();
				ja.setVisible(true);
				
			}
		});
		mntmApplication.setBackground(Color.BLACK);
		mntmApplication.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmApplication.setForeground(Color.LIGHT_GRAY);
		
		// SET ICON FOR MENU ITEM 'Application'
		
		mntmApplication.setIcon(new ImageIcon(getClass().getResource("application.png")));
		menuBar.add(mntmApplication);
		
		// Menu item 'Search Job' 
		
		JMenuItem mntmSearchJob = new JMenuItem("Search Job");
		
		// Action on the click of 'Job Search' item
		
		mntmSearchJob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				Searchjob s=new Searchjob();
				s.setVisible(true);
			}
		});
		mntmSearchJob.setBackground(Color.BLACK);
		mntmSearchJob.setBorder(new LineBorder(Color.WHITE, 2, true));
		mntmSearchJob.setForeground(Color.LIGHT_GRAY);
		
		// SET ICON FOR MENU ITEM 'JobIcon'
		
		mntmSearchJob.setIcon(new ImageIcon(getClass().getResource("jobIcon.png")));
		menuBar.add(mntmSearchJob);
		
	// Menu bar item 'Data Analysis'
		
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
		
		
		// Heading of this GUI 
		
		JLabel lblJobApplication = new JLabel("Job Application");
		lblJobApplication.setBounds(268, 82, 207, 81);
		
		// Icon for Heading of this GUI
		
		lblJobApplication.setIcon(new ImageIcon(getClass().getResource("oie_3125349NWGcGN3c.png")));
		lblJobApplication.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblJobApplication.setForeground(Color.WHITE);
		panel.add(lblJobApplication);
		
		// Button to add Applicant
		
		JButton btnAddApplication = new JButton("ADD APPLICATION");
		btnAddApplication.setBounds(98, 204, 227, 64);
		btnAddApplication.setIcon(new ImageIcon(getClass().getResource("AddApplicant.png")));
		
		// Action of Add button on click
		
		btnAddApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnAddApplication);
		
		// Button to remove Applicant
		
		JButton btnNewButton = new JButton("REMOVE APPLICANT");
		btnNewButton.setBounds(390, 204, 227, 69);
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("DeleteApplicant.png")));
		panel.add(btnNewButton);
		
		//Background image for this GUI
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("Applicaation.jpg")));
		lblNewLabel.setBounds(2, 50, 718, 402);
		panel.add(lblNewLabel);
	}

}
