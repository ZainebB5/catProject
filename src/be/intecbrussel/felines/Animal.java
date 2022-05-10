package be.intecbrussel.felines;

public class Animal {
    protected static  int animalCount;
    private char size;
    private char coat;
    private String color;
    private double wheight;

    {
        animalCount++;
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWheight() {
        return wheight;
    }

    public void setWheight(double wheight) {
        this.wheight = wheight;
    }

    public void makeNoise(String sound){
    }
    public void eat(){

    }
    public void sleep(){

    }
    public boolean isAlive(){
        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
