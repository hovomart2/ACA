package week4HomeworkTask3;

public class SlowClock implements Clock{
    private int seconds;

    public SlowClock(){
        seconds = 0;
    }

    public SlowClock(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void start() {
        long start = System.currentTimeMillis();
        while (true){
            if(System.currentTimeMillis()-start>2000){
                seconds++;
                start = System.currentTimeMillis();
            }
        }
    }
}
