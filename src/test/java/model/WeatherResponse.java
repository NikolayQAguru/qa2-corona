package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private  Coord coord;
    @JsonProperty("weather")
    private List<Weather> weathers;
    private String base;
    @JsonProperty("main")
    private List<Main> mains;
    private int visibility;
    @JsonProperty("wind")
    private List<Wind> winds;
    private List<Clouds> clouds;
    private int dt;
    private List<Sys> sys;
    private int id;
    private String name;
    private int cod;

    


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Main> getMains() {
        return mains;
    }

    public void setMains(List<Main> mains) {
        this.mains = mains;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public List<Wind> getWinds() {
        return winds;
    }

    public void setWinds(List<Wind> winds) {
        this.winds = winds;
    }

    public List<Clouds> getClouds() {
        return clouds;
    }

    public void setClouds(List<Clouds> clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public List<Sys> getSys() {
        return sys;
    }

    public void setSys(List<Sys> sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
