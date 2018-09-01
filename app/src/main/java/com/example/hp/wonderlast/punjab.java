package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class punjab extends AppCompatActivity {
    ListView lvpun;
    Integer imagepun[]={R.drawable.goldentemple,R.drawable.partiotonmuseum,R.drawable.jaliyawala,R.drawable.virastekhalsa,R.drawable.waghaborder};
    String nm[]={"Golden temple","Partition onmuseum","Jaliawala Bagh","Virast-e-khalsa","Waghaborder"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);
        lvpun=(ListView)findViewById(R.id.lvpun);
        customadapter ad=new customadapter(this,imagepun,nm);
        lvpun.setAdapter(ad);
        lvpun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(view.getId())
                {
                    case R.id.imageViewgeneral:
                        if(position==0)
                        {String s="Golden Temple\n" +
                                "Also known as Harmandir Sahib (Temple of God), the Golden temple is one of the prime tourist attractions in Punjab and the most important pilgrim spot for the Sikh community. The temple is said to be the focal point behind the founding and naming of the city of Amritsar. The 4th Guru of the Sikh community excavated a tank and named it ‘Amritsar’ which literally means the ‘pool of the nectar of immortality’ and built the temple on the pool which we know today as the Golden temple.\n" +
                                "Timings : - 3AM–10PM\n" +
                                "Contact :-\n" +
                                "Shiromani Gurdwara Parbandhak Committee,\n" +
                                "Teja Singh Samundri Hall, Golden Temple Complex,\n" +
                                "Sri Amritsar\n" +
                                "\n" +
                                "Pbx. : 0183-2553957-58-59\n" +
                                "Fax : 0183-2553919\n" +
                                "Email : info@sgpc.net\n" +
                                "(office time : 09:30 a.m. to 4.30 p.m\n" +
                                "\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagepun[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==1)
                        {String s="Partition Museum\n" +
                                "The Partition Museum comprehensively charts the Partition with a narrative arc that moves from the time before partition, proceeds to the independence movement, the early demands for separate countries, and ultimately the Partition and its consequences.\n                                \"The Partition Museum comprehensively charts the Partition with a narrative arc that moves from the time before partition, proceeds to the independence movement, the early demands for separate countries, and ultimately the Partition and its consequences.\\n\";\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagepun[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==2)
                        {String s="Jaliawala Bagh\n" +
                                "The public garden is located within the temple complex of the Golden temple and covers an area of 6.5 acre. The garden’s significance lies in the Jallianwala bagh memorial located here, which was established in 1951 to commemorate the massacre of the peaceful Sikh celebrators on the occasion of the Punjabi New Year on April 13th, 1919 by the occupying British forces. Sources claim there were around 397 fatalities and about 1100 were wounded, however the true figures were never known and are likely to be way higher than 397.\n" +
                                "Timings :- 6:30AM–7:30PM\n" +
                                "contact us\n" +
                                "jallianwalagagh@gmail.com\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagepun[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==3)
                        {String s="Jaliawala Bagh\n" +
                                "The public garden is located within the temple complex of the Golden temple and covers an area of 6.5 acre. The garden’s significance lies in the Jallianwala bagh memorial located here, which was established in 1951 to commemorate the massacre of the peaceful Sikh celebrators on the occasion of the Punjabi New Year on April 13th, 1919 by the occupying British forces. Sources claim there were around 397 fatalities and about 1100 were wounded, however the true figures were never known and are likely to be way higher than 397.\n" +
                                "Timings :- 6:30AM–7:30PM\n" +
                                "contact us\n" +
                                "jallianwalagagh@gmail.com\nThe Virasat-e-Khalsa, the first of its kind, will provide a space in which the impassioned drama of this heritage shall unfold. For the Sikhs, this Complex would serve as a reaffirmation of roots. For the non-Sikhs, it will be an inspiring journey into a spirited culture, providing a fascinating insight into the Sikh faith and its history.\n" +
                                "Timings :-10AM–6PM\n" +
                                "\n" +
                                "Contact Virasat-e-khalsa\n" +
                                "\n" +
                                "By Mail\n" +
                                "For any kind of inquiry - khc_asf@yahoo.co.in\n" +
                                "By Post\n" +
                                "Chandigarh Office\n" +
                                "Anandpur Sahib Foundation\n" +
                                "Plot No. 3, sector 38-A, Chandigarh – 160036, India \n" +
                                "\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagepun[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==4)
                        {String s="\n" +
                                "Wagha Border\n" +
                                "The name Wagah refers to a village in Pakistan, through which the controversial Radcliff line which discriminates the border of India from Pakistan was drawn during the partition at the time of Indian independence in 1947. The eastern half of the village remains in India while the western half is in Pakistan. The place lies on the Grand Trunk road and was the only link between the two countries before the opening of the Aman Setu in Kashmir in 1999\n" +
                                "About Wagah Border\n" +
                                " Weather:   35° C\n" +
                                "\n" +
                                " Time Required: 1-2 hours\n" +
                                "\n" +
                                " Open Time: 10:00 AM - 4:00 PM. The ceremony takes place at 4:15 PM in winters and 5:15 PM in summers.\n" +
                                "\n" +
                                " Cost: No entry fee\n" +
                                "\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagepun[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                }
            }
        });
    }
}
