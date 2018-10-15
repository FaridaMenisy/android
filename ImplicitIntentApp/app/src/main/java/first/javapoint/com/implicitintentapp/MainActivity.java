package first.javapoint.com.implicitintentapp;

        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends Activity {

    Button button;
    Button VisitButton;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.relative_layout);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        VisitButton = (Button)findViewById(R.id.button2);



      //  addOnClickListener();
    }
    public void addOnClickListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                //actionview da actions btb2a already defined fl anroid
                //zy mslan eft7ly camera
                //eft7ly tab gdda and so on
                //uri.parse bb3tlaha l data bt3ty
                //
                //9
                //down vote
                //accepted
                //A Uri object is usually used to tell a ContentProvider what we want to access by reference.
                // It is an immutable one-to-one mapping to a resource or data.
                // The method Uri.parse creates a new Uri object from a properly formated String
                //contentProvider : can help an application manage access to data stored by itself, stored by other apps,
                // and provide a way to share data with other apps
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(url));
                startActivity(intent);

                VisitButton.setOnClickListener(new View.OnClickListener(){


                    @Override
                    public void onClick(View view) {

                        String texts = editText.getText().toString();
                        Intent intent1  = new Intent(getApplicationContext(), SecondAct.class);
                        intent1.putExtra("url", texts);
                        startActivity(intent1);


                    }
                });
            }
        });

    }
}
