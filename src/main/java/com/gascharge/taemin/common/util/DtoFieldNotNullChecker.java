package com.gascharge.taemin.common.util;

import java.util.Arrays;
import java.util.Optional;

public class DtoFieldNotNullChecker {
    public static Optional checkAnyFieldNotNull(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> {
                    field.setAccessible(true);
                    Object o;
                    try {
                        o = field.get(object);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    if (o != null) return true;
                    else return false;
                }).findAny();
    }
}
