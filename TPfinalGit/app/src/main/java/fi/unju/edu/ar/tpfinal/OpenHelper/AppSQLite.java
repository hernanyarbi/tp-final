package fi.unju.edu.ar.tpfinal.OpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HSoft on 1/11/2017.
 */

public class AppSQLite extends SQLiteOpenHelper {



    public AppSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQLiteUtils.USER_TABLE);
        db.execSQL(SQLiteUtils.PRODUCTS_TABLE);
        db.execSQL(SQLiteUtils.CATEGORIES_TABLE);
        db.execSQL(SQLiteUtils.LIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion > oldVersion){
            db.execSQL("DROP TABLE IF EXISTS users");
            db.execSQL("DROP TABLE IF EXISTS products");
            db.execSQL("DROP TABLE IF EXISTS categories");
            db.execSQL("DROP TABLE IF EXISTS list");
            onCreate(db);
        }
    }
}
