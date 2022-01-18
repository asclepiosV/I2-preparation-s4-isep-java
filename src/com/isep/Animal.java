package com.isep;

import java.util.Objects;

public class Animal{
    public static String surnom = "";
    public String affiche(){
        if(Objects.equals(surnom, "TOM")){
            System.out.println("Je suis l'animal "+ surnom);
        }
        else System.out.println("Je ne suis pas TOM");
        return null;
    }


}
