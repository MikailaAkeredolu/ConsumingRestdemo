package com.example;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Created by mikailaakeredolu on 6/6/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true) //from the Jackson JSON processing library to indicate that any properties not bound in this type should be ignored.

public class Quote {

   private String type;
    private Value value;

    public Quote(){

    }

    public String getType(){
        return  type;

    }

    public void setType(String type){
        this.type = type;

    }


    public Value getValue(){
        return value;
    }

    public void setValue(Value value){
        this.value = value;

    }

    @Override
    public  String toString(){
        return  "Quote{" +
                "type='" + type + '\'' +
                ",value=" + value +
                '}';
    }



}
