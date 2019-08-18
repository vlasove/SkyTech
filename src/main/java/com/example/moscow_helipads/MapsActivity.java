package com.example.moscow_helipads;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng moscow = new LatLng(55.755214, 37.615684);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(moscow, 10.0f));
        map.getUiSettings().setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng dot1 = new LatLng(55.713159, 37.655819);
        map.addMarker(new MarkerOptions().position(dot1).title("1"));
        LatLng dot2 = new LatLng(55.712783, 37.634611);
        map.addMarker(new MarkerOptions().position(dot2).title("2"));
        LatLng dot3 = new LatLng(55.708740, 37.615056);
        map.addMarker(new MarkerOptions().position(dot3).title("3"));
        LatLng dot4 = new LatLng(55.706155, 37.573134);
        map.addMarker(new MarkerOptions().position(dot4).title("4"));
        LatLng dot5 = new LatLng(55.650417, 37.552412);
        map.addMarker(new MarkerOptions().position(dot5).title("5"));
        LatLng dot6 = new LatLng(55.727531, 37.568616);
        map.addMarker(new MarkerOptions().position(dot6).title("6"));
        LatLng dot7 = new LatLng(55.721671, 37.544465);
        map.addMarker(new MarkerOptions().position(dot7).title("7"));
        LatLng dot8 = new LatLng(55.715714, 37.666513);
        map.addMarker(new MarkerOptions().position(dot8).title("8"));
        LatLng dot9 = new LatLng(55.735863, 37.521131);
        map.addMarker(new MarkerOptions().position(dot9).title("9"));
        LatLng dot10 = new LatLng(55.710755, 37.468951);
        map.addMarker(new MarkerOptions().position(dot10).title("10"));
        LatLng dot11 = new LatLng(55.749060, 37.516195);
        map.addMarker(new MarkerOptions().position(dot11).title("11"));
        LatLng dot12 = new LatLng(55.758167, 37.527208);
        map.addMarker(new MarkerOptions().position(dot12).title("12"));
        LatLng dot13 = new LatLng(55.727842, 37.647552);
        map.addMarker(new MarkerOptions().position(dot13).title("13"));
        LatLng dot14 = new LatLng(55.723116, 37.666411);
        map.addMarker(new MarkerOptions().position(dot14).title("14"));
        LatLng dot15 = new LatLng(55.722490, 37.690832);
        map.addMarker(new MarkerOptions().position(dot15).title("15"));
        LatLng dot16 = new LatLng(55.745923, 37.694448);
        map.addMarker(new MarkerOptions().position(dot16).title("16"));
        LatLng dot17 = new LatLng(55.752856, 37.671837);
        map.addMarker(new MarkerOptions().position(dot17).title("17"));
        LatLng dot18 = new LatLng(55.761081, 37.659520);
        map.addMarker(new MarkerOptions().position(dot18).title("18"));
        LatLng dot19 = new LatLng(55.774498, 37.679147);
        map.addMarker(new MarkerOptions().position(dot19).title("19"));
        LatLng dot20 = new LatLng(55.730642, 38.016704);
        map.addMarker(new MarkerOptions().position(dot20).title("20"));
        LatLng dot21 = new LatLng(55.909906, 37.631139);
        map.addMarker(new MarkerOptions().position(dot21).title("21"));
        LatLng dot22 = new LatLng(55.871431, 37.492879);
        map.addMarker(new MarkerOptions().position(dot22).title("22"));
        LatLng dot23 = new LatLng(55.933103, 37.661630);
        map.addMarker(new MarkerOptions().position(dot23).title("23"));
        LatLng dot24 = new LatLng(55.852020, 37.418602);
        map.addMarker(new MarkerOptions().position(dot24).title("24"));
        LatLng dot25 = new LatLng(55.938729, 37.768974);
        map.addMarker(new MarkerOptions().position(dot25).title("25"));

        // Get back the mutable Circle
        map.addCircle(new CircleOptions()
                .center(new LatLng(55.754293, 37.616625))
                .radius(1500)
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(120, 0, 0, 0))
        );

        map.addCircle(new CircleOptions()
                .center(new LatLng(55.722768, 37.514231))
                .radius(1000)
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(120, 0, 0, 0))
        );


        map.addCircle(new CircleOptions()
                .center(new LatLng(55.561561, 36.694398))
                .radius(5000)
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(120, 0, 0, 0))
        );

        map.addCircle(new CircleOptions()
                .center(new LatLng(55.749141, 37.536168))
                .radius(1000)
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(120, 0, 0, 0))
        );

        map.addCircle(new CircleOptions()
                .center(new LatLng(55.692277, 37.887378))
                .radius(7000)
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(120, 0, 0, 0))
        );

    }
}
