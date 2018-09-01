package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class haryana extends AppCompatActivity {
    ListView lvhar;
    Integer imagehar[]={R.drawable.morni,R.drawable.mansadevi,R.drawable.pinjore,R.drawable.tikar};
    String nm[]={"Morni Hills ","Mansa Devi","Pinjore","Tikar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);
        lvhar=(ListView)findViewById(R.id.lvhar);
        customadapter ad=new customadapter(this,imagehar,nm);
        lvhar.setAdapter(ad);
        lvhar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(view.getId())
                {
                    case R.id.imageViewgeneral:
                        if(position==0)
                        {String s="\n" +
                                "Morni Hills\n" +
                                "A sleepy hill station in Harayana, Morni Hills is frequently visited by the residents of Delhi, Harayana and Chandigarh. With greenery spread all around, Morni Hills is the perfect weekend getaway destination. Shivalik range of Himalayas is expanded all across Morni. If you are looking for a few hours of peacefulness and just relaxing around, Morni Hills is your ideal hill station. It has good connectivity with the major cities that surround it, and the temperature is pleasing throughout the year. As it’s the only hill station in Harayana, people often overlook it and head towards more popular places. But if you like to explore the unexplored, you must visit Morni Hills.\n" +
                                "Contact :- \n" +
                                "Amit Kumar : 7508089898\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehar[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==1)
                        {String s="Mansa Devi \n" +
                                "             Mata Mansa Devi Temple at Panchkula is a symbol of Himalayan culture and faith. The shrine located on the foothills of Shivalik is an epitome of age old tradition of ‘Shakti’ worship in Northern India. Himalaya being the abode of Shiva and his consort 'shakti' became centre of Shakti worship. In the vicinity of Panchkula, there are numerous Shakti worshipping centers known by their names such as Chandi, Kalika, Mansa, Bhima, etc.\n" +
                                " Sr. No\t Name Of Officer\t Designation\t Mobile No\n" +
                                " 1.\tSh. S P Arora\tChief Executive Officer\t9501311333\n" +
                                "  Sr. No\t Name Of Employee\t Designation\t Mobile No\n" +
                                " 1.\t Smt. Sharda Parajapati\t Secretary,SMMDSB\t 9501648811\n" +
                                " 2.\t Sh. Prithavi Raj\t Secretary, KALKA\t  9215882197\n" +
                                " 3.\t  Sh. Rakesh Pahuja\t SDE\t 9815336655\n" +
                                " 4.\t  Sh. Ajit Saini\t Account Officer\t 9780598289\n" +
                                " 5.\t  Sh. Surdarshan Kumar\t Senior Head Pujari\t 9463915680\n" +
                                " 6.\t Sh. Ramesh Kumar\t Assistant, Establishment\t 9988616357\n" +
                                " 7.\t  Sh. Ram Karan\t  Electrical\t 9417315164\n" +
                                " 8.\t Sh. Sant Raj\t Security Guard\t 9467930255\n" +
                                " 9.\t Smt. Parvinder\t  Accountant\t 9988529619\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehar[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==2)
                        {String s="Pinjore\n" +
                                "Located in the valley overlooking the lower Shivalik regions, Pinjore is a part of the Panchkula district of Haryana. Shivalik marks the beginning of one of the most spectacular mountains that provide a haven for tourists and trekkers. This ancient, religious location deriving its name from Panchpura— the town of the Pandavas, is found close to Chandigarh, over 1,800 feet above sea level. Being rich in cultural heritage, Pinjore is best known for its Mughal and Pinjore Gardens. Major languages spoken are Hindi and Punjabi. Weather conditions are quite moderate, and the best time to visit is towards the end of monsoon when the town is surrounded by lush green trees and a cool atmosphere.\n" ;

                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehar[position]);
                            i.putExtra("uname",s);
                            startActivity(i);
                        }
                        if(position==3)
                        {String s="Tikar Tal\n" +
                                "Situated at a distance of 7 km from the beautiful Morni Hills, Tikkar Taal is a place which boasts of its two manmade lakes. A hillock divides these two interconnected artificial lakes, Chota Taal and Bara Taal. Lying amidst the hills, Tikkar Taal presents a resplendent view of the hills. There are not much accommodations present in Tikkar Taal due to its lack of popularity, but it doesn’t scare away the lovers of nature. You can get cheap rooms here. This place is apt for people who are on a budget travel.  Tikkar Taal is untouched by commercialisation, and is an ideal place to be.\n";
                            Intent i=new Intent(getApplicationContext(),Final1.class);
                            i.putExtra("image1",imagehar[position]);
                            i.putExtra("uname",s);
                            startActivity(i);}
                }
            }
        });
    }
}
