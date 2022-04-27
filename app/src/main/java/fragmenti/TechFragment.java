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

public class TechFragment extends Fragment {

    public TechFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tech, container, false);

        ArrayList<ModelClassNews> modelClassNews;
        Adapter adapter;
        RecyclerView recyclerViewTech;

        recyclerViewTech = view.findViewById(R.id.recycleViewTech);
        modelClassNews = new ArrayList<>();
        recyclerViewTech.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modelClassNews);
        recyclerViewTech.setAdapter(adapter);

        Helper.findNews("tech", modelClassNews, adapter);

        return view;
    }
}