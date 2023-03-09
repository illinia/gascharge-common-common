package com.gascharge.taemin.common.object;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class JavaTypeUtil {
    public static JavaType getJavaType(Type type) {
        TypeFactory factory = TypeFactory.defaultInstance();
        if (type instanceof ParameterizedType) {
            ParameterizedType type1 = (ParameterizedType) type;
            Type rawType = type1.getRawType();

            List<JavaType> collect = Arrays.stream(type1.getActualTypeArguments()).map(t -> getJavaType(t)).toList();

            return factory.constructParametricType((Class<?>) rawType, collect.toArray(new JavaType[0]));
        } else {
            return factory.constructType(type);
        }
    }
}
