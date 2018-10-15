package first.javapoint.com.sharedpreferencesapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home_activity extends Activity {


    protected void onCreate(Bundle savedInstanceState ){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Intent intent = getIntent();
        String m = intent.getStringExtra(MainActivity.Extra_msg);

        TextView textview = findViewById(R.id.textView);
        textview.setText(m);

    }
}
