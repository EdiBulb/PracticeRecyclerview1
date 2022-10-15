package org.techtown.practicerecyclerview1;

import android.graphics.drawable.Drawable;

/*3. 아이템 클래스 정의하기
추후에 아이템에 어떤 값이 들어갈지 아이템 객체를 만들어 준다.*/
public class RecyclerViewItem {
    private Drawable iconDrawable;
    private String mainTitle;
    private String subTitle;

    public void setIconDrawable(Drawable iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Drawable getIconDrawable() {
        return iconDrawable;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
