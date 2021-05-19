package com.ayomi.mycity_tourapp;

import android.os.Parcel;
import android.os.Parcelable;

public class DetailedInformation implements Parcelable {

    private String PlaceName;
    private int ImageResourceId;
    private String PhoneNo;
    private String Address;
    private String Description;

    public DetailedInformation(String placeName, int imageResourceId, String phoneNo, String address, String description) {
        PlaceName = placeName;
        ImageResourceId = imageResourceId;
        PhoneNo = phoneNo;
        Address = address;
        Description = description;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public String getDescription() {
        return Description;
    }


    protected DetailedInformation(Parcel in) {
        PlaceName = in.readString();
        ImageResourceId = in.readInt();
        PhoneNo = in.readString();
        Address = in.readString();
        Description = in.readString();
    }

    public static final Creator<DetailedInformation> CREATOR = new Creator<DetailedInformation>() {
        @Override
        public DetailedInformation createFromParcel(Parcel in) {
            return new DetailedInformation(in);
        }

        @Override
        public DetailedInformation[] newArray(int size) {
            return new DetailedInformation[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(PlaceName);
        dest.writeInt(ImageResourceId);
        dest.writeString(PhoneNo);
        dest.writeString(Address);
        dest.writeString(Description);
    }
}
