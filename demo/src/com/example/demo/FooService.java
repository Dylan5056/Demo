package com.example.demo;

import android.R.integer;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class FooService extends Service {
	public IBinder onBind(Intent intent){return null;}
    public void onCreat(){
    	super.onCreate();
    
    Log.i(this.getPackageName(),"��������");
    }
    public void onStart(Intent intent,int startId){
    	super.onStart(intent,startId);
    	Log.i(this.getPackageName(),"����������");
    }
    public void onDestroy(){
    	super.onDestroy();
    	Log.w(this.getPackageName(),"���ٷ���");
    }
};
