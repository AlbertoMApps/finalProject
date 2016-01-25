package com.example.tae_user0.finalprojectapp1.Service;

import android.app.IntentService;
import android.content.Intent;

import com.example.tae_user0.finalprojectapp1.dbModel.MyOpenHelperManager;
import com.example.tae_user0.finalprojectapp1.dbModel.User;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
public class SaveDataService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public SaveDataService() {
        super("SaveDataService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        User user = intent.getParcelableExtra("user");
        MyOpenHelperManager mou = new MyOpenHelperManager(getApplicationContext());
        mou.saveUser(user);
        mou.getUser();
        //mou.deleteUser(user);
    }
}
