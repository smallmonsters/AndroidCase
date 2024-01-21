package com.example.recyclerviewcase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

  private Context context;
  private ArrayList<UserModel> userList;

  //构造器
  public RecyclerViewAdapter(Context context, ArrayList<UserModel> userList) {
    this.context = context;
    this.userList = userList;

  }

  @NonNull
  @Override
  public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_itme, parent, false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
    holder.textView.setText(userList.get(position).getUser());
  }

  @Override
  public int getItemCount() {
    return this.userList.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public MyViewHolder(@NonNull View itemView) {
      super(itemView);
      this.textView = itemView.findViewById(R.id.username);
    }
  }
}
