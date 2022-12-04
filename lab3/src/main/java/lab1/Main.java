package lab1;

import service.RegionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        LastSeeingPlace p1 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi-").setStreetName("Ruska").setHouseNumber("22-A").build();
        LastSeeingPlace p2 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Geroiv Maidanu").setHouseNumber("105").build();
        LastSeeingPlace p3 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Golovna").setHouseNumber("11-B").build();
        LastSeeingPlace p4 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Shevchenka").setHouseNumber("98-C").build();
        LastSeeingPlace p5 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Lesi Ukrainky").setHouseNumber("98-A").build();
        LastSeeingPlace p6 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Universitetska").setHouseNumber("54").build();
        LastSeeingPlace p7 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Sosury").setHouseNumber("29").build();
        LastSeeingPlace p8 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Nezalezhnosti").setHouseNumber("194").build();
        LastSeeingPlace p9 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Stepana Bandery").setHouseNumber("103").build();
        LastSeeingPlace p10 = new LastSeeingPlace.Builder()
                .setRegionName("Chernivtsi").setStreetName("Geroiv Maidanu").setHouseNumber("38-B").build();



        List<LastSeeingPlace> lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p1);
        lastSeeingPlaces.add(p5);

        Vanished vanished1 = new Vanished.Builder()
                .setType(Vanished.Type.ANIMAL).setSex(Vanished.Sex.MALE).setName("Barsik")
                .setBirthDate(LocalDate.of(2017, 8, 18))
                .setMissDate(LocalDate.of(2022, 10, 29))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0982602637").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p2);

        Vanished vanished2 = new Vanished.Builder()
                .setType(Vanished.Type.HUMAN).setSex(Vanished.Sex.MALE).setName("Roman")
                .setBirthDate(LocalDate.of(1974, 11, 8))
                .setMissDate(LocalDate.of(2022, 8, 24))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0682602111").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p4);
        lastSeeingPlaces.add(p9);
        lastSeeingPlaces.add(p10);

        Vanished vanished3 = new Vanished.Builder()
                .setType(Vanished.Type.HUMAN).setSex(Vanished.Sex.FEMALE).setName("Alina")
                .setBirthDate(LocalDate.of(1999, 9, 28))
                .setMissDate(LocalDate.of(2022, 2, 24))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0990993917").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p3);

        Vanished vanished4 = new Vanished.Builder()
                .setType(Vanished.Type.HUMAN).setSex(Vanished.Sex.MALE).setName("Bogdan")
                .setBirthDate(LocalDate.of(1991, 4, 11))
                .setMissDate(LocalDate.of(2021, 9, 19))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0680026393").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p6);

        Vanished vanished5 = new Vanished.Builder()
                .setType(Vanished.Type.ANIMAL).setSex(Vanished.Sex.FEMALE).setName("Lily")
                .setBirthDate(LocalDate.of(2019, 6, 26))
                .setMissDate(LocalDate.of(2022, 6, 6))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0992890628").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p7);

        Vanished vanished6 = new Vanished.Builder()
                .setType(Vanished.Type.ANIMAL).setSex(Vanished.Sex.MALE).setName("Zack")
                .setBirthDate(LocalDate.of(2018, 10, 12))
                .setMissDate(LocalDate.of(2021, 3, 8))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0971270900").build();

        lastSeeingPlaces = new ArrayList<LastSeeingPlace>();
        lastSeeingPlaces.add(p8);

        Vanished vanished7 = new Vanished.Builder()
                .setType(Vanished.Type.HUMAN).setSex(Vanished.Sex.MALE).setName("Igor")
                .setBirthDate(LocalDate.of(1997, 6, 6))
                .setMissDate(LocalDate.of(2022, 11, 2))
                .setLastSeeingPlace(lastSeeingPlaces).setfinderPhoneNumber("0680993839").build();

        List<Vanished> vanisheds = new ArrayList<Vanished>();
        vanisheds.add(vanished1);
        vanisheds.add(vanished2);
        vanisheds.add(vanished3);
        vanisheds.add(vanished4);
        vanisheds.add(vanished5);
        vanisheds.add(vanished6);
        vanisheds.add(vanished7);

        Region region = new Region.Builder().setRegionName("Chernovtsi").setSquare(8097)
                .setPeopleNumber(9016).setAnimalNumber(1000).setVanished(vanisheds).build();

        RegionService service = new RegionService(region);

        System.out.println("\nVanisheds sorted by name:\n");
        System.out.println(service.sortByName());

        System.out.println("\nVanisheds sorted by name (Stream):\n");
        System.out.println(service.sortByNameStream());

        System.out.println("\nVanisheds sorted by miss date:\n");
        System.out.println(service.sortByMissDate());

        System.out.println("\nVanisheds sorted by miss date (Stream):\n");
        System.out.println(service.sortByMissDateStream());

        System.out.println("\nVanisheds sorted by age:\n");
        System.out.println(service.sortByAge());

        System.out.println("\nVanisheds sorted by age (Stream):\n");
        System.out.println(service.sortByAgeStream());

        System.out.println("\nVanisheds which are animals:\n");
        System.out.println(service.findVanishedByType(Vanished.Type.ANIMAL));

        System.out.println("\nVanisheds which are animals (Stream):\n");
        System.out.println(service.findAnimalVanishedStream(Vanished.Type.ANIMAL));

        System.out.println("\nVanisheds which are female:\n");
        System.out.println(service.findFemaleVanished(Vanished.Sex.FEMALE));

        System.out.println("\nVanisheds which are female (Stream):\n");
        System.out.println(service.findFemaleVanishedStream(Vanished.Sex.FEMALE));

    }
}
