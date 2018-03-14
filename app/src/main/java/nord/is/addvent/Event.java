package nord.is.addvent;

import java.util.Date;

/**
 * Created by Ólafur Georg Gylfason (ogg4@hi.is) on 13.3.2018.
 *
 * The model class for events.
 */
public class Event {

    private String mId;
    private String mTitle;
    private String mLocation;
    private String mHost;
    private String mDescription;
    private Date mDate;
    private Boolean mIsNordEvent;

    public Event() {
        mDate = new Date();
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getHost() {
        return mHost;
    }

    public void setHost(String host) {
        mHost = host;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean getNordEvent() {
        return mIsNordEvent;
    }

    public void setNordEvent(Boolean nordEvent) {
        mIsNordEvent = nordEvent;
    }
}
