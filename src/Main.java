import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ReadFile ref = new ReadFile();
		//ref.changePath("tabelaDanych/test.txt");
		ref.openFile();
		ref.getTextFile();
		//ref.changePath("tabelaDanych/stopnie.txt");
		//ref.openFile();
		//ref.getTextFile();
	}
	
	

}
