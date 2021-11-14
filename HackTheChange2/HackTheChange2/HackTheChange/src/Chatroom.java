import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Chatroom extends javax.swing.JFrame implements ActionListener{
	String yourName;
	
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
	JFrame f=new JFrame("Chat");
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	JButton sendMessage = new JButton("Send");
	JButton returnToMenu = new JButton("Return To Menu");
	JTextArea chatBox = new JTextArea(10,40);
	JTextArea textField =new JTextArea(10,20);
	
	public Chatroom() { 
	yourName = JOptionPane.showInputDialog("Enter your name!");
	if(yourName == null) {
		f.dispose();
		Menu menu = new Menu();
	}
	else {
		JPanel framePanel = new JPanel();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(dim.width/2-150, dim.height/2-150);
		framePanel.setLayout(new BoxLayout(framePanel, BoxLayout.PAGE_AXIS));
		
		JPanel userPanel=new jPanelGradient();
		textField.setLineWrap(true);
		JScrollPane scrollable = new JScrollPane(textField);
		scrollable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		userPanel.add(scrollable);
		userPanel.add(sendMessage);
		userPanel.add(returnToMenu);
		returnToMenu.addActionListener(this);
		sendMessage.addActionListener(this);
		JPanel chat = new jPanelGradient2();
		chatBox.setLineWrap(true);
		chatBox.setEditable(false);
		JScrollPane scrollable2 = new JScrollPane(chatBox);
		scrollable2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollable2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		chat.add(scrollable2);
		
		//f.add(chat, BorderLayout.NORTH);
		framePanel.add(chat);
		framePanel.add(userPanel);
		f.add(framePanel);
		f.pack();
		f.setVisible(true);
	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==returnToMenu)
			{
				f.dispose();
				Menu menu = new Menu();
			}
			if (e.getSource() == sendMessage)
			{
				String s = textField.getText();
				chatBox.append(yourName + ": " + s + "\n");
				textField.setText("");
				getResponse(s);
			}
		}
	//This is just an example of chatbot features, we should use AWS lex to do this better using real mental health data
	public void getResponse(String s) {
		if (s.toLowerCase().contains("hello")) {
			chatBox.append("Wellness assistant: Hello! How are you doing today?\n");
		}
		if(s.toLowerCase().contains("bye")) {
			chatBox.append("Wellness assistant: Have a great day!\n");
		}
		if (s.toLowerCase().contains("doing great")) {
			chatBox.append("Wellness assistant: I am glad to hear that!");
		}
		if(s.toLowerCase().contains("doing bad")) {
			chatBox.append("Wellness assistant: I am sorry to hear that\nCheck out the Resources in the Main Menu\n");
		}
	}
	}