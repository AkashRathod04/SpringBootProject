package com.crudapp.SpringWebCrudApp.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {


    @Id
    private long eid;

    private String ename;

    private String username;

    private String password;


    public long getEid () {
        return eid;
    }

    public void setEid ( long eid ) {
        this.eid = eid;
    }

    public String getEname () {
        return ename;
    }

    public void setEname ( String ename ) {
        this.ename = ename;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }
}
