package lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        try {
            Path path = Paths.
                    get("sampleFile.txt");
            writeUsingNIO(path);
            readUsingNIO(path);
        }


        catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void writeUsingNIO(Path Xpath) throws IOException

    {
        BufferedWriter bufferedWriter = Files.
                newBufferedWriter(Xpath);
        try {
            System.out.println("Writing contents to file.");
            //Type your code here
            bufferedWriter.write("abc\ncde\nwww");
        }
        catch (IOException ioe) {
            bufferedWriter.close();
            ioe.printStackTrace();
        }
        finally {
            bufferedWriter.close();
        }
    }


    private static void readUsingNIO(Path Xpath) throws IOException {
        BufferedReader bufferedReader = Files.
                newBufferedReader(Xpath);
        try {
            String line;
            System.out.println("Reading file"+ Xpath.getFileName().toString());
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            bufferedReader.close();
            e.printStackTrace();
        }finally {
            bufferedReader.close();
        }
}
}
