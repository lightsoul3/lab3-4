package service;

import lab1.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RegionService {

    private Region region;

    public RegionService( Region regionData){
        region = regionData;
    }

    public List<Vanished> sortByName(){
        List<Vanished> vanisheds = new ArrayList<>();
        vanisheds.addAll(region.getVanished());
        Collections.sort(vanisheds);
        vanisheds.sort(new VanishedNameComperator());

        return vanisheds;
    }

    public List<Vanished> sortByMissDate(){
        List<Vanished> vanisheds = new ArrayList<>();
        vanisheds.addAll(region.getVanished());
        Collections.sort(vanisheds);
        vanisheds.sort(new VanishedMissDateComperator());

        return vanisheds;
    }

    public List<Vanished> sortByAge(){
        List<Vanished> vanisheds = new ArrayList<>();
        vanisheds.addAll(region.getVanished());
        Collections.sort(vanisheds);
        vanisheds.sort(new VanishedAgeComperator());

        return vanisheds;
    }

    public List<Vanished> findVanishedByType(Vanished.Type type){
        List<Vanished> vanisheds = new ArrayList<>();
        for(Vanished vanished : region.getVanished()){
            if(vanished.getType() == type){
                vanisheds.add(vanished);
            }
        }
        return vanisheds;
    }

    public List<Vanished> findFemaleVanished(Vanished.Sex sex){
        List<Vanished> vanisheds = new ArrayList<>();
        for(Vanished vanished : region.getVanished()){
            if(vanished.getSex() == sex){
                vanisheds.add(vanished);
            }
        }
        return vanisheds;
    }

    public List<Vanished> sortByNameStream(){
        return region.getVanished().stream().sorted(new VanishedNameComperator()).collect(Collectors.toList());
    }

    public List<Vanished> sortByMissDateStream(){
        return region.getVanished().stream().sorted(new VanishedMissDateComperator()).collect(Collectors.toList());
    }


    public List<Vanished> sortByAgeStream(){
        return region.getVanished().stream().sorted(new VanishedAgeComperator()).collect(Collectors.toList());
    }

    public List<Vanished> findAnimalVanishedStream(Vanished.Type vType){
        return region.getVanished().stream().filter(type -> type.getType().contains(vType)).collect(Collectors.toList());
    }

    public List<Vanished> findFemaleVanishedStream(Vanished.Sex vSex){
        return region.getVanished().stream().filter(sex -> sex.getSex().contains(vSex)).collect(Collectors.toList());
    }

}
