package com.itmo.Neznaika;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String secondName;

    protected Person() { }

    public void setName(String name){
        this.name = name;
    }
    public void setSecondName(String name){
        this.secondName = name;
    }

    public String getName(){
        return this.name;
    }

    public String getSecondName(){
        return this.secondName;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (!this.getClass().equals(otherObj.getClass())) return false;
        Person other = (Person) otherObj;
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
    //output: com.itmo.Neznaika.Human[name=Незнайка]
}