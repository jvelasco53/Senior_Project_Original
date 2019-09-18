package com.example.myapplication.Activities;

public class Member {


    private String user;
    private Integer Type;
    private Integer Relational;
    private Integer Logical;
    private Integer Branching;
    private Integer Loops;
    private Integer Array;
    private Integer Print;

    public Member() {

    }
    public Integer getPrint() {
        return Print;
    }

    public void setPrint(Integer print) {
        Print = print;
    }
    public Integer getRelational() {
        return Relational;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRelational(Integer relational) {
        Relational = relational;
    }

    public Integer getLogical() {
        return Logical;
    }

    public void setLogical(Integer logical) {
        Logical = logical;
    }

    public Integer getBranching() {
        return Branching;
    }

    public void setBranching(Integer branching) {
        Branching = branching;
    }

    public Integer getLoops() {
        return Loops;
    }

    public void setLoops(Integer loops) {
        Loops = loops;
    }

    public Integer getArray() {
        return Array;
    }

    public void setArray(Integer array) {
        Array = array;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }
}
