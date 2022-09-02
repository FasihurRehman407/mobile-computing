package com.example.quranapp;

public class ParahModel {
    String name;
    String id;

    @Override
    public String toString() {
        return name + '\'' + id + '\'';
    }

    public ParahModel(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
