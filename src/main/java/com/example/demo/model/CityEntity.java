package com.example.demo.model;

import com.example.demo.model.enumeration.CityType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CITY")
public class CityEntity extends CommonInfoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_city")
    @SequenceGenerator(name = "seq_city", sequenceName = "seq_city", allocationSize = 1)
    private Integer id;

    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "CITY_TYPE", nullable = false)
    private CityType type;

    @Column(name = "FOUNDATION_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date foundationDate;

    @Column(name = "SQUARE")
    private double square;

    @Column(name = "CAPITAL")
    private int capital;


    @Transient
    private Date createDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "COUNTRY_ID")
    private CountryEntity country;

    @OneToMany(mappedBy = "city", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<StreetEntity> streets = new ArrayList<StreetEntity>();


    public CityEntity() {
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

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public List<StreetEntity> getStreets() {
        return streets;
    }

    public void setStreets(List<StreetEntity> streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", foundationDate=" + foundationDate +
                ", square=" + square +
                ", capital=" + capital +
                ", createDate=" + createDate +
                //", country=" + country +
                '}';
    }
}
