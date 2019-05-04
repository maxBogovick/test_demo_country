package com.example.demo.model;

import com.example.demo.model.enumeration.CityType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CITY")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_city")
    @SequenceGenerator(name = "seq_city", sequenceName = "seq_city", allocationSize = 1)
    private Integer id;

    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "CITY_TYPE")
    private CityType type;

    @Column(name = "FOUNDATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date foundationDate;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SQUARE")
    private double square;

    @Column(name = "CAPITAL")
    private int capital;

    @Column(name = "POPULATION")
    private int population;

    @Transient
    private Date createDate;

    public CityEntity() {
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityType getType() {
        return type;
    }

    public void setType(CityType type) {
        this.type = type;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
