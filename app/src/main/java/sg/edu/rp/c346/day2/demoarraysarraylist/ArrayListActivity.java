package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        ArrayList <String> fruitAl = new ArrayList<String>();

        fruitAl.add("apple");
        fruitAl.add("banana");
        fruitAl.add("cherry");
        fruitAl.add("durian");
        fruitAl.set(1,"theFruit");
        fruitAl.remove(0);
        fruitAl.set(fruitAl.size()-1,"dragon fruit");


        String msg = "Fruit\n=====\n";
        for (int i = 0; i < fruitAl.size(); i ++){
            msg += fruitAl.get(i) + "\n";
        }
        tv.setText(msg);



    }
}