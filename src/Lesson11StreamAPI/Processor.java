package Lesson11StreamAPI;

public class Processor {
    private String name;
    private int frequency;

    public Processor(String name, int frequency){
        this.name=name;
        this.frequency=frequency;
    }

    public String getName(){
        return name;
    }

    public int getfrequency() {
        return frequency;
    }
    public void setName(String val) {
        this.name=val;
    }
    public void setfrequency(int val) {
        this.frequency=val;
    }



}
