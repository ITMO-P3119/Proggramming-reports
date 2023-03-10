package com.itmo.Neznaika;

import java.util.Objects;

public class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getName(){
        return this.name;
    };

    public String exposition(desc how){
     return this.name + how.getContent();
    }

    public String preexposition(desc how){
     return how.getContent() + this.name;
    }

    public String close(){
     return this.name + " закрылся";
    }

    public String isOpen(String what){
        return this.name +" открылась " + what;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (!this.getClass().equals(otherObj.getClass())) return false;
        Place other = (Place) otherObj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + this.name + "]";
    }
}