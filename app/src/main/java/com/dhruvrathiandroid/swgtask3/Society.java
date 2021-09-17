package com.dhruvrathiandroid.swgtask3;

public class Society {
    private String socId;
    private String socName;
    private String socDesc;

    public Society(String socId, String socName, String socDesc){
        this.socId = socId;
        this.socName = socName;
        this.socDesc = socDesc;
    }

    public String getSocId() {
        return socId;
    }
    public void setSocId(String socId) {
        this.socId = socId;
    }
    public String getSocName() {
        return socName;
    }
    public void setSocName(String socName) {
        this.socName = socName;
    }
    public String getSocDesc(){ return socDesc;}
    public void setSocDesc(String socDesc) {
        this.socDesc = socDesc;
    }
    public Society(){

    }
}
