package first.javapoint.com.implicitintentapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondAct extends Activity {

    public void onCreate(Bundle bundle) {


        super.onCreate(bundle);
        setContentView(R.layout.layouttwo);
        Bundle extras  = getIntent().getExtras();
        String value = extras.getString("name");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value, Toast.LENGTH_LONG).show();
    }

}
