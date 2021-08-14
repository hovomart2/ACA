package week4HomeworkTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt()==1){
            FastClock fastClock = new FastClock();
            fastClock.start();
        }
        else if(scanner.nextInt()==2){
            SlowClock slowClock = new SlowClock();
            slowClock.start();
        }
        else{
            throw new RuntimeException("Invalid input");
        }

    }
}
