package com.example.circkett20live.liveScore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("odi")
    @Expose
    private int odi;
    @SerializedName("t20")
    @Expose
    private int t20;
    @SerializedName("test")
    @Expose
    private int test;
    @SerializedName("squads")
    @Expose
    private int squads;
    @SerializedName("matches")
    @Expose
    private int matches;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getOdi() {
        return odi;
    }

    public void setOdi(int odi) {
        this.odi = odi;
    }

    public int getT20() {
        return t20;
    }

    public void setT20(int t20) {
        this.t20 = t20;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getSquads() {
        return squads;
    }

    public void setSquads(int squads) {
        this.squads = squads;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

}
