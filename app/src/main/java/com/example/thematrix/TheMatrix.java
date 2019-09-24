package com.example.thematrix;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.TheMatrix.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class TheMatrix extends AppCompatActivity implements View.OnClickListener {

    /*Row One*/
    @BindView(R.id.btn_11)
    Button btn_11;

    @BindView(R.id.btn_12)
    Button btn_12;

    @BindView(R.id.btn_13)
    Button btn_13;

    @BindView(R.id.btn_14)
    Button btn_14;

    @BindView(R.id.btn_15)
    Button btn_15;

    @BindView(R.id.btn_16)
    Button btn_16;

    @BindView(R.id.btn_17)
    Button btn_17;

    @BindView(R.id.btn_18)
    Button btn_18;

    /*Row Two*/
    @BindView(R.id.btn_21)
    Button btn_21;

    @BindView(R.id.btn_22)
    Button btn_22;

    @BindView(R.id.btn_23)
    Button btn_23;

    @BindView(R.id.btn_24)
    Button btn_24;

    @BindView(R.id.btn_25)
    Button btn_25;

    @BindView(R.id.btn_26)
    Button btn_26;

    @BindView(R.id.btn_27)
    Button btn_27;

    @BindView(R.id.btn_28)
    Button btn_28;

    /*Row Three*/
    @BindView(R.id.btn_31)
    Button btn_31;

    @BindView(R.id.btn_32)
    Button btn_32;

    @BindView(R.id.btn_33)
    Button btn_33;

    @BindView(R.id.btn_34)
    Button btn_34;

    @BindView(R.id.btn_35)
    Button btn_35;

    @BindView(R.id.btn_36)
    Button btn_36;

    @BindView(R.id.btn_37)
    Button btn_37;

    @BindView(R.id.btn_38)
    Button btn_38;

    /*Row Four*/
    @BindView(R.id.btn_41)
    Button btn_41;

    @BindView(R.id.btn_42)
    Button btn_42;

    @BindView(R.id.btn_43)
    Button btn_43;

    @BindView(R.id.btn_44)
    Button btn_44;

    @BindView(R.id.btn_45)
    Button btn_45;

    @BindView(R.id.btn_46)
    Button btn_46;

    @BindView(R.id.btn_47)
    Button btn_47;

    @BindView(R.id.btn_48)
    Button btn_48;

    /*Row Five*/
    @BindView(R.id.btn_51)
    Button btn_51;

    @BindView(R.id.btn_52)
    Button btn_52;

    @BindView(R.id.btn_53)
    Button btn_53;

    @BindView(R.id.btn_54)
    Button btn_54;

    @BindView(R.id.btn_55)
    Button btn_55;

    @BindView(R.id.btn_56)
    Button btn_56;

    @BindView(R.id.btn_57)
    Button btn_57;

    @BindView(R.id.btn_58)
    Button btn_58;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thematrix);
        ButterKnife.bind(this);
     /*Row One*/
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
        btn_18.setOnClickListener(this);

        /*Row Two*/
        btn_21.setOnClickListener(this);
        btn_22.setOnClickListener(this);
        btn_23.setOnClickListener(this);
        btn_24.setOnClickListener(this);
        btn_25.setOnClickListener(this);
        btn_26.setOnClickListener(this);
        btn_27.setOnClickListener(this);
        btn_28.setOnClickListener(this);

        /*Row Three*/
        btn_31.setOnClickListener(this);
        btn_32.setOnClickListener(this);
        btn_33.setOnClickListener(this);
        btn_34.setOnClickListener(this);
        btn_35.setOnClickListener(this);
        btn_36.setOnClickListener(this);
        btn_37.setOnClickListener(this);
        btn_38.setOnClickListener(this);

        /*Row Four*/
        btn_41.setOnClickListener(this);
        btn_42.setOnClickListener(this);
        btn_43.setOnClickListener(this);
        btn_44.setOnClickListener(this);
        btn_45.setOnClickListener(this);
        btn_46.setOnClickListener(this);
        btn_47.setOnClickListener(this);
        btn_48.setOnClickListener(this);

        /*Row Five*/
        btn_51.setOnClickListener(this);
        btn_52.setOnClickListener(this);
        btn_53.setOnClickListener(this);
        btn_54.setOnClickListener(this);
        btn_55.setOnClickListener(this);
        btn_56.setOnClickListener(this);
        btn_57.setOnClickListener(this);
        btn_58.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        String ButtnTag = "color";
        switch (view.getId()) {

            /* Row One */

            case R.id.btn_11:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Primary", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 11, Color Primary");
                break;
            case R.id.btn_12:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Accent", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 12, Color Accent");
                break;
            case R.id.btn_13:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Dark", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 13, Color Dark");
                break;
            case R.id.btn_14:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 14, Color Blue");
                break;
            case R.id.btn_15:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Purple", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 15, Color Purple");
                break;
            case R.id.btn_16:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Pink", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 16, Color Pink");
                break;
            case R.id.btn_17:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Orange", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 17, Color Orange");
                break;
            case R.id.btn_18:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Light Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 18, Color Light Blue");
                break;

                /* Row Two */

            case R.id.btn_21:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Accent", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 21, Color Accent");
                break;
            case R.id.btn_22:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Dark", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 22, Color Dark");
                break;
            case R.id.btn_23:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 23, Color Blue");
                break;
            case R.id.btn_24:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Purple", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 24, Color Purple");
                break;
            case R.id.btn_25:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Pink", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 25, Color Pink");
                break;
            case R.id.btn_26:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Orange", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 26, Color Orange");
                break;
            case R.id.btn_27:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Light Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 27, Color Light Blue");
                break;
            case R.id.btn_28:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Primary", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 28, Color Primary");
                break;

                /* Row Three */

            case R.id.btn_31:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Dark", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 31, Color Dark");
                break;
            case R.id.btn_32:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 32, Color Blue");
                break;
            case R.id.btn_33:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Purple", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 33, Color Purple");
                break;
            case R.id.btn_34:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Pink", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 34, Color Pink");
                break;
            case R.id.btn_35:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Orange", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 35, Color Orange");
                break;
            case R.id.btn_36:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Light Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 36, Color Light Blue");
                break;
            case R.id.btn_37:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Primary", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 37, Color Primary");
                break;
            case R.id.btn_38:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Accent", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 38, Color Accent");
                break;

                /* Row Four */

            case R.id.btn_41:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 41, Color Blue");
                break;
            case R.id.btn_42:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Purple", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 42, Color Purple");
                break;
            case R.id.btn_43:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Pink", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 43, Color Pink");
                break;
            case R.id.btn_44:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Orange", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 44, Color Orange");
                break;
            case R.id.btn_45:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Light Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 45, Color Light Blue");
                break;
            case R.id.btn_46:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Primary", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 46, Color Primary");
                break;
            case R.id.btn_47:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Accent", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 47, Color Accent");
                break;
            case R.id.btn_48:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Dark", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 48, Color Dark");
                break;

                /* Row Five */

            case R.id.btn_51:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Purple", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 51, Color Purple");
                break;
            case R.id.btn_52:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Pink", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 52, Color Pink");
                break;
            case R.id.btn_53:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Orange", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 53, Color Orange");
                break;
            case R.id.btn_54:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Light Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 54, Color Light Blue");
                break;
            case R.id.btn_55:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Primary", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 55, Color Primary");
                break;
            case R.id.btn_56:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Accent", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 56, Color Accent");
                break;
            case R.id.btn_57:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Dark", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 57, Color Dark");
                break;
            case R.id.btn_58:
                Toast.makeText(getApplicationContext(), "You Pushed a Button Color Blue", Toast.LENGTH_SHORT).show();
                Log.e(ButtnTag, "Button 58, Color Blue");
                break;



        }

    }
}
