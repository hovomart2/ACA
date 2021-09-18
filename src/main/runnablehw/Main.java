package runnablehw;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        new Thread(new RunnableImpl(
                new File("C:\\Users\\Asus\\IdeaProjects\\ACA\\src\\main\\runnablehw\\file"))).start();

    }
}
