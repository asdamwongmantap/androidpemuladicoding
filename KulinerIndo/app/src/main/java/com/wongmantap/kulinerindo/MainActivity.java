package com.wongmantap.kulinerindo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Kuliner> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(KulinerData.getListData());
        showRecyclerList();
    }
    //    show list view function
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(this);
        listKulinerAdapter.setListKuliner(list);
        rvCategory.setAdapter(listKulinerAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedKuliner(list.get(position));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //    show grid view function
    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridKulinerAdapter gridPresidentAdapter = new GridKulinerAdapter(this);
        gridPresidentAdapter.setListKuliner(list);
        rvCategory.setAdapter(gridPresidentAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedKuliner(list.get(position));
            }
        });
    }
    //    show card view function
    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewKulinerAdapter cardViewKulinerAdapter = new CardViewKulinerAdapter(this);
        cardViewKulinerAdapter.setListKuliner(list);
        rvCategory.setAdapter(cardViewKulinerAdapter);
    }
    // on selected / on click event
    private void showSelectedKuliner(Kuliner kuliner){
//        Toast.makeText(this, "Kamu memilih "+kuliner.getName(), Toast.LENGTH_SHORT).show();
        Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, kuliner.getName());
//        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_REMARKS, kuliner.getRemarks());
        startActivity(moveWithDataIntent);
    }
}
