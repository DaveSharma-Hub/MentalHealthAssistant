import java.io.Serializable;

public class WeekData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int data[];
	
	public WeekData() {
		data = new int[21];
		for(int i = 0; i < data.length; i++) {
			data[i] = 0;
		}
	}
	
	public WeekData(int size) {
		data = new int[size];
		for(int i = 0; i < data.length; i++) {
			data[i] = 0;
		}
	}
	
	public void set(int index, int value) {
		data[index] = value;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return data.length;
	}
	
	public int[] getData() {
		return data.clone();
	}

}
