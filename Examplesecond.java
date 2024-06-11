import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Examplesecond
{
    public static void main(String[] args) throws IOException {
        String filename = "output.txt";
        String[] data = {"Line 1", "Line 2", "Line 3", "Line 4"};

        File file = new File(filename);      //creating new file
        BufferedWriter writer = null;       // creating bufferedwriter object

        try {

            if (file.createNewFile()) {
                System.out.println("File created :" + file.getName());
            } else {
                System.out.println("File already exists");
            }
            writer = new BufferedWriter(new FileWriter(file));  //Bufferedwriter object to write file
            try {
                for (int i = 0; i <= data.length; i++)        // try to write each line of the array
                   {
                    writer.write(data[i]);
                    writer.newLine();

                   }
                System.out.println("Data written to the file successfully");

            }
            catch (ArrayIndexOutOfBoundsException e)       // handle exception that might occur accessing inavalid array index
                {
                System.out.println("ArrayIndexOutOfBoundsException caught:" + e.getMessage());
                }
            catch (IOException e)  // handle exception that might occur while writing
                {
                System.out.println("IOException caught while writing to this file:" + e.getMessage());
                }
            finally         // writer is closed
            {
                try {
                    if (writer != null) {
                        writer.close();
                        System.out.println("Bufferedwriter closed successfully");
                    }
                } catch (IOException e)     // Handle the exception while closiing the writer
                {
                    System.out.println("IOException caught while closing the Buffered writer: " + e.getMessage());
                }
            }

        }
        catch (IOException e)     //Handle the exception while creating and opening file
           {
            System.out.println("IOException caught while creating the file or opening the writer: " + e.getMessage());
           }
        finally
            {
                System.out.println("Program execution continues after exception handling.");
            }


    }

}



