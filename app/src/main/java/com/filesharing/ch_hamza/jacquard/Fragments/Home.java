package com.filesharing.ch_hamza.jacquard.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.filesharing.ch_hamza.jacquard.Pojoclasses.Config;
import com.filesharing.ch_hamza.jacquard.R;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements BaseSliderView.OnSliderClickListener {
 SliderLayout sliderLayout;
 RecyclerView recyclerView;
 static String path0, path1, path2;
    HashMap<String, String> HashMapForURL ;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_home, container, false);

        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = (SliderLayout) view.findViewById(R.id.slider);
        path0 =Config.BANNER1;
        path1= Config.BANNER2;
        path2=Config.BANNER3;
        recyclerView=(RecyclerView)view.findViewById(R.id.model_recyclerView);
        recyclerView.setHasFixedSize(true);
        AddImagesUrlOnline();
return view;
    }


    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
    private void AddImagesUrlOnline()

    {

        HashMapForURL = new HashMap<String, String>();

        HashMapForURL.put(" ", path0);
        HashMapForURL.put("  ", path1);
        HashMapForURL.put("   ", path2);
        callSlider();
    }


    private void callSlider() {

        for(String name : HashMapForURL.keySet()){

            TextSliderView textSliderView = new TextSliderView(getActivity().getApplicationContext());

            textSliderView
                    .description(name)
                    .image(HashMapForURL.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            textSliderView.bundle(new Bundle());

            textSliderView.getBundle()
                    .putString("extra",name);

            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.DepthPage);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(8000);
    }
}
