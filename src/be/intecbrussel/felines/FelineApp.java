package be.intecbrussel.felines;

public class FelineApp {
    public static void main(String[] args) {
        PersianCat pers = new PersianCat();
        TurkishVanCat tvc = new TurkishVanCat();
        SiameseCat siam = new SiameseCat();
        NorwegianForestCat nfc = new NorwegianForestCat();
        AndreanMountainCat amc = new AndreanMountainCat();
        PersianCat persian = new PersianCat();
        TurkishVanCat turkvc = new TurkishVanCat();
        Acinonyx acin = new Acinonyx();
        Panthera pant = new Panthera();
        Acinonyx acin1 = new Acinonyx();


        Felis[] felisListCat = new Felis[]{pers, tvc, siam, nfc, amc, persian, turkvc };

        System.out.println("number of animals " + Animal.getAnimalCount());
        for (Felis felis : felisListCat){
            System.out.println(felis.toString() + " is alive :" + felis.isAlive());
        }
        System.out.println("-".repeat(30));
        pers.setName("Titi");
        pers.setShelterNo(1000);
        pers.setBadgeNo(32);
        System.out.println("Hello my name is " + pers.getName() + " I'm a " + pers.toString() + ", my shelternum is : " + pers.getShelterNo() + " and my badgenum is : " + pers.getBadgeNo());

        System.out.println("-".repeat(30));
        tvc.setName("Toto");
        tvc.setShelterNo(200);
        tvc.setBadgeNo(32);
        System.out.println("Hello my name is " + tvc.getName() + " I'm a " + tvc.toString() + ", my shelternum is : " + tvc.getShelterNo() + " and my badgenum is : " + tvc.getBadgeNo());


        /*AndreanMountainCat amc = new AndreanMountainCat("Maya",10);
        System.out.println(amc.getName() + " - " + amc.getAge());
        System.out.println(amc.isAlive());
        TurkishVanCat tvc = new TurkishVanCat("toutou",5);
        System.out.println(tvc.getName() + " - " + tvc.getAge());
        System.out.println(tvc.isAlive());*/

    }
}
