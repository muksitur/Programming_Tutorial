import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO {

	//todo: Create a file with at least 5 lines of arbitrary text
	//create a second file and copy the first and the last word of every line of your arbitrary text
	//donot forget to save your file
	
	private static String FILENAME = "filename.txt";
	
	public static void fileread(){
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				String[] words = sCurrentLine.split(" ");
				System.out.print(words[0]+" ");
				System.out.print(words[words.length-1]+"\n");
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
	
	public static void filewrite(){
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {

			String content = "This is the first line in the file\n"
					+ "This is the second line in the file\n"
					+ "This is the third line in the file\n"
					+ "This is the fourth line in the file\n"
					+ "This is the fifth line in the file\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			//System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
	
	public static void main(String[] args){
		
		FileIO fio = new FileIO();
		
		fio.filewrite();
		
		fio.fileread();
		
	}
	
}
