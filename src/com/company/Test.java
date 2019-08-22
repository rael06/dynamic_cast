package com.company;

public class Test {
    public static <T> T caster(T type, Object _toCast) {
        return (T) _toCast;
    }
}
