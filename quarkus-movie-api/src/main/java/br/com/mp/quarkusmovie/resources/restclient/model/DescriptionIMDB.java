
package br.com.mp.quarkusmovie.resources.restclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;

public class DescriptionIMDB {

    private ImageIMDB imageIMDB;

    private String idImdb;

    private String longName;

    private String qualifier;

    private Long rank;

    private String staff;

    private Long year;

    public ImageIMDB getImage() {
        return imageIMDB;
    }

    @JsonbProperty("i")
    public void setImage(ImageIMDB imageIMDB) {
        this.imageIMDB = imageIMDB;
    }

    public String getIdImdb() {
        return idImdb;
    }

    @JsonbProperty("id")
    public void setIdImdb(String idImdb) {
        this.idImdb = idImdb;
    }

    public String getLongName() {
        return longName;
    }

    @JsonbProperty("l")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getQualifier() {
        return qualifier;
    }

    @JsonbProperty("q")
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getStaff() {
        return staff;
    }

    @JsonbProperty("s")
    public void setStaff(String staff) {
        this.staff = staff;
    }

    public Long getYear() {
        return year;
    }

    @JsonbProperty("y")
    public void setYear(Long year) {
        this.year = year;
    }
}