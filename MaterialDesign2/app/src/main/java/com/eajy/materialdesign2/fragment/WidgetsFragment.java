package com.eajy.materialdesign2.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.eajy.materialdesign2.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;

import static android.content.Context.MODE_PRIVATE;

public class WidgetsFragment extends Fragment {

    private AdView ad_view_widget;
    private CardView card_ad_widget;

    private ImageView img_card;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_widgets, container, false);
        ad_view_widget = nestedScrollView.findViewById(R.id.ad_view_widget);
        card_ad_widget = nestedScrollView.findViewById(R.id.card_ad_widget);
        img_card = nestedScrollView.findViewById(R.id.img_full_screen_dialog);
        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showAd();
        Glide.with(getContext()).load(R.drawable.food2).apply(new RequestOptions().fitCenter()).into(img_card);
    }

    private void showAd() {
        try {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("app", MODE_PRIVATE);
            if (!sharedPreferences.getBoolean("isDonated", false)) {
                AdRequest adRequest = new AdRequest.Builder().build();
                ad_view_widget.loadAd(adRequest);

                Animation animation = new AlphaAnimation(0.0f, 1.0f);
                animation.setDuration(500);
                card_ad_widget.setVisibility(View.VISIBLE);
                card_ad_widget.startAnimation(animation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
