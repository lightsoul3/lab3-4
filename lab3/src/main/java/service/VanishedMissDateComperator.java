package service;

import lab1.Vanished;

import java.util.Comparator;

public class VanishedMissDateComperator implements Comparator<Vanished> {
    @Override
    public int compare(Vanished v1, Vanished v2){
        return v1.getMissDate().compareTo(v2.getMissDate());
    }
}
