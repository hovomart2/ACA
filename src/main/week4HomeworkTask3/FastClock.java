package week4HomeworkTask3;

public class FastClock implements Clock {
    private int seconds;

    public FastClock(){
        seconds = 0;
    }

    public FastClock(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void start() {
        long start = System.currentTimeMillis();
        while (true){
            if(System.currentTimeMillis()-start>500){
                seconds++;
                start = System.currentTimeMillis();
            }
        }
    }
}
