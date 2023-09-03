package com.example.circkett20live.liveScore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {
    @SerializedName("hitsToday")
    @Expose
    private int hitsToday;
    @SerializedName("hitsUsed")
    @Expose
    private int hitsUsed;
    @SerializedName("hitsLimit")
    @Expose
    private int hitsLimit;
    @SerializedName("credits")
    @Expose
    private int credits;
    @SerializedName("server")
    @Expose
    private int server;
    @SerializedName("offsetRows")
    @Expose
    private int offsetRows;
    @SerializedName("totalRows")
    @Expose
    private int totalRows;
    @SerializedName("queryTime")
    @Expose
    private double queryTime;
    @SerializedName("s")
    @Expose
    private int s;
    @SerializedName("cache")
    @Expose
    private int cache;

    public int getHitsToday() {
        return hitsToday;
    }

    public void setHitsToday(int hitsToday) {
        this.hitsToday = hitsToday;
    }

    public int getHitsUsed() {
        return hitsUsed;
    }

    public void setHitsUsed(int hitsUsed) {
        this.hitsUsed = hitsUsed;
    }

    public int getHitsLimit() {
        return hitsLimit;
    }

    public void setHitsLimit(int hitsLimit) {
        this.hitsLimit = hitsLimit;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getServer() {
        return server;
    }

    public void setServer(int server) {
        this.server = server;
    }

    public int getOffsetRows() {
        return offsetRows;
    }

    public void setOffsetRows(int offsetRows) {
        this.offsetRows = offsetRows;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public double getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(double queryTime) {
        this.queryTime = queryTime;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}
