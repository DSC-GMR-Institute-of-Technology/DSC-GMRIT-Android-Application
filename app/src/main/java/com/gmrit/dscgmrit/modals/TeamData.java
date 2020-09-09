package com.gmrit.dscgmrit.modals;

public class TeamData {
    private String teamName;
    private String roleName;
    private String yearDept;
    private String Interests;
    private String emailID;
    private int teamPhoto;

    public TeamData() {

    }

    public TeamData(String teamName, String roleName, String yearDept, String interests, String emailID, int teamPhoto) {
        this.teamName = teamName;
        this.roleName = roleName;
        this.yearDept = yearDept;
        Interests = interests;
        this.emailID = emailID;
        this.teamPhoto = teamPhoto;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getYearDept() {
        return yearDept;
    }

    public void setYearDept(String yearDept) {
        this.yearDept = yearDept;
    }

    public String getInterests() {
        return Interests;
    }

    public void setInterests(String interests) {
        Interests = interests;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getTeamPhoto() {
        return teamPhoto;
    }

    public void setTeamPhoto(int teamPhoto) {
        this.teamPhoto = teamPhoto;
    }
}
