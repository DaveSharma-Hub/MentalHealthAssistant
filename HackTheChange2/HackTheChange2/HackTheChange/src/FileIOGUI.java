import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOGUI {
	private String filename;
	
	public FileIOGUI() {
		filename = "week";
	}
	public FileIOGUI(String name) {
		filename = name;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void WriteObjectToFile(Object obj) {
		try {
			 
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Object ReadFileToObject() {
		try {
			//check if file exists
			File f = new File(filename);
			if(!f.exists() || f.isDirectory()) { 
				System.out.println("File is null");
			    return null;
			}
			
	         // create an ObjectInputStream for the file we created before
	         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));

	         // read
	         Object obj =  ois.readObject();
	         
	         ois.close();
	         
	         // obj
	         return obj;

	      } catch (Exception ee) {
	         ee.printStackTrace();
	      }
		return null;
	}
}
