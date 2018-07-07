package com.high.advanced;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import FirstChapter.ViewTouchActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "demo";
    private RecyclerView recyclerView;
    private List<Class> mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findView();
        initData();
        setAdapter();

    }

    private void findView(){
        recyclerView = findViewById(R.id.id_recycleview);

    }

    private void initData(){
        mActivity = new ArrayList<>();

        mActivity.add(ViewTouchActivity.class);

    }

    private void intentTo(Class clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    private void setAdapter(){
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(getLayoutInflater().inflate(R.layout.item_textview_view, parent, false));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
                ViewHolder vh = (ViewHolder) holder;
                vh.text.setText(mActivity.get(position).getSimpleName());
                vh.text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        intentTo(mActivity.get(position));
                    }
                });
            }

            @Override
            public int getItemCount() {
                return mActivity.size();
            }

            class ViewHolder extends RecyclerView.ViewHolder {

                TextView text;

                public ViewHolder(View itemView) {
                    super(itemView);

                    text = (TextView) itemView.findViewById(R.id.id_tv_test);
                }

            }
        });
    }
}
