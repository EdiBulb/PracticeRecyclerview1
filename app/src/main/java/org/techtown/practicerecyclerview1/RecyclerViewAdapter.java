package org.techtown.practicerecyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*4. 어댑터 및 뷰홀더 상속 및 구현*/
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<RecyclerViewItem> mData = null; // 데이터를 담는 배열 선언

    //어댑터 생성자
    public RecyclerViewAdapter(ArrayList<RecyclerViewItem>data){//어댑터 생성시, 배열을 생성한다.
        mData = data;
    }

    //onCreateViewHolder : 아이템 뷰를 위한 뷰홀더 객체를 생성하여 리턴한다.
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();//Context 클래스가 왜 쓰이는 걸까?
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE); // inflater가 뭐지? - xml 리소스를 view객체로 반환한다.

        View view = inflater.inflate(R.layout.recycler_item,parent,false); // 뷰 객체 생성
        RecyclerViewAdapter.ViewHolder vh = new RecyclerViewAdapter.ViewHolder(view); // 뷰 홀더 객체 생성

        return vh;
    }

    //onBindViewHolder : position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시한다.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewItem item = mData.get(position); //

        holder.imageView.setBackground(item.getIconDrawable()); //대이터의 이미지 가져오기
        holder.mainText.setText(item.getMainTitle()); //데이터의 mainText 홀딩
        holder.subText.setText(item.getSubTitle()); //데이터의 subText 홀딩

    } // 이거 만든 메소드 왜 안써먹지?

    //getItemCount : 전체 데이터의 개수를 리턴한다.
    @Override
    public int getItemCount() {
        return mData.size();
    }

    //질문 : 어댑터가 무슨 기능을 하지? - 데이터를 올리는 부분에서 뷰와 데이터를 연결해주는 다리 역할을 한다.
    //데이터를 받아서 관리하고 어댑터 뷰에 출력할 수 있는 형태로 데이터를 제공하는 객체



    //inner class로 뷰홀더를 먼저 만들어준 뒤에 어댑터를 이어서 구현한다.
    //아이템 뷰를 저장하는 뷰홀더 클래스
    //뷰 홀더가 왜 필요한가? - 뷰 객체를 재사용하는데, 뷰 객체의 데이터는 계속 바뀐다. 따라서 맨 처음 뷰 객체를 기억하고 있을(홀딩) 객체가 필요함.

    public class ViewHolder extends RecyclerView.ViewHolder{ // 뷰 홀더를 왜 어댑터 내부에 만들지?,,, 어댑터에 무엇이 들어가야하는가?
        ImageView imageView;
        TextView mainText;
        TextView subText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //뷰 객체에 대한 참조
            imageView = itemView.findViewById(R.id.item_image);
            mainText = itemView.findViewById(R.id.icon_main_text);
            subText = itemView.findViewById(R.id.icon_sub_text);
        }
    }
}
