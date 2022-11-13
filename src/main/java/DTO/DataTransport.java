/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
import java.io.Serializable;

public class DataTransport implements Serializable {
    private String f = "";
    private String d = "";

    public DataTransport() {
    }
    public DataTransport( String function, String data) {
        this.f = function;
        this.d = data;
    }

    public String getFunction() {
        return f;
    }

    public void setFunction(String function) {
        this.f = function;
    }

    public String getData() {
        return d;
    }

    public void setData(String data) {
        this.d = data;
    }

}
