package com.example.admin.staggeredrecyclerviewexample;

/**
 * Created by Admin on 4/5/2017.
 */

public class Beaches {
    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int imgid;

    public Beaches(int imgid, String name) {
        this.imgid = imgid;
        this.name = name;
    }

    public String name;

}
