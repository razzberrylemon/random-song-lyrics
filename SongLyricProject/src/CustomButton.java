import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CustomButton extends JButton{
	//	private static final long serialVersionUID = 1L;
	//	
	//	
	//	private Color normalColor = new Color(158, 71, 112);
	//	private Color clickDownColor = new Color(132, 60, 94);
	//	
	//	public CustomButton() {
	//		@Override
	//		protected void paintComponent(Graphics g) {
	//			if (getModel().isPressed()) {
	//				g.setColor(clickDownColor);
	//			} else {
	//				g.setColor(normalColor);
	//			}
	//			g.fillRect(0, 0, getWidth(), getHeight());
	//			super.paintComponent(g);
	//		}
	//	}

    private Color pressedColor = new Color(113, 51, 80);
    private Color normalColor = new Color(158, 71, 112);

    public CustomButton (String text) {
        super(text);
        setBorderPainted(false);
        setFocusPainted(false);

        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(normalColor);
        setForeground(Color.WHITE);
        setText(text);

        addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				if (getModel().isPressed()) {
					setBackground(pressedColor);
				} else {
					setBackground(normalColor);
				}
			}
        });
    }
}
