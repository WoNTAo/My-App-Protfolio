package cn.wontao.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String tip_1 = "This button will launch my";
    private final static String tip_2 = "app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view) {
        switch (view.getId()) {
            case R.id.popular_movies_button:
                Toast.makeText(this, tip_1 + " popuular movies " + tip_2, Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_hawk_button:
                Toast.makeText(this, tip_1 + " stock hawk " + tip_2, Toast.LENGTH_SHORT).show();
                break;

            case R.id.build_it_bigger_button:
                Toast.makeText(this, tip_1 + " build it bigger " + tip_2, Toast.LENGTH_SHORT).show();
                break;

            case R.id.make_your_app_material:
                Toast.makeText(this, tip_1 + " make your app material " + tip_2, Toast.LENGTH_SHORT).show();
                break;

            case R.id.go_ubiquitous:
                Toast.makeText(this, tip_1 + " go ubiquitous " + tip_2, Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone:
                Toast.makeText(this, tip_1 + " capstone " + tip_2, Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
