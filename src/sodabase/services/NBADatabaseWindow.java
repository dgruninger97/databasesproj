package sodabase.services;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class NBADatabaseWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NBADatabaseWindow window = new NBADatabaseWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NBADatabaseWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("NBA Database");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlayers = new JButton("Players");
		btnPlayers.setBounds(62, 141, 97, 25);
		frame.getContentPane().add(btnPlayers);
		
		JButton btnTeams = new JButton("Teams");
		btnTeams.setBounds(249, 141, 97, 25);
		frame.getContentPane().add(btnTeams);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the NBA Database!");
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Arial", Font.BOLD, 16));
		lblWelcomeToThe.setBounds(95, 27, 243, 16);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to compare?");
		lblWhatWouldYou.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWhatWouldYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatWouldYou.setBounds(119, 93, 190, 16);
		frame.getContentPane().add(lblWhatWouldYou);
	}
}
