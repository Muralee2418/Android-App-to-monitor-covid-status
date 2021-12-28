package com.example.covid19status;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Summary s;
    Globaldata global_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.total);
        //getData();
       Retrofit retrofit=new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        Api api=retrofit.create(Api.class);
        Call<Summary> call=api.getCoronaData();
        call.enqueue(new Callback<Summary>() {
            @Override
            public void onResponse(Call<Summary> call, Response<Summary> response) {
                Summary s=response.body();
                String result=Integer.valueOf(s.getGlobaldata().getTotalConfirmed()).toString();
                tv.setText(result);
                Log.d("test",result);


            }

            @Override
            public void onFailure(Call<Summary> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Failed to communicate server", Toast.LENGTH_SHORT).show();


            }
        });


    }
    public void getData(){
        Log.d("test","inside on getHeroes");
        //Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();


        Api api = retrofit.create(Api.class);
        Call<Summary> call = api.getCoronaData();
         //Call<List<Hero>> call = api.getHeroes();
        /*call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heroList = response.body();
                Log.d("test","inside enqueue");

                //Creating an String array for the ListView
                String[] heroes = new String[heroList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < heroList.size(); i++) {
                    heroes[i] = heroList.get(i).getName();
                    Log.d("test",heroes[i]);
                    tv.append(heroes[i]);
                }


                //displaying the string array into listview
                //lv.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));

            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Log.d("Error Message",t.getMessage());
            }
        });*/
        call.enqueue(new Callback<Summary>() {
            @Override
            public void onResponse(Call<Summary> call, Response<Summary> response) {
                //if(s.equals(null)){ Log.d("Test","response empty");}
                s=response.body();

                Log.d("Test","inside enque");
                global_data=s.getGlobaldata();
                String str=s.getCountryData().get(1).getCountry_name().toString();
                Log.d("Test",str);
                tv.setText(str);

            }

            @Override
            public void onFailure(Call<Summary> call, Throwable t) {
                Log.d("testerror",t.getMessage());

            }
        });



    }
}
