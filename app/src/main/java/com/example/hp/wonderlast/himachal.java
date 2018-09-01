package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class himachal extends AppCompatActivity {
    ListView lvhim;
    Integer imagehim[]={R.drawable.jakhoo,R.drawable.dalhousie,R.drawable.dharmshalastadium,R.drawable.manali,R.drawable.kullu};
    String nm[]={"Jakhoo","Dalhousie","Dharmshala stadium","Manali","Kullu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal);
        lvhim=(ListView)findViewById(R.id.lvhim);
        customadapter ad=new customadapter(this,imagehim,nm);
        lvhim.setAdapter(ad);
        lvhim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(view.getId())
                {
                    case R.id.imageViewgeneral:
                        if(position==0)
                        {String s=".Jakhoo\n" +
                                "\n" +
                                "The top of the hill is 2 km away from the Ridge. Pranks of monkeys and panorama of Shimla town are added attractions besides the old temple of Lord Hanuman recently renovated. Known for Dussehra Day celebrations. \n" +
                                "\n" +
                                "Jakhoo Temple, ShimlaJakhoo Hill is 2 km from the Ridge, at a height of 2500m. Jakhu Hill is the highest peak in Shimla and offers a beautiful view of the town and of the Himalayas. At the top of the Jakhu Hill, is an old temple of Hanuman, which is also the home of countless playful monkeys. The Hanuman Mandir at the top of Jakhu hill is the highest point in town. This Hanuman Mandir is one of the most favoured spots for tourists and pilgrims. The monkeys around the temple surprisingly do attack people; they however look for food from tourist and pilgrims. It is a steep 45 minute walk to the top of the hill, however for those who are not familiar with hill or mountain climbing it will take more than an hour. On the way to the top of the hill, there are beautiful views of hills, surrounding valleys, huge trees and of course the playful monkeys jumping from one tree to another.\n" +
                                "\n" +
                                "\n" +
                                " \t \n" +
                                "\n" +
                                " The Jakhu Hanuman Mandir is believed to be in existence from the times ofRamayana. The Hanuman Mandir is said to be formed when Hanumanvisited Jakhu Hill. According to the local legends, Hanuman visited this placeduring the famous Rama - Ravana fight. Lakshmana, the younger brother of Rama, was critically injured during the fight with Indrajit, the mighty son ofRavana. Only medicinal (Sanjivi) herb can save Lakshmana’s life. Jambavanrequested Hanuman to fetch the herb. The herb is only available in theHimalayan range. Hanuman came to Himalayas to search for the herb, butgot confused, so as to which was the particular herb. Out of desperation, heuprooted the whole mountain, which contained the herbs and flew to Lanka,where injured Lakshmana with Rama, Sugriva, Vibhishana, Jambavan andothers warriors were waiting for him. With just the smell of the herb,Lakshmana and the other warriors became conscious.\n" +
                                "Jakhu temple on Jakhu Hill, ShimlaThe Jakhu Hanuman Mandir is believed to be in existence from the times of Ramayana. The Hanuman Mandir is said to be formed when Hanuman visited Jakhu Hill. According to the local legends, Hanuman visited this place during the famous Rama - Ravana fight. Lakshmana, the younger brother of Rama, was critically injured during the fight with Indrajit, son of Ravana. Only medicinal (Sanjivani Buti) herb can save Lakshmana’s life. Jambavan requested Hanuman to fetch the herb. The herb is only available in the Himalayan range. Hanuman came to Himalayas to search for the herb, but got confused, so as to which was the particular herb. Out of desperation, he uprooted the whole mountain, which contained the herbs and flew to Lanka, where injured Lakshmana with Rama, Sugriva, Vibhishana, Jambavan and others warriors were waiting for him. With just the smell of the herb, Lakshmana and the other warriors became conscious. On his way back, Hanuman rested on the Jakhu Hills, and the top of the hill got flat by his and mountain’s weight. The place where he sat has been converted into a small temple, where his footprints are preserved till today. The Jakhu Temple has since been highly revered by the locals. The entrance of Hanuman Mandir at Jakhu Hill, inside the temple there are several beautiful painting of various scenes from the Ramayana. Shimla is a must visit hill station while in India. Although there are several places to visit in Shimla, no visit to Shimla will be complete without hiking the Jakhu Hill and a visit to the Hanuman Mandir.\n" +
                                "Jai Bajrang Bali !\n" +
                                "HOW TO REACH :\n" +
                                "Jakhu Temple is situated at a height of around 2 Km from the base of Jakhu hill. To reach the temple, a trek of 2 kms, through dense pine forests is required. The trek is very tiring. One can also hire ponies from the base of hills, to take a to and fro ride to temple. Walking sticks are also available at the shops on the base of Jakhu hill.\n" +
                                "Other Interesting Places in  and around Shimla\n" +
                                "\n" +
                                " Rampur\n" +
                                " Sarahan\n" +
                                " Pabbar Valley\n" +
                                " The Mall\n" +
                                " Indian Institute of Advance Studies\n" +
                                " Himachal Pradesh State Museum\n" +
                                " Jakhoo Hill\n" +
                                " Annadale\n" +
                                " The Glen\n" +
                                " Summer Hill\n" +
                                " Chadwick Falls\n" +
                                " Kamna Devi Temple\n" +
                                " Kufri\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehim[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==1)
                        {String s=".Dalhousie\n" +
                                "\n" +
                                "Dalhousie is yet another hill station in Himachal Pradesh which is ideal for de-stressing in the serene, tranquil troposphere. Away from the hustle-bustle of the city life, sit back and enjoy the nature in Dalhousie.\n" +
                                "\n" +
                                "Ideal for: Honeymooners\n" +
                                "Ideal duration: 2-3days\n" +
                                "Best time to visit: April to July\n" +
                                "\n" +
                                "How to reach: The closest airport is Dharamsala which is 5 hours away. The closest railhead is Pathankot’s Chakki Bank (71 kms from Dalhousie) and then take a cab which takes around 10 hours.\n" +
                                "\n" +
                                "Things to do:\n" +
                                "\n" +
                                "Experience the beauty of nature in the valley of Khajjar which is also known as the Switzerland of India\n" +
                                "Enjoy a gentle walk or a trek in the beautiful terrain in Dainkund Walk, Ganji Pahadi Walk and Bakrota Walk.\n" +
                                "Visit the St. John’s Church, oldest church of the town carries vast historical implication\n" +
                                "Relish the cascading waterfalls near Delhi – namely the Chamera falls and the Satdhara falls\n" +
                                "\n" +
                                "Nearby famous places: Dharamshala, Khajjiar, Kalatop";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehim[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==2)
                        {String s="Dharamsala definitely has to be on your list of best places to visit in Himachal Pradesh. Famous not only because of its climate but also you get to see how multicultural Indian community lives in harmony with the Indo Tibetan community.\n" +
                                "\n" +
                                "Ideal for: Friends or Solo Travelers\n" +
                                "Ideal duration: 2-3days\n" +
                                "Best time to visit: May –July and November-January for snowfall\n" +
                                "\n" +
                                "How to reach: The nearest major railway station is at Pathankot, 85 kilometres away. Dharamshala is well-connected to Delhi The journey is almost 520 kilometres from Delhi. The drive from Delhi via Chandigarh, is about 12 hours.\n" +
                                "\n" +
                                "Things to do:\n" +
                                "\n" +
                                "Enjoy a boat ride across the Dal Lake and witness the royal the Kangra Fort.\n" +
                                "Pay homage to the Bhagsunath Temple, dedicated to Lord Shiva and simultaneously enjoy the cascading Bhagsu falls.\n" +
                                "Visit various monasteries, the Kangra Art Museum, the Dalai Lama Temple Complex and see the magnificent tea plantation on the foothills of Kangra valley.\n" +
                                "Nearby famous places: Khajjiar, Bir Billing, Palampur";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehim[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==3)
                        {String s="One of the best place to visit in Himachal Pradesh is Manali. If you are on a lookout for fresh air and green mountains amidst the snow covered ranges then Kullu Manali, indeed should be on the top of your list.\n" +
                                "\n" +
                                "Ideal for: Everyone! But it is a hot favorite amongst newlyweds.\n" +
                                "Ideal duration: 4-5 days\n" +
                                "Best time to visit: May-July. November-January for snowfall.\n" +
                                "\n" +
                                "How to reach: Chandigarh is the nearest airport, 252 Kms away. Nearest rail head is also in Chandigarh, 270 Kms away. \n" +
                                "Things to do:\n" +
                                "\n" +
                                "Indulge in adventure sports at Solang Valley\n" +
                                "Visit Manali Bird Sanctuary\n" +
                                "Visit the Old temples\n" +
                                "Nearby famous places: Solang, Rohtang, Manikaran, Malana, Khirganga";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehim[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==4)
                        {String s="Height: 1,230 m\n" +
                                "Area: 5,503 sq.kms \n" +
                                "Population: 3,81,571\n" +
                                "Languages: Hindi, Punjabi, Pahari, English are understood and spoken by the people engaged in tourism trade \n" +
                                "\n" +
                                "The most charming and beautiful Kullu valley spreads out its charm on either side of river Beas. The valley runs north to south of this river and is 80 km long and about 2 km at its broadest. Yet with awe inspiring glens and mossy meadows encircled by the rushing streams and meandering brooks, flung east & west, a fairly wide area is open to the tourists, the trekkers, the mountaineers, the artists and to anyone who wishes to escape the heat & dust of the plains to breathe the exhilarating air of the Himalaya and enjoy the spectacle of the variegated mountain scenery. The valley is also famous for its exquisitely woven colorful handmade shawls and Kullu caps.\n" +
                                "\n" +
                                "\n" +
                                "Kullu (1230m) was once known as Kulanthapitha - the end of the habitable world. Beyond rose the forbidding heights of the Greater Himalaya and by the banks of the shining river Beas lay the fabled Silver Valley. Kullu got its first motorable access only after independence. The long centuries of seclusion have however allowed the area to retain a considerable measure of its traditional charm. Here is the core of an intricate web of numerous valleys, each of which is a visual delight and seems more beautiful than the other.\n" +
                                "\n" +
                                "\n" +
                                "The Silver Valley has nature's treasures that lie carelessly scattered as flowers. This wealth nestles by every tree in the splendid forests, bursts forth in the blooms and in the fruit of every orchard. Here are riches which cannot be measured and echo down the ages with the words of every myth and ancient legend and glow in the warm smiles of its gentle people. There is pleasure in every step you take in these enchanted valleys and in every gurgle you hear in the clear mountain streams.\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehim[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                }
            }
        });
    }
}
