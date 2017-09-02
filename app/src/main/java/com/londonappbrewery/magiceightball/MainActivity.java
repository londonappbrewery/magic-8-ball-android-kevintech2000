package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   private ImageView ballDisplay;
   private Button myButton;
   int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      ballDisplay = (ImageView) this.findViewById(R.id.image_eightBall);
      myButton = (Button) this.findViewById(R.id.askButton);

      myButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Random randomNumberGenerator = new Random();
            int number = randomNumberGenerator.nextInt(5);
            ballDisplay.setImageResource(ballArray[number]);
         }
      });
   }
}
