package com.android.activity01_a

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.HorizontalScrollView
import androidx.appcompat.app.AppCompatActivity
import com.android.activity01_a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val horizontal = findViewById<HorizontalScrollView>(R.id.horizontal)


        val application = binding.application.text
        Log.d("MainActivity", "1: $application")

        val position = binding.position.text
        Log.d("MainActivity", "2: $position")
        //EditText
        val position1 = binding.position1
        val positionval = position1.text.toString()
        Log.d("MainActivity", "3: $positionval")

        val salary = binding.desired.text
        Log.d("MainActivity", "4: $salary")
        //EditText
        val salary1 = binding.desired1
        val salaryval = salary1.text.toString()
        Log.d("MainActivity", "5: $salaryval")

        val date = binding.date.text
        Log.d("MainActivity", "6: $date")
        //EditText
        val date1 = binding.date1
        val dateval = date1.text.toString()
        Log.d("MainActivity", "7: $dateval")

        val personal = binding.personal.text
        Log.d("MainActivity", "8: $personal")


        //EditText
        val last1 = binding.lname1
        val last2 = last1.text.toString()
        Log.d("MainActivity", "9: $last2")
        //TextView
        val last = binding.lname.text
        Log.d("MainActivity", "10: $last")

        //EditText
        val first1 = binding.fname1
        val first2 = first1.text.toString()
        Log.d("MainActivity", "11: $first2")
        //TextView
        val first = binding.fname.text
        Log.d("MainActivity", "12: $first")

        //EditText
        val middle1 = binding.mname1
        val middle2 = middle1.text.toString()
        Log.d("MainActivity", "13: $middle2")
        //TextView
        val middle = binding.mname.text
        Log.d("MainActivity", "14: $middle")

        //EditText
        val address1 = binding.address1
        val address2 = address1.text.toString()
        Log.d("MainActivity", "15: $address2")
        //TextView
        val address = binding.address.text
        Log.d("MainActivity", "16: $address")

        //EditText
        val city1 = binding.city1
        val city2 = city1.text.toString()
        Log.d("MainActivity", "17: $city2")
        //TextView
        val city = binding.city.text
        Log.d("MainActivity", "18: $city")

        //EditText
        val state1 = binding.state1
        val state2 = state1.text.toString()
        Log.d("MainActivity", "19: $state2")
        //TextView
        val state = binding.state.text
        Log.d("MainActivity", "20: $state")

        //EditText
        val zip1 = binding.zip1
        val zip2 = zip1.text.toString()
        Log.d("MainActivity", "21: $zip2")
        //TextView
        val zip = binding.zip.text
        Log.d("MainActivity", "22: $zip")

        val home = binding.home.text
        Log.d("MainActivity", "23: $home")
        //EditText
        val home1 = binding.home1
        val home2 = home1.text.toString()
        Log.d("MainActivity", "24: $home2")

        val cell = binding.phone.text
        Log.d("MainActivity", "25: $cell")
        //EditText
        val cell1 = binding.phone1
        val cell2 = cell1.text.toString()
        Log.d("MainActivity", "26: $cell2")

        val email = binding.email.text
        Log.d("MainActivity", "27: $email")
        //EditText
        val email1 = binding.email1
        val email2 = email1.text.toString()
        Log.d("MainActivity", "28: $email2")

        val social = binding.security.text
        Log.d("MainActivity", "29: $social")
        //EditText
        val social1 = binding.security1
        val social2 = social1.text.toString()
        Log.d("MainActivity", "30: $social2")

        val citizen = binding.citizen.text
        Log.d("MainActivity", "31: $citizen")
        //checkbox
        val yes = findViewById<CheckBox>(R.id.yes1)
        Log.d("MainActivity", "32: ${yes.isChecked}")
        val no = findViewById<CheckBox>(R.id.no1)
        Log.d("MainActivity", "33: ${no.isChecked}")

        val felony = binding.convicted.text
        Log.d("MainActivity", "34: $felony")
        //checkbox
        val yes1 = binding.yes2.isChecked
        Log.d("MainActivity", "35: $yes1")
        val no1 = binding.no2.isChecked
        Log.d("MainActivity", "36: $no1")

        val call = binding.call.text
        Log.d("MainActivity", "37: $call")
        //checkbox
        val yes2 = binding.yes3.isChecked
        Log.d("MainActivity", "38: $yes2")
        val no2 = binding.no3.isChecked
        Log.d("MainActivity", "39: $no2")

        val education = binding.education.text
        Log.d("MainActivity", "40: $education")

        val school = binding.school.text
        Log.d("MainActivity", "41: $school")
        val location = binding.location.text
        Log.d("MainActivity", "42: $location")
        val year = binding.year.text
        Log.d("MainActivity", "43: $year")
        val degree = binding.degree.text
        Log.d("MainActivity", "44: $degree")
        val major = binding.major.text
        Log.d("MainActivity", "45: $major")

        val school1 = binding.s1
        val ss1 = school1.text.toString()
        Log.d("MainActivity", "46: $ss1")
        val l1 = binding.l1
        val ll1 = l1.text.toString()
        Log.d("MainActivity", "47: $ll1")
        val y1 = binding.y1
        val yy1 = y1.text.toString()
        Log.d("MainActivity", "48: $yy1")
        val d1 = binding.d1
        val dd1 = d1.text.toString()
        Log.d("MainActivity", "49: $dd1")
        val m1 = binding.m1
        val mm1 = m1.text.toString()
        Log.d("MainActivity", "50: $mm1")

        val s2 = binding.s2
        val ss2 = s2.text.toString()
        Log.d("MainActivity", "51: $ss2")
        val l2 = binding.l2
        val ll2 = l2.text.toString()
        Log.d("MainActivity", "52: $ll2")
        val y2 = binding.y2
        val yy2 = y2.text.toString()
        Log.d("MainActivity", "53: $yy2")
        val d2 = binding.d2
        val dd2 = d2.text.toString()
        Log.d("MainActivity", "54: $dd2")
        val m2 = binding.m2
        val mm2 = m2.text.toString()
        Log.d("MainActivity", "55: $mm2")

        val s3 = binding.s3
        val ss3 = s3.text.toString()
        Log.d("MainActivity", "56: $ss3")
        val l3 = binding.l3
        val ll3 = l3.text.toString()
        Log.d("MainActivity", "57: $ll3")
        val y3 = binding.y3
        val yy3 = y3.text.toString()
        Log.d("MainActivity", "58: $yy3")
        val d3 = binding.d3
        val dd3 = d3.text.toString()
        Log.d("MainActivity", "59: $dd3")
        val m3 = binding.m3
        val mm3 = m3.text.toString()
        Log.d("MainActivity", "60: $mm3")

        val other = binding.other.text
        Log.d("MainActivity", "29: $other")
        //EditText
        val other1 = binding.other1
        val others = other1.text.toString()
        Log.d("MainActivity", "30: $others")

        val employment = binding.employment.text
        Log.d("MainActivity", "40: $employment")

        val employer = binding.employers.text
        Log.d("MainActivity", "29: $employer")
        //EditText
        val employers = binding.employers1
        val employerss = employers.text.toString()
        Log.d("MainActivity", "30: $employerss")

        val dates = binding.dates.text
        Log.d("MainActivity", "29: $dates")
        //EditText
        val dates1 = binding.dates1
        val datess = dates1.text.toString()
        Log.d("MainActivity", "30: $datess")

        val work = binding.work.text
        Log.d("MainActivity", "29: $work")
        //EditText
        val works = binding.work1
        val workss = works.text.toString()
        Log.d("MainActivity", "30: $workss")

        val rate = binding.pay.text
        Log.d("MainActivity", "29: $rate")
        //EditText
        val pay = binding.pay1
        val pays = pay.text.toString()
        Log.d("MainActivity", "30: $pays")

        val t = binding.to.text
        Log.d("MainActivity", "29: $t")
        //EditText
        val o = binding.to1
        val os = o.text.toString()
        Log.d("MainActivity", "30: $os")

        val addresses = binding.addressess.text
        Log.d("MainActivity", "29: $addresses")
        //EditText
        val adress = binding.addresses1
        val adresses = adress.text.toString()
        Log.d("MainActivity", "30: $adresses")

        val cities = binding.addresses.text
        Log.d("MainActivity", "29: $cities")
        //EditText
        val citiess = binding.cities
        val cities1 = citiess.text.toString()
        Log.d("MainActivity", "30: $cities1")

        val statess = binding.cities1.text
        Log.d("MainActivity", "29: $statess")
        //EditText
        val states = binding.states1
        val states1 = states.text.toString()
        Log.d("MainActivity", "30: $states1")

        val Zip = binding.zipss.text
        Log.d("MainActivity", "29: $Zip")
        //EditText
        val Zips = binding.zipss1
        val Zips1 = Zips.text.toString()
        Log.d("MainActivity", "30: $Zips1")

        val positions = binding.positions.text
        Log.d("MainActivity", "29: $positions")
        //EditText
        val positions1 = binding.cities
        val pos = positions1.text.toString()
        Log.d("MainActivity", "30: $pos")

        val duties = binding.duties.text
        Log.d("MainActivity", "29: $duties")
        //EditText
        val duty = binding.duties1
        val duty1 = duty.text.toString()
        Log.d("MainActivity", "30: $duty1")

        val supervisor = binding.supervisor.text
        Log.d("MainActivity", "29: $supervisor")
        //EditText
        val names = binding.supervisor1
        val title = names.text.toString()
        Log.d("MainActivity", "30: $title")

        val reason = binding.reason.text
        Log.d("MainActivity", "29: $reason")
        //EditText
        val fors = binding.reason1
        val leaving = fors.text.toString()
        Log.d("MainActivity", "30: $leaving")

        val contacts = binding.contact.text
        Log.d("MainActivity", "29: $contacts")
        val yes3 = binding.yes4.isChecked
        Log.d("MainActivity", "38: $yes3")
        val no3 = binding.no4.isChecked
        Log.d("MainActivity", "39: $no3")

        val references = binding.references.text
        Log.d("MainActivity", "40: $references")

        val name = binding.n.text
        Log.d("MainActivity", "41: $name")
        val titles = binding.title.text
        Log.d("MainActivity", "42: $titles")
        val company = binding.company.text
        Log.d("MainActivity", "43: $company")
        val phone = binding.p.text
        Log.d("MainActivity", "44: $phone")

        val n1 = binding.n1
        val n2 = n1.text.toString()
        Log.d("MainActivity", "46: $n2")
        val t1 = binding.tl1
        val t2 = t1.text.toString()
        Log.d("MainActivity", "47: $t2")
        val com1 = binding.c1
        val com2 = com1.text.toString()
        Log.d("MainActivity", "48: $com2")
        val ph = binding.p1
        val ph1 = ph.text.toString()
        Log.d("MainActivity", "49: $ph1")


        val n3 = binding.n2
        val n4 = n3.text.toString()
        Log.d("MainActivity", "51: $n4")
        val t3 = binding.l2
        val t4 = t3.text.toString()
        Log.d("MainActivity", "52: $t4")
        val com3 = binding.c3
        val com4 = com3.text.toString()
        Log.d("MainActivity", "53: $com4")
        val ph2 = binding.p2
        val ph3 = ph2.text.toString()
        Log.d("MainActivity", "54: $ph3")


        val n5 = binding.n3
        val n6 = n5.text.toString()
        Log.d("MainActivity", "56: $n6")
        val t5 = binding.tl3
        val t6 = t5.text.toString()
        Log.d("MainActivity", "57: $t6")
        val com5 = binding.c3
        val com6 = com5.text.toString()
        Log.d("MainActivity", "58: $com6")
        val ph4 = binding.d3
        val ph5 = ph4.text.toString()
        Log.d("MainActivity", "59: $ph5")

        val acknowlege = binding.acknowlege.text
        Log.d("MainActivity", "40: $acknowlege")

        val check1 = binding.checkBox3.isChecked
        Log.d("MainActivity", "38: $check1")
        // textview
        val certify = binding.certify.text
        Log.d("MainActivity", "40: $certify")

        val check2 = binding.checkBox4.isChecked
        Log.d("MainActivity", "39: $check2")
        //textview
        val authorize = binding.authorize.text
        Log.d("MainActivity", "40: $authorize")

        val check3 = binding.checkBox5.isChecked
        Log.d("MainActivity", "39: $check3")
        //textview
        val event = binding.event.text
        Log.d("MainActivity", "40: $event")

        val sign = binding.sign1
        val sign1 = sign.text.toString()
        Log.d("MainActivity", "54: $sign1")

        val app = binding.signs1
        val apps = app.text.toString()
        Log.d("MainActivity", "54: $apps")

        val signature = binding.sign.text
        Log.d("MainActivity", "40: $signature")

        val applications = binding.signs.text
        Log.d("MainActivity", "40: $applications")

    }

}


