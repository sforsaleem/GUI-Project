import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JobRecommender extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmRec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobRecommender frame = new JobRecommender();
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
	public JobRecommender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Background panel for this GUI
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Menu bar 
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 722, 48);
		panel.add(menuBar);
		
		// Menu bar item 'Recommended'
		
		mntmRec = new JMenuItem("Recommended");
		
		// Action of menu  item 'Recommended' on click
		
		mntmRec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobRecommender jr=new JobRecommender();
				jr.setVisible(true);
			}
		});
		mntmRec.setForeground(Color.LIGHT_GRAY);
		mntmRec.setBackground(Color.BLACK);
		mntmRec.setBorder(new LineBorder(null, 2, true));
		
		// Action of menu item 'Recommended ' on Click
		
		mntmRec.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent arg0) {
				dispose();
				JobRecommender jr=new JobRecommender();
				jr.setVisible(true);
			
			}
			public void menuKeyReleased(MenuKeyEvent arg0) {
			}
			public void menuKeyTyped(MenuKeyEvent arg0) {
			}
		});
		
		
		// Set icon for menu item 
		
		mntmRec.setIcon(new ImageIcon(getClass().getResource("recommended.png")));
		menuBar.add(mntmRec);
		
		// Menu bar item 'Application'
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Application");
		
		// Action of menu  item 'Application' on click
		
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JobApplication j=new JobApplication();
				j.setVisible(true);
			}
		});
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.setBackground(Color.BLACK);
		mntmNewMenuItem.setBorder(new LineBorder(null, 2, true));
		mntmNewMenuItem.setIcon(new ImageIcon(getClass().getResource("application.png")));
		menuBar.add(mntmNewMenuItem);
		
		
		// Menu bar item 'Search Job'
		
		JMenuItem mntmSearchJob = new JMenuItem("Search Job");
		
		// Action of menu  item 'Search Job' on click
		
		
		mntmSearchJob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				Searchjob s=new Searchjob();
				s.setVisible(true);
			}
		});
		mntmSearchJob.setForeground(Color.LIGHT_GRAY);
		mntmSearchJob.setBackground(Color.BLACK);
		mntmSearchJob.setBorder(new LineBorder(null, 2, true));
		
		// Set icon for menu item 
		
		mntmSearchJob.setIcon(new ImageIcon(getClass().getResource("JobIcon.png")));
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
		
		
		// Heading Label 'Recommended Jobs'
		JLabel lblRecommendJob = new JLabel("Recommended Jobs");
	
		// Set icon for Heading of this GIG
		
		lblRecommendJob.setIcon(new ImageIcon(getClass().getResource("recommended.png")));
		lblRecommendJob.setForeground(Color.DARK_GRAY);
		lblRecommendJob.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblRecommendJob.setBounds(279, 84, 212, 50);
		panel.add(lblRecommendJob);
		
		// JList to show Recommended jobs for Registered man
		
		JList list = new JList();
		list.setBounds(138, 174, 477, 200);
		panel.add(list);
		
		
		//BACKGROUND IMAGE FOR THIS GUI
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("RecommendedBackground.jpg")));
		lblNewLabel.setBounds(2, 50, 718, 402);
		panel.add(lblNewLabel);
	}
}
