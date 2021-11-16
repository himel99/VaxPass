package cosc490.morgan.vaxpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.etUsername);
        TextView password = (TextView) findViewById(R.id.etPassword);

        MaterialButton btnLogin = (MaterialButton) findViewById(R.id.btnLogin);

        //admin and admin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //show toast for successful login
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    //call method to open activity for the home page
                    openHomePage();
                }else{
                    //toast for login failure
                    Toast.makeText(MainActivity.this, "Login FAILED!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openHomePage(){
        //create new intent
        Intent intent = new Intent(this, HomeActivity.class);
        //start activity with that intent
        startActivity(intent);
    }
}