package me.notmithun.recreations.gtn_recreated;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.notmithun.recreations.gtn_recreated.RViewIntergrated.*;

import java.util.ArrayList;
import java.util.List;

public class versionhistoryActivity extends AppCompatActivity {

    protected RecyclerView rv;
    protected String[] verInfo = new String[2];
    protected List<verList> itemList;
    protected version_histroy_items items1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versionhistory);
        rv = findViewById(R.id.rv);

        verInfo[0] = "Guess the Number's Last Edition: The last was kinda bad. And didn't work so I decided to recreate it.";
        verInfo[1] = "GTN (Recreated) Version 1: Nothing much. Just starting...";

        rv.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();

        for (String ver : verInfo) {
            itemList.add(new verList(ver));
        }

        items1 = new version_histroy_items(itemList);

        rv.setAdapter(items1);
    }
}