package com.hexa.samplejpa.mapper;

public interface Mapper<A, B> {

    B mapTo (A a);

    A mapFrom(B b);
}
