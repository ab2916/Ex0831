package com.example.ex0831;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener{
    ListView lV;
    Spinner spin;
    TextView tV1;
    TextView tV2;
    TextView tV3;
    TextView tV4;
    String[][] firstName = {
            {"Shay", "Dan", "Idan", "Inbar", "Dorel", "Orel", "Nisim", "Erel", "Yonatan", "Maya"},
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"},
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}
    };

    String[][] lastName = {
            {"Shteyman", "Zhuravlov", "Bunkin", "Menahem", "Gedj", "Gabay", "Krief", "Ben-Baruch", "Iluz", "Mayzus"},
            {"11", "22", "33", "44", "55", "66", "77", "88", "99", "100"},
            {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj"},
            {"AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ"}
    };

    String[][] dof = {
            {"14/01", "2/04", "23/09", "12/02", "8/07", "8/09", "7/12", "9/12","16/03", "5/03"},
            {"11/11", "22/22", "33/33", "44/44", "55/55", "66/66", "77/77", "88/88", "99/99", "100/100"},
            {"aa/aa", "bb/bb", "cc/cc", "dd/dd", "ee/ee", "ff/ff", "gg/gg", "hh/hh", "ii/ii", "jj/jj"},
            {"AA/AA", "BB/BB", "CC/CC", "DD/DD", "EE/EE", "FF/FF", "GG/GG", "HH/HH", "II/II", "jj/jj"}
    };


    String[][] phoneNumbers = {
            {"0532230985", "0586651505", "0544771608", "0547456674", "0586910852", "0587161658", "0542509918", "0522228615", "0502120264", "0522030883"},
            {"1111111111", "222222222", "3333333333", "4444444444", "5555555555", "6666666666", "7777777777", "8888888888", "9999999999", "10101010101010101010"},
            {"aaaaaaaaaa", "bbbbbbbbb", "cccccccccc", "dddddddddd", "eeeeeeeeee", "ffffffffff", "gggggggggg", "hhhhhhhhhh", "iiiiiiiiii", "jjjjjjjjjj"},
            {"AAAAAAAAAA", "BBBBBBBBB", "CCCCCCCCCC", "DDDDDDDDDD", "EEEEEEEEEE", "FFFFFFFFFF", "GGGGGGGGGG", "HHHHHHHHHH", "IIIIIIIIII", "JJJJJJJJJJ"},
    };

    String[]classes = {"1", "2", "3", "4"};
    int classNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lV = findViewById(R.id.lV);
        spin = findViewById(R.id.spin);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);

        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> adpSp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classes);
        spin.setAdapter(adpSp);

        lV.setOnItemClickListener(this);
        lV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        tV1.setText("Last name: " + lastName[classNumber][i]);
        tV2.setText("First name: " + firstName[classNumber][i]);
        tV3.setText("Date of birth: " + dof[classNumber][i]);
        tV4.setText("Phone number: " + phoneNumbers[classNumber][i]);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        ArrayAdapter<String> adpLv = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, firstName[i]);
        lV.setAdapter(adpLv);
        classNumber = i;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}