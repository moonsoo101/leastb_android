package com.leastb.moonsoo.walkingeye.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.leastb.moonsoo.walkingeye.R;
import com.leastb.moonsoo.walkingeye.Services.CameraService;
import com.squareup.picasso.Picasso;


public class TabFragment1 extends Fragment {
    View view;
    ImageView imageView;
    Button startBtn, stopBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_fragment_1, container, false);
        imageView = (ImageView) view.findViewById(R.id.img);
        startBtn = (Button) view.findViewById(R.id.startBtn);
        stopBtn = (Button) view.findViewById(R.id.stopBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getActivity(),//현재제어권자
                        CameraService.class); // 이동할 컴포넌트
                getActivity().startService(intent); // 서비스 시작\
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getActivity(),//현재제어권자
                        CameraService.class); // 이동할 컴포넌트
                getActivity().stopService(intent); // 서비스 종료
            }
        });
        return view;
    }

    public void loadPicture(String index) {
        String url = "http://13.124.33.214/darknet/" + index + ".jpg";
        Picasso.with(getActivity()).load(url).into(imageView);
    }

}