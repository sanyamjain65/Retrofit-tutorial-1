package mypocketvakil.example.com.retrofitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    TextView id,name,year,value;
    APInterface apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=(TextView)findViewById(R.id.id);
        name=(TextView)findViewById(R.id.name);
        year=(TextView)findViewById(R.id.year);
        value=(TextView)findViewById(R.id.value);


        apiService = APIClient.getClient().create(APInterface.class);


//        Call<SingleUser> call=apiService.singleUser();
//        call.enqueue(new Callback<SingleUser>() {
//            @Override
//            public void onResponse(Call<SingleUser> call, Response<SingleUser> response) {
//                SingleUser single=response.body();
//                SingleUser.Data data=single.getData();
//                id.setText(data.getId().toString());
//                name.setText(data.getName().toString());
//                year.setText(data.getYear().toString());
//                value.setText(data.getPantone_value().toString());
//
//
//
//            }
//
//            @Override
//            public void onFailure(Call<SingleUser> call, Throwable t) {
//
//            }
//        });

//        User user=new User("peter@klaven","cityslicka");
//        Call<User> call1=apiService.loginUser(user);
//        call1.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                User user1=response.body();
//                String token=user1.getToken().toString();
//                if (token.equals("QpwL5tke4Pnpja7X"))
//                {
//                    Toast.makeText(MainActivity.this, "Login successful",Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Login ni hua",Toast.LENGTH_LONG).show();
//
//
//            }
//        });

        Example example=new Example("9711339241","1234");
        Call<Example> exampleCall=apiService.login(example);
        exampleCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example example1=response.body();
                FinmoUser fuser=example1.getUser();
                id.setText(fuser.getPoints().toString());
                name.setText(fuser.getAccountName().toString());
                year.setText(fuser.getEmail().toString());
                value.setText(fuser.getDeviceId().toString());



            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

               id.setText(t.toString());
            }
        });



    }
}
