package com.example.piyush.firebasenotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String token=FirebaseInstanceId.getInstance().getToken();
        Log.d("TOKEN",token);
    }
}
