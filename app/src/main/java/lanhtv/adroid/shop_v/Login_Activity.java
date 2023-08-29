package lanhtv.adroid.shop_v;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity{

    private Button login_btn,reg_btn;
    private EditText username_edt,password_edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        valueFind();
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mở màn hình chính
                OpenScene(0);
            }
        });

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_Activity.this, "chưa hoàn thiện", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void valueFind(){
        login_btn = findViewById(R.id.btn_sclogin_login);
        reg_btn = findViewById(R.id.btn_sclogin_reg);
        username_edt = findViewById(R.id.edt_sclogin_username);
        password_edt = findViewById(R.id.edt_sclogin_password);
    }

    private void OpenScene(int x){
        if (x == 0){
            Intent intent = new Intent(Login_Activity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}