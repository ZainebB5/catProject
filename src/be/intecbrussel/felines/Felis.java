package be.intecbrussel.felines;

import java.util.Objects;

public class Felis extends Animal{
    private static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {
        vaccinationCount++;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        if( Math.abs(shelterNo) <= 999){
            this.shelterNo = shelterNo;
        } else {
            System.out.println("wrong value ! ShelterNo must be between 0 and 999 .\n Please change value in setShelterNo()");
        }

    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        if( Math.abs(shelterNo) <= 999){
            this.badgeNo = badgeNo;
        } else {
            System.out.println("wrong value ! BadgeNo must be between 0 and 999 .\n Please change value in setBadgeNo()");
        }
    }

    public void miauw(){
    }
    public void miauw(int time){
    }

    public static int getNoOfVaccinationCount(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "Hello my name is" + name + ", my shelterNo is : " + shelterNo +
                " and my badgeNo : " + badgeNo;
    }
}
