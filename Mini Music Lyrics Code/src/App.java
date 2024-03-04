import java.util.Scanner;

class q{
	String song[]=new String[100]; //song name
	String sd[]=new String[100];	//song details like view artist
	String lyrics[]=new String[100];	//song lyrics
	String playlist[][]=new String[10][100];	//create playlist
	String plname[]=new String[10];		//playlist name
	int num=10;
	String mn;
	String an;
	String rd;
	int tp=0;			//total playlist
	int p1[]=new int[10];
	void push(int i) {
		int w=this.tp-1;
		if(w==0) {
		this.playlist[w][p1[0]]=this.song[i];
		p1[0]+=1;}
		if(w==1) {
			this.playlist[w][p1[1]]=this.song[i];
			p1[1]+=1;}
		if(w==2) {
			this.playlist[w][p1[2]]=this.song[i];
			p1[2]+=1;}
		if(w==3) {
			this.playlist[w][p1[3]]=this.song[i];
			p1[3]+=1;}
		if(w==4) {
			this.playlist[w][p1[4]]=this.song[i];
			p1[4]+=1;}
		if(w==5) {
			this.playlist[w][p1[5]]=this.song[i];
			p1[5]+=1;}
		if(w==6) {
			this.playlist[w][p1[6]]=this.song[i];
			p1[6]+=1;}
		if(w==7) {
			this.playlist[w][p1[7]]=this.song[i];
			p1[7]+=1;}
		if(w==8) {
			this.playlist[w][p1[8]]=this.song[i];
			p1[8]+=1;}
		if(w==9) {
			this.playlist[w][p1[9]]=this.song[i];
			p1[9]+=1;}
		
	}
	
