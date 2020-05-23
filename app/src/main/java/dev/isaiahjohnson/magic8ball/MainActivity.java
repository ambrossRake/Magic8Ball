package dev.isaiahjohnson.magic8ball;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends WearableActivity {

    private final static String TAG = "MainActivity";
    private ImageView magicDiceView;
    private Random random = new Random();
    private List<Integer> diceFaces = Arrays.asList(R.drawable.dice_face1, R.drawable.dice_face2, R.drawable.dice_face3, R.drawable.dice_face4,
            R.drawable.dice_face5, R.drawable.dice_face6, R.drawable.dice_face7, R.drawable.dice_face8, R.drawable.dice_face9, R.drawable.dice_face10, R.drawable.dice_face11,
            R.drawable.dice_face12, R.drawable.dice_face13, R.drawable.dice_face14, R.drawable.dice_face15, R.drawable.dice_face16, R.drawable.dice_face17, R.drawable.dice_face18,
            R.drawable.dice_face17, R.drawable.dice_face18, R.drawable.dice_face19, R.drawable.dice_face20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magicDiceView = findViewById(R.id.magic_dice);
        magicDiceView.setOnClickListener(view -> {
            int i = random.nextInt(diceFaces.size());
            int diceFaceID = diceFaces.get(i);
            Log.d(TAG, String.valueOf(diceFaceID));
            magicDiceView.setImageDrawable(getDrawable(diceFaceID));
        });

        setAmbientEnabled();
    }
}
