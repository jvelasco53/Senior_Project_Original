package com.example.myapplication.Helpers;

public class Compile {
    private int branching = 0;
    private int looping = 0;
    private int operations = 0;

    public int getBranching(){
        return branching;
    }

    public void setBranching(int branching) {
        this.branching = branching;
    }

    public int getLooping() {
        return looping;
    }

    public void setLooping(int looping) {
        this.looping = looping;
    }

    public int getOperations() {
        return operations;
    }

    public void setOperations(int operations) {
        this.operations = operations;
    }
}
