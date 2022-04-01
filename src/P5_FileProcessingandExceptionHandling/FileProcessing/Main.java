package P5_FileProcessingandExceptionHandling.FileProcessing;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //demoCreateFile();

        //demoWriteFile();

        //demoReadFile();

        //demoDeleteFile();

        demoBufferWrite();
    }


    // CREATE FILE
    static void demoCreateFile()
    {
        try {
            //File myObj = new File("demofile.doc");
            File myObj = new File("C:\\Users\\84344\\Desktop\\DemoJava\\demofile.txt");
            if(myObj.createNewFile())
            {
                System.out.println("Created file: " + myObj.getName());
            }else {
                System.out.println(myObj.getName() + " is exist with path: " + myObj.getPath());

            }
        }catch (IOException e)
        {
            System.out.println("Errorrrrrrr");
        }
    }

    static void demoWriteFile()
    {
        try {
            //FileWriter myWriter = new FileWriter("filename.doc");
            FileWriter myWriter = new FileWriter("filename.xlsx");
            myWriter.write("Demo write fle word!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // DEMO READ FILE
    static void demoReadFile()
    {
        File myObj = new File("filename.doc");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // DEMO DELETE FILE
    static void demoDeleteFile()
    {
        File myObj = new File("filename.doc");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }


    //  DEMO DELETE FOLDER
    static void demoDeleteFolder()
    {
        File myObj = new File("C:\\Users\\84344\\Desktop\\DemoJava");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }

    //DEMO BUFFERWRITER
    static void demoBufferWrite() throws IOException {
        FileWriter writer = new FileWriter("demoBuffer.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success...");
    }

    static void demoBufferReader() throws IOException {
        FileReader fr = new FileReader("demoBuffer.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }

    //DEMO WRITE EXCEL
    static void demoWriteExcelFile()
    {

    }
}
