package com.minhtv.tour_guide;

public class Spot {

    private String mName;
    private String mDescription;
    private int mImageId;
    private String mTime;
    private String mOwners;
    private String mAddress;

    public Spot(String Name, String Description, int ImageId, String Time, String Address) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;
        mTime = Time;
        mAddress = Address;
    }

    public Spot(String Name, String Description, int ImageId, String Time, String Owners, String Address) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;
        mTime = Time;
        mOwners = Owners;
        mAddress = Address;
    }

    /**
     * Get the string resource ID for the name of the attraction.
     */
    public String getmName() {
        return mName;
    }

    /**
     * Get the string resource ID for the Desciption of the attraction.
     */
    public String getmDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getmImageId() {
        return mImageId;
    }

    /**
     * Return the opening Times for the attraction.
     */
    public String getmTime() {
        return mTime;
    }

    /**
     * Return the Owner Name of the attraction.
     */
    public String getmOwners() {
        return mOwners;
    }

    /**
     * Return the Adress of the attraction.
     */
    public String getmAddress() {
        return mAddress;
    }
}