	void pop(int i) {
		
	}

	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		q t=new q();
		int p;
		int q;
		int pl;
		int p2=0;
		t.song[0]="Takkunu Takkunu";
		t.sd[0]="Movie: Mr.Local\nArtists: Anirudh Ravichander, Hiphop Tamizha\nReleased: 2019";
		t.lyrics[0]="Male : Ho ho hoh ho yoo\r\n"
				+ "\r\n"
				+ "Male : Ava neraa pakkaiyil\r\n"
				+ "Konja gera aaguthu\r\n"
				+ "Ava gera sirikkaiyil\r\n"
				+ "Manam noora norunguthu\r\n"
				+ "\r\n"
				+ "Male : Aiyo paakaatha\r\n"
				+ "Ennai thaakaadha\r\n"
				+ "Idhayam weakaaga\r\n"
				+ "Unakkaaga vaazha\r\n"
				+ "\r\n"
				+ "Male : Takkunu takkunu\r\n"
				+ "Takkunu takkunu\r\n"
				+ "Takkunu takkunu paakaatha\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu aakkaatha\r\n"
				+ "\r\n"
				+ "Male : Kick onnu kick onnu\r\n"
				+ "Kick onnu kick onnu\r\n"
				+ "Kick onnu irukkuthu paarvaiyila\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Vituttu ponaa thappae illa\r\n"
				+ "\r\n"
				+ "Male : Enna paakkaatha\r\n"
				+ "Paarvaiyaala ennai thaakkaadha\r\n"
				+ "Enna paakkaatha\r\n"
				+ "Paarvaiyaala enna thaakkaadha\r\n"
				+ "\r\n"
				+ "Male : Koovi koovi vikkura caru\r\n"
				+ "Roadu mela poguthu paaru\r\n"
				+ "Athil sernthu naama pona sema joru\r\n"
				+ "Chorus : Aamam di…\r\n"
				+ "\r\n"
				+ "Male : Area-la kettu paaru\r\n"
				+ "Enna minja aalu yaru\r\n"
				+ "Nee ok sonna life-eh thaar maaru\r\n"
				+ "Chorus : Sollen di…\r\n"
				+ "\r\n"
				+ "Male : White-ah dhaan\r\n"
				+ "Bright-ah dhaan\r\n"
				+ "Irukkum paalu\r\n"
				+ "Chorus : Heyy\r\n"
				+ "Male : Athukku expiry date-u\r\n"
				+ "Just orae oru naalu\r\n"
				+ "Chorus : Hoo\r\n"
				+ "\r\n"
				+ "Male : Dark-ah dhaan\r\n"
				+ "Brown-ah dhaan\r\n"
				+ "Irukkum theanu\r\n"
				+ "Chorus : Heyy\r\n"
				+ "Male : Adi adhu pol naanu\r\n"
				+ "Keda matten kannu\r\n"
				+ "\r\n"
				+ "Male : Takkunu takkunu\r\n"
				+ "Takkunu takkunu\r\n"
				+ "Takkunu takkunu paakaatha\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu aakkaatha\r\n"
				+ "\r\n"
				+ "Male : Kick onnu kick onnu\r\n"
				+ "Kick onnu kick onnu\r\n"
				+ "Kick onnu irukkuthu paarvaiyila\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Vituttu ponaa thappae illa\r\n"
				+ "\r\n"
				+ "Male : Ae…..ae……ae……ae…..ae….\r\n"
				+ "Ae…….ae……ae……ae….ae…..ae…\r\n"
				+ "\r\n"
				+ "Male : Un sirippu adhu thaaru maaru\r\n"
				+ "Unna azhagula minja yaaru\r\n"
				+ "Naduvula antha ego mattum\r\n"
				+ "Namakulla venaam di\r\n"
				+ "\r\n"
				+ "Male : Musically-laam bore-u\r\n"
				+ "Naan compose panren paaru\r\n"
				+ "Team oda tune pottu\r\n"
				+ "Paada poren di\r\n"
				+ "\r\n"
				+ "Chorus : Heyy heyy…\r\n"
				+ "Male : Vaayen…\r\n"
				+ "Onna sernthu povom\r\n"
				+ "Oru dating meeting\r\n"
				+ "Vaaya.. konjam konaya vechi\r\n"
				+ "Selfie edukatta\r\n"
				+ "Paaren…en kannula kaadhala\r\n"
				+ "Thaayen oru mutham onnu\r\n"
				+ "Ok thaan neeyum sonna\r\n"
				+ "Husband aagatta\r\n"
				+ "\r\n"
				+ "Male & Chorus : Takkunu takkunu\r\n"
				+ "Takkunu takkunu\r\n"
				+ "Takkunu takkunu paakaatha\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu\r\n"
				+ "Bakkunu bakkunu aakkaatha\r\n"
				+ "\r\n"
				+ "Male & Chorus : Kick onnu kick onnu\r\n"
				+ "Kick onnu kick onnu\r\n"
				+ "Kick onnu irukkuthu paarvaiyila\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Look onnu look onnu\r\n"
				+ "Vituttu ponaa thappae illa\r\n"
				+ "\r\n"
				+ "Chorus : Ho ho ho ho ho ho ho ho………";
				
		
		t.song[1]="Kanne Kanne";
		t.sd[1]="Movie: Ayogya\nArtist: Anirudh Ravichander\nReleased: 2019";
		t.lyrics[1]="Male : Kannae kannae unna thookki\r\n"
				+ "Kaana thooram pogatta\r\n"
				+ "Kaattu jeevan pola thaavi\r\n"
				+ "Aasai ellaam kekatta..kekatta…\r\n"
				+ "\r\n"
				+ "Male : {Kannae kannae unna thookki\r\n"
				+ "Kaana thooram pogatta\r\n"
				+ "Kaattu jeevan pola thaavi\r\n"
				+ "Aasai ellaam kekatta…} (2)\r\n"
				+ "\r\n"
				+ "Whistling : …………………………\r\n"
				+ "\r\n"
				+ "Male : Yei azhagiyae azhagiyae\r\n"
				+ "Unnai kannil thinna poren\r\n"
				+ "Nee vedukkura midukkula\r\n"
				+ "Naan sinna pinnam aanaen\r\n"
				+ "\r\n"
				+ "Male : Yei azhagiyae azhagiyae\r\n"
				+ "Unnai kannil thinna poren\r\n"
				+ "Nee vedukkura midukkula\r\n"
				+ "Naan sinna pinnam aanaen\r\n"
				+ "\r\n"
				+ "Male : Ennodu nee vandhu seramalae\r\n"
				+ "Ponaka en nenju thaangathadi\r\n"
				+ "Yaarodum thonadha peraasa thaan\r\n"
				+ "Chorus : Pennae undhan mela thonuthadi\r\n"
				+ "\r\n"
				+ "Male : {Kannae kannae unna thookki\r\n"
				+ "Kaana thooram pogatta\r\n"
				+ "Kaattu jeevan pola thaavi\r\n"
				+ "Aasai ellaam kekatta…} (2)\r\n"
				+ "\r\n"
				+ "Male : Ela ela mayil iragaa\r\n"
				+ "Idha idha theriyala\r\n"
				+ "Pura aana puli manasu\r\n"
				+ "Ennaanu puriyaliyae\r\n"
				+ "\r\n"
				+ "Male : Dhevadhaiya thara irakki\r\n"
				+ "Naan pudikka\r\n"
				+ "Ippo nenachen nenachen\r\n"
				+ "Unna mulusa ragasiyama\r\n"
				+ "Eduthukka thaan\r\n"
				+ "Ulla thudichen thudichen\r\n"
				+ "\r\n"
				+ "Male : Ela ela Chorus : mayil iragaa\r\n"
				+ "Male : Idha idha Chorus : Theriyala\r\n"
				+ "Male : Pura aana Chorus : Puli manasu\r\n"
				+ "Male : Ennaanu puriyaliyae\r\n"
				+ "\r\n"
				+ "Male : Ennodu nee vandhu seramalae\r\n"
				+ "Seramalae\r\n"
				+ "Ponaka en nenju thaangathadi\r\n"
				+ "Thaangathadi\r\n"
				+ "Yaarodum thonadha peraasa thaan\r\n"
				+ "Peraasa thaan\r\n"
				+ "Chorus : Pennae undhan mela thonuthadi\r\n"
				+ "\r\n"
				+ "Male : {Kannae kannae unna thookki\r\n"
				+ "Kaana thooram pogatta\r\n"
				+ "Kaattu jeevan pola thaavi\r\n"
				+ "Aasai ellaam kekatta…} (2)";
		
