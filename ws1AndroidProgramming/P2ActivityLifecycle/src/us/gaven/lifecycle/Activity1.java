package us.gaven.lifecycle;



import us.gaven.lifecycle.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Activity1 extends Activity 
{
	private static final  String TAG = "activity1";
    EditText editBox;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d (TAG, "enter onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        editBox = (EditText) findViewById(R.id.userName); // note R.id.*, not R.string.* here
        Log.d (TAG, "leave onCreate");
    }
    public void btnGoListener(View v) {
    	Log.d (TAG, "entered onClick, starting Activity 2");
    	// read string typed into edit box ( id = 'userName' )
    	
    	String data = editBox.getText().toString();  	
    	Log.d( TAG, "user entered:[" + data + "]" );
    	String message = getResources().getString(R.string.btnGoMessage);  // pull from strings.xml
    	
    	startActivity(new Intent(getApplication(), Activity2.class));
    	
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
