package fi.unju.edu.ar.tpfinal.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListPresenter;
import fi.unju.edu.ar.tpfinal.Interfaces.ShoppingList.ShoppingListView;
import fi.unju.edu.ar.tpfinal.Models.ShoppingListModel;
import fi.unju.edu.ar.tpfinal.Presenters.ShoppingListPresenterImpl;
import fi.unju.edu.ar.tpfinal.R;

public class ShoppingList extends AppCompatActivity implements ShoppingListView {

    private EditText name,description;
    private ShoppingListPresenter shoppingListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        name = (EditText) findViewById(R.id.nameList);
        description = (EditText) findViewById(R.id.descripcionList);

        shoppingListPresenter = new ShoppingListPresenterImpl(this);
    }

    @Override
    public void setErrorName() {
        name.setError("Campo obligatorio");
    }

    @Override
    public void setErrorDescription() {
        description.setError("Campo obligatorio");
    }

    @Override
    public void navigateMenu() {
        startActivity(new Intent(this, MenuPrincipal.class));
    }

    public void addList(View v){
        ShoppingListModel shoppingListModel = new ShoppingListModel();
        shoppingListModel.setName(name.getText().toString());
        shoppingListModel.setDescription(description.getText().toString());

        shoppingListPresenter.addList(shoppingListModel,this);

    }


}
