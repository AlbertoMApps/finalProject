package com.example.tae_user0.finalprojectapp1.dbModel;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
public class MyOpenHelperManager implements Parcelable{

    private Context context;
    private DBHelper mDBHelper;
    private User  user;
    private Favourites favourites;
    //private ArrayList favList;

    public MyOpenHelperManager(Context context) {
        this.context = context;
    }

    protected MyOpenHelperManager(Parcel in) {
        user = in.readParcelable(User.class.getClassLoader());
    }

    public static final Creator<MyOpenHelperManager> CREATOR = new Creator<MyOpenHelperManager>() {
        @Override
        public MyOpenHelperManager createFromParcel(Parcel in) {
            return new MyOpenHelperManager(in);
        }

        @Override
        public MyOpenHelperManager[] newArray(int size) {
            return new MyOpenHelperManager[size];
        }
    };

    private DBHelper getHelper() {
        if (mDBHelper == null) {
            mDBHelper = OpenHelperManager.getHelper(context, DBHelper.class);
        }
        return mDBHelper;
    }
//first I create an User to save
    public void saveUser(User user){
        try {
            Dao dao = getHelper().getUserDao();
            //User user = new User();
            user.setName(user.getName());
            user.setEmail(user.getEmail());

            dao.create(user);
        } catch (SQLException e) {
            Log.e("TAG", "Error creating an user");
        }
    }
    // getting users
    public List getUsers(){
        try{
            Dao dao = getHelper().getUserDao();
            return dao.queryForAll();
        } catch (SQLException e){
            Log.e("TAG", "Error creating user");
        }
        return null;
    }
// saveFavourites
    public void saveFavourites(String restName,String street){
        try {
            Dao dao = getHelper().getDaoFav();
            favourites = new Favourites();
            favourites.setRestName(restName);
            favourites.setStreet(street);
            dao.create(favourites);
        } catch (SQLException e) {
            Log.e("TAG", "Error saving favourites");
        }

    }
// getting favourites
    public List getFavourites(){
        try{
            Dao dao = getHelper().getDaoFav();
//            Favourites fav;
//            favList = new ArrayList();
//            for( int i =0; i <favList.size() ;i++){
//                //fav = (Favourites) dao.queryForId(i);
//                favList.add(favList);
//            }
            return dao.queryForAll();
        } catch (SQLException e){
            Log.e("TAG", "Error creating favourites");
        }
    return null;
    }
 //get the user for the app
    public void getUser(){
        try {
            Dao dao = getHelper().getUserDao();
            user = (User) dao.queryForId(1);
            if (user == null) {
                Log.d("TAG", "Node with id = 1");
            } else {
                Log.d("TAG", "Get user with id = 1: " + user.getName());
            }
//            List users = dao.queryForEq(User.NAME, "Fede");
//            if (users.isEmpty()) {
//                Log.d("TAG", "We did not find any person called Fede");
//            } else {
//                Log.d("TAG", "Getting users with name = Fede " + users);
//            }
        } catch (SQLException e) {
            Log.e("TAG", "Error creating user");
        }
    }

//    public void simpleQuery (){
//        try {
//            Dao dao = getHelper().getUserDao();
//            QueryBuilder queryBuilder = dao.queryBuilder();
//            queryBuilder.setWhere(queryBuilder.where().eq(User.NAME, "Fede"));
//            List users = dao.query(queryBuilder.prepare());
//            if (users.isEmpty()) {
//                Log.d("TAG", "Names not found  = Fede");
//            } else {
//                Log.d("TAG", "Recovering names = Fede " + users);
//            }
//        } catch (SQLException e) {
//            Log.e("TAG", "Error creando usuario");
//        }
//    }
//update an user
    public void updateUser(String name){
        try {
            Dao dao = getHelper().getUserDao();
            user.setName(name);
            dao.update(user);
            Log.d("TAG", "User modified: " + user.getName());
           // dao.delete(user);
        } catch (SQLException e) {
            Log.e("TAG", "Error creating the user");
        }
    }
    public void deleteUser(User user){
        try{
            Dao dao = getHelper().getUserDao();
            dao.delete(user);
        } catch (SQLException e){
            Log.e("TAG", "Error deleting the user");
        }
    }


   //onDestroy
    protected void onDestroy() {
        //super.onDestroy();
        if (mDBHelper != null) {
            OpenHelperManager.releaseHelper();
            mDBHelper = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(user, flags);
    }
}
