import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis =
                    new FileInputStream("source.dat");
            FileOutputStream fos =
                    new FileOutputStream("destination.dat");
            // NIO Channels
            FileChannel sourceChannel = fis.getChannel();
            FileChannel destChannel = fos.getChannel();
            // Buffer
            ByteBuffer buffer =
                    ByteBuffer.allocate(1024);
            while (sourceChannel.read(buffer) > 0) {
                buffer.flip();
                destChannel.write(buffer);
                buffer.clear();
            }
            sourceChannel.close();
            destChannel.close();
            fis.close();
            fos.close();
            System.out.println(
                    "File copied successfully using NIO."
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}