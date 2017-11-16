package fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList;

import fi.unju.edu.ar.tpfinal.Models.ShoppingListModel;
import fi.unju.edu.ar.tpfinal.Views.ShoppingList;

/**
 * Created by Hernan Yarbi on 15/11/2017.
 */

public interface ShoppingListInteractor {

    void addList(ShoppingListPresenter shoppingListPresenter, ShoppingList shoppingList,
                 ShoppingListModel shoppingListModel);

}
