package com.example.demo.model;

import com.example.demo.model.enumeration.CityType;
import com.example.demo.model.enumeration.Currency;
import com.example.demo.model.enumeration.MotherTongue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COUNTRIES")
public class CountryEntity extends CommonInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_country")
    @SequenceGenerator(name = "seq_country", sequenceName = "seq_country", allocationSize = 1)
    private Integer id;

    @Column(name = "COUNTRY_NAME", nullable = false, insertable = true, updatable = true)
    private String name;


    @Enumerated(EnumType.STRING)
    @Column(name = "MOTHER_TONGUE")
    private MotherTongue motherTongue;

    @Column(name = "CURRENCY", nullable = false)
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "SQUARE")
    private double square;

    @Column(name="CITY", nullable =false)
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Transient
    private Date createDate;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CityEntity> cities = new ArrayList<>();

    public CountryEntity() {
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

    public List<CityEntity> getCities() {
        return cities;
    }

    public void setCities(List<CityEntity> cities) {
        this.cities = cities;
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
