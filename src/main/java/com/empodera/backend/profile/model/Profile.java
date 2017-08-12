package com.empodera.backend.profile.model;

import java.util.Date;
import java.util.List;

public class Profile {

    private String id;
    private String firstName;
    private String lastName;
    private String maidenName;
    private String formattedName;
    private Date dateOfBirth;
    private String headLine;
    private Location location; //check this with daniel

    private String summary;
    private String specialities;
    private Language languageId;
    private Education educationId;
    private Certification certificationId;
    private Course coursesId;
    private Position positionId;
    private List<Position> threeCurrentPositions;
    private List<Position> threePastPositions;
    private String pictureUrl;





}
