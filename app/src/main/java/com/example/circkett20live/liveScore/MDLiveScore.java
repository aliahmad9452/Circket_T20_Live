package com.example.circkett20live.liveScore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MDLiveScore {

    @SerializedName("Datum")
    @Expose
    private Datum datum; // Use lowercase for variable names
    @SerializedName("Info")
    @Expose
    private Info info; // Use lowercase for variable names
    @SerializedName("Matchlive")
    @Expose
    private Matchlive matchlive; // Use lowercase for variable names

    public Datum getDatum() {
        return datum;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Matchlive getMatchlive() {
        return matchlive;
    }

    public void setMatchlive(Matchlive matchlive) {
        this.matchlive = matchlive;
    }
}
