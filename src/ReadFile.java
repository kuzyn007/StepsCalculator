import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
	
	private String path;
	private double[][] lines;
	
	public ReadFile() {
		path = "tabelaDanych/stopnie.txt";
	}
	
	public void changePath(String filePath) {
		path = filePath;
	}
	
	public double[][] openFile() throws FileNotFoundException {
		File fr = new File(path);
		Scanner in = new Scanner(fr);

		lines = new double[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				lines[i][j] = in.nextDouble();
			}
		}

		in.close();
		return lines;
	}

	public void getTextFile() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(lines[i][j] + "   ");
			}
			System.out.println();
		}	
	}
	
	
}