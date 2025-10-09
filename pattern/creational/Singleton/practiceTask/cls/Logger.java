package pattern.creational.Singleton.practiceTask.cls;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static FileWriter Log;

    private Logger() {

    }

    private static FileWriter getFileWriter() throws IOException {
        if (Log == null) {
            Log = new FileWriter("C:\\MyDetails\\LLD\\pattern\\creational\\Singleton\\practiceTask\\cls\\Sample.txt");
        }
        return Log;
    }

    public static void logger(String log) {
        try {
            FileWriter fileWriter = getFileWriter();
            fileWriter.write(log);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Failed to Log");
        }
    }
}
