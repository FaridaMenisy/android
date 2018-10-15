package first.javapoint.com.sharedpreferencesapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static final String Extra_msg ="";
    private EditText emailView;
    private EditText pw;
    private Button submit;
    private CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailView  = (EditText)findViewById(R.id.editText);
        pw = (EditText) findViewById(R.id.editText2);
        chk = (CheckBox) findViewById(R.id.checkBox);
        submit = (Button)findViewById(R.id.button);

       pw.setOnEditorActionListener(new TextView.OnEditorActionListener(){


            @Override
            //Android allows you to specify an action to be made when users have completed their input.
            //You can specify the action by setting theandroid:imeOptions attribute.
            public boolean onEditorAction(TextView textView, int actionid, KeyEvent keyEvent) {

                if(actionid == R.id.login  || actionid == EditorInfo.IME_NULL){
                    //call thelogin function
                    attemptlogin();
                    return true;
                }
                return false;
            }
        });


     submit.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
         attemptlogin();
         }
     });



    }

    private void attemptlogin(){


        String email = emailView.getText().toString();
        String passwrod  = pw.getText().toString();


        if (chk.isChecked()){
        saveLoginDetails(email, passwrod);
            SharedPreferences sp = getSharedPreferences("loginDetails", Context.MODE_PRIVATE);
       String p = sp.getString("Email", "");

            Intent intent = new Intent(this,  Home_activity.class);
            intent.putExtra(Extra_msg , p);
            startActivity(intent);
            // Toast.makeText(getApplicationContext(),p,Toast.LENGTH_SHORT).show();


        }
    }


    public void saveLoginDetails( String email, String pw){

        SharedPreferences sp = getSharedPreferences("loginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor  editor = sp.edit();
        editor.putString("Email", email);
        editor.putString("pw", pw);
        String  x =  sp.getString("Email", "");

        editor.commit();



    }




    /*public String getEmail() {
        SharedPreferences sharedPreferences = getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("pw", "");
        return s;

    }*/

   /* public boolean isUserLogedOut() {
        SharedPreferences sharedPreferences = getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean isEmailEmpty = sharedPreferences.getString("Email", "").isEmpty();
        boolean isPasswordEmpty = sharedPreferences.getString("Password", "").isEmpty();
        return isEmailEmpty || isPasswordEmpty;
    }*/



}
