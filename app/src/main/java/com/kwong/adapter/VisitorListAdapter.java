package com.kwong.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kwong.autolayouttest.R;
import com.kwong.model.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kwong on 2016-04-02.
 */
public class VisitorListAdapter extends BaseAdapter {

    private Context FContext ;
    private List<Visitor> FVisitorList ;
    public VisitorListAdapter(Context c, List<Visitor> VisitorList ) {
        this.FContext = c ;
        if(VisitorList==null){
            FVisitorList = new ArrayList<Visitor>() ;
        }else{
            FVisitorList = VisitorList ;
        }
    }

    @Override
    public int getCount() {
        return FVisitorList.size();
    }

    @Override
    public Object getItem(int position) {
        return FVisitorList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null ;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(FContext);
            convertView =  inflater.inflate(R.layout.item_visitor, null);
            holder = new ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_passport = (TextView)convertView.findViewById(R.id.tv_passport);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        Visitor visitor = FVisitorList.get(position) ;
        if (visitor!=null) {
            holder.tv_name.setText( visitor.getFName() + "  " + visitor.getFCapitalName() );
            holder.tv_passport.setText(visitor.getFPassportNumb());
        }
        return convertView;
    }
    class ViewHolder {
        TextView tv_name, tv_passport ;
    }
}
