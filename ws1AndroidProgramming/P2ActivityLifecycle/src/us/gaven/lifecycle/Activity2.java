package us.gaven.lifecycle;



import us.gaven.lifecycle.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class Activity2 extends Activity 
{
	private static final  String TAG = "activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d (TAG, "enter onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d (TAG, "leave onCreate");
    }
    public void btnCloseListener(View v) {
    	Log.d (TAG, "entered onClick, closing Activity 2");
    	// read string typed into edit box ( id = 'userName' )
        finish();
    	Log.d (TAG, "leave onClick");
    }
    
    protected void onStart(){
    	Log.d (TAG, "enter onStart");
    	super.onStart();
    	Log.d (TAG, "leave onStart");
    }
    
    protected void onRestart() {
    	Log.d (TAG, "enter onRestart");
    	super.onRestart();
    	Log.d (TAG, "leave onRestart");  	
    }  
    protected void onResume() {
    	Log.d (TAG, "enter onResume");
    	super.onResume();
    	Log.d (TAG, "leave onResume");   	
    }
    protected void onPause() {
    	Log.d (TAG, "enter onPause");
    	super.onPause();
    	Log.d (TAG, "leave onPause");   	
    }
    protected void onStop() {
    	Log.d (TAG, "enter onStop");
    	super.onStop();
    	Log.d (TAG, "leave onStop");
    }  
    protected void onDestroy() {
    	Log.d (TAG, "enter onDestroy");
    	super.onDestroy();
    	Log.d (TAG, "leave onDestroy");
    }
    
}
