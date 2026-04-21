import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter("test.txt");
            fw.write("Hello opp teacher");
			//here i should put fw.close
            br = new BufferedReader( new FileReader("test.txt"));
            br.close();
             //so here i can read the file when i didnt i could not read it but it changed 
        } catch (IOException e) {
            System.out.println("Error catched");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                    System.out.println("File closed");
                }
                if (br != null) {
                     String line;
                     System.out.println("Reading from file:");
                      while ((line = br.readLine()) != null) {
                           System.out.println(line);
                       }
					br.close();
				
                }
                

            } catch (IOException e) {
                System.out.println("Error catched ");
            }
        }
    }
}