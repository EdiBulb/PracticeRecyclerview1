package org.techtown.practicerecyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

/*5. 어댑터 생성 및 데이터 추가*/

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView = null;  //리사이클러 뷰
    RecyclerViewAdapter mAdapter = null;//어댑터
    ArrayList<RecyclerViewItem> mList;  //이거 역할이 뭐지?

    private Drawable mImageDrawable; // 이게 왜 필요한거지?
    private String mMainText; //
    private String mSubText; //



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);//리사이클러뷰 연결
        mList = new ArrayList<>();// 데이터 생성, 초기값 null

        mAdapter = new RecyclerViewAdapter(mList);//어댑터와 데이터를 연결
        mRecyclerView.setAdapter(mAdapter);//어댑터와 리사이클러뷰를 연결하기

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));//리사이클러뷰의 방향 정하기

        mImageDrawable = ResourcesCompat.getDrawable(getResources(),R.drawable.img, null);//
        mMainText = "홍길동";
        mSubText = "자세히 보기 >";

        addItem(mImageDrawable, mMainText+ " - 1", mSubText);
        addItem(mImageDrawable, mMainText+ " - 2", mSubText);
        addItem(mImageDrawable, mMainText+ " - 3", mSubText);
        addItem(mImageDrawable, mMainText+ " - 4", mSubText);
        addItem(mImageDrawable, mMainText+ " - 5", mSubText);
        addItem(mImageDrawable, mMainText+ " - 6", mSubText);
        addItem(mImageDrawable, mMainText+ " - 7", mSubText);
        addItem(mImageDrawable, mMainText+ " - 8", mSubText);
        addItem(mImageDrawable, mMainText+ " - 9", mSubText);
        addItem(mImageDrawable, mMainText+ " - 10", mSubText);
        addItem(mImageDrawable, mMainText+ " - 11", mSubText);


        mAdapter.notifyDataSetChanged(); //추가된 리스트 파악후, 아이템을 표시한다.

    }

    //addItem 메소드를 만든다.
    private void addItem(Drawable icon, String mainText, String subText){
        RecyclerViewItem item = new RecyclerViewItem();//아이템 생성

        item.setIconDrawable(icon);
        item.setMainTitle(mainText);
        item.setSubTitle(subText);

        mList.add(item);
    }
}
