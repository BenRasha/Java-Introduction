package SimpleClassesAndObjects.Task6;

public class Time {
    private int second;
    private int minute;
    private int hour;
    public Time(int second,int minute,int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    public void setSecond(int second){
        if(second<=60){
            this.second=second;
        }else{
            this.second=0;
        }
    }
    public int getSecond(){
        return second;
    }
    public void setMinute(int minute){
        if(minute<=60){
            this.minute=minute;
        }else{
            this.minute=0;
        }
    }
    public int getMinute(){
        return minute;
    }
    public void setHour(int hour){
        if(hour<=24){
            this.hour=hour;
        }else{
            this.hour=0;
        }
    }
    public int getHour(){
        return hour;
    }
    public void timeIncrease(int second,int minute,int hour){
        this.second+=second;
        this.minute+=minute;
        this.hour+=hour;
        if (this.second>=60){
            this.minute+=this.second/60;
            this.second%=60;
        }
        if(this.minute>=60){
            this.hour+=this.minute/60;
            this.minute%=60;
        }
        if (this.hour>=24){
            this.hour=0;
        }
    }
    public void timeDecrease(int second,int minute,int hour){
        this.second-=second;
        this.minute-=minute;
        this.hour-=hour;
        if(this.second<0){
            this.minute-=this.second/60;
            this.second=-this.second%60;
        }
        if (this.minute<0){
            this.hour+=this.minute/60-1;
            this.minute=60+this.minute%60;
        }
        if (this.hour < 0) {
            this.hour = 24 + this.hour;
        }
    }
    public String toString(){
        return "Time:"+hour+":"+minute+":"+second;
    }
}
