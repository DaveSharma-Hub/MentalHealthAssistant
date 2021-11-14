import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Report extends JFrame implements ActionListener{

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
	JFrame frame = new JFrame();
	JButton returnToMenu = new JButton("Return To Menu");
	FileIOGUI file;
	PastData data;
	
	public Report() {
		//Setting up Frame positioning
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(dim.width/2-150, dim.height/2-150);
		frame.setPreferredSize(new Dimension(400,400));
		
		//Results Panel
		JPanel results = new jPanelGradient();
		results.setLayout(new GridLayout(4,1));
		
		file = new FileIOGUI("past");
		if((data = (PastData) file.ReadFileToObject()) == null){
			//no past week
			JLabel sleepLabel = new JLabel("<html><p align='justify'>No Past Week Data!</p></html>");
			results.add(sleepLabel);
		}
		else {
			//Sleep Feedback
			String sleepFeedback = data.getSleepFeedback();
			JLabel sleepLabel = new JLabel(sleepFeedback);
			results.add(sleepLabel);
	
			//Healthy Meals Feedback
			String mealsFeedback = data.getMealsFeedback();
			JLabel mealsLabel = new JLabel(mealsFeedback);
			results.add(mealsLabel);
			//Exercise Feedback
			String exerciseFeedback = data.getExerciseFeedback();
			JLabel exerciseLabel = new JLabel(exerciseFeedback);
			results.add(exerciseLabel);
		}
		

		//Return button
		returnToMenu.addActionListener(this);
		results.add(returnToMenu);
		//Making frame visible
		frame.pack();
		frame.add(results);
		frame.setVisible(true);
	}
	
	public Report(Color[] c) {
		//Setting up Frame positioning
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(dim.width/2-150, dim.height/2-150);
		frame.setPreferredSize(new Dimension(400,400));
		//Results Panel
		JPanel results = new jPanelGradient();
		results.setLayout(new GridLayout(4,1));
		//Sleep Feedback
		String sleepFeedback = sleepResults(c);
		JLabel sleepLabel = new JLabel(sleepFeedback);
		results.add(sleepLabel);

		//Healthy Meals Feedback
		String mealsFeedback = mealResults(c);
		JLabel mealsLabel = new JLabel(mealsFeedback);
		results.add(mealsLabel);
		//Exercise Feedback
		String exerciseFeedback = exerciseResults(c);
		JLabel exerciseLabel = new JLabel(exerciseFeedback);
		results.add(exerciseLabel);
		
		file = new FileIOGUI("past");
		data = new PastData(sleepFeedback, mealsFeedback, exerciseFeedback);
		file.WriteObjectToFile(data);

		//Return button
		returnToMenu.addActionListener(this);
		results.add(returnToMenu);
		//Making frame visible
		frame.pack();
		frame.add(results);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == returnToMenu) {
			frame.dispose();
			Menu menu = new Menu();
		}
	}
	public String sleepResults(Color[] c)
	{
		double numberOfReds = 0;
		double numberOfGreens = 0;
		for (int i = 0; i < 7; i++) {
			if (c[i].equals(Color.GREEN)) {
				numberOfGreens++;
			}
			if (c[i].equals(Color.RED)) {
				numberOfReds++;
			}
		}
		String percentage = Double.toString((numberOfGreens/7) * 100);
		String formatted = String.format("%.2f", Double.valueOf(percentage));
		if (numberOfReds >= numberOfGreens) {
			return "<html><p align='justify'>Sleep Schedule: You have gotten 8 hours of sleep for " + formatted + "% of the week, "
					+ "if you want to improve your sleep schedule, visit the resources shown, keep it up!</p></html>";
		}
		return "<html><p align='justify'>Sleep Schedule: You have gotten 8 hours of sleep for " + formatted + "% of the week, "
		+ "Good Job! You're doing great!</p></html>";
	}
	public String mealResults(Color[] c)
	{
		double numberOfReds = 0;
		double numberOfGreens = 0;
		for (int i = 7; i < 14; i++) {
			if (c[i].equals(Color.GREEN)) {
				numberOfGreens++;
			}
			if (c[i].equals(Color.RED)) {
				numberOfReds++;
			}
		}
		String percentage = Double.toString((numberOfGreens/7) * 100);
		String formatted = String.format("%.2f", Double.valueOf(percentage));
		if (numberOfReds >= numberOfGreens) {
			return "<html><p align='justify'>Eating Habits: You have eaten healthy for " + formatted + "% of the week, "
					+ "if you want to improve your eating habits, visit the resources shown, keep it up!</p></html>";
		}
		return "<html><p align='justify'>Eating Habits: You have eaten healthy for  " + formatted + "% of the week, "
		+ "Good Job! You're doing great!</p></html>";
	}
	public String exerciseResults(Color[] c)
	{
		double numberOfReds = 0;
		double numberOfGreens = 0;
		for (int i = 14; i < 21; i++) {
			if (c[i].equals(Color.GREEN)) {
				numberOfGreens++;
			}
			if (c[i].equals(Color.RED)) {
				numberOfReds++;
			}
		}
		String percentage = Double.toString((numberOfGreens/7) * 100);
		String formatted = String.format("%.2f", Double.valueOf(percentage));
		if (numberOfReds >= numberOfGreens) {
			return "<html><p align='justify'>Exercised: You have exercised for " + formatted + "% of the week, "
					+ "if you want to improve your fitness, visit the resources shown, keep it up!</p></html>";
		}
		return "<html><p align='justify'>Exercised: You have exercised for " + formatted + "% of the week, "
		+ "Good Job! You're doing great!</p></html>";
	}
}
