import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class Menu extends javax.swing.JFrame implements ActionListener{
	JFrame frame=new JFrame();
	
	class jPanelGradient extends JPanel{
		
		protected void paintComponent(Graphics g) {
			Graphics2D g2d=(Graphics2D)g;
			int width = getWidth();
			int height= getHeight();
			
			Color color1=new Color(52,143,80);
			Color color2=new Color(86,180,211);
			GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, width, height);
		}
	}
	
	class jPanelGradient2 extends JPanel{
		
		protected void paintComponent(Graphics g) {
			Graphics2D g2d=(Graphics2D)g;
			int width = getWidth();
			int height= getHeight();
			
			Color color1=new Color(52,153,70);
			Color color2=new Color(52,160,135);
			GradientPaint gp=new GradientPaint(0,0,color1,45,height,color2);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, width, height);
		}
	}
	
	JButton HealthList;
	JButton Chat;
	JButton GetHelp;
	
	public Menu() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(dim.width/2-150, dim.height/2-150);
		JPanel top=new jPanelGradient2();
		top.setSize(10, 10);
		Color c=new Color(52,146,80);
		top.setBackground(c);
		JPanel p1=new jPanelGradient();
		JLabel mainMenu=new JLabel("Central Hub");
		try {
		    Image img = ImageIO.read(getClass().getResource("menu.png"));
		    img=img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		    mainMenu.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		 }
		mainMenu.setFont(new Font("Serif", Font.PLAIN, 20));
//		ImageIcon i1=new ImageIcon("health.png");
//		Image image=i1.getImage();
//		Image newimg=image.getScaledInstance(1,1,java.awt.Image.SCALE_SMOOTH);
//		i1=new ImageIcon(newimg);
//		
		
		HealthList=new JButton("Health");
		try {
		    Image img = ImageIO.read(getClass().getResource("health.png"));
		    img=img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		    HealthList.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		 }
		HealthList.addActionListener(this);
        HealthList.setSize(40, 40);
    	p1.add(Box.createRigidArea(new Dimension(0,10)));

		Chat=new JButton("Chat!");
		try {
		    Image img = ImageIO.read(getClass().getResource("chat.jpg"));
		    img=img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		    Chat.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		 }
		Chat.addActionListener(this);
		Chat.setSize(40,40);
        //Chat.setAlignmentX(Component.CENTER_ALIGNMENT);

		GetHelp=new JButton("Resources");
		try {
		    Image img = ImageIO.read(getClass().getResource("help.png"));
		    img=img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		    GetHelp.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		 }
		GetHelp.addActionListener(this);
        //GetHelp.setAlignmentX(Component.CENTER_ALIGNMENT);

		top.add(mainMenu);
    	top.add(Box.createRigidArea(new Dimension(0,50)));

		p1.add(HealthList);
		p1.add(Chat);
		p1.add(GetHelp);
		
    	//p1.add(Box.createRigidArea(new Dimension(0,50)));

		URL url = this.getClass().getResource("brain.gif");
        ImageIcon icon = new ImageIcon(url); //ImageIcon
//        int width = 400;
//        int height = 400;
//        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        JLabel label = new JLabel(icon);
        
        label.setLocation(dim.width/2-150, dim.height/2-150); // for example, you can use your own values
        frame.setUndecorated(false);
        //frame.getContentPane().add(label,BorderLayout.SOUTH);
        p1.add(label);
        //JLabel loading=new JLabel("Health App");
        //JPanel adder=new JPanel();
        //adder.add(loading);
       // frameLoader.getContentPane().add(adder);
        frame.pack();
        //frameLoader.setLocationRelativeTo(null);
        //frameLoader.setVisible(true);
		frame.getContentPane().add(top,BorderLayout.NORTH);
		frame.getContentPane().add(p1);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==HealthList) {
			frame.dispose();
			GUI g1=new GUI();
		}
		if(e.getSource()==Chat) {
			frame.dispose();
			Chatroom c1=new Chatroom();
		}
		if(e.getSource()==GetHelp) {
			try {
		        Desktop.getDesktop().browse(new URL("https://cmha.calgary.ab.ca/").toURI());
		    } catch (Exception e1) {
		        e1.printStackTrace();
		    }
		}
	}
}
