package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class gujarat extends AppCompatActivity {
    ListView lvgujarat;
    Integer imagegujarat[]={R.drawable.r,R.drawable.dwarka,R.drawable.saputara,R.drawable.akshardham,R.drawable.somnath};
    String nm[]={"Rann of Kutch ","Dwarka","Saputra","Akshardham","Somnath-temple"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat);
        lvgujarat=(ListView)findViewById(R.id.lvgujarat);
        customadapter ad=new customadapter(this,imagegujarat,nm);
        lvgujarat.setAdapter(ad);
        lvgujarat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(view.getId())
                {
                    case R.id.imageViewgeneral:
                        if(position==0)
                        {String s="Rann of Kutch\n" +
                                "The White Salt Desert is definitely a place that one should visit in his lifetime. The Great Rann of Kutch is by far the largest white salt desert in India and is truly a magnificent destination to be at. One can enjoy camel safaris on a moonlit night (During the Rann Utsav in December-March). Accommodation is available at the nearby villages called Dhordo and Hodka. It is once in a lifetime experience to be at Great Rann, and is indeed one of the best weekend tours you will ever plan in your life!\n" +
                                "Contact :-\n" +
                                "Inquire  by email at akshartours@ymail.com Or Call  at +91-79- 2644 0626 / 2656 0637 / 2656 0360 / 2644 5037, Mobile us at 9978603453, 7567640250, 98673332484, Inquire Now.\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagegujarat[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==1)
                        {String s="Dwarka\n" +
                                "Dwarka needs no introduction; this sacred city of Lord Krishna has unspoiled charm that draws a large number of Hindu devotees all year long. One of the four Dhams in India (Hindu Pilgrimage Destinations), Dwarka is nestled in the lap of Gujarat, offering divinity and abundant peace to everyone who visits it. Amongst the most important places to visit in Dwarka, Dwarkadhish Temple is a five-storied shrine believed to had been constructed 1400 years ago. Other than this, you would love to see Bet Dwarka, Okha (30kms from Dwarka) and different temples dedicated to Rukmini (Lord Krishna’s Wife), Mirabai, Narsinh Mehta and Shank Narayan.\n" +
                                "Contact Address\n" +
                                "Shree Dwarkadhish Temple Dwarka : 361 335, Dist.: Jamnagar ,Gujarat- India.\n" +
                                "Phone:STD CODE +91- 2892,Office : 234080 Res: 234090\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagegujarat[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==2)
                        {String s="Saputra\n" +
                                "Perhaps the only hill station in Gujarat, Saputara is unlike any other places that you would visit in the state. Nestled amidst the Sahyadris, Saputara offers respite from the hot and humid climate. Surrounded by green rolling hills, this hill station is quite picturesque. The soothing air and the charming people add to the reasons as to why one should visit Saputara. The main attractions here include Hatgad Fort, Sunrise point, The Ropeway, Boating in Lake Saputara and Artist Village. This beautiful town is situated about 170kms from Surat.\n" +
                                "Conatct :-\n" +
                                "Registered office: Udyog Bhavan, Block No. 16, 4th Floor, Sector-11, Gandhinagar - 382 011. Tel: +91 79 23977200\n" +
                                "\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagegujarat[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==3)
                        {String s="Akshardham\t\n" +
                                "Each element of Akshardham echoes with spirituality – the mandir, the exhibitions and even the gardens. The Akshardham mandir has over two hundred murtis (idols), representing spiritual stalwarts from over many millennia. The spiritual premise of Akshardham is that each soul is potentially divine. Whether we are serving the family, our neighbors, the country, or people all around the world, each act of kindness can help one move towards divinity. Each prayer is an endeavor in self-improvement and a step closer to God.\n" +
                                "A visit to Akshardham is an enriching experience. Whether it is in realizing the power of prayer, in feeling the strength of non-violence, in becoming aware of the universal nature of Hinduism’s ancient principles, or just in admiring the beauty of God’s abode on Earth – each element has a resounding significance.\n" +
                                "TIMINGS\n" +
                                "Swaminarayan Akshardham, Gujarat - Timinings\n" +
                                "Tuesday to Sunday \n" +
                                "First Entry: 9:30am \n" +
                                "Last Entry: 7:30pm\n" +
                                "CLOSED: EVERY MONDAY\n" +
                                "\n" +
                                "Swaminarayan Akshardham\n" +
                                "Sector 20, 'J' Road, Gandhinagar - 382 020 Gujarat, India\n" +
                                "Phone: (91-79) 2326 0001, 2326 0002 Fax: (91-79) 2326 0336\n" +
                                "Email:gujrat@akshardham.com \n" +
                                "web:  akshardham.com/gujrat\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagegujarat[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==4)
                        {String s="Somnath\n" +
                                "A holy town in Junagadh district, Somnath is revered highly as one of the places where the Jyotirlingas of Lord Shiva are kept. The temple is the centre point of all the local and tourists activities of the town. Although, Somnath Temple is the reason behind Somnath being a popular tourist attraction, another reason can be its scenic location near the coast. So, other than visiting temples and cleansing one’s soul, tourists can enjoy some good time at the beach as well. Junagadh Gate and Panch Pandav Gufa (Cave) are the famous tourist destinations in Somnath.\n" +
                                "»Timing \n" +
                                "Timing for Darshan at Somnath Temple : 6.00am to 9.00pm \n" +
                                "Timing for Aarti : 7.00 am, 12.00 Noon and 7.00 pm\n" +
                                "\"Jay Somnath\" Sound and Light Show : 8.00 pm to 9.00 pm\n" +
                                "Contacts:-\n" +
                                "For POOJA VIDHI, YAGNA & GENERAL DONATION\n" +
                                "Temple Supervisor\n" +
                                "Mobile No. 94282 14915  / 9428214823\n" +
                                "\n" +
                                "CONTACT FOR GUESTHOUSE ROOM BOOKING :\n" +
                                "Shree Somnath Trust\n" +
                                "Somnath Prabhas Patan - 362 268\n" +
                                "District : GIRSOMNATH, Gujarat.\n" +
                                "Phone No :\n" +
                                "Tanna Guest House : +91-2876-231212\n" +
                                "Lilavati Guest House: +91-2876-233033\n" +
                                "Maheshwari G.House:+91-2876-233130\n" +
                                "Sagar Darshan G.H. : +91-2876-233533\n" +
                                "Please Contact Central Booking office For General Enquiry on Guest House Room Booking\n" +
                                "Mobile No : +91-94282 14914 (8 Am To 9 Pm)\n" +
                                "email : somgh11@gmail.com\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagegujarat[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                }
            }
        });
    }
}
