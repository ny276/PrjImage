package nykim.prjimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent findIntent = getIntent();
        int[] hitCount = findIntent.getIntArrayExtra("voteCount");
        String[] imgName = findIntent.getStringArrayExtra("imgName");

        btReturn = findViewById(R.id.btReturn);
        btReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
