package com.example.assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CashRegisterAdapter  extends BaseAdapter {

    Context context;
    ArrayList<Product> products;

    public CashRegisterAdapter (Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }
    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_row_item,null);
        }

        TextView productNameText= (TextView) view.findViewById(R.id.product_name);
        TextView productPriceText = (TextView) view.findViewById(R.id.product_quantity);
        TextView productQuantityText = (TextView) view.findViewById(R.id.product_price);

        productNameText.setText(products.get(i).name);
        productPriceText.setText(products.get(i).price);
        productQuantityText.setText(products.get(i).quantity);

        return  view;


    }

}
