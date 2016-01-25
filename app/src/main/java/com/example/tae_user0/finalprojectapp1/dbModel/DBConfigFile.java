package com.example.tae_user0.finalprojectapp1.dbModel;

import java.io.File;

import static com.j256.ormlite.android.apptools.OrmLiteConfigUtil.writeConfigFile;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
public class DBConfigFile {
    private static final Class<?>[] CLASSES = new Class[] {
            User.class,
            Favourites.class,
    };
    public static void main(String[] args) throws Exception {
        writeConfigFile(new File("app/src/main/res/raw/ormlite_config.txt"), CLASSES);
    }
}
