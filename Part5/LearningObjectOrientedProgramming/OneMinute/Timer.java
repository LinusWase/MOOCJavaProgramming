public class Timer {
    private ClockHand seconds;
    private ClockHand hundredOfSeconds;

    public Timer(){
        this.hundredOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.hundredOfSeconds.advance();

        if (this.hundredOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }

    public String toString(){
        return this.seconds + ":" + this.hundredOfSeconds;
    }

}
