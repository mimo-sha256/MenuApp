package com.example.android.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello = findViewById(R.id.hello);
        registerForContextMenu(hello);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.example_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

             default: return super.onOptionsItemSelected(item);
        }
    }

    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.example_menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            default: return false;
        }
    }
}
