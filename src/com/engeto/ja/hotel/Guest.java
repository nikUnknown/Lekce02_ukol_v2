package com.engeto.ja.hotel;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate born;

    public Guest(String name,LocalDate born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

}