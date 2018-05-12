package com.example.mirza.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void submitOrder(View view) {

        displayprice(i*5);
    }
    public void addition(View v)
    {
        i++;
        displaymssg(i);
        displayprice(i*5);

    }
    public void subtract(View v)
    {
        if(i==0)
        {
            Toast.makeText(getApplicationContext(),"Cannot purchase below 0",Toast.LENGTH_SHORT).show();
            return;
        }
        i--;
        displaymssg(i);
        displayprice(i*5);

    }

    private void displaymssg(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayprice(int price)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_value);
        priceTextView.setText("Thank you for the purchase\nPlease visit again\n"+"Rs"+price);
    }


}
