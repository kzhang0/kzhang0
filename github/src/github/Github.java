package github;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author kuo zhang
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println();
        
        try {
			FileReader fr = new FileReader(new File("helloworld.txt"));
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine ())!=null){
				if(line.equals("helloworld")){
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file doesnt exist");
                }
    }
}
