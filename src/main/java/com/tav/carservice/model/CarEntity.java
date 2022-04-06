package com.tav.carservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
public class CarEntity {

    public CarEntity(String brand, String color, int numOfSeats, boolean isAutomatic) {
        this.brand = brand;
        this.color = color;
        this.numOfSeats = numOfSeats;
        this.isAutomatic = isAutomatic;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "color", nullable = false)
    private String color;
    @Column(name = "num_of_seats", nullable = false)
    private int numOfSeats;
    @Column(name = "is_automatic", nullable = false)
    private boolean isAutomatic;

}
