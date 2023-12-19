package com.webprojectv0.notalone;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String userName;

    // @OneToMany(mappedBy = "siteUser")
    @OneToMany(mappedBy = "siteUser")
    private List<Cart> cartList;

}
