package first.javapoint.com.buttonintentapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
  private  Button sumbutton;
  private EditText editText1;
  private  EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addOnClickListener();
    }

    @SuppressLint("WrongViewCast")
    public void addOnClickListener (){

     editText1 =  (EditText) findViewById(R.id.textView);
     editText2 = (EditText) findViewById(R.id.textView2);
     sumbutton = (Button) findViewById(R.id.button);

     sumbutton.setOnClickListener(new View.OnClickListener(){


         @Override
         public void onClick(View view) {

             String num=editText1.getText().toString();
             String num2= editText2.getText().toString();
             int a =Integer.parseInt(num);
             int b =Integer.parseInt(num2);

             int sum = a+b;
             //Andorid Toast can be used to display information for the short period of time.
             //A toast contains message to be displayed quickly and disappears after sometime.
             // After sometime it disappears. It doesn't block the user interaction.
             //toast.length_long displays notifications for long period of time
             Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
         }
     });

    }
}
