package us.gaven.simple1;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity 
{
	private static final  String TAG = "mainactivity";
    EditText editBox;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d (TAG, "entered onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBox = (EditText) findViewById(R.id.userName); // note R.id.*, not R.string.* here
    }
    public void btnGoListener(View v) {
    	Log.d (TAG, "entered onClick");
    	// read string typed into edit box ( id = 'userName' )
    	
    	String data = editBox.getText().toString();  	
    	Log.d( TAG, "user entered:[" + data + "]" );
    	String message = getResources().getString(R.string.btnGoMessage);  // pull from strings.xml
    	Toast.makeText(this, message + " " +  data  , Toast.LENGTH_LONG).show();
    	Log.d (TAG, "leave onClick");
    }
}
