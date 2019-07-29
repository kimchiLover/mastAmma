package com.amma;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class UserDetails {

    //@Id
    private int uid;
    private String uname;
    private String pswd;

    public UserDetails(){

    }

    public UserDetails(String uname, String pswd) {
        this.uname = uname;
        this.pswd = pswd;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        if((this.uname.equals(((UserDetails) obj).uname)) && this.pswd.equals(((UserDetails) obj).getPswd()))
        return true;

        return false;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPswd() {
        return pswd;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}