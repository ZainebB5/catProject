package be.intecbrussel.felines;

public class AndreanMountainCat extends Felis{



    public String miauw(String customSound){
        return customSound;
    }

    @Override
    public String toString() {
        return "I'am a AndreanMountainCat";
    }

    @Override
    public boolean isAlive(){
        return false;
    }
}
