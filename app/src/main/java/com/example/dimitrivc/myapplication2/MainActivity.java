package com.example.dimitrivc.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        Integer tmp_arms = findViewById(R.id.arms).getVisibility();
        boolean arms_boolean = false;
        String key_arms = "key_arms";
        if (tmp_arms == View.VISIBLE){
            arms_boolean = true;
        }
        outState.putBoolean(key_arms, arms_boolean);

        Integer tmp_ears = findViewById(R.id.ears).getVisibility();
        boolean ears_boolean = false;
        String key_ears = "key_ears";
        if (tmp_ears == View.VISIBLE){
            ears_boolean = true;
        }
        outState.putBoolean(key_ears, ears_boolean);

        Integer tmp_eyebrows = findViewById(R.id.eyebrows).getVisibility();
        boolean eyebrows_boolean = false;
        String key_eyebrows = "key_eyebrows";
        if (tmp_eyebrows == View.VISIBLE){
            eyebrows_boolean = true;
        }
        outState.putBoolean(key_eyebrows, eyebrows_boolean);

        Integer tmp_eyes = findViewById(R.id.eyes).getVisibility();
        boolean eyes_boolean = false;
        String key_eyes = "key_eyes";
        if (tmp_eyes == View.VISIBLE){
            eyes_boolean = true;
        }
        outState.putBoolean(key_eyes, eyes_boolean);

        Integer tmp_glasses = findViewById(R.id.glasses).getVisibility();
        boolean glasses_boolean = false;
        String key_glasses = "key_glasses";
        if (tmp_glasses == View.VISIBLE){
            glasses_boolean = true;
        }
        outState.putBoolean(key_glasses, glasses_boolean);

        Integer tmp_hat = findViewById(R.id.hat).getVisibility();
        boolean hat_boolean = false;
        String key_hat = "key_hat";
        if (tmp_hat == View.VISIBLE){
            hat_boolean = true;
        }
        outState.putBoolean(key_hat, hat_boolean);

        Integer tmp_mouth = findViewById(R.id.mouth).getVisibility();
        boolean mouth_boolean = false;
        String key_mouth = "key_mouth";
        if (tmp_mouth == View.VISIBLE){
            mouth_boolean = true;
        }
        outState.putBoolean(key_mouth, mouth_boolean);

        Integer tmp_mustache = findViewById(R.id.mustache).getVisibility();
        boolean mustache_boolean = false;
        String key_mustache = "key_mustache";
        if (tmp_mustache == View.VISIBLE){
            mustache_boolean = true;
        }
        outState.putBoolean(key_mustache, mustache_boolean);

        Integer tmp_nose = findViewById(R.id.nose).getVisibility();
        boolean nose_boolean = false;
        String key_nose = "key_nose";
        if (tmp_nose == View.VISIBLE){
            nose_boolean = true;
        }
        outState.putBoolean(key_nose, nose_boolean);

        Integer tmp_shoes = findViewById(R.id.shoes).getVisibility();
        boolean shoes_boolean = false;
        String key_shoes = "key_shoes";
        if (tmp_shoes == View.VISIBLE){
            shoes_boolean = true;
        }
        outState.putBoolean(key_shoes, shoes_boolean);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        View arms = findViewById(R.id.arms);
        boolean arms_boolean = inState.getBoolean("key_arms");
        if (arms_boolean){
            arms.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            arms.setVisibility(View.INVISIBLE);
        }

        View ears = findViewById(R.id.ears);
        boolean ears_boolean = inState.getBoolean("key_ears");
        if (ears_boolean) {
            ears.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            ears.setVisibility(View.INVISIBLE);
        }

        View eyebrows = findViewById(R.id.eyebrows);
        boolean eyebrows_boolean = inState.getBoolean("key_eyebrows");
        if (eyebrows_boolean) {
            eyebrows.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            eyebrows.setVisibility(View.INVISIBLE);
        }

        View eyes = findViewById(R.id.eyes);
        boolean eyes_boolean = inState.getBoolean("key_eyes");
        if (eyes_boolean) {
            eyes.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            eyes.setVisibility(View.INVISIBLE);
        }

        View glasses = findViewById(R.id.glasses);
        boolean glasses_boolean = inState.getBoolean("key_glasses");
        if (glasses_boolean) {
            glasses.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            glasses.setVisibility(View.INVISIBLE);
        }

        View hat = findViewById(R.id.hat);
        boolean hat_boolean = inState.getBoolean("key_hat");
        if (hat_boolean) {
            hat.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            hat.setVisibility(View.INVISIBLE);
        }

        View mouth = findViewById(R.id.mouth);
        boolean mouth_boolean = inState.getBoolean("key_mouth");
        if (mouth_boolean) {
            mouth.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            mouth.setVisibility(View.INVISIBLE);
        }

        View mustache = findViewById(R.id.mustache);
        boolean mustache_boolean = inState.getBoolean("key_mustache");
        if (mustache_boolean) {
            mustache.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            mustache.setVisibility(View.INVISIBLE);
        }

        View nose = findViewById(R.id.nose);
        boolean nose_boolean = inState.getBoolean("key_nose");
        if (nose_boolean) {
            nose.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            nose.setVisibility(View.INVISIBLE);
        }

        View shoes = findViewById(R.id.shoes);
        boolean shoes_boolean = inState.getBoolean("key_shoes");
        if (shoes_boolean) {
            shoes.setVisibility(View.VISIBLE);
        } else {
            // if .. set view.visibility
            shoes.setVisibility(View.INVISIBLE);
        }
    }

    public void addArms(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View arms = findViewById(R.id.arms);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Arms:
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addEars(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View ears = findViewById(R.id.ears);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Ears:
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addEyebrows(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View eyebrows = findViewById(R.id.eyebrows);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Eyebrows:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addEyes(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View eyes = findViewById(R.id.eyes);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Eyes:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addGlasses(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View glasses = findViewById(R.id.glasses);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Glasses:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addHat(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View hat = findViewById(R.id.hat);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Hat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addMouth(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View mouth = findViewById(R.id.mouth);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Mouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addMustache(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View mustache = findViewById(R.id.mustache);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Mustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addNose(View view) {// Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View nose = findViewById(R.id.nose);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Nose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void addShoes(View view) {
        // Is view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        View shoes = findViewById(R.id.shoes);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.CB_Shoes:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