		t.song[2]="Unnil Ennai Naanum Kandene";
		t.sd[2]="Movie:	Geetha Govindam\nSinger(s):	Sid Sriram\nReleased: ";
		t.lyrics[2]="Tatikina Takajunu Tatikina Takajunu\r\n"
				+ "Tarikita Tatarina Tatintita Anantam\r\n"
				+ "Inaintitum Irumanam Eluntitum Putusuvaram\r\n"
				+ "Mannankalil Sirikkira Kanavukal Ayiram\r\n"
				+ "Unnil Ennai Nanum Kantene Yakkai Turantene\r\n"
				+ "Kannukkulle Katal Kontene Mintum Pirantene\r\n"
				+ "Innum Innum Ventum Enpene\r\n"
				+ "Nensa Kuttil Unnai Vaippene\r\n"
				+ "Un Patam Patta Mannai Tinpene\r\n"
				+ "Un Suvasam Ennai Tintumpotu Sorkkam Kantu Okirene\r\n"
				+ "Unnil Ennai Nanum Kantene Yakkai Turantene\r\n"
				+ "Kannukkulle Katal Kontene Mintum Pirantene\r\n"
				+ "Unnil Ennai Nanum Kantene Yakkai Turantene\r\n"
				+ "Kannukkulle Katal Kontene Mintum Pirantene\r\n"
				+ "Tatikina Takajunu Tatikina Takajunu\r\n"
				+ "Tarikita Tatarina Tatintita Anantam\r\n"
				+ "Inaintitum Irumanam Eluntitum Putusuvaram\r\n"
				+ "Mannankalil Sirikkira Kanavukal Ayiram\r\n"
				+ "Pani Patarnta Paruvavum Parisa\r\n"
				+ "Nerunki Vara Tatai Enna Putusa\r\n"
				+ "Mati Enatu Mayakkattin Sokusa\r\n"
				+ "Itam Kotu Patavisa\r\n"
				+ "Unatalakil Enatuyir Perisa\r\n"
				+ "Unai Maranta Ninaivukal Tarisa\r\n"
				+ "Maunam Ennai Alittitum Urasa\r\n"
				+ "Tutu Sollum En Kolusa\r\n"
				+ "Mayiliraku Viralkalum Varutitum Lesa\r\n"
				+ "Marukanattil Kalaintitum Maname Lesa\r\n"
				+ "Unnil Ennai Nanum Kantene Yakkai Turantene\r\n"
				+ "Kannukkulle Katal Kontene Mintum Pirantene\r\n"
				+ "Utatukalil Uyirinai Tarava Vili Irantil Kanavena Varava\r\n"
				+ "Iravukkena Virakamum Urava Anutinam Urukkava\r\n"
				+ "Mayam Seyyum Parvaiyil Vilava\r\n"
				+ "Enai Ilantu Marupati Elava\r\n"
				+ "Varttaikalil Utirvatu Matuva Amutamum Parukava\r\n"
				+ "Palai Nila Malai Nir Tuliyay Ni Va\r\n"
				+ "Manatil Vanta Marrankal Vasantattin\r\n"
				+ "Puva Unnil Ennai Nanum Kantene Yakkai Turantene\r\n"
				+ "Kannukkulle Katal Kontene Mintum Pirantene\r\n";
		
		t.song[3]="Mudhal Nee Mudivum Nee";
		t.sd[3]="Movie: Mudhal Nee Mudivum Nee\r\n"
				+ "Artist: Darbuka Siva\r\n"
				+ "Released: 2020\r\n";
		t.lyrics[3]="Male : Aaa….aaa….aa….aa…\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "\r\n"
				+ "Male : Mudhal nee mudivum nee\r\n"
				+ "Moondru kaalam nee\r\n"
				+ "Kadal nee karaiyum nee\r\n"
				+ "Kaatru kooda nee\r\n"
				+ "\r\n"
				+ "Male : Manadhoram oru kaayam\r\n"
				+ "Unnai ennadha naal illaiyae\r\n"
				+ "Naanaga naanum illaiyae\r\n"
				+ "\r\n"
				+ "Male : Vazhiyengum pala bimbam\r\n"
				+ "Adhil naan saaya thozh illaiyae\r\n"
				+ "Un pola yaarum illaiyae\r\n"
				+ "\r\n"
				+ "Males : Theera nadhi neethaanadi\r\n"
				+ "Neendhaamal naan moozhgi ponen\r\n"
				+ "Neethaanadi vaanil madhi\r\n"
				+ "Neeyalla naan thaanae theindhen\r\n"
				+ "\r\n"
				+ "Male : Paadhi kaanagam\r\n"
				+ "Adhil kaanamal ponavan\r\n"
				+ "Oru paavai kaal thadam\r\n"
				+ "Adhai thedamal theinthavan\r\n"
				+ "\r\n"
				+ "Male : Kaanadha baaram en nenjilae\r\n"
				+ "Thunai illa naan andrilae\r\n"
				+ "Naal ellaam pogum aanalum naan\r\n"
				+ "Males : Uyir illadha udalae\r\n"
				+ "\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "\r\n"
				+ "Male : Mudhal nee mudivum nee\r\n"
				+ "Moondru kaalam nee\r\n"
				+ "Kadal nee karaiyum nee\r\n"
				+ "Kaatru kooda nee\r\n"
				+ "\r\n"
				+ "Male : Dhoora desathil thozhainthaayo\r\n"
				+ "Kanmani\r\n"
				+ "Unai thedi kandathum\r\n"
				+ "En kannellaam minnmini\r\n"
				+ "\r\n"
				+ "Male : Pinnokki kaalam pogum enil\r\n"
				+ "Un mannippai kooruven\r\n"
				+ "Kannokki nerai paarkkum kanam\r\n"
				+ "Males : Pizhai ellaamae kalaiven\r\n"
				+ "\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "Chorus : Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Hooo oo hoo oo hoo oo hoo oo\r\n"
				+ "Male : Aa…aaa….aa…\r\n"
				+ "\r\n"
				+ "Male : Mudhal nee mudivum nee\r\n"
				+ "Moondru kaalam nee\r\n"
				+ "Kadal nee karaiyum nee\r\n"
				+ "Kaatru kooda nee\r\n"
				+ "\r\n"
				+ "Male : Nagaradha kadigaaram\r\n"
				+ "Adhu pol naanum nindrirundhen\r\n"
				+ "Nee engu sendraai kannamma\r\n"
				+ "Azhagaana aridhaaram\r\n"
				+ "Velipaarvaikku poosi konden\r\n"
				+ "Punnaigaikku podhum kannamma\r\n"
				+ "\r\n"
				+ "Males : Nee ketkavae en padalai\r\n"
				+ "Un aasai raagathil seidhen\r\n"
				+ "Un punnagai pon minnalai\r\n"
				+ "Naan korthu aangaangu neidhen\r\n"
				+ "\r\n"
				+ "Male : Mudhal nee…eee…..\r\n"
				+ "Mudivum nee…ee…ee…";
		
