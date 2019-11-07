import java.io.File;

public class FindFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder = new File ("C:\\Prev_Laptop_CDrive\\Pradeep");
		String[] files = folder.list();
		for (String file:files) {
			System.out.println(file);
		}

	}

}
