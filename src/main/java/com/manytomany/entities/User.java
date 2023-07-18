package com.manytomany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="user")

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userName;
    private String passWord;
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
   private  Collection<Group> groups = new ArrayList<>();
}
