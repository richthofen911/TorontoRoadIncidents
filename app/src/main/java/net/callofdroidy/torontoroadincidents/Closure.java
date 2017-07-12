package net.callofdroidy.torontoroadincidents;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

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
    public String getDescription() {
        return this.Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getContractor() {
        return this.Contractor;
    }
    public void setContractor(String Contractor) {
        this.Contractor = Contractor;
    }
    public String getWorkEventType() {
        return this.WorkEventType;
    }
    public void setWorkEventType(String WorkEventType) {
        this.WorkEventType = WorkEventType;
    }
    public String getExpired() {
        return this.Expired;
    }
    public void setExpired(String Expired) {
        this.Expired = Expired;
    }
    public String getWorkPeriod() {
        return this.WorkPeriod;
    }
    public void setWorkPeriod(String WorkPeriod) {
        this.WorkPeriod = WorkPeriod;
    }
    public String getEndTime() {
        return this.EndTime;
    }
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }
    public String getStartTime() {
        return this.StartTime;
    }
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }
    public String getLastUpdated() {
        return this.LastUpdated;
    }
    public void setLastUpdated(String LastUpdated) {
        this.LastUpdated = LastUpdated;
    }
    public String getSeverityOverride() {
        return this.SeverityOverride;
    }
    public void setSeverityOverride(String SeverityOverride) {
        this.SeverityOverride = SeverityOverride;
    }
    public String getPlanned() {
        return this.Planned;
    }
    public void setPlanned(String Planned) {
        this.Planned = Planned;
    }
    public String getRoadClass() {
        return this.RoadClass;
    }
    public void setRoadClass(String RoadClass) {
        this.RoadClass = RoadClass;
    }
    public String getLongitude() {
        return this.Longitude;
    }
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }
    public String getLatitude() {
        return this.Latitude;
    }
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }
    public String getDistrict() {
        return this.District;
    }
    public void setDistrict(String District) {
        this.District = District;
    }
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getRoad() {
        return this.Road;
    }
    public void setRoad(String Road) {
        this.Road = Road;
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    @Generated(hash = 1950041070)
    public Closure(String Id, String Road, String Name, String District,
            String Latitude, String Longitude, String RoadClass, String Planned,
            String SeverityOverride, String LastUpdated, String StartTime,
            String EndTime, String WorkPeriod, String Expired,
            String WorkEventType, String Contractor, String Description) {
        this.Id = Id;
        this.Road = Road;
        this.Name = Name;
        this.District = District;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.RoadClass = RoadClass;
        this.Planned = Planned;
        this.SeverityOverride = SeverityOverride;
        this.LastUpdated = LastUpdated;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.WorkPeriod = WorkPeriod;
        this.Expired = Expired;
        this.WorkEventType = WorkEventType;
        this.Contractor = Contractor;
        this.Description = Description;
    }
    @Generated(hash = 255753717)
    public Closure() {
    }
}
