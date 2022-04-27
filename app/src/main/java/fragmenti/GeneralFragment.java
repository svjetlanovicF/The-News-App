package fragmenti;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thenewsapp.Adapter;
import com.example.thenewsapp.Helper;
import com.example.thenewsapp.ModelClassNews;
import com.example.thenewsapp.R;
import com.example.thenewsapp.TheNews;

import java.util.ArrayList;

public class GeneralFragment extends Fragment {

    public GeneralFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_general, container, false);

        ArrayList<ModelClassNews> modelClassNews;
        Adapter adapter;
        RecyclerView recyclerViewGeneral;

        recyclerViewGeneral = view.findViewById(R.id.recycleViewGeneral);
        modelClassNews = new ArrayList<>();
        recyclerViewGeneral.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modelClassNews);
        recyclerViewGeneral.setAdapter(adapter);

        Helper.findNews("general", modelClassNews, adapter);

        return view;
    }
}