import java.io.Serializable;

public class PastData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sleepFeedback;
	private String mealsFeedback;
	private String exerciseFeedback;
	
	public PastData() {
		sleepFeedback = new String();
		mealsFeedback = new String();
		exerciseFeedback = new String();
	}
	
	

	public PastData(String sleepFeedback, String mealsFeedback, String exerciseFeedback) {
		super();
		this.sleepFeedback = sleepFeedback;
		this.mealsFeedback = mealsFeedback;
		this.exerciseFeedback = exerciseFeedback;
	}



	public String getSleepFeedback() {
		return sleepFeedback;
	}

	public void setSleepFeedback(String sleepFeedback) {
		this.sleepFeedback = sleepFeedback;
	}

	public String getMealsFeedback() {
		return mealsFeedback;
	}

	public void setMealsFeedback(String mealsFeedback) {
		this.mealsFeedback = mealsFeedback;
	}

	public String getExerciseFeedback() {
		return exerciseFeedback;
	}

	public void setExerciseFeedback(String exerciseFeedback) {
		this.exerciseFeedback = exerciseFeedback;
	}
	
}
