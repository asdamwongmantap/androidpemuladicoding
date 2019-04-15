package com.wongmantap.kulinerindo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by 0431260118 on 4/10/2019.
 */

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_REMARKS = "extra_remarks";
    public static final String EXTRA_NAME = "extra_name";
//    private RecyclerView rvCategory;
//    private ArrayList<Kuliner> list = new java.util.ArrayList<>();
//
    TextView tvDataName;
    TextView tvDataRemarks;
    ImageView tvDataPhotos;


    //
//    private void showRecyclerList(){
//        rvCategory.setLayoutManager(new LinearLayoutManager(this));
//        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(this);
//        listKulinerAdapter.setListKuliner(list);
//        rvCategory.setAdapter(listKulinerAdapter);
//
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

//        rvCategory = findViewById(R.id.rv_category);
//        rvCategory.setHasFixedSize(true);
//
//        list.addAll(KulinerData.getListData());
//        showRecyclerList();

        tvDataName = findViewById(R.id.tv_data_name);
        tvDataRemarks = findViewById(R.id.tv_data_remarks);
        tvDataPhotos = findViewById(R.id.tv_data_photos);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String remarks = getIntent().getStringExtra(EXTRA_REMARKS);
        String textname = name ;
        String textremarks = remarks;
        tvDataName.setText(textname);
        tvDataRemarks.setText(textremarks);

//

        //untuk menambahkan panah back
        ActionBar menu = getSupportActionBar();
        menu.setDisplayHomeAsUpEnabled(true);
        menu.setDisplayShowHomeEnabled(true);
    }

}
