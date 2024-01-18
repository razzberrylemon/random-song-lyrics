import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Driver {
	private static Random rand = new Random();
	private final static Color BACKGROUND_PINK = new Color(242, 131, 182);
	private final static Color TEXT_BROWN = new Color(31, 21, 10);
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Random Lyrics");
		mainFrame.getContentPane().setBackground(BACKGROUND_PINK);
		
		CustomButton button = new CustomButton("click me!");
		button.setBounds(150, 10, 100, 20);
		button.setFont(new Font("Courier New", Font.BOLD, 13));
		button.setOpaque(true);
		button.setBorder(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 40, 400, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Courier New", Font.PLAIN, 12));
		label.setForeground(TEXT_BROWN);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = rand.nextInt(10) + 1;
				
				if(num == 1) {
					//Linger by the Cranberries
					label.setText("do you have to let it linger?");
				} else if (num == 2) {
					//Danza Kuduro by Don Omar
					label.setText("Danza Kuduro!");
				} else if (num == 3) {
					//Bills, Bills, Bills by Destiny's Child
					label.setText("do you pay my automo' bills?");
				} else if (num == 4) {
					//Careless Whisper by George Michael
					label.setText("tonight the music seems so loud!!");
				} else if (num == 5) {
					//Cowboy Take Me Away by The Chicks
					label.setText("on a pillow of bluebonnets, in a blanket made of stars");
				} else if (num == 6) {
					//Come On Eileen by Dexys Midnight Runners
					label.setText("toora, loora, toora, loo-rye-aye!");
				} else if (num == 7) {
					//Motownphilly by Boys II Men
					label.setText("Motownphilly's back again...");
				} else if (num == 8) {
					//Call Me Maybe by Carly Rae Jepsen
					label.setText("call me maybe!");
				} else if (num == 9) {
					//There She Goes by The La's
					label.setText("there she goes! there she goes, again!");
				} else if (num == 10) {
					//Ophelia by The Lumineers
					label.setText("oh, Ophelia, heaven help the fools who fall in love");
				} else {
					label.setText("error");
				}
			}
		});
		
		mainFrame.add(button);
		mainFrame.add(label);
		
		
		//always these guys, always in this order !
		mainFrame.setSize(400, 100);
		mainFrame.setLocationRelativeTo(null); 	//puts frame in middle of screen
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
