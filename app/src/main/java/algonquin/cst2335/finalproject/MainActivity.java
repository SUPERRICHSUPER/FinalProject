package algonquin.cst2335.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import algonquin.cst2335.finalproject.BearImage.BearImage;
import algonquin.cst2335.finalproject.BearImage.BearImageGenerator;
import algonquin.cst2335.finalproject.CurrencyConverter.CurrencyConverter;
import algonquin.cst2335.finalproject.FlightTracker.FlightTracker;
import algonquin.cst2335.finalproject.TriviaQuestion.TriviaQuestion;
import algonquin.cst2335.finalproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.music.setOnClickListener( click ->
                startActivity(new Intent(this, music.class)));
        binding.dictionary.setOnClickListener( click ->
                startActivity(new Intent(this, dictionary.class)));
        binding.Sunrise.setOnClickListener( click ->
                startActivity(new Intent(this, Sunrise.class)));
        binding.Recipe.setOnClickListener( click ->
                startActivity(new Intent(this, Recipe.class)));
    }
}