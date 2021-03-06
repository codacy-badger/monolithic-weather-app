package org.fifiz.training.java.monolithic_weather_app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class WeatherBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codePostal;

    public String goToResult(){
        return "welcome";
    }
    
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
