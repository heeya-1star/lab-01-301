package com.example.petshop;
import java.util.Date;
 public abstract class Mood {

     private Date date;

     // Constructors
     public Mood(){
         this.date = new Date();
     }
     public Mood(Date date){
         this.date = date;
     }




     // Getters and setters
     public Date getDate() {
         return date;
     }

     public void setDate(Date date) {
         this.date = date;
     }

     public abstract String name();
}
