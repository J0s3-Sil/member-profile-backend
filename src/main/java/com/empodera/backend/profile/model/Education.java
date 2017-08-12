package com.empodera.backend.profile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


@Entity
public class Education{

    @Id
    private String id;
    private String schoolName;
    private String fieldOfStudy;
    private Date startDate;
    private Date endDate;
    private Date degree;
    private List<String> activities;
    private String notes;










}
