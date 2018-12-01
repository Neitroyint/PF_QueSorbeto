package classes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Productos.db";

    public static final String TABLE_CLIENT = "cliente_table";
    public static final String CLI_ID = "cli_id";
    public static final String CLI_NOMBRE = "cli_nombre";
    public static final String CLI_TELEFONO = "cli_telefono";

    public static final String TABLE_NAMEPROD = "producto_table";
    public static final String PRO_ID = "prod_id";
    public static final String PRO_NOMBRE = "prod_nombre";
    public static final String PRO_PRECIOVENTA = "prod_precioventa";

    public static final String TABLE_NAMEFACT = "factura_table";
    public static final String FAC_NUMERO = "fact_numero";
    public static final String FAC_CLIENTE = "fact_cliente";
    public static final String FAC_PRODUCTO = "fact_producto";
    public static final String FAC_CANTIDAD = "fact_cantidad";
    public static final String FAC_FECHA = "fact_fecha";


    public DataBase(Context context) {

        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase  db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table " + TABLE_CLIENT + "(CLI_ID INTEGER PRIMARY KEY AUTOINCREMENT, CLI_NOMBRE TEXT, CLI_TELEFONO INTEGER )");
        db.execSQL(" create table " + TABLE_NAMEPROD + "(PRO_ID INTEGER PRIMARY KEY, PRO_NOMBRE TEXT, PRO_PRECIOVENTA INTEGER )");
        db.execSQL(" create table " + TABLE_NAMEFACT + "(FAC_NUMERO INTEGER PRIMARY KEY AUTOINCREMENT, FAC_CLIENTE TEXT, FAC_PRODUCTO TEXT, FAC_CANTIDAD INTEGER, FAC_FECHA DATE )");
      }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLIENT + TABLE_NAMEFACT + TABLE_NAMEPROD);
        onCreate(db);
    }
}
