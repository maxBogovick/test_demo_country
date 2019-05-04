package com.example.demo.model;

import com.example.demo.model.enumeration.CityType;
import com.example.demo.model.enumeration.Currency;
import com.example.demo.model.enumeration.MotherTongue;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COUNTRIES")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_country")
    @SequenceGenerator(name = "seq_country", sequenceName = "seq_country", allocationSize = 1)
    private Integer id;

    @Column(name = "COUNTRY_NAME", nullable = true, insertable = true, updatable = true)
    private String name;


    @Enumerated(EnumType.STRING)
    @Column(name = "MOTHER_TONGUE")
    private MotherTongue motherTongue;

    @Column(name = "CURRENCY")
    private Currency currency;

    @Column(name = "SQUARE")
    private double square;

    @Column(name = "POPULATION")
    private Integer population;

    @Column(name = "DESCRIPTION")
    private String description;

    @Transient
    private Date createDate;

    public CountryEntity() {
    }

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

    public MotherTongue getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(MotherTongue motherTongue) {
        this.motherTongue = motherTongue;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", motherTongue=" + motherTongue +
                ", currency='" + currency + '\'' +
                ", square=" + square +
                ", createDate=" + createDate +
                '}';
    }
}
