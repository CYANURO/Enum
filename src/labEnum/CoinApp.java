package labEnum;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CoinApp extends JFrame {

	private JPanel contentPane;
	private JPanel northPanel;
	private JPanel centerPanel;
	
	private JButton centButton;
	private JButton nickelButton;
	private JButton dimeButton;
	private JButton quarterButton;
	
	private Icon usCentIcon;
	private Icon usNickleIcon;
	private Icon usDimeIcon;
	private Icon usQuarterIcon;
	
	private JLabel coinLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		// Console output
		for(Coin coinValues: Coin.values()) {
			
			System.out.println(coinValues);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinApp frame = new CoinApp();
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
	
	public CoinApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		
		//  Content Pane
		createContentPane();
		
		// Coin Panel
		createCoinSelectionPanel();
		
		// Coin info panel
		createInformationPane();
		
	}

	private void createContentPane() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	}


	private void createCoinSelectionPanel() {
		
		usCentIcon = new ImageIcon(getClass().getResource("UsCent.png"));
		usNickleIcon = new ImageIcon(getClass().getResource("UsNickel.png"));
		usDimeIcon = new ImageIcon(getClass().getResource("UsDime.png"));
		usQuarterIcon = new ImageIcon(getClass().getResource("UsQuarter.png"));
		
		northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(100, 100));
		contentPane.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new GridLayout(1, 4, 0, 0));
		
		centButton = new JButton();
		centButton.setContentAreaFilled(false);
		centButton.setFocusable(false);
		centButton.setBorderPainted(false);
		centButton.setIcon(usCentIcon);
		northPanel.add(centButton);
		
		centButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				coinLabel.setText(Coin.CENT.toString());
			}
		});
		
		
		nickelButton = new JButton();
		nickelButton.setFocusable(false);
		nickelButton.setBorderPainted(false);
		nickelButton.setContentAreaFilled(false);
		nickelButton.setIcon(usNickleIcon);
		northPanel.add(nickelButton);
		
		nickelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				coinLabel.setText(Coin.NICKEL.toString());
			}
		});

		
		dimeButton = new JButton();
		dimeButton.setFocusable(false);
		dimeButton.setBorderPainted(false);
		dimeButton.setContentAreaFilled(false);
		dimeButton.setIcon(usDimeIcon);
		northPanel.add(dimeButton);

		dimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				coinLabel.setText(Coin.DIME.toString());
			}
		});
		
		
		quarterButton = new JButton();
		quarterButton.setFocusable(false);
		quarterButton.setBorderPainted(false);
		quarterButton.setContentAreaFilled(false);
		quarterButton.setIcon(usQuarterIcon);
		northPanel.add(quarterButton);

		quarterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				coinLabel.setText(Coin.QUARTER.toString());
			}
		});
		
	}
	
	private void createInformationPane() {
		
		centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		coinLabel = new JLabel(" ");
		coinLabel.setBorder(new EmptyBorder(50, 0, 0, 0));
		coinLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		centerPanel.add(coinLabel);
		
	}
}
