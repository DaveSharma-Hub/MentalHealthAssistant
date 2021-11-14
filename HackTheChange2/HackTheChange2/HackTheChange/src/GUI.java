import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends javax.swing.JFrame implements ActionListener{


	JFrame f=new JFrame();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

			Color color1=new Color(52,142,80);
			Color color2=new Color(86,177,200);
			GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, width, height);
		}
	}

	class jPanelGradient3 extends JPanel{

		protected void paintComponent(Graphics g) {
			Graphics2D g2d=(Graphics2D)g;
			int width = getWidth();
			int height= getHeight();

			Color color1=new Color(52,142,80);
			Color color2=new Color(86,177,200);
			GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, width, height);
		}
	}

	JButton viewHistory;
	JButton generateReport;
	JButton returnToMenu;

	Button button1 = new Button("Monday");
	Button button2 = new Button("Tuesday");
	Button button3 = new Button("Wednesday");
	Button button4 = new Button("Thursday");
	Button button5 = new Button("Friday");
	Button button6 = new Button("Saturday");
	Button button7 = new Button("Sunday");
	Button button8 = new Button("Monday");
	Button button9 = new Button("Tuesday");
	Button button10 = new Button("Wednesday");
	Button button11 = new Button("Thursday");
	Button button12 = new Button("Friday");
	Button button13 = new Button("Saturday");
	Button button14 = new Button("Sunday");
	Button button15 = new Button("Monday");
	Button button16 = new Button("Tuesday");
	Button button17 = new Button("Wednesday");
	Button button18 = new Button("Thursday");
	Button button19= new Button("Friday");
	Button button20 = new Button("Saturday");
	Button button21 = new Button("Sunday");

	WeekData data;
	FileIOGUI file;
	
	Chatroom c1;
	Menu menu;

	public GUI() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(dim.width/2-400, dim.height/2-450);
		jPanelGradient gradPaintPanel = new jPanelGradient();
		gradPaintPanel.setPreferredSize(new Dimension(800, 800));
		f.getContentPane().add(gradPaintPanel);


		JPanel topButtons=new JPanel();
		Color color1=new Color(52,143,80);
		topButtons.setBackground(color1);
		viewHistory=new JButton("View History");
		viewHistory.addActionListener(this);
		generateReport=new JButton("Generate Report");
		generateReport.addActionListener(this);
		returnToMenu = new JButton("Return To Menu");
		returnToMenu.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);

		jPanelGradient g1=new jPanelGradient();

		//data = new WeekData();
		file = new FileIOGUI();
		
		if((data = (WeekData)file.ReadFileToObject()) == null) {
			data = new WeekData();
		}
		
		//int arr[] = data.getData();
		for(int i =0; i<data.size(); i++) {
			Color col = Color.WHITE;
			if(data.get(i) == 1) {
				col = Color.GREEN;
			}
			else if(data.get(i) == -1) {
				col = Color.RED;
			}
			
			int butt = i + 1;
			if(butt == 1) {
				button1.setBackground(col);
			}
			if(butt == 2) {
				button2.setBackground(col);
			}
			if(butt == 3) {
				button3.setBackground(col);
			}
			if(butt == 4) {
				button4.setBackground(col);
			}
			if(butt == 5) {
				button5.setBackground(col);
			}
			if(butt == 6) {
				button6.setBackground(col);
			}
			if(butt == 7) {
				button7.setBackground(col);
			}
			if(butt == 8) {
				button8.setBackground(col);
			}
			if(butt == 9) {
				button9.setBackground(col);
			}
			if(butt == 10) {
				button10.setBackground(col);
			}
			if(butt == 11) {
				button11.setBackground(col);
			}
			if(butt == 12) {
				button12.setBackground(col);
			}
			if(butt == 13) {
				button13.setBackground(col);
			}
			if(butt == 14) {
				button14.setBackground(col);
			}
			if(butt == 15) {
				button15.setBackground(col);
			}
			if(butt == 16) {
				button16.setBackground(col);
			}
			if(butt == 17) {
				button17.setBackground(col);
			}
			if(butt == 18) {
				button18.setBackground(col);
			}
			if(butt == 19) {
				button19.setBackground(col);
			}
			if(butt == 20) {
				button20.setBackground(col);
			}
			if(butt == 21) {
				button21.setBackground(col);
			}
		}
		

		//topButtons.setContentAreaFilled(false);
		//topButtons.setBorderPainted(false);

		BorderLayout b1=new BorderLayout();
		b1.setVgap(50);
		//topButtons.setLayout(b1);

		topButtons.add(viewHistory);
		topButtons.add(generateReport);
		topButtons.add(returnToMenu);
		topButtons.add(Box.createRigidArea(new Dimension(0,100)));

		URL url = this.getClass().getResource("meals.gif");
	    ImageIcon icon = new ImageIcon(url); //ImageIcon
	    icon.setImage(icon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
	    JLabel l1=new JLabel(icon);
	    
	   
	    URL url2 = this.getClass().getResource("w2.png");
	    ImageIcon icon2 = new ImageIcon(url2); //ImageIcon
	    icon2.setImage(icon2.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH));
	    JLabel l2=new JLabel(icon2);
	    
	    URL url3 = this.getClass().getResource("sleep.png");
	    ImageIcon icon3 = new ImageIcon(url3); //ImageIcon
	    icon3.setImage(icon3.getImage().getScaledInstance(125, 115, Image.SCALE_SMOOTH));
	    JLabel l3=new JLabel(icon3);
	    
		JPanel LHS=new jPanelGradient2();
		JLabel sleep=new JLabel("8 hours of sleep");
		
		JLabel eat=new JLabel("Healthy Meal");

		JLabel exercise=new JLabel("Exercise");

		LHS.add(Box.createRigidArea(new Dimension(50,55)));

		LHS.add(sleep);
		LHS.add(l3,BorderLayout.EAST);
		LHS.add(Box.createRigidArea(new Dimension(50,75)));

		LHS.add(eat);
		LHS.add(l1,BorderLayout.EAST);
		LHS.add(Box.createRigidArea(new Dimension(50,70)));

		LHS.add(exercise);
		LHS.add(l2,BorderLayout.EAST);
		LHS.add(Box.createRigidArea(new Dimension(0,200)));

		LHS.setLayout(new BoxLayout(LHS, BoxLayout.PAGE_AXIS));

		JPanel RHS=new jPanelGradient3();
		RHS.setOpaque(false);
		RHS.setLayout(new GridLayout(3,7));
		RHS.add(button1);
		RHS.add(button2);
		RHS.add(button3);
		RHS.add(button4);
		RHS.add(button5);
		RHS.add(button6);
		RHS.add(button7);
		RHS.add(button8);
		RHS.add(button9);
		RHS.add(button10);
		RHS.add(button11);
		RHS.add(button12);
		RHS.add(button13);
		RHS.add(button14);
		RHS.add(button15);
		RHS.add(button16);
		RHS.add(button17);
		RHS.add(button18);
		RHS.add(button19);
		RHS.add(button20);
		RHS.add(button21);
		


		f.getContentPane().add(topButtons,BorderLayout.NORTH);

		f.getContentPane().add(LHS,BorderLayout.WEST);
		f.getContentPane().add(RHS,BorderLayout.EAST);
		f.setSize(800,800);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==viewHistory) {
			f.dispose();
			Report report = new Report();
		}
		if(e.getSource()==generateReport) {
			if ((button1.getBackground() != Color.RED) && (button1.getBackground() != Color.GREEN)
					|| (button2.getBackground() != Color.RED) && (button2.getBackground() != Color.GREEN)
					|| (button3.getBackground() != Color.RED) && (button3.getBackground() != Color.GREEN)
					|| (button4.getBackground() != Color.RED) && (button4.getBackground() != Color.GREEN)
					|| (button5.getBackground() != Color.RED) && (button5.getBackground() != Color.GREEN)
					|| (button6.getBackground() != Color.RED) && (button6.getBackground() != Color.GREEN)
					|| (button7.getBackground() != Color.RED) && (button7.getBackground() != Color.GREEN)
					|| (button8.getBackground() != Color.RED) && (button8.getBackground() != Color.GREEN)
					|| (button9.getBackground() != Color.RED) && (button9.getBackground() != Color.GREEN)
					|| (button10.getBackground() != Color.RED) && (button10.getBackground() != Color.GREEN)
					|| (button11.getBackground() != Color.RED) && (button11.getBackground() != Color.GREEN)
					|| (button12.getBackground() != Color.RED) && (button12.getBackground() != Color.GREEN)
					|| (button13.getBackground() != Color.RED) && (button13.getBackground() != Color.GREEN)
					|| (button14.getBackground() != Color.RED) && (button14.getBackground() != Color.GREEN)
					|| (button15.getBackground() != Color.RED) && (button15.getBackground() != Color.GREEN)
					|| (button16.getBackground() != Color.RED) && (button16.getBackground() != Color.GREEN)
					|| (button17.getBackground() != Color.RED) && (button17.getBackground() != Color.GREEN)
					|| (button18.getBackground() != Color.RED) && (button18.getBackground() != Color.GREEN)
					|| (button19.getBackground() != Color.RED) && (button19.getBackground() != Color.GREEN)
					|| (button20.getBackground() != Color.RED) && (button20.getBackground() != Color.GREEN)
					|| (button21.getBackground() != Color.RED) && (button21.getBackground() != Color.GREEN))
			{
				JOptionPane.showMessageDialog(null, "All activities for all 7 days must be filled","Message", JOptionPane.PLAIN_MESSAGE);
				return;
			}
			f.dispose(); 
			Color[] c = {button1.getBackground(),button2.getBackground(),button3.getBackground(),button4.getBackground()
					,button5.getBackground(),button6.getBackground(),button7.getBackground(),button8.getBackground()
					,button9.getBackground(),button10.getBackground(),button11.getBackground(),button12.getBackground()
					,button13.getBackground(),button14.getBackground(),button15.getBackground(),button16.getBackground()
					,button17.getBackground(),button18.getBackground(),button19.getBackground(),button20.getBackground()
					,button21.getBackground()};
			button1.setBackground(Color.WHITE);
			button2.setBackground(Color.WHITE);
			button3.setBackground(Color.WHITE);
			button4.setBackground(Color.WHITE);
			button5.setBackground(Color.WHITE);
			button6.setBackground(Color.WHITE);
			button7.setBackground(Color.WHITE);
			button8.setBackground(Color.WHITE);
			button9.setBackground(Color.WHITE);
			button10.setBackground(Color.WHITE);
			button11.setBackground(Color.WHITE);
			button12.setBackground(Color.WHITE);
			button13.setBackground(Color.WHITE);
			button14.setBackground(Color.WHITE);
			button15.setBackground(Color.WHITE);
			button16.setBackground(Color.WHITE);
			button17.setBackground(Color.WHITE);
			button18.setBackground(Color.WHITE);
			button19.setBackground(Color.WHITE);
			button20.setBackground(Color.WHITE);
			button21.setBackground(Color.WHITE);
			data = new WeekData();
			file.WriteObjectToFile(data);
			Report report = new Report(c);
		}
		if (e.getSource()== button1 || e.getSource() == button2 || e.getSource() == button3 
				|| e.getSource() == button4|| e.getSource() == button5 
				|| e.getSource() == button6 || e.getSource() == button7
				|| e.getSource() == button8 || e.getSource() == button9
				|| e.getSource() == button10 || e.getSource() == button11
				|| e.getSource() == button12|| e.getSource() == button13
				|| e.getSource() == button14 || e.getSource() == button15
				|| e.getSource() == button16 || e.getSource() == button17
				|| e.getSource() == button18 || e.getSource() == button19
				|| e.getSource() == button20 || e.getSource() == button21) {
			if (e.getSource() instanceof Component) {
				if (((Component) e.getSource()).getBackground() == Color.GREEN) {
					((Component) e.getSource()).setBackground(Color.RED);
				}
				else if (((Component) e.getSource()).getBackground() == Color.RED) {
					((Component) e.getSource()).setBackground(Color.WHITE);
				}
				else {
					((Component) e.getSource()).setBackground(Color.GREEN);
				}
			}
			
		}
		int butt = 0;
		if(((Component) e.getSource()).getBackground() == Color.RED){
			butt = -1;
		}
		if(((Component) e.getSource()).getBackground() == Color.GREEN){
			butt = 1;
		}
		if(e.getSource() == button1) {
			
			data.set(0, butt);
		}
		if(e.getSource() == button2) {
			
			data.set(1, butt);
		}
		if(e.getSource() == button3) {
			
			data.set(2, butt);
		}
		if(e.getSource() == button4) {
			
			data.set(3, butt);
		}
		if(e.getSource() == button5) {
			
			data.set(4, butt);
		}
		if(e.getSource() == button6) {
			
			data.set(5, butt);
		}
		if(e.getSource() == button7) {
			
			data.set(6, butt);
		}
		if(e.getSource() == button8) {
			
			data.set(7, butt);
		}
		if(e.getSource() == button9) {
			
			data.set(8, butt);
		}
		if(e.getSource() == button10) {
			
			data.set(9, butt);
		}
		if(e.getSource() == button11) {
			
			data.set(10, butt);
		}
		if(e.getSource() == button12) {
			
			data.set(11, butt);
		}
		if(e.getSource() == button13) {
			
			data.set(12, butt);
		}
		if(e.getSource() == button14) {
			
			data.set(13, butt);
		}
		if(e.getSource() == button15) {
			
			data.set(14, butt);
		}
		if(e.getSource() == button16) {
			
			data.set(15, butt);
		}
		if(e.getSource() == button17) {
			
			data.set(16, butt);
		}
		if(e.getSource() == button18) {
			
			data.set(17, butt);
		}
		if(e.getSource() == button19) {
			
			data.set(18, butt);
		}
		if(e.getSource() == button20) {
			
			data.set(19, butt);
		}
		if(e.getSource() == button21) {
			
			data.set(20, butt);
		}
		
		file.WriteObjectToFile(data);
		
		
		if (e.getSource() == returnToMenu) {
			f.dispose();
			menu = new Menu();
		}
	}
}