package com.kimersoft.pointofsaleterminal.fragments.startedTab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimersoft.pointofsaleterminal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StartedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StartedFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView rvStarted;


    public StartedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StartedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StartedFragment newInstance(String param1, String param2) {
        StartedFragment fragment = new StartedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_waiting, container, false);

        rvStarted =view.findViewById(R.id.rv_waiting);
        rvStarted.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
     //   WaitingAdapter waitingAdapter=new WaitingAdapter(getActivity(),new ArrayList<String >(), ItemSelector.STARTED_ITEM);
       // rvStarted.setAdapter(waitingAdapter);
        return view;
    }

}
