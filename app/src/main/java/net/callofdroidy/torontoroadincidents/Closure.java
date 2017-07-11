package net.callofdroidy.torontoroadincidents;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Richthofen80 on 7/10/2017.
 */
@Entity
public class Closure {
    @org.greenrobot.greendao.annotation.Id
    private String Id;
    @Property(nameInDb = "Road")
    private String Road;
    @Property(nameInDb = "Name")
    private String Name;
    @Property(nameInDb = "District")
    private String District;
    @Property(nameInDb = "Latitude")
    private String Latitude;
    @Property(nameInDb = "Longitude")
    private String Longitude;
    @Property(nameInDb = "RoadClass")
    private String RoadClass;
    @Property(nameInDb = "Planned")
    private String Planned;
    @Property(nameInDb = "SeverityOverride")
    private String SeverityOverride;
    @Property(nameInDb = "LastUpdated")
    private String LastUpdated;
    @Property(nameInDb = "StartTime")
    private String StartTime;
    @Property(nameInDb = "EndTime")
    private String EndTime;
    @Property(nameInDb = "WorkPeriod")
    private String WorkPeriod;
    @Property(nameInDb = "Expired")
    private String Expired;
    @Property(nameInDb = "WorkEventType")
    private String WorkEventType;
    @Property(nameInDb = "Contractor")
    private String Contractor;
    @Property(nameInDb = "Description")
    private String Description;
}