		t.song[4]="Maruthani Vizhiyil";
		t.sd[4]="Movie: Sakkarakatti\r\n"
				+ "Artist: A. R. Rahman\r\n"
				+ "Released: 2008";
		t.lyrics[4]="Female : Maruthani …maruthani..maruthani ..vizhiyil enn\r\n"
				+ "Adi podi deepali\r\n"
				+ "\r\n"
				+ "Gangai endru kaanalai kaatum – kaadhal\r\n"
				+ "Kaanal endru gangaiyai kaatum\r\n"
				+ "\r\n"
				+ "Vaazhum payirkku thaneer vendum\r\n"
				+ "Kaadhal kathaikka kanneer vendum\r\n"
				+ "\r\n"
				+ "Female : Maruthani vizhiyil enn\r\n"
				+ "Adi podi deepali\r\n"
				+ "\r\n"
				+ "Aagayam mann meethu saayathu\r\n"
				+ "Nijamana kaadhal thaan\r\n"
				+ "Nilaiyana paadal thaan\r\n"
				+ "Athan oosai ennalum ooyathu\r\n"
				+ "\r\n"
				+ "Female : Maruthani\r\n"
				+ "Maruthani vizhiyil enn…\r\n"
				+ "\r\n"
				+ "Female : Avan idhya veetil vaazhum\r\n"
				+ "Aval dhegam vendhu poghum\r\n"
				+ "Ena avan arundhida maattan\r\n"
				+ "Sudu neerum sudu soorum\r\n"
				+ "\r\n"
				+ "Female : Kaathali kai nagam ellaam…\r\n"
				+ "Pokkisam polae avan semipaan\r\n"
				+ "\r\n"
				+ "Female : Oruthikkagha vazghira jadhi\r\n"
				+ "Unnaravillai innoru pathi\r\n"
				+ "\r\n"
				+ "Female : Maruthani vizhiyil enn…\r\n"
				+ "Maruthani vizhiyil enn…\r\n"
				+ "Adi podi deepali\r\n"
				+ "Aagayam mann meethu saayathu\r\n"
				+ "Nijamana kaadhal thaan\r\n"
				+ "Nilaiyana paadal thaan\r\n"
				+ "Athan oosai ennalum ooyathu\r\n"
				+ "\r\n"
				+ "Female : Aval avan kaadhal nenjil\r\n"
				+ "Kandalae siru kuttram\r\n"
				+ "Avan nenjam thaai paal polae\r\n"
				+ "Ennalum pari sutham\r\n"
				+ "\r\n"
				+ "Aathiram nethiram moo..da -Paalaiyum\r\n"
				+ "Kallai aval paarkiral\r\n"
				+ "\r\n"
				+ "Female : Aaha motham avasara kolam – ohhhhh\r\n"
				+ "Avalukithai kaatidum kaalam\r\n"
				+ "\r\n"
				+ "Female : Maruthani vizhiyil enn…\r\n"
				+ "Maruthani vizhiyil enn…\r\n"
				+ "Adi podi deepali\r\n"
				+ "\r\n"
				+ "Female : Gangai endru kaanalai kaatum – kaadhal\r\n"
				+ "Kaanal endru gangaiyai kaatum\r\n"
				+ "\r\n"
				+ "Vaazhum payirkku thaneer vendum\r\n"
				+ "Kaadhal kathaikka kanneer vendum\r\n"
				+ "\r\n"
				+ "Female : Maruthani vizhiyil enn…\r\n"
				+ "Adi podi deepali\r\n"
				+ "Aagayam mann meethu saayathu\r\n"
				+ "Nijamana kaadhal thaan\r\n"
				+ "Nilaiyana paadal thaan\r\n"
				+ "Athan oosai ennalum ooyathu\r\n"
				+ "\r\n"
				+ "Female : Maruthani…\r\n"
				+ "Maruthani… vizhiyil enn\r\n"
				+ "Maruthani.\r\n"
				+ "Maruthaniiiii….maruthaniiiii…..maruthaniiiii.\r\n"
				+ "Vizhiyil enn…";
		
