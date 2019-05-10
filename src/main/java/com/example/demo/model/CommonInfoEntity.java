package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonInfoEntity {

    @Column(name = "POPULATION")
    private Integer population;

    @Column(name = "DESCRIPTION")
    private String description;

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
