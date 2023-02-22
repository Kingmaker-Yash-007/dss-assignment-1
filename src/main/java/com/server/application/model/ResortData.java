package com.server.application.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Resorts")
public class ResortData {
    @Field("_id")
    private ObjectId id;
    @Field("Resort_id")
    private int resortID;
    @Field("skierID")
    private int skierID;
    @Field("liftID")
    private int liftID;
    @Field("seasonID")
    private int seasonID;
    @Field("dayID")
    private int dayID;
    @Field("time")
    private int time;
    @Field("ResortName")
    private String resortName;
    @Field("totalVert")
    private int totalVert;
    @Field("numSkier")
    private int numSkier;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getResortID() {
        return resortID;
    }

    public void setResortID(int resortID) {
        this.resortID = resortID;
    }

    public int getSkierID() {
        return skierID;
    }

    public void setSkierID(int skierID) {
        this.skierID = skierID;
    }

    public int getLiftID() {
        return liftID;
    }

    public void setLiftID(int liftID) {
        this.liftID = liftID;
    }

    public int getSeasonID() {
        return seasonID;
    }

    public void setSeasonID(int seasonID) {
        this.seasonID = seasonID;
    }

    public int getDayID() {
        return dayID;
    }

    public void setDayID(int dayID) {
        this.dayID = dayID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public int getTotalVert() {
        return totalVert;
    }

    public void setTotalVert(int totalVert) {
        this.totalVert = totalVert;
    }

    public int getNumSkier() {
        return numSkier;
    }

    public void setNumSkier(int numSkier) {
        this.numSkier = numSkier;
    }
}
