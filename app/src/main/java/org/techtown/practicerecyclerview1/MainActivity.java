package org.techtown.practicerecyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = null ;
        RecyclerImageTextAdapter mAdapter = null ;
        ArrayList<RecyclerItem> mList = new ArrayList<RecyclerItem>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            /// 코드 계속 ...

            mRecyclerView = findViewById(R.id.recycler1) ;

            // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
            mAdapter = new RecyclerImageTextAdapter(mList) ;
            mRecyclerView.setAdapter(mAdapter) ;

            /// ... 코드 계속.

            // 리사이클러뷰에 LinearLayoutManager 지정. (vertical)
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

            addItem(getDrawable(R.drawable.ic_account_box_black_36dp),
                    "Box", "Account Box Black 36dp") ;
            // 두 번째 아이템 추가.
            addItem(getDrawable(R.drawable.ic_account_circle_black_36dp),
                    "Circle", "Account Circle Black 36dp") ;
            // 세 번째 아이템 추가.
            addItem(getDrawable(R.drawable.ic_assignment_ind_black_36dp),
                    "Ind", "Assignment Ind Black 36dp") ;

            adapter.notifyDataSetChanged() ;

            /// ... 코드 계속
        }
        public void addItem(Drawable icon, String title, String desc) {
            RecyclerItem item = new RecyclerItem();

            item.setIcon(icon);
            item.setTitle(title);
            item.setDesc(desc);

            mList.add(item);
        }
    }
}