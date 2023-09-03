package com.example.circkett20live.liveScore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Matchlive {
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("info")
    @Expose
    private Info info;

    public Matchlive(String apikey, List<Datum> data, String status, Info info) {
        this.apikey = apikey;
        this.data = data;
        this.status = status;
        this.info = info;
    }



    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
