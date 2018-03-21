package nykim.prjimage;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btResult, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] imgName = {"그림1", "그림2", "그림3", "그림4", "그림5", "그림6", "그림7", "그림8", "그림9"};
        final int[] voteCount = new int[imgName.length];
        for(int i=0; i<imgName.length; i++) {
            voteCount[i] = 0;
        }
        ImageView[] image = new ImageView[imgName.length];
        Integer[] imageId = {R.id.iv1, R.id.iv2, R.id.iv3, R.id.iv4, R.id.iv5, R.id.iv6, R.id.iv7, R.id.iv8, R.id.iv9};

        btResult = findViewById(R.id.btResult);
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
           }
       });

        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });



    }
}
