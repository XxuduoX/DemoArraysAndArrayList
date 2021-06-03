package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);

        //continue view the code in the worksheet
        String [] fruit = new String [3];

        fruit[0] = "apple";
        fruit[1] = "banana";
        fruit[2] = "cherry";


        System.out.println("Size is : " + fruit.length);

        String msg = "Fruit\n=====\n";
        for (int i = 0; i < fruit.length; i ++){
            msg += fruit[i] + "\n";
        }

        tv.setText(msg);


    }
}