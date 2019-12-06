package com.bradnon.pattern.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class XingzhiHighSchool implements School {

    private String name;

    public XingzhiHighSchool(String name) {
        this.name = name;
    }

    List<School> partList = new ArrayList<>();

    @Override
    public void addPart(School company) {
        partList.add(company);
    }

    @Override
    public void removePart(School company) {
        partList.remove(company);
    }

    @Override
    public void displayPart() {
        partList.forEach(x -> {
            x.displayPart();
        });
    }

    @Override
    public void action() {
        partList.forEach(x -> {
            x.action();
        });
    }
}
