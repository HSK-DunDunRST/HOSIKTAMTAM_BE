package com.goormthonuniv.hoseo.hosiktamtam.domain.menu;

import com.goormthonuniv.hoseo.hosiktamtam.domain.common.BaseTimeEntity;
import com.goormthonuniv.hoseo.hosiktamtam.domain.restaurant.Restaurant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer price;

    private String image;
}