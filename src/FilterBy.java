import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FilterBy extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilterBy frame = new FilterBy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	public FilterBy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
				mntmDataAnalysis.addMouseListener(new MouseAdapter() {
					
					// Action of menu item 'Data Analysis'
					@Override
					public void mouseClicked(MouseEvent arg0) {
						dispose();
						DataAnalysis d=new DataAnalysis();
						d.setVisible(true);
					}
				});
				mntmDataAnalysis.setBorder(new LineBorder(Color.WHITE, 2, true));
				mntmDataAnalysis.setBackground(Color.BLACK);
				mntmDataAnalysis.setForeground(Color.LIGHT_GRAY);
				mntmDataAnalysis.setIcon(new ImageIcon(getClass().getResource("Search.png")));
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
				
				JLabel lblJobApplication = new JLabel("Filter Job");
				lblJobApplication.setBounds(302, 96, 204, 81);
				
				// Icon for Heading of this GUI
				
				lblJobApplication.setIcon(new ImageIcon(getClass().getResource("Sort.png")));
				lblJobApplication.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblJobApplication.setForeground(Color.WHITE);
				panel.add(lblJobApplication);
				
				// Label of drop down of Job Posting
				
				JLabel lblNewLabel = new JLabel("State");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBounds(193, 211, 93, 21);
				panel.add(lblNewLabel);
				
				// Label of drop down of Position
				
				JLabel lblData = new JLabel("Position");
				lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblData.setForeground(Color.WHITE);
				lblData.setBounds(193, 272, 93, 21);
				panel.add(lblData);
				
				// Label of drop down of Salary
				
				JLabel lblSalary = new JLabel("Salary");
				lblSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblSalary.setForeground(Color.WHITE);
				lblSalary.setBounds(193, 332, 93, 21);
				panel.add(lblSalary);
				
				// Drop down menu for 'Positing'
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"--NONE--", "Illinois", "Texas", "Washington", "Pennsylvania", "Newyork", "Virginia", "Colorado", "California"}));
				comboBox.setBounds(325, 202, 145, 30);
				panel.add(comboBox);
				
				// Drop down menu for 'Job Position'
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--NONE--", "Entry Level", "Junior Level", "Mid Level", "Senior Level"}));
				comboBox_1.setBounds(325, 263, 145, 30);
				panel.add(comboBox_1);
				
				// Drop Down for 'Salary'
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"--NONE--", "<$50,000", "<$70,000", "<$80,000", "<$90,000", "<$100,000"}));
				comboBox_2.setBounds(325, 323, 145, 30);
				panel.add(comboBox_2);
				
				// filter button to filter Job
				
				JButton btnNewButton = new JButton("Filter Result");
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setBackground(Color.DARK_GRAY);
				
				// Action on the Click of Filter Buton
				
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						JOptionPane.showMessageDialog(null, "THIS BUTTON WILL FILTER JOB :) ") ; 
					}
				});
				btnNewButton.setBounds(509, 371, 133, 48);
				panel.add(btnNewButton);
				
				// BACKGROUND IMAGE FOR THIS GUI
				
				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("FilterBackground.jpg")));
				lblNewLabel_1.setBounds(2, 50, 718, 402);
				panel.add(lblNewLabel_1);
	}
}
