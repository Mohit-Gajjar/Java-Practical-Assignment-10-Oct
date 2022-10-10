import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class pr7 {
    File readInFile = new File("file.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "This is file handling demo";

        FileWriter writeInFile = new FileWriter("file.txt");

        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writing successful");

        writeInFile.close();

        int ch;

        FileReader readInFile = new FileReader("file.txt");
        System.out.println("File created SucessFully");
        FileReader readInFileReader = null;

        System.out.println("File is found");

        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);

        readInFile.close();
    }
}
