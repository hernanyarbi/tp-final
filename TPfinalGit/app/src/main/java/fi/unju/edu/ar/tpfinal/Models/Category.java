package fi.unju.edu.ar.tpfinal.Models;

import java.io.Serializable;

/**
 * Created by HSoft on 6/11/2017.
 */

public class Category implements Serializable {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
