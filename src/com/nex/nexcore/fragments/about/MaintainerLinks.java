package com.nex.nexcore.fragments.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.android.settings.R;

public class MaintainerLinks extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nex_maintainer_card, container, false);

        LinearLayout button1 = view.findViewById(R.id.mtelegram);
        LinearLayout button2 = view.findViewById(R.id.mgroup);
        LinearLayout button3 = view.findViewById(R.id.mchannel);

        button1.setOnClickListener(v -> 
            Toast.makeText(getContext(), "Button 1 clicked", Toast.LENGTH_SHORT).show()
        );

        button2.setOnClickListener(v -> 
            Toast.makeText(getContext(), "Button 2 clicked", Toast.LENGTH_SHORT).show()
        );

        button3.setOnClickListener(v -> 
            Toast.makeText(getContext(), "Button 3 clicked", Toast.LENGTH_SHORT).show()
        );

        return view;
    }
}
