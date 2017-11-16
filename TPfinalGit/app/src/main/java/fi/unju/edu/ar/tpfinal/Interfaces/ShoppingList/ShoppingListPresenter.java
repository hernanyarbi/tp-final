package fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList;

import fi.unju.edu.ar.tpfinal.Models.ShoppingListModel;
import fi.unju.edu.ar.tpfinal.Views.ShoppingList;

/**
 * Created by Hernan Yarbi on 15/11/2017.
 */

public interface ShoppingListPresenter {

    void setErrorName();
    void setErrorDescription();
    void navigateMenu();
    void addList(ShoppingListModel shoppingListModel, ShoppingList shoppingList);

}
