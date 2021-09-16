package runnablehw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RunnableImpl implements Runnable {
    private final File file;

    public RunnableImpl(File file){
        this.file = file;
    }
    @Override
    public void run() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10_000; i++) {
            printWriter.println("Random line");
        }
        printWriter.close();
    }
}
