package th.vu.cs.testminiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rasta on 13/2/2560.
 */

public class MyAdapter extends BaseAdapter{

    private  List<Data> mDatas;
    private LayoutInflater mlayoutInflater;

    public MyAdapter(Context context, List<Data> dataList){
        mDatas = dataList;
        mlayoutInflater = LayoutInflater.from(context);




    }


    static class ViewHolder{  // คลาส ViewHolder สำหรับข้อมูลที่แสดงแต่ละ Low
        TextView tvTitle;   // title
        TextView tvDesc;    // description
        ImageView img;          // icon





    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public int getCount() { // มีข้อมูลอยู่ใน List กี่ตัว
        return mDatas.size();
    }

    @Override
    public long getItemId(int position) { // position ไอดีไอเทมของแต่ละตัว
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;  // เก็บ View
        if(view == null){
            view = mlayoutInflater.inflate(R.layout.row_layout,viewGroup,false);
            holder = new ViewHolder();

            holder.tvTitle = (TextView)view.findViewById(R.id.textView);
           // holder.tvDesc = (TextView)view.findViewById(R.id.textView3);
            holder.img = (ImageView)view.findViewById(R.id.imageView2);
            view.setTag(holder);   // เก็บ viewholder เดิมไว้ใช้ครั้งต่อไป
        }
        else {
            holder = (ViewHolder)view.getTag();
        }

        holder.tvTitle.setText(mDatas.get(i).getmText1());
        //holder.tvDesc.setText(mDatas.get(i).getmText2());
        holder.img.setImageResource(mDatas.get(i).getmIcon());



        return view;
    }

    public MyAdapter() {
        super();
    }












}
