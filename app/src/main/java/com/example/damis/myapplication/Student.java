package com.example.damis.myapplication;

/**
 * Created by Damis on 23.10.2017.
 */

public class Student {

    private String imie;
    private String nazwisko;

    public Student(String im, String nz){
        this.imie = im;
        this.nazwisko = nz;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
