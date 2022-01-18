package com.isep;

import java.util.Objects;

public class Lion extends Animal{
    @Override
    public String affiche() {
        if(Objects.equals(surnom, "TOM")) {
            return "Je suis le lion TOM";
        }
        else {
            return "Je suis le lion MAX";
        }
    }
}