		t.song[5]="Para Para";
		t.sd[5]="Movie: Neerparavai\r\n"
				+ "Artists: G. V. Prakash Kumar, N.R. Raghunathan\r\n"
				+ "Released: 2015";
		t.lyrics[5]="Male : Para para para paravai ondru\r\n"
				+ "Kiru kiru vena thalaiyum sutri\r\n"
				+ "Un kaalil veezhndhathu pennae jebikka vaa\r\n"
				+ "\r\n"
				+ "Male : Adhu paranthida vaanam illai\r\n"
				+ "Adhu irunthida boomiyum illai\r\n"
				+ "Un maarbil koodu katti valarkkavaa\r\n"
				+ "\r\n"
				+ "Male : Oh anbae endhan vaazhvukku\r\n"
				+ "Aasirvaadham neeyadi\r\n"
				+ "Kaneeraadum pillaikku\r\n"
				+ "Neeyae kaadhal thaayadi\r\n"
				+ "\r\n"
				+ "Male : Unnai kaana meendum meendum\r\n"
				+ "Kangal thoondum\r\n"
				+ "Irumurai oru vaanavil varuma\r\n"
				+ "\r\n"
				+ "Male : Para para para paravai ondru\r\n"
				+ "Kiru kiru vena thalaiyum sutri\r\n"
				+ "Un kaalil veezhndhathu pennae jebikka vaa\r\n"
				+ "\r\n"
				+ "Male : Adhu paranthida vaanam illai\r\n"
				+ "Adhu irunthida boomiyum illai\r\n"
				+ "Un maarbil koodu katti valarkkavaa\r\n"
				+ "\r\n"
				+ "Male : Devalayam mezhugum naanae\r\n"
				+ "Thiri yerum theeyum neeyae\r\n"
				+ "En dhegam kanneer vittu karayudhae\r\n"
				+ "\r\n"
				+ "Male : Meen kotha chellum paravai\r\n"
				+ "Meen valaiyil vizhundhathu pola\r\n"
				+ "Vaazhkai un saalai oram thavikhudhae\r\n"
				+ "\r\n"
				+ "Male : Mazhaiyil kazhuviya manalilae\r\n"
				+ "Tholaindha kaaladi naanadi\r\n"
				+ "Mugathai tholaitha en vaazhvukku\r\n"
				+ "Nilaitha mugavari neeyadi\r\n"
				+ "\r\n"
				+ "Male : Petrol meethu theeyai pola\r\n"
				+ "Undhan meedhu para paravena\r\n"
				+ "Paravuthu manasu\r\n"
				+ "\r\n"
				+ "Male : Para para para paravai ondru\r\n"
				+ "Kiru kiru vena thalaiyum sutri\r\n"
				+ "Un kaalil veezhndhathu pennae jebikka vaa\r\n"
				+ "\r\n"
				+ "Male : Adhu paranthida vaanam illai\r\n"
				+ "Adhu irunthida boomiyum illai\r\n"
				+ "Un maarbil koodu katti valarkkavaa\r\n"
				+ "\r\n"
				+ "Male : En ulagam kaivasam illai\r\n"
				+ "En perum gyabagam illai\r\n"
				+ "Sathiyamaai enarugae nee irukkiraai\r\n"
				+ "\r\n"
				+ "Male : Petravarai veetil maranthen\r\n"
				+ "Matravarai roattil maranthen\r\n"
				+ "Maradhiyilum un ninaivai valarkirai\r\n"
				+ "\r\n"
				+ "Male : Mangai en kural keladi\r\n"
				+ "Naan madhuvil kidakkindra e-yadi\r\n"
				+ "Enadhu asuthangal paaradi\r\n"
				+ "Vandhu ennai parisutham seiyadi\r\n"
				+ "\r\n"
				+ "Male : Petrol meethu theeyai pola\r\n"
				+ "Undhan meedhu para paravena\r\n"
				+ "Paravuthu manasu\r\n"
				+ "\r\n"
				+ "Male : Para para para paravai ondru\r\n"
				+ "Kiru kiru vena thalaiyum sutri\r\n"
				+ "Un kaalil veezhndhathu pennae jebikka vaa\r\n"
				+ "\r\n"
				+ "Male : Adhu paranthida vaanam illai\r\n"
				+ "Adhu irunthida boomiyum illai\r\n"
				+ "Un maarbil koodu katti valarkkavaa";
		
		t.song[6]="Kannadi Poovukku";
		t.sd[6]="Movie: Enakku Vaaitha Adimaigal\r\n"
				+ "Artists: Jonita Gandhi, Haricharan, Santhosh Dhayanidhi\r\n"
				+ "Released: 2016";
		t.lyrics[6]="Male : Kannadi poovukku vannamilla\r\n"
				+ "Unkitta en kadhal sonnathilla\r\n"
				+ "Mounathil vaarthaigal sonthamilla\r\n"
				+ "Unnaala kan thoongala\r\n"
				+ "\r\n"
				+ "Male : Nee thee pol poochedi\r\n"
				+ "Ponathae en moochadi\r\n"
				+ "Unnaal thaanadi\r\n"
				+ "Manam oonchalaai\r\n"
				+ "Aadum theradi\r\n"
				+ "\r\n"
				+ "Male : Kaadhal kannukullae ettu poda\r\n"
				+ "Minnal nenjukullae mettu poda\r\n"
				+ "Boomi panthu pola unthan gnyabagam\r\n"
				+ "Kaadhal thaan suthuthae\r\n"
				+ "\r\n"
				+ "Male : Unna paartha uchu kotti poven\r\n"
				+ "Pacha pulla aaven\r\n"
				+ "Achu vellam nee thaanae\r\n"
				+ "Enna ketta kaadhal solla maatta\r\n"
				+ "Raja raani seetta\r\n"
				+ "Nenja kulukki pottalae\r\n"
				+ "\r\n"
				+ "Male : Kuthikiren parakuren\r\n"
				+ "Parava pola naan\r\n"
				+ "Ippa tharaiyilum mithakuren\r\n"
				+ "Kuzhantha pola thaan\r\n"
				+ "Uruguren karaiyuran\r\n"
				+ "Mezhuga pola naan\r\n"
				+ "Unna iravilum thodaruven\r\n"
				+ "Nizhala pola naan\r\n"
				+ "\r\n"
				+ "Male : Kannadi poovukku vannamilla\r\n"
				+ "Unkitta en kadhal sonnathilla\r\n"
				+ "Mounathil vaarthaigal sonthamilla\r\n"
				+ "Unnaala kan thoongala\r\n"
				+ "\r\n"
				+ "Female : Naan yaarodu pesa\r\n"
				+ "Nee illaamalae\r\n"
				+ "Naan yaarodu yaaro\r\n"
				+ "Nee sollaamalae\r\n"
				+ "\r\n"
				+ "Female : Ullukullae kaadhal undaanathae\r\n"
				+ "Oorukum natpukum theriyaamalae\r\n"
				+ "Kaiyodu thaan kaigal serum varai\r\n"
				+ "Kannaalae naam pesalaam\r\n"
				+ "\r\n"
				+ "Male : Kuthikiren parakuren\r\n"
				+ "Parava pola naan\r\n"
				+ "Ippa tharaiyilum mithakuren\r\n"
				+ "Kuzhantha pola thaan\r\n"
				+ "Uruguren karaiyuran\r\n"
				+ "Mezhuga pola naan\r\n"
				+ "Unna iravilum thodaruven\r\n"
				+ "Nizhala pola naan\r\n"
				+ "\r\n"
				+ "Female : Kannadi poovukku vannamilla\r\n"
				+ "Unkitta en kadhal sonnathilla\r\n"
				+ "Mounathil vaarthaigal sonthamilla\r\n"
				+ "Unnaala kan thoongala\r\n"
				+ "\r\n"
				+ "Male : Nee thee pol poochedi\r\n"
				+ "Ponathae en moochadi\r\n"
				+ "Unnaal thaanadi\r\n"
				+ "Manam oonchalaai\r\n"
				+ "Aadum theradi";
		
