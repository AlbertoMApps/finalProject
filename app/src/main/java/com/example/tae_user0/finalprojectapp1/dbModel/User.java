package com.example.tae_user0.finalprojectapp1.dbModel;

import android.os.Parcel;
import android.os.Parcelable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
@DatabaseTable
public class User implements Parcelable{

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String EMAIL = "email";
       public static final String FAV = "fav";

        @DatabaseField(generatedId = true, columnName = ID)
        private int id;
        @DatabaseField(columnName = NAME)
        private String name;
        @DatabaseField(columnName = EMAIL)
        private String email;
        @DatabaseField(foreign = true, columnName = FAV)
        private Favourites fav;

    public User(Parcel in) {
        id = in.readInt();
        name = in.readString();
        email = in.readString();
    }
    public User() {

    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };



    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Favourites getFavourites() {
            return fav;
        }

        public void setFavourites(Favourites  fav) {
            this.fav = fav;
        }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(email);
    }
}
