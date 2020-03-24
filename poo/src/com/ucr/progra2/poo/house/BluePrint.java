package com.ucr.progra2.poo.house;

import java.io.Serializable;
import java.security.InvalidParameterException;

/**
 * plano de la casa
 */
public class BluePrint implements Serializable {

    private String color;
    private Integer[] dimension;
    private String pipeType;
    private Boolean completed;

    public BluePrint() {
    }

    public BluePrint(String color, Integer[] dimension, String pipeType) {
        this.color = color;
        this.dimension = dimension;
        this.pipeType = pipeType;
    }

    public String getColor() {
        if(color==null){
            throw new  InvalidParameterException("No hay color de momento");
        }
        return color;
    }

    public void setColor(String colorParam) {
        if(completed) {
            this.color = colorParam;
        }else{
            throw new  InvalidParameterException("No se puede pintar sin terminar");
        }
    }

    public String getPipeType() {
        return pipeType;
    }

    public Integer[] getDimension() {
        return dimension;
    }

    public void setDimension(Integer[] dimension) {
        this.dimension = dimension;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
