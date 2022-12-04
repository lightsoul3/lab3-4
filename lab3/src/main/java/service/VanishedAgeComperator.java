package service;

import lab1.Vanished;

import java.time.LocalDate;
import java.util.Comparator;

public class VanishedAgeComperator implements Comparator<Vanished>{
    LocalDate curDate = LocalDate.now();
    @Override
    public int compare(Vanished v1, Vanished v2){
        return (curDate.minusYears(v1.getBirthDate().getYear())).compareTo(curDate.minusYears(v2.getBirthDate().getYear()));
    }
}
