package it2.develhope.Angelo.APISpringRepositories01.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//defines a table of cars
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    //a primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //a modelName not null
    @Column(nullable = false)
    private String modelName;

    //a serialNumber not null
    @Column(nullable = false)
    private String serialNumber;

    //a currentPrice that can be null
    private double currentPrice;
}
