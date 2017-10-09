package com.ssdesigninteractive.dialpadresearch;

import android.content.Context;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by i079691 on 10/1/17.
 */

public class CustomSlideAdapter extends PagerAdapter{

    private int[] image_resources = {R.drawable.slide_01, R.drawable.slide_02, R.drawable.slide_03, R.drawable.slide_04, R.drawable.slide_05};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSlideAdapter(Context ctx){
        this.ctx = ctx;
    }




    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(LinearLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