		t.song[7]="Vaa Senthaazhini";
		t.sd[7]="Movie: Adiyae\r\n"
				+ "Released: 2023\r\n"
				+ "Artists: Sid Sriram, Justin Prabhakaran, Bagavathy P K";
		t.lyrics[7]="Male : Naan thodum kanave nijam thaanaa\r\n"
				+ "Unakkul karanje ponenae\r\n"
				+ "Nee varum iravin nizhal naanaa\r\n"
				+ "Unakkul neranje ponen\r\n"
				+ "\r\n"
				+ "Male : Iruthayam koodayila\r\n"
				+ "Adhu ragasiyam pesayila\r\n"
				+ "Uthatteeramum edam maarumae\r\n"
				+ "Un kaathil mella kaadhal pesum vaa\r\n"
				+ "\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Unna thedi naan inga odi vanthen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Unakkaaga en ulagam thaandi vanthen\r\n"
				+ "\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Unna thedi naan inga odi vanthen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Unakkaaga en ulagam thaandi vanthen\r\n"
				+ "\r\n"
				+ "Male : Naan thodum kanave nijam thaanaa\r\n"
				+ "Unakkul karanje ponen\r\n"
				+ "\r\n"
				+ "Female : Un kaathil mella kaadhal pesum\r\n"
				+ "Un kaathil mella kaadhal pesum\r\n"
				+ "\r\n"
				+ "Male : Neththi pottin orama\r\n"
				+ "Niththam naanum vaazhnthidanum\r\n"
				+ "Nenju kuzhi osaiyila\r\n"
				+ "Thala saachida thonum\r\n"
				+ "\r\n"
				+ "Male : Udal kadanthumae\r\n"
				+ "Uyir parakkumae\r\n"
				+ "Puthu prabanjamae\r\n"
				+ "Namakkaagavae\r\n"
				+ "\r\n"
				+ "Male : Odum neram niruthi\r\n"
				+ "Aayul rega thiruthi\r\n"
				+ "Kaadhal seiven kadathi\r\n"
				+ "Un oruthi nerukkam\r\n"
				+ "Erappu varaikkum\r\n"
				+ "\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Unna thedi naan inga odi vanthen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Unakkaaga en ulagam thaandi vanthen\r\n"
				+ "\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Unna thedi naan inga odi vanthen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Unakkaaga en ulagam thaandi vanthen\r\n"
				+ "\r\n"
				+ "Male : Naan thodum kanave nijam thaanaa\r\n"
				+ "Unakkul karanje ponen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Female : Un kaathil mella kaadhal pesum\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Female : Un kaathil mella kaadhal pesum\r\n"
				+ "\r\n"
				+ "Male : Vaa senthaazhini\r\n"
				+ "Unna thedi naan inga odi vanthen\r\n"
				+ "Vaa senthaazhini\r\n"
				+ "Unakkaaga en ulagam thaandi vanthen";
		
