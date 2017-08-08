package com.test.basics;

import java.util.Iterator;

public interface generics <E> {
    void add(E x);
    Iterator<E> iterator();
}		