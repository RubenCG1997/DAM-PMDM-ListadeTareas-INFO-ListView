package com.iescamas.listadetareas_infolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter  extends BaseAdapter {
    private Context context;
    private ArrayList<TaskModel> listTaskModel;

    public Adapter(Context context, ArrayList<TaskModel> listTaskModel) {
        this.context = context;
        this.listTaskModel = listTaskModel;
    }

    @Override
    //Devuelve el numero de card que tiene el adapter
    public int getCount() {
        return listTaskModel.size();
    }

    @Override
    //Devuelve el card según su posicion
    public Object getItem(int i) {
        return listTaskModel.get(i);
    }

    @Override
    //Devuelve el identificador según su posicion
    public long getItemId(int i) {
        return listTaskModel.get(i).getImage();
    }

    @Override
    //Devuelve una vista del card con los valores especificados
    public View getView(int i, View view, ViewGroup viewGroup) {
       view= LayoutInflater.from(context).inflate(R.layout.cardview,null);

       ImageView img = view.findViewById(R.id.img_card);
       TextView nameTask = view.findViewById(R.id.lbl_task);
       TextView date = view.findViewById(R.id.lbl_date);
       TextView time = view.findViewById(R.id.lbl_time);

       img.setImageResource(listTaskModel.get(i).getImage());
       nameTask.setText(listTaskModel.get(i).getNameTask());
       date.setText(listTaskModel.get(i).getDate());
       time.setText(listTaskModel.get(i).getTime());

       return view;
    }
}
