package com.progra2.homework;

public interface List {
    void add(Integer value);

    boolean remove(Integer value);

    Integer nextOf(Integer value);

    Integer previousOf(Integer value);
}