		t.song[8]="Innum Konjam Naeram";
		t.sd[8]="Movie: Maryan\r\n"
				+ "Artists: A. R. Rahman, Shweta Mohan, Vijay Prakash\r\n"
				+ "Released: 2013";
		t.lyrics[8]="Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "\r\n"
				+ "Innum pesa kooda thodangala\r\n"
				+ "En nenjamum konjamum neraiyala\r\n"
				+ "Ippa enna vittu pogaatha\r\n"
				+ "Enna vittu pogaatha\r\n"
				+ "Innum pesa kooda thodangala\r\n"
				+ "En nenjamum konjamum neraiyala\r\n"
				+ "Ippa mazhai pola nee vandha\r\n"
				+ "Kadal pola naan niraiven\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Ithu varaikkum thaniyaga\r\n"
				+ "en manasa alaiyavitta\r\n"
				+ "Alaiyavitta alaiya vitta\r\n"
				+ "Edhirpaaraa nerathula\r\n"
				+ "ithayathula valaiya vitta\r\n"
				+ "Valaiya vittu valaiya vitta\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Nee vanthu vanthu poyen\r\n"
				+ "ndha alaigal pola\r\n"
				+ "\r\n"
				+ "Vantha un kaiyula\r\n"
				+ "maattikuven valaiyala pola\r\n"
				+ "Un kannukketha azhaga\r\n"
				+ "varen kaathiruda konjam\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Unna ippadiye thanthaalum\r\n"
				+ "thithikume nenjam\r\n"
				+ "Innum konja kaalam porutha thaan enna\r\n"
				+ "Yen avasaram enna avasaram sollu kanne\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Innum konja kaalam porutha thaan enna\r\n"
				+ "Yen avasaram enna avasaram sollu kanne\r\n"
				+ "\r\n"
				+ "Kadal maatha aanaiyaaga uyirodu\r\n"
				+ "Unakkaaga kaathiruppen kaathirupenya\r\n"
				+ "\r\n"
				+ "En kannu rendum mayanguthe mayanguthe\r\n"
				+ "Unnidam sollave thayanguthe\r\n"
				+ "\r\n"
				+ "Intha uppu kaathu inikkuthu\r\n"
				+ "Unnayum ennayum izhukkuthu\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Unna izhukka enna izhukka\r\n"
				+ "En manasu niraiyumaa\r\n"
				+ "Intha meen udambu vaasana\r\n"
				+ "Enna nee thottathum manakkuthe\r\n"
				+ "Intha iravellaam nee pesu\r\n"
				+ "Thalaiyaatti naan rasippen\r\n"
				+ "\r\n"
				+ "Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "Innum konja neram iruntha thaan enna\r\n"
				+ "Yen avasaram enna avasaram nillu ponne\r\n"
				+ "\r\n"
				+ "Nee en kanna pola irukkanum\r\n"
				+ "En pillaikku thagappan aavanum\r\n"
				+ "Andha alaiyoram namma\r\n"
				+ "pasanga konji vilaiyaadanum\r\n"
				+ "Nee sonthamaaga kidaikkanum\r\n"
				+ "Nee sonnathellaam nadakkanum\r\n"
				+ "Namma ulagam onnu indru nam uruvaakkanum\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "hooooooohoooo";
		
