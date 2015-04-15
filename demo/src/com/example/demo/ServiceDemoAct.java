package com.example.demo;
import android.util.Log;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ServiceDemoAct extends Activity implements  android.view.View.OnClickListener{
	private Intent mIntent=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnStart=(Button)findViewById(R.id.button1);
		Button btnStop=(Button)findViewById(R.id.button2);
		btnStart.setOnClickListener(this);
		btnStop.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:{doStart();break;}
		case R.id.button2:{doStop();break;}
		}
		}
		
	
private void doStart(){
	this.mIntent=new Intent(this,FooService.class);
	this.startService(this.mIntent);
	
}
private void doStop(){
	if(this.mIntent!=null){this.stopService(this.mIntent);}
}
};
