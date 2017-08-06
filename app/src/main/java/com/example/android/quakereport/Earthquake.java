package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by thodzic on 6/15/17.
 */

public class Earthquake {

    //Magnitude of Earthquake
    private double mMagnitude;

    //Location of Earthquake
    private String mLocation;

    //Date of Earthquake
    private long mTimeInMiliseconds;

    //Url of the earthquake
    private String mUrl;

    /**
     * Constructs a new {@Link Earthquake} object.
     *  @param magnitude is the magnitude of the quake
     * @param location is the location of the quake
     * @param timeInMIliseconds is the date of the quake
     */

    public Earthquake(double magnitude, String location, long timeInMIliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMIliseconds;
        mUrl = url;
    }

    //Returns magnitude of earthquake
    public double getMagnitude(){
        return mMagnitude;
    }

    //Returns location of earthquake
    public String getLocation(){
        return mLocation;
    }

    //Returns date of earthquake
    public Long getTimeInMiliseconds(){
        return mTimeInMiliseconds;
    }

    //Returns the url
    public String getUrl() {
        return mUrl;
    }

}
