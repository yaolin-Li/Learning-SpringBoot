package com.lyl.pojo;

public class Users {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Users(Integer userid, String username, Integer userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }

    public Users() {
    }
}
