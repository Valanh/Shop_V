package lanhtv.adroid.shop_v;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_name = findViewById(R.id.name);
        //comment trên git cập nhật cho file code
        tv_name.setText("chào bạn");
        tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set text for tv_name
                tv_name.setText("chạm vào tôi làm gì");
            }
        });
    }
}
