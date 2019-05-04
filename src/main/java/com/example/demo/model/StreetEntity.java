package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
public class StreetEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_street")
    @SequenceGenerator(name = "seq_street", sequenceName = "seq_street", allocationSize = 1)
    private Integer id;
    
    @Column(name = "HOUSE")
    private Integer house;

    @Column(name = "CITY_ID")
    private int cityId;

    //@Enumerated(EnumType.STRING)
    @Column(name = "STREET_NAME")
    private String name;

    public StreetEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
