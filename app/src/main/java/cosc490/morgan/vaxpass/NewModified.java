package cosc490.morgan.vaxpass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewModified extends AppCompatActivity {

    int first = 1;
    int last = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}