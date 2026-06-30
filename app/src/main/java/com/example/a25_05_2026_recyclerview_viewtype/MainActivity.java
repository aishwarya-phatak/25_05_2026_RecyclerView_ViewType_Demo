package com.example.a25_05_2026_recyclerview_viewtype;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ArrayList<User> users;
    ArrayList<Product> products;
    ProductAndUserAdapter productAndUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArrays();
        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recyclerViewForProductsUsers);
        productAndUserAdapter = new ProductAndUserAdapter(users, products);
        recyclerView.setAdapter(productAndUserAdapter);
        linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void initArrays() {
        users = new ArrayList<User>();
        products = new ArrayList<Product>();

        for (int i = 0; i < 10; i++) {
            products.add(
                    new Product(
                            i + 10,
                            "Product " + i,
                            i * 1000 + 500)
            );
        }

        for (int i = 0; i < 5; i++) {
            users.add(new User(
                    i + 5,
                    "User " + i,
                    "Pune")
            );
        }
    }
}