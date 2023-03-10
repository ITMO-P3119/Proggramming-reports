package com.itmo.Neznaika;

public class Human extends Person{

	public Human(String name) {
        super();
        this.setName(name);
    }

   public String search(String what){
   	return this.getName() + " обследовали " + what;
   }

   public String walk(){
    return " прошлись по нему ";
   }

   public String stop(String what){
       return this.getName() + " остановился " + what;
   }

   public String getIn(String what){
    return this.getName() + " вошли " + what;
   }


    public String rich(){
     return this.getName() + " разбогател ";
    }

    public String travel(){
     return " уехал путешествовать";
    }

   public String exposition(desc how){
   	return this.getName() + how.getContent();
   }

   public String preexposition(desc how){
   	return how.getContent() + this.getSecondName();
   }
}