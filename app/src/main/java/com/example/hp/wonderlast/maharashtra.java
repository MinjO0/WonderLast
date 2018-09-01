package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class maharashtra extends AppCompatActivity {
    ListView lvmah;
    Integer imagemah[]={R.drawable.gate,R.drawable.nashik,R.drawable.ajanta,R.drawable.kolhapur,R.drawable.panchgani,R.drawable.aurang,R.drawable.matheran};
    String nm[]={"Gateway_of_India","Nashik","Ajanata_Ellora_Caves","Kolhapur","Panchgani","Aurangabad_Ajanta_Caves","Matheran"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);
        lvmah=(ListView)findViewById(R.id.lvmah);
        customadapter ad=new customadapter(this,imagemah,nm);
        lvmah.setAdapter(ad);
        lvmah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(view.getId())
                {
                    case R.id.imageViewgeneral:
                        if(position==0)
                        {String s="Construction Started : 31 March, 1913\n" +
                                "\n" +
                                "Construction Completed : 1924\n" +
                                "\n" +
                                "Inaugurated : 4 December, 1924\n" +
                                "\n" +
                                "Cost of Construction : 2.1 million Rupees in 1913\n" +
                                "\n" +
                                "Maintained By : Archeological Survey of India\n" +
                                "\n" +
                                "Where is it Located : Mumbai, Maharashtra, India\n" +
                                "\n" +
                                "Why was it Built : To commemorate the 1911 royal visit of King George Vand Queen Mary to Mumbai (erstwhile Bombay)\n" +
                                "\n" +
                                "Dimensions : The central dome is 48 feet in diameter and 83 feet in height\n" +
                                "\n" +
                                "Materials Used : Yellow Kharodi basalt and reinforced concrete\n" +
                                "\n" +
                                "Architectural Style : Indo-Saracenic with Muslim influences\n" +
                                "\n" +
                                "Architect : George Wittet\n" +
                                "\n" +
                                "Visit Timing : Open to public 24 hours a day, all days of the week\n" +
                                "\n" +
                                "Entry Fee : No entry fee";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==1)
                        {String s="Nasik is a religious Hindu city, host to the Kumbh Mela every 12 years. It also makes for a perfect wine tasting destination.\n" +
                                "\n" +
                                "Nashik (Nasik), named after a relic associated with Ramayana, is a city in Maharashtra located on the banks of river Godavari. Nashik plays host to the famous Kumbh Mela every 12 years. The city is home to plenty of exotic temples and is known in Hindu mythology as the place where Ravana's sister, Surpanakha, tried to seduce Lord Ram and got her nose cut off by Lakshman in the process. Its religious importance doesn't end there. It also plays host to the thousands of tourists visiting Shirdi and Trimbakeshwar. Apart from its temples, Nashik also has forts, waterfalls and vineyards to look out for. With multiple vineyards present in Nashik, the most popular being Sula, the wine-tourism industry is mushrooming in this part of Maharashtra. Nashik gives you the chance to experience a fabulous cocktail of extremes - from temples to vineyards, hills to waterfalls, this place offers a lot to see.";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==2)
                        {String s="The UNESCO World Heritage Site of Ajanta and Ellora Caves is one of the unmissable tourist attractions in Maharashtra. Located close to Aurangabad, the heritage site pays tribute to the excellent craftsmanship of artisans and sculptors by hammer and chisel.\n" +
                                "\n" +
                                "Enveloped by jungles, the Ajanta and Ellora caves are an amalgamation of Buddhist, Jain and Hindu monuments as the complex includes both Buddhist monasteries as well as Hindu and Jain temples. There are 34 caves at Ellora that date between the 6th and 11th centuries AD, and 29 caves at Ajanta that are said to date back between 2nd century BC and 6th century AD. While the Ajanta caves have gorgeous paintings and sculptures, the Ellora caves are well-known for their extraordinary architecture. Explore Ajanta tour packages.\n" +
                                "\n" +
                                "Famous for: UNESCO World Heritage Site, History, Heritage, Culture.\n" +
                                "\n" +
                                "Ideal Visit Time: 1 Day.\n" +
                                "\n" +
                                "Now you can explore places of interest and delights with well-customized Maharashtra tour packages.";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==3)
                        {String s="Located on the banks of the Panchganga River, Kolhapur is one of the former Princely states of the Marathas. It was ruled by the Bhosale Chhatrapati (Bhosale royal clan) of the Maratha Empire. Having been the core of the Maratha Empire, it is famous for its various historical monuments and cultural heritage of the Marathas. During the major Hindu festivals like Holi, Diwali, Ganesh Chaturthi, Vijaya Dashami and Navaratri, the town is quite appealing and you must pay a visit. The highlights of the town include the special ‘kolhapuri slippers’ and the kolhapuri cuisines are worth trying out. Explore these customized Kolhapur tour packages.\n" +
                                "\n" +
                                "Famous for: Heritage, History, Kolhapuri chappal.\n" +
                                "\n" +
                                "Places to Visit in Kolhapur: Mahalakshmi Temple, Jyotiba Temple, Rankala Lake, Chhatrapati Sahu Museum, Panhala Fort\n" +
                                "\n" +
                                "Ideal Visit Time: 1 day.\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==4)
                        {String s="Panchgani gets its name from the five hills surrounding it. One of the most popular places in Maharashtra, the hill station is famous for its sunrise & sunset points, scenic valley views and exciting activities.\n" +
                                "\n" +
                                "Settled at 1334m, the picturesque backdrop had lured the colonials of the British Era. Equally popular till date, the town tempts couples on honeymoon, families, nature lovers, and adventure lovers, especially during the refreshing monsoon. Bliss in essence, Panchgani is perfect for sightseeing, paragliding, trekking, hiking, cycling, and enjoying the natural scenery.\n" +
                                "\n" +
                                "Famous for: Hill Station, Views, Nature, Temples.\n" +
                                "\n" +
                                "Places to Visit in Panchgani: Table Land, Mapro Farms, Sydney Point, Lingmala Falls, Kate’s Point, Arthur Seat, Dhom Dam, Bhilar Waterfalls, and Elephant’s Head Point.\n" +
                                "\n" +
                                "Ideal Visit Time: 2-3 Days";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==5)
                        {String s="The Ajanta caves are located in the northern part of the state of Maharashtra, India. The place is situated in the district of Aurangabad, which is around 400 km from Mumbai. The Aurangabad city is around 107 km from the caves. The location of the Ajanta caves is 75 degrees 40' N and 20 degrees 30' E. The river Waghora flows nearby and is in the midst of the mighty Sahyadri hills. There are thick forests surrounding the caves, which is why these have remained secluded since millennia. Nearby important cities are Pune (232 km), Ellora (32 km), Nasik (224 km), Nanded (275 km) and Mumbai (400 km).\n" +
                                "\n" +
                                "When to visit\n" +
                                "\n" +
                                "The best time to visit if from November to March, when the weather is pleasant and winters arrive. Summers are hot (April to May). Monsoons begin in the month of June and continue till October, making it unpleasant to visit in the rains. Avoid visiting the caves during the holiday season also, as there is a mad rush of visitors.\n" +
                                "\n" +
                                "Opening time\n" +
                                "\n" +
                                "The caves are opened in the morning at 9 a.m. and closed at 5:30 p.m. Mondays are closed completely.\n" +
                                "\n" +
                                "Entry fee\n" +
                                "\n" +
                                "Entry for children under 15 years is free, while adults are charged Rs. 10 per head for Indians and Rs. 250 per head for foreigners.\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==6)
                        {String s="One of the must visit places in Maharashtra, Matheran is next on our list. Located at 800 meters above sea level, in the lap of Sahyadri, it’s a loved summer retreat for the city dwellers. The hill town has a no-vehicles policy so the environment is clean and fresh. There are 38 scenic look-out points opening to the panoramic beauty. The Matheran toy train is one of the scenic mountain railways in India. Scenic treks, horse rides and adventure sports offer thrill on your vacation.\n" +
                                "\n" +
                                "Famous for: Hill Station, Nature, Views.\n" +
                                "\n" +
                                "Places to visit in Matheran: Celia Pt, Echo Point, Louisa Point, Charlotte Lake, Alexander Point, One Tree Hill, Pisharnath Mahadev Mandir, Hart Point, Monkey Point, Porcupine Point Panorama Point, Louisa Point, One Tree Hill Point, Rambagh Point.\n" +
                                "\n" +
                                "Ideal Visit Time: 1 day or a weekend trip.";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagemah[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                }
            }
        });
    }
}
