package com.example.circkett20live;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.circkett20live.Retrofit.RetrofitClientInstance;
import com.example.circkett20live.Retrofit.RetrofitServices;
import com.example.circkett20live.liveScore.Datum;
import com.example.circkett20live.liveScore.MDLiveScore;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView txtStatus, txtName, txtStartDate, txtEndDate, txtODI, txtT20, txtTest, txtSquads, txtMatches;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtStatus = findViewById(R.id.txtStatus);
        txtName = findViewById(R.id.txtName);
        txtStartDate = findViewById(R.id.txtStartDate);
        txtEndDate = findViewById(R.id.txtEndDate);
        txtODI = findViewById(R.id.txtODI);
        txtT20 = findViewById(R.id.txtT20);
        txtTest = findViewById(R.id.txtTest);
        txtSquads = findViewById(R.id.txtSquads);
        txtMatches = findViewById(R.id.txtMatches);
        getLiveScore();
    }

    private void getLiveScore() {
        RetrofitServices services = RetrofitClientInstance.getApiClient().create(RetrofitServices.class);
        Call<MDLiveScore> call = services.getLiveScore(getResources().getString(R.string.live_Match_key), "0");
        call.enqueue(new Callback<MDLiveScore>() {
            @Override
            public void onResponse(Call<MDLiveScore> call, Response<MDLiveScore> response) {
                if (response.isSuccessful()) {
                    MDLiveScore mdLiveScore = response.body();

                        txtT20.setText("tctT20:  "+mdLiveScore.getDatum().getT20() + "Match");


                }
            }

            @Override
            public void onFailure(Call<MDLiveScore> call, Throwable t) {
                t.printStackTrace();
                Log.d("Network request failed", t.getMessage());
            }
        });
    }
}
