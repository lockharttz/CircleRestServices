/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oom
 */
@XmlRootElement
public class Result {
    
    private double areacircle;
    
    public double getAreacircle() {
        return areacircle;
    }
    @XmlElement
    public void setAreacircle(double areacircle) {
        this.areacircle = areacircle;
    }
    
    private double circum;
    
    public double getCircumference() {
        return circum;
    }
    @XmlElement
    public void setCircumference(double circum) {
        this.circum = circum;
    }

}