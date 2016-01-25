package com.example.tae_user0.finalprojectapp1.dbModel;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
@DatabaseTable
public class Favourites {

        public static final String ID = "id";
        public static final String RESTNAME = "restName";
        public static final String STREET = "street";

        @DatabaseField(generatedId = true, columnName = ID)
        private int id;
        @DatabaseField(columnName = RESTNAME)
        private String restName;
        @DatabaseField(columnName = STREET)
        private String street;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRestName() {
            return this.restName;
        }

        public void setRestName(String name) {
            this.restName = name;
        }

        public String getStreet() {
            return this.street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
}
