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

import java.util.ArrayList;

public class HealthFragment extends Fragment {


    public HealthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health, container, false);

        ArrayList<ModelClassNews> modelClassNews;
        Adapter adapter;
        RecyclerView recyclerViewHealth;

        recyclerViewHealth = view.findViewById(R.id.recycleViewHealth);
        modelClassNews = new ArrayList<>();
        recyclerViewHealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modelClassNews);
        recyclerViewHealth.setAdapter(adapter);

        Helper.findNews("health", modelClassNews, adapter);

        return view;
    }
}