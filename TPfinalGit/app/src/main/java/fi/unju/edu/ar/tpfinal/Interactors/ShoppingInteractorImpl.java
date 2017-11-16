package fi.unju.edu.ar.tpfinal.Interactors;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListInteractor;
import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListPresenter;
import fi.unju.edu.ar.tpfinal.Models.ShoppingListModel;
import fi.unju.edu.ar.tpfinal.OpenHelper.AppSQLite;
import fi.unju.edu.ar.tpfinal.OpenHelper.SQLiteUtils;
import fi.unju.edu.ar.tpfinal.Views.ShoppingList;

/**
 * Created by Hernan Yarbi on 15/11/2017.
 */

public class ShoppingInteractorImpl implements ShoppingListInteractor {
    @Override
    public void addList(ShoppingListPresenter shoppingListPresenter, ShoppingList shoppingList, ShoppingListModel shoppingListModel) {

        AppSQLite conexion = new AppSQLite(shoppingList, SQLiteUtils.DB,null,1);
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues values = new ContentValues();

        if(!shoppingListModel.getName().isEmpty() && !shoppingListModel.getDescription().isEmpty()){
            values.put(SQLiteUtils.NAME_LIST, shoppingListModel.getName());
            values.put(SQLiteUtils.DESCRIPTION, shoppingListModel.getDescription());

            try {
                Long response = db.insert("list",SQLiteUtils.ID_LIST,values);
                Toast.makeText(shoppingList.getApplicationContext(), "Usuario agregado correctamente",Toast
                        .LENGTH_LONG).show();
                db.close();
                shoppingListPresenter.navigateMenu();
            }catch (Exception e){

            }
        }else{
            if(shoppingListModel.getName().isEmpty()){
                shoppingListPresenter.setErrorName();
            }
            if(shoppingListModel.getDescription().isEmpty()){
                shoppingListPresenter.setErrorDescription();
            }
        }

    }
}
