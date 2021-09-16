package runnablehw;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        new Thread(new com.company.RunnableImpl(
                new File("C:\\Users\\Asus\\IdeaProjects\\JavaAdobe\\src\\com\\company\\file"))).start();

    }
}
