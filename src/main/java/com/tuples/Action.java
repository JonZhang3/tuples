package com.tuples;

public interface Action<N, I, V> {

    void apply(N name, I index, V value);

}
