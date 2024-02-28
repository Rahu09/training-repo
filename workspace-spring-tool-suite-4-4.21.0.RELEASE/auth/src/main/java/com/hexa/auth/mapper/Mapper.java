package com.hexa.auth.mapper;

public interface Mapper<A, B> {

    B mapTo (A a);

    A mapFrom(B b);
}
