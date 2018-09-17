package com.alexjlockwood.example.delight;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TrimClipActivity extends AppCompatActivity {

  @BindView(R.id.airplane) ImageView airplaneView;
  @BindView(R.id.eye) ImageView eyeView;
  @BindView(R.id.flashlight) ImageView flashlightView;
  @BindView(R.id.searchback) ImageView searchbackView;
  @BindView(R.id.heart) ImageView heartView;
  @BindView(R.id.screen) ImageView screenView;
  @BindView(R.id.searchClock) ImageView searchClockView;
  @BindView(R.id.readHeart) ImageView readHeart;


  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_trimclip);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    isChecked = !isChecked;
    final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
    airplaneView.setImageState(stateSet, true);
    eyeView.setImageState(stateSet, true);
    flashlightView.setImageState(stateSet, true);
    searchbackView.setImageState(stateSet, true);
    heartView.setImageState(stateSet, true);
    screenView.setImageState(stateSet, true);

  ((Animatable)searchClockView.getDrawable()).start();
  ((Animatable)readHeart.getDrawable()).start();
  }
}
