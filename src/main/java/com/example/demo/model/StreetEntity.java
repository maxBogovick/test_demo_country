package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
public class StreetEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_street")
    @SequenceGenerator(name = "seq_street", sequenceName = "seq_street", allocationSize = 1)
    private Integer id;
    
    @Column(name = "HOUSE", nullable = false)
    private Integer house;

    @Column(name = "CITY_ID", updatable = false, insertable = false)
    private int cityId;


    @Column(name = "STREET_NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID")
    private CityEntity city;

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

    @Override
    public String toString() {
        return "StreetEntity{" +
                "id=" + id +
                ", house=" + house +
                ", cityId=" + cityId +
                ", name='" + name + '\'' +
                '}';
    }
}
