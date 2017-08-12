package com.empodera.backend.profile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


@Entity
public class Company {

    @Id
    private String id;
    private String name; // Default. The human readable name of the company
    private String universalName; // Unique string identifier of the company
    private List<String> emailDomains;
    private char companyType;
    private String ticker;
    private String websiteUrl;
    private String industryCode;
    private String blogRssUrl;
    private String twitterid;
    private String rangeCode;
    private List<String> specialities;
    private List<Location> Locations;
    private String locationDescription;
    private boolean locationIsHeadquarters;
    private boolean locationIsActive;
    private String locationAddress;
    private String locationAddressCity;
    private String locationAddressState;
    private String locationAddressPostalCode;
    private String locationContactInfo;
    private String locationContactInfoPhone1;
    private String locationContactInfoPhone2;
    private String locationContactInfoFax;
    private String description;
    private Date foundedYear;
    private Date endYear;






}