		t.song[9]="Mundhinam Parthene";
		t.sd[9]="Movie :Vaaranam Aayiram (2008) (வாரணம் ஆயிரம்)\r\n"
				+ "Music:Harris Jayaraj\r\n"
				+ "Released: 2010\r\n";
		t.lyrics[9]="Male : Hi malini..I am krishnan\r\n"
				+ "Naan itha solliyae aaganum\r\n"
				+ "Nee avvalavu azhagu\r\n"
				+ "Inga yevanum ivvalo azhagaa oru..\r\n"
				+ "Ivalo azhaga paarthirukka maattaanga..\r\n"
				+ "And i am in love with you..\r\n"
				+ "\r\n"
				+ "Male : Mundhinam paarthenae\r\n"
				+ "Paarthathum thotrenae\r\n"
				+ "Salladai kannaaga\r\n"
				+ "Nenjamum punnaanathae\r\n"
				+ "\r\n"
				+ "Male : Ithanai naalaaga\r\n"
				+ "Unnai naan paaraamal\r\n"
				+ "Enguthaan poneno\r\n"
				+ "Naatkalum veenanathae\r\n"
				+ "\r\n"
				+ "Male : Vaanathil nee vennilaa\r\n"
				+ "Yekkathil naan theivathaa\r\n"
				+ "{Ippozhuthae ennodu vanthaal enna\r\n"
				+ "Oor paarka ondraga sendraal enna} (2)\r\n"
				+ "\r\n"
				+ "Male : Mundhinam paarthenae\r\n"
				+ "Paarthathum thotrenae\r\n"
				+ "Salladai kannaaga\r\n"
				+ "Nenjamum punnaanathae\r\n"
				+ "\r\n"
				+ "Male : Ithanai naalaaga\r\n"
				+ "Unnai naan paaraamal\r\n"
				+ "Enguthaan poneno\r\n"
				+ "Naatkalum veenanathae\r\n"
				+ "\r\n"
				+ "Chorus : Kaadhalae…\r\n"
				+ "Swasamae…..\r\n"
				+ "\r\n"
				+ "Male : Thulaa thottil unnai vaithu\r\n"
				+ "Nigar seiya ponnai veithaal\r\n"
				+ "Thulaabaaram thorkaatho\r\n"
				+ "Perazhagae…\r\n"
				+ "\r\n"
				+ "Female : Mugam paarthu pesum unnai\r\n"
				+ "Mudhal kaadhal sinthum kannai\r\n"
				+ "Annaikkaamal poveno\r\n"
				+ "Aaruyirae….\r\n"
				+ "\r\n"
				+ "Male : Oh nizhal pola\r\n"
				+ "Vidaamal unnai thodarvenadi\r\n"
				+ "Pugai pola padaamal pattu\r\n"
				+ "Nagarvenadi\r\n"
				+ "Vinaa nooru kanaavum nooru\r\n"
				+ "Vidai solladi…\r\n"
				+ "\r\n"
				+ "Female : Mundhinam paarthenae\r\n"
				+ "Paarthathum thotrenae\r\n"
				+ "Salladai kannaaga\r\n"
				+ "Ullamum punnaanathae\r\n"
				+ "\r\n"
				+ "Female : Ithanai naalaaga\r\n"
				+ "Male : Oh my love..\r\n"
				+ "Unnai naan paaraamal\r\n"
				+ "Male : Yes my love..\r\n"
				+ "Enguthaan poneno\r\n"
				+ "Naatkalum veenanathae\r\n"
				+ "\r\n"
				+ "Claps : …………………………….\r\n"
				+ "\r\n"
				+ "Female : Kadal neelam mangum nerum\r\n"
				+ "Alai vanthu theendum thooram\r\n"
				+ "Manam sendru muzhgaatho\r\n"
				+ "Eerathilae…\r\n"
				+ "\r\n"
				+ "Male : Thalai saaika tholum thanthaai\r\n"
				+ "Viral korthu pakkam vanthaai\r\n"
				+ "Idhazh mattum innum yen\r\n"
				+ "Dhoorathilae..\r\n"
				+ "\r\n"
				+ "Female : Pagal neram\r\n"
				+ "Kanaakal kanden urangaamalae\r\n"
				+ "Uyir rendum uraaya kanden\r\n"
				+ "Nerungaamalae\r\n"
				+ "Unai indri enakku ethu\r\n"
				+ "Edhirkaalamae\r\n"
				+ "\r\n"
				+ "Male : Mundhinam paarthenae\r\n"
				+ "Paarthathum thotrenae\r\n"
				+ "Salladai kannaaga\r\n"
				+ "Nenjamum ponnaanathae\r\n"
				+ "\r\n"
				+ "Male : Ithanai naalaaga\r\n"
				+ "Unnai naan paaraamal\r\n"
				+ "Enguthaan poneno\r\n"
				+ "Naatkalum veenanathae\r\n"
				+ "\r\n"
				+ "Male : Vaanathil nee vennilaa\r\n"
				+ "Yekkathil naan theivathaa\r\n"
				+ "{Ippozhuthae ennodu vanthaal enna\r\n"
				+ "Oor paarka ondraga sendraal enna} (2)\r\n"
				+ "\r\n"
				+ "Male : Vennila.. vennila.. vennila…..";
		do {
		System.out.println("Press [a] to get song list\nPress [b] to Add new songs\nPress [c] to create new playlist\nPress [d] to view your playlist");
		char z=s.next().charAt(0);
		
		if(z=='a') {									//for view song!
			do {
			for(int x=0;x<t.num;x++) {
				System.out.println((x+1)+"."+t.song[x]);
			}
			System.out.println("If u want to visit a song in that,enter a song's s/o number: ");
			int y=s.nextInt();
			if(y<=0 || y>t.num) {
				System.out.println("Sorry your entered option is unavailable!");
			}
			else{
			y-=1;
			System.out.println("\t"+t.song[y]+"\n\nSong Details:\n"+t.sd[y]+"\n\n\tSong Lyrics\n"+t.lyrics[y]);}
			do {
			System.out.println("\npress [0] to visit another song\npress [1] to go back");
			p=s.nextInt();
			if(p>=2 || p<0) {System.out.println("PLZ enter the correct option");}
			}while(p!=0 && p!=1);
			}while(p==0);
		}
		else if(z=='b') {
			p=10;
			s.nextLine();
	        System.out.print("Plz Enter song name: ");
	        t.song[p] = s.nextLine();
			System.out.print("plz enter song movie name: ");
			t.mn=s.nextLine();
			System.out.print("plz enter song Artist name: ");
			t.an=s.nextLine();
			System.out.print("plz enter song Release year: ");
			t.rd=s.nextLine();
			t.sd[p]="Movie:"+t.mn+"\nArtist:"+t.an+"\nRelease:"+t.rd;
			System.out.print("Plz Type "+t.song[p]+" song lyrics");
			t.lyrics[p]=s.nextLine();
			p+=1;
			t.num+=1;
		}
		else if(z=='c') {
			s.nextLine();
			System.out.print("Give name for ur playlist: ");
			t.plname[p2]=s.nextLine();
			p2+=1;
			for(int x=0;x<t.num;x++) {
				System.out.println((x+1)+"."+t.song[x]);
			}
			t.tp+=1;
			do {
				q=t.num;
			System.out.println("Enter s/o number to add a song to your new playlist:\nPress '0' to go back");
			pl=s.nextInt();
			pl-=1;
			if(pl>=0 && pl<q) {
			t.push(pl);
			System.out.println("Song is sucessfully added to your playlist");
			}
			else if(pl==-1) {}
			else {
				System.out.println("Sorry your entered option is unavailable!");
			}
			}while(pl!=-1);
		}
		else if(z=='d') {
			if(t.tp==0) {System.out.println("Your playlist is empty!");}
			else {
			do {
				for(p=0;p<t.tp;p++) {
				System.out.println((p+1)+"."+t.plname[p]);
			}
			System.out.println("Enter s/o number to view that playlist:\nPress '0' to go back");
			pl=s.nextInt();
			pl-=1;
			q=t.num;
			q-=1;
			if(pl>=0 && pl<q) {System.out.println("\n"+t.plname[pl]+"\n");
			for(p=0;p<t.p1[pl];p++) {
				System.out.println(t.playlist[pl][p]);
			}}
			else if(pl==-1) {}
			else {
				System.out.println("Sorry your entered option is unavailable!");
			}
			}while(pl!=-1);
			}
		}
		
		else {
			System.out.println("Sorry your entered option is unavailable!");
		}
		System.out.println("Enter [0] TO GO BACK\nEnter [1] TO END THE PROGRAM");
		q=s.nextInt();
	}while(q==0);
		System.out.println("\n\n\t\tPROGRAM ENDED!");
	}
}
