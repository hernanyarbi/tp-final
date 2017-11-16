package fi.unju.edu.ar.tpfinal.Presenters;

import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListPresenter;
import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListView;
import fi.unju.edu.ar.tpfinal.Models.ShoppingListModel;
import fi.unju.edu.ar.tpfinal.Views.ShoppingList;

/**
 * Created by Hernan Yarbi on 15/11/2017.
 */

public class ShoppingListPresenterImpl implements ShoppingListPresenter {

    private ShoppingListView shoppingListView;

    public ShoppingListPresenterImpl(ShoppingListView shoppingListView) {
        this.shoppingListView = shoppingListView;
    }

    @Override
    public void setErrorName() {
        if(shoppingListView != null){
            shoppingListView.setErrorName();
        }
    }

    @Override
    public void setErrorDescription() {
        if(shoppingListView != null){
            shoppingListView.setErrorDescription();
        }
    }

    @Override
    public void navigateMenu() {
        if(shoppingListView != null){
            shoppingListView.navigateMenu();
        }
    }

    @Override
    public void addList(ShoppingListModel shoppingListModel, ShoppingList shoppingList) {

    }

}
