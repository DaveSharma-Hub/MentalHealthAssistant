import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Loading extends JFrame{
	public Loading() {
		JFrame frameLoader=new JFrame();
		URL url = this.getClass().getResource("g2uA.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        frameLoader.setUndecorated(true);
        frameLoader.getContentPane().add(label);
        frameLoader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoader.pack();
        frameLoader.setLocationRelativeTo(null);
        frameLoader.setVisible(true);
	}
}
