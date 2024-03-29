import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;

import javax.swing.JButton;

/**
 * Title: GameButton.java
 * Description: Class of game buttons
 * @author Xuan Shi
 */
public class GameButton extends JButton {
	private boolean flag;

    /**
     * Constructor
     */
    public GameButton() {
        super();
        this.setBackground(new Color(200, 200, 200));
        this.flag = false;
    }
    
    /**
     * Override setEnabled.
     */
    public void setEnabled(boolean enabled) {
        boolean oldEnabled = isEnabled();
        super.setEnabled(enabled);
        if (oldEnabled != enabled) {
            if (!enabled)
                setBackground(new Color(238, 238, 238));
            else
                setBackground(new Color(190, 190, 190));

            repaint();
        }
    }
    
    public boolean getFlag() {return this.flag;}
    
    public void toggleFlag() {
    	flag = !flag;
    }
}