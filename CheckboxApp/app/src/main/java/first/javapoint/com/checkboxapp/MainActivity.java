package first.javapoint.com.checkboxapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

    CheckBox pizza,coffe,burger;
    Button ButtonOrder ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){

        pizza = (CheckBox) findViewById(R.id.checkBox);
        coffe = (CheckBox) findViewById(R.id.checkBox2);
        burger = (CheckBox) findViewById(R.id.checkBox3);
        ButtonOrder =(Button) findViewById(R.id.button2);

        ButtonOrder.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                  //We can directly pass String class object to StringBuffer and
                // StringBuilder class constructors. As String class is immutable in java,
                // so for editing a string, we can perform same by converting it
                // to StringBuffer or StringBuilder class objects.
                int totalAmount = 0;
                StringBuilder  result  = new StringBuilder();
                result.append("selecteditems:");
                if(pizza.isChecked()){
                    result.append("\n pizza");
                    totalAmount+=100;
                }
                if(coffe.isChecked()){
                    result.append("coffee");
                    totalAmount+=50;
                }
                if(burger.isChecked()){
                    result.append("burger");
                    totalAmount+=120;
                }

                result.append("\nTotal: "+totalAmount+"Rs");
                if(result!= null && !result.toString().equals("")){
                Toast.makeText(getApplicationContext(),  result.toString() ,Toast.LENGTH_LONG).show();}

                else{

                    Toast.makeText(getApplicationContext(),  "Nothing selected" ,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
