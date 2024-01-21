package com.example.recyclerviewcase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recyclerId);
    ArrayList<UserModel> userList = new ArrayList<UserModel>();
    for (int i = 0; i < 10; i++) {
      userList.add(new UserModel("User" + i));
    }
    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, userList);
    recyclerView.setAdapter(recyclerViewAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

  }
}