package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class rajasthan extends AppCompatActivity {
    ListView lvraj;
    Integer imageraj[]={R.drawable.ajmer,R.drawable.amber,R.drawable.bhangarh,R.drawable.bundi,R.drawable.chitt};
    String nm[]={"Ajmer-Sharif-Dargah","Amber Fort","Bhangarh Fort","Bundi Palace","Chittorgarh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);
        lvraj=(ListView)findViewById(R.id.lvraj);
        customadapter ad=new customadapter(this,imageraj,nm);
        lvraj.setAdapter(ad);
        lvraj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(view.getId())
        {
            case R.id.imageViewgeneral:
                if(position==0)
                {String s="AJMER-Dargah Sharif\n" +
                        "\n" +
                        "Popular for the Dargah Sharif — shrine of sufi saint Moinuddin Chishti, Ajmer is the 5th largest city of Rajasthan. It is surrounded by the Aravalli range and the Naag Pathar range, which protects it from the Thar desert. Among the most popular tourist attractions in Rajasthan, Ajmer is a regular destination for several celebrities who come to the dargah to seek blessings.\n" +
                        "\n" +
                        "Best time to visit: All through the year\n" +
                        "Major attractions in Ajmer: Dargah Sharif, Ana Sagar Lake, Naag Pathar ranges\n" +
                        "Things to do in Ajmer: Attend Qawali at Dargah Sharif, offer chadar to the grave of Sufi saint\n";
                    Intent i=new Intent(getApplicationContext(),Final1.class);
                    i.putExtra("image1",imageraj[position]);
                    i.putExtra("uname",s);
                    startActivity(i);
                }
                if(position==1)
                {String s="The fort is situated about 20 minutes northeast of Jaipur. If you're on a strict budget, take one of the frequent buses that depart from near the Hawa Mahal in the Old City. They're crowded but will only cost you 15 rupees (or 25 rupees if you want air-conditioning). Alternatively, it's possible to take an auto rickshaw for about 500 rupees for the return trip. Expect to pay 850 rupees or more for a taxi.Amber Fort is open daily from 8 a.m. until 5.30 p.m. To reach the entrance at the top, you can either walk uphill, ride on elephant back, go by jeep, golf cart, or take your vehicle.";
                    Intent i=new Intent(getApplicationContext(),Final1.class);
                    i.putExtra("image1",imageraj[position]);
                    i.putExtra("uname",s);
                    startActivity(i);
                }
                if(position==2)
                {String s="India is a mystical country indeed, with its numerous forts, forests and historical sites wrapped in its own unique enigma. One such site is Bhangarh Fort, which is located in Alwar district in Rajasthan. Deemed as one of the most haunted places in the world, Bhangarh fort's haunted stories are bone chilling yet fascinating all at the same time. The legends and stories related to Bhangarh make up for an interesting account.";
                    Intent i=new Intent(getApplicationContext(),Final1.class);
                    i.putExtra("image1",imageraj[position]);
                    i.putExtra("uname",s);
                    startActivity(i);
                }
                if(position==3)
                {String s="Another very important tourist destination in Rajasthan, this city is often left behind when it comes to curation of places to visit in Rajasthan. At 210 km from Jaipur, Bundi was once the native place of a tribe called Bunda Meena and hence inherited the name. The city is known for its magnificent forts, baoris (step reservoirs), lakes and ancient architectures.\n" +
                        "\n" +
                        "Best time to visit: All through the year\n" +
                        "Major attractions in Bundi: Nawal Sagar, Sukh Mahal, Dabhai Kund, Taragarh Fort, Bundi Palace, and several other steep well reservoirs\n" +
                        "Things to do in Bundi: Explore Badal Mahal inside the Taragarh fort for the ancient painting exhibiting the erst while opium trade, visit the baoris and understand the ancient technique of water harvesting, explore the forts and palaces\n";
                    Intent i=new Intent(getApplicationContext(),Final1.class);
                    i.putExtra("image1",imageraj[position]);
                    i.putExtra("uname",s);
                    startActivity(i);
                }
                if(position==4)
                {String s="Chittorgarh.....\n" +
                        "\n" +
                        "One of the most ancient cities in Indian history, Chittorgarh was founded by the Maurya dynasty in 734 AD. The city has been the birthplace for many a historical figures including Maharana Pratap and Meera Bai. It is situated on the banks of river Berach and has several heritage forts, monuments and associated stories and fables.\n" +
                        "\n" +
                        "Best time to visit: All through the year\n" +
                        "Major attractions in Chittorgarh: Chittorgarh fort, Rana Kumbha’s palace, Fateh Prakash Palace, Rani Padmini’s palace, Kumbhaswamini temple,Kirti Stambha, Vijay Stambha, Kalika Mata temple\n" +
                        "Things to do in Chittorgarh: Listen to the folk tales from the villagers, relish authentic Rajasthani cuisine";
                    Intent i=new Intent(getApplicationContext(),Final1.class);
                    i.putExtra("image1",imageraj[position]);
                    i.putExtra("uname",s);
                    startActivity(i);
                }
        }
    }
});
        }
    }

