
package com.empodera.backend.profile.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;



@Entity
public class Certification {


    @Id
    private String id;
    private String name; // Name of the certification
    private String authority;  // The name of the certification issuing.
    private Integer number;  // The license number for this certification
    private Date startDate;
    private Date endDate;





}
