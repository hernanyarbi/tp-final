package fi.unju.edu.ar.tpfinal.Models;

/**
 * Created by Hernan Yarbi on 15/11/2017.
 */

public class ShoppingListModel {

    private Integer id;
    private String name;
    private String description;

    public ShoppingListModel() {
    }

    public ShoppingListModel(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
