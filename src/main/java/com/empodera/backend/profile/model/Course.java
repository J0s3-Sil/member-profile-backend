package com.empodera.backend.profile.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private int number;





}
