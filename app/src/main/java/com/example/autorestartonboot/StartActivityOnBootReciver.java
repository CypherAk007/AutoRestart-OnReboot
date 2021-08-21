package com.example.autorestartonboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;



public class StartActivityOnBootReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent i = new Intent(context,MainActivity.class);
            //To start the activity outside the class and to avoid crashes at api levels.
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //starts the main activity on boot
            context.startActivity(i);
        }


    }
}
