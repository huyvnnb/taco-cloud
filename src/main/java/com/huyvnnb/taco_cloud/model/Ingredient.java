package com.huyvnnb.taco_cloud.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@ToString
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;


    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
