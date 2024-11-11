package com.huyvnnb.taco_cloud.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class Taco {
    private Long id;
    private Date createAt;
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 character long")
    private String name;

    @Size(min = 1, message = "Please choose at least 1 ingredient")
    private List<String> ingredients;

}
