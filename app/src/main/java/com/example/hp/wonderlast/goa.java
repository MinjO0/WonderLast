package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class goa extends AppCompatActivity {
ListView lvgoa;
Integer imagegoa[]={R.drawable.anjuna,R.drawable.arambol,R.drawable.calangute,R.drawable.candolim,R.drawable.margao};
String nm[]={"Anjuna","Arambol","Calangute","Candolim","Margao"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
        lvgoa=(ListView)findViewById(R.id.lvgoa);
        customadapter ad=new customadapter(this,imagegoa,nm);
        lvgoa.setAdapter(ad);
lvgoa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
switch(view.getId())
{
    case R.id.imageViewgeneral:
        if(position==0)
    {String s="Anjuna\n" +
            "Goa is one of the most toured places in India. Anjuna, a small village on the North coast of Goa, is amongst those few places to see in Goa which receive a lot of tourists. The Anjuna Beach is arguably amongst the best beaches in India. The beach has the perfect picturesque background with hills. \n" +
            "\n" +
            "The beach is blessed with beautiful red laterite rock.  Hundreds of people visit the Anjuna Beach every day and enjoy themselves by relaxing on the beach. A flea market is held on every Wednesday in the Anjuna beach. People from all around the state come to this flea market as one can get amazing products at really cheap prices here.\n" +
            "\n" +
            "Location: Anjuna, Goa 403509\n" +
            "\n" +
            "How to reach from Panaji: Anjuna Beach is 29 km away from Panaji and one can take buses or cab to reach there.\n" +
            "GET IN TOUCH\n" +
            "ANJUNA BEACH RESORT\n" +
            "Near Starco Junction, Behind Oxford Arcade, D’Mello Vaddo, Anjuna beach, Anjuna - Goa 403509\n" +
            "Sales@Anjunabeachresort.Com\n" +
            "Sales : +91 08322274499\n" +
            "Domnic : +91 9822380008\n" +
            "Dalton : +91 9637725807\n" +
            "Joseph : +91 9822176753\n";
        Intent i=new Intent(getApplicationContext(),Final1.class);
        i.putExtra("image1",imagegoa[position]);
        i.putExtra("uname",s);
        startActivity(i);
    }
        if(position==1)
        {String s="Arambol\n" +
                "\n" +
                "Arambol Beach is located in North Goa and first became popular when people came to it in order to escape  Baga and Calangute beach crowd. Today it is famous in its own right and draws several tourists, though not in the quantity that Baga and Calangute do. This is a good beach to visit if you are searching for a place that combines adventure sports in Goa with relaxation. The strong winds on the headlands around the beach make it an ideal spot for paragliding and kitesurfing.\n" +
                "\n" +
                "These sports are more well-known on the Arambol scene than the water sports which characterize the other beaches of Goa. The village of Arambol is a little distance away so you can get a feel of authentic local life if you step by the house sometime. Accommodation is available in the many huts that have come up around the beach and the food options around the place are many and varied owing to the numerous shacks that line the beach. If you want to step away from the crowd for a bit, you can walk onwards to Mandrem to the south. Kalacha Beach, north of Arambol, is where the best paragliding in Goa takes place.\n" +
                "\n" +
                "A verdant jungle near the beach makes for a good trekking option in Goa. Depending upon the time of the year, you can go swimming in the sea too. The Arambol “Sweetwater lake” and the banyan tree on the hilltop can be counted upon as its best sights. You might even catch the Tribal Dance Convention or the Annual Juggling Convention taking place here if you are lucky. A variety of musicians from India and abroad also tend to gather here, making it a good music destination too.\n" +
                "\n" +
                "Water Sports: Paragliding, Kitesurfing\n" +
                "\n" +
                "Location: Arambol, North Goa\n" +
                "\n" +
                "How to reach from Panaji: The beach is roughly 40km from Panaji. Take a bus or a cab for maximum convenience.\n" +
                "\n" +
                "Beach Side Restaurants: Shimon, Fellini, Double Dutch, Rice Bowl, German Bakery";
            Intent i=new Intent(getApplicationContext(),Final1.class);
            i.putExtra("image1",imagegoa[position]);
            i.putExtra("uname",s);
            startActivity(i);
        }
        if(position==2)
        {String s="Calangute\n" +
                "\n" +
                "The largest beach in Goa, Calangute Beach is also affectionately known as the “Queen of Beaches”. It is among the top ten beaches in the world, which means it is one of the tourist places in Goa that you should not miss. It is a big, serene beach with activities enough to fill your mind for the entirety of your trip. The beach alone is a great attraction for tourists. The beach is ideal for both the options,  lying down in the sand without the fear of being run over or trying your hand at some water sports.\n" +
                "\n" +
                "There are a lot of options to choose from. The distance of Calangute from Baga Beach is not great; the two beaches are only separated from each other by some rocks. You can choose to have breakfast or lunch at Baga or Calangute. There are also many great sight-seeing opportunities near Calangute such as Morjim Beach, St. Alex Church, the Water Pond of Arambol, Ashvem Beach, the Aguada Lighthouse & Aguada Fort, Nerul River, the Friday Local Mapusa Market, River Betul & Betul Estuary.\n" +
                "\n" +
                "You will find Calangute transformed into a beach for the party in Goa in the night as good as the one at Baga Beach. Since Calangute Beach is connected to most other important tourist spots in North Goa, it is a good place to reside in during your Goa visit.\n" +
                "\n" +
                "Water Sports: Calangute offers the best in water sports- enjoy kayaking, sailing, wind-surfing, water snorkeling, water-skiing, and fishing here. Parasailing is also a sport you can indulge in.\n" +
                "\n" +
                "Location: Calangute, North Goa\n" +
                "\n" +
                "How to reach from Panaji: Taking a taxi or cab is the easiest option to reach here\n" +
                "\n" +
                "Beach Side Restaurants: Pousada by the Beach, Zuperb, Sousa Lobo, A Reverie, The Chocolate Room\n" +
                "\n";
            Intent i=new Intent(getApplicationContext(),Final1.class);
            i.putExtra("image1",imagegoa[position]);
            i.putExtra("uname",s);
            startActivity(i);
        }
        if(position==3)
        {String s="Candolim\n" +
                "\n" +
                "unning from Calangute Beach on one side to Fort Aguada on the other is the Candolim Beach. The day activities offered on this beach are its best attraction. You can perform a whole host of activities on the beach including a vast array of water sports, all at very reasonable prices. You can choose to spend some time at Candolim Beach and then head over to Calangute next door or just spend all your day on this beach and explore the sights nearby.\n" +
                "\n" +
                "Renting a scooter in order to get around freely is the best option and will only cost around Rs.300/- for the day. Many churches and chapels dot its neighborhood and there is also an old lighthouse which stands inside Fort Aguada. The Fort Aguada Jail is also a tourist attraction. The best part about Candolim Beach is that it has significantly lesser footfall. You can enjoy the beauty of Goan beaches along with the activities they, have to offer without the crowds of Baga or Calangute. This also allows other activities to flourish on Candolim. Yoga is one such example.\n" +
                "\n" +
                "The beach is an ideal place for couples on their honeymoon or on a romantic getaway because it offers much-desired solitude but not at the cost of leaving you absolutely bored. There are some great resort in Goa which are Candolim like Hyatt, Radison Hotel, Taj and there are also several villas out for hire. Also, make sure to drop by the Stone House for some great blues live music in the evening when in Candolim.\n" +
                "\n" +
                "Water Sports: You can try parasailing, diving, jet-skiing, snorkeling, banana-boating or get on a boat and go bird and dolphin watching. Sea excursions are also available here.\n" +
                "\n" +
                "Location: Candolim\n" +
                "\n" +
                "How to reach from Panaji: The beach is located approximately 14km from Panaji, so depending upon your luggage needs ,a cab or scooter will serve you well.\n" +
                "\n" +
                "Beach Side Restaurants: Soi, House of Lloyds, Café Jazz, Bomra’s, The Mermaid  Restaurant, After 7\n";
            Intent i=new Intent(getApplicationContext(),Final1.class);
            i.putExtra("image1",imagegoa[position]);
            i.putExtra("uname",s);
            startActivity(i);
        }
        if(position==4)
        {String s="Margao\n" +
                "\n" +
                "\n" +
                "Combining an old world charm with the cosmopolitanism that characterizes modern Goa, Margao is definitely a microclausmic representation of everything that Goa characterizes. Surrounded in greenery, the picturesque town of Margao was once a major religious center and is today, Goa’s second largest town. \n" +
                "\n" +
                "Tourist Attractions of Margao:\n" +
                "Some of the most important tourist attractions of Margao are the relics of its rich associations with the Portuguese, which has influenced its history and shaped its present. Still retaining a part of that old-world charm, Margao is home to numerous examples of Portuguese architecture like Portuguese churches, and some magnificent specimens of old Portuguese houses complete with shady balcaos (porches) and oyster-shell windows in the Borda area of the region.\n" +
                "\n" +
                "\n" +
                "The Margao Goa City Tour brief itinerary is as below:\n" +
                "Tour Type\n" +
                "Full Day / Half Day\n" +
                "Covers\n" +
                "Margao City\n" +
                "Tour Start Point\n" +
                "From Your Hotel\n" +
                "\n" +
                "The Largo de Igreja, or the Church of the Holy Spirit as it is also known is one of the most important attractions of Margao, surrounded by beautiful white washed houses showcasing some of the best examples of the Portuguese late-Baroque architecture.\n" +
                "\n" +
                "Another important tourist attraction of the region is the \"House of Seven Gables\" or \"Sat Burzam Ghor\". Though, the name can be a bit misleading today as only 3 of the 7 gables survive, yet the building epitomizes an era of grandeur that Goa still holds on to.\n" +
                "The Municipal Gardens form another of the important tourist attractions of Margao and can be said to be the center of the town. Most of the restaurants and offices are located in and around this area along with the town’s library. \n" +
                "\n" +
                "Margao is Goa's second largest city and commercial metropolis of Salcete taluka in South Goa. It still retains semblance of Goa's Portuguese colonial past, and is connected to the rest of the Indian sub-continent by rail. Margao is the headquarters of South Goa District and is considered the main commercial city of Goa. It is famous for its ancient cultural heritage and traditional customs of the people of Goa. \n" +
                "\n" +
                "Charge Base\n" +
                "Min. 8 hours / 80 kms\n" +
                "Guests\n" +
                "2 – 4 pax\n" +
                "Type of Car\n" +
                "AC or Non AC Available\n" +
                "Charges\n" +
                "Kindly Call 09765227999\n";
            Intent i=new Intent(getApplicationContext(),Final1.class);
            i.putExtra("image1",imagegoa[position]);
            i.putExtra("uname",s);
            startActivity(i);
        }
}
    }
});
    }
}
