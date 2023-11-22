package com.tickets.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String fullname;
    private String phonenumber;
    private String email;

    private boolean enabled;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Role > role= new ArrayList<>();

    public User() {
    }


}
