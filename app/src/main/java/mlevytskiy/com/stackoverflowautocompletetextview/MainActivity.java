package mlevytskiy.com.stackoverflowautocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    public static String[] myData = new String[]{"Africa (AF)","America (AFM)","Apple (AMP)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView text = (AutoCompleteTextView) findViewById(R.id.text_view);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myData);

        text.setAdapter(adapter);
        text.setThreshold(1);
        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {

                System.out.print("" + position);

//                selected_station = (String) parent.getItemAtPosition(position);
                //TODO Do something with the selected text
            }
        });

    }

}
