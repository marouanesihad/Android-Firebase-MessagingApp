package com.example.toshiba.firebasemessagingapp.firebase;

/**
 * Created by toshiba on 14/01/2017.
 */

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Registration du token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Afficher le token ds le logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }

    private void sendRegistrationToServer(String token) {

    }
}