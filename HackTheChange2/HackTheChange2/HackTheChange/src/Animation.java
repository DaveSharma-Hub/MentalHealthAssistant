import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Animation extends JFrame{
	public Animation() {
		JFrame frameLoader=new JFrame();
		URL url = this.getClass().getResource("loading-1.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        frameLoader.setUndecorated(true);
        frameLoader.getContentPane().add(label);
        //JLabel loading=new JLabel("Health App");
        //JPanel adder=new JPanel();
        //adder.add(loading);
       // frameLoader.getContentPane().add(adder);
        frameLoader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoader.pack();
        frameLoader.setLocationRelativeTo(null);
        frameLoader.setVisible(true);
//		JProgressBar jb=new JProgressBar(0,100);
//		jb.setBounds(40,40,160,30);         
//		jb.setValue(0);    
//		jb.setStringPainted(true);    
//		add(jb);   

		try {
			for(int i=0;i<=100;i++) {
//				jb.setValue(i);
//				i+=1;
				Thread.sleep(20);
				if(i==100) {
					frameLoader.setVisible(false);
					Thread.sleep(10);
					Menu m1=new Menu();
				}
			}
			
		}catch(Exception e) {
			
		}
	}
}
