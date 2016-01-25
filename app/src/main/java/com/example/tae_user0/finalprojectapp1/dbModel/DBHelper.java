package com.example.tae_user0.finalprojectapp1.dbModel;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.tae_user0.finalprojectapp1.R;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by TAE_user0 on 21/01/2016.
 */


public class DBHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "androcode_ormlite.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<User, Integer> userDao;
    private Dao<Favourites, Integer> favDao;

    public DBHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        //db creation
        try {
            TableUtils.createTable(connectionSource, User.class);
            TableUtils.createTable(connectionSource, Favourites.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        onCreate(db, connectionSource);
        //db code to upgrade de db from one version to another
    }

    public Dao<User, Integer> getUserDao() throws SQLException {
        if (userDao == null) {
            userDao = getDao(User.class);
        }
        return userDao;
    }

    public Dao<Favourites, Integer> getDaoFav() throws SQLException {
        if (this.favDao == null) {
            favDao = getDao(Favourites.class);
        }
        return favDao;
    }

    @Override
    public void close() {
        //free up the resources
        super.close();
        userDao = null;
        favDao = null;
    }

}
