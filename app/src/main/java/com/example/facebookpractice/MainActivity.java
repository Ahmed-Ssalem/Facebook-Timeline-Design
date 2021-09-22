package com.example.facebookpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.facebookpractice.Adapter.PostAdapter;
import com.example.facebookpractice.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Post> posts = new ArrayList<Post>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        posts.add(new Post(R.drawable.saed_profile,"Mohamed Saed","5h","public","\uD83E\uDD40❤",
                R.drawable.saed_post,"1.5k","236 Comments"));
        posts.add(new Post(R.drawable.sadek_profile,"Mohamed Sadek","1d","friends","Searching for an Everglow",
                R.drawable.sadek_post,"69","69 Comments"));
        posts.add(new Post(R.drawable.kaka_profile,"Kaka Sharaf","3h","public","❤❤❤❤❤",
                R.drawable.kaka_post,"259","186 Comments"));
        posts.add(new Post(R.drawable.salem_profile,"Ahmed Salem","2h","public","\uD835\uDC9E\uD835\uDCC1\uD835\uDCB6\uD835\uDCC8\uD835\uDCC8\uD835\uDCCE ❤",
                R.drawable.salem_post,"2k","306 Comments"));
        posts.add(new Post(R.drawable.zaki_profile,"Ahmed Zaki","3h","public","ضهري و سندي ❤️",
                R.drawable.zaki_post,"1.5k","236 Comments"));
        posts.add(new Post(R.drawable.shaaban_profile,"Mohamed Saaban","1m","friends","❤❤",
                R.drawable.shaaban_post,"156","68 Comments"));
        for (int i = 0; i < 20; ++i)
            posts.add(new Post(R.drawable.shaaban_profile,"Mohamed Saaban","1m","friends","❤❤",
                    R.drawable.shaaban_post,"156","68 Comments"));

        PostAdapter adapter = new PostAdapter(posts);
        RecyclerView posrList = findViewById(R.id.recycler_posts);
        posrList.setAdapter(adapter);

    }
}