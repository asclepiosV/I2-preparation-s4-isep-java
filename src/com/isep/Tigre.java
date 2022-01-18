package com.isep;

import java.util.Objects;

public class Tigre extends Animal{
    @Override
    public String affiche() {
        if (Objects.equals(surnom, "TOM")) {
            return "Je suis le tigre TOM";
        } else {
            return "Je suis le tigre MAX";
        }
    }
}
