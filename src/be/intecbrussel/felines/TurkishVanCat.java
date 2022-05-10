package be.intecbrussel.felines;

public class TurkishVanCat extends Felis{
    public String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "I'am a TurkishVanCat";
    }
}