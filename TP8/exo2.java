import java.io.*;

public class exo2 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    try {
                        int character;
                        while ((character = reader.read()) != -1) {
                            writer.write(character);
                        }
                        reader.close();
                        writer.close();
                        System.out.println("File copied successfully.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            task.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}