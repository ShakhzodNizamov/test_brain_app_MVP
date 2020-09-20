package com.jagito.test.model;

import com.jagito.test.contracts.TestContract;

import java.util.ArrayList;
import java.util.HashMap;

public class TestRepository implements TestContract.Model {
    public enum CATEGORIES {ADABIYOT, BIOLOGIYA, TARIX, GEOGRAFIYA, FIZIKA, MATEMATIKA, ZOOLOGIYA, INGLIZ, RUS, MUSIQA}

    private CATEGORIES current;
    private HashMap<CATEGORIES, ArrayList<QuestionData>> data = new HashMap<>();
    private int questionCount = 0;
    private int wrongCount = 0;
    private int rightCount = 0;

    public TestRepository() {

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Hozirgacha eskirmay kelgan, unutilmagan, “otalar so’zi” deb nomlanuvchi janr qaysi?",
                    "maqollar",
                    "ertaklar",
                    "tez aytish",
                    "matal",
                    "maqollar"));
            list.add(new QuestionData(
                    "“Muhaddis” so’zining ma’nosi?",
                    "“hadis yozuvchi”",
                    "“hadis aytuvchi”",
                    "“hadischi”",
                    "TJY",
                    "“hadis aytuvchi”"));
            list.add(new QuestionData(
                    "Imom Buxoriydan bizgacha qancha asar yetib keldi?",
                    "20 dan ortiq",
                    "25 dan ortiq",
                    "10 dan ortiq",
                    "5 dan ortiq",
                    "20 dan ortiq"));
            list.add(new QuestionData(
                    "Miloddan avvalgi VI asrda quldorlik tuzumi paytidaYunonistondan qullar orasidan yetishib chiqqan, \n" +
                            "     o’ta aqlli, badbashara donishmand kim?       \n",
                    "Suqrot",
                    "Aristotel",
                    "Ezop",
                    "Demokrit",
                    "Ezop"));
            list.add(new QuestionData(
                    "Mirkarim Osimning “Zulmat ichra nur” qissasi kimga bag’ishlangan?       ",
                    "Navoiy",
                    "Bobur",
                    "Mashrab",
                    "Amir Temur",
                    "Navoiy"));
            list.add(new QuestionData(
                    "Hayot haqiqati bilan bog’liq bo’lib, xayoliy va hayotiy uydirmalar asosiga qurilgan, didaktik g’oya \n" +
                            " tashuvchi og’zaki hikoyalar?..\n",
                    "qissa",
                    "masal",
                    "hikoya",
                    "ertak ",
                    "ertak "));
            list.add(new QuestionData(
                    "Hamid Olimjon necha yil umr ko’rgan?",
                    "29",
                    "34 ",
                    "40",
                    "35",
                    "34 "));
            list.add(new QuestionData(
                    "Hamid Olimjonning tarixiy dramasi?",
                    "Muqanna",
                    "Shiroq",
                    "Ulug`bek",
                    "Tomaris",
                    "Muqanna"));
            list.add(new QuestionData(
                    "Hamid Olimjonning “Oygul bilan Baxtiyor” dostoni qachon yaratilgan?       ",
                    "1951",
                    "1938",
                    "1937",
                    "1954",
                    "1937"));
            list.add(new QuestionData(
                    "Maqsud Shayxzodaning “Toshkentnoma” dostoni qachon yozilgan?       ",
                    "1957",
                    "1950",
                    "1960",
                    "TJY",
                    "1957"));
            data.put(CATEGORIES.ADABIYOT, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "O`zbekistonda  tabiiy holda o`sadigan yuksak o`simliklarning  necha turi borligi aniqlangan?",
                    "500000",
                    "45000",
                    "5000",
                    "31000",
                    "500000"));
            list.add(new QuestionData(
                    "Poyasining yuqori qismi qishda sovuq urib ketadigan ko`p yillik o`simliklar nima deyiladi?",
                    "2 yilik o`t",
                    "yarim buta",
                    "ko`p yillik o`t",
                    "daraxt",
                    "daraxt"));
            list.add(new QuestionData(
                    "Yeryong`oq o`simliklar hayotiy shaklining qaysi guruhiga mansub?",
                    "1 yilik o`t",
                    "yarim buta",
                    "ko`p yillik o`t",
                    "daraxt",
                    "1 yilik o`t"));
            list.add(new QuestionData(
                    "O`simliklarning yer osti vegrtativ organi?",
                    "meva",
                    "ildiz",
                    "poya",
                    "novda",
                    "ildiz"));
            list.add(new QuestionData(
                    "Urug`langan markaziy hujayradan nima hosil bo`ladi?",
                    "murtak",
                    "endosperma",
                    "tuguncha",
                    "chang donachalar",
                    "tuguncha"));
            list.add(new QuestionData(
                    "Meva necha qismdan iborat?",
                    "2",
                    "3",
                    "4",
                    "5",
                    "2"));
            list.add(new QuestionData(
                    "Sporangiy bandining uchida nima joylashadi?",
                    "gifa",
                    "mitseliy",
                    "mevatana",
                    "sporangiy",
                    "sporangiy"));
            list.add(new QuestionData(
                    "Qarag`ay qubbalari qancha vaqtda yetiladi",
                    "200",
                    "50",
                    "2",
                    "75",
                    "200"));
            list.add(new QuestionData(
                    "Ko`p hujayrali o`simliklar tanasi nima deyiladi?",
                    "xlorella",
                    "tallom",
                    "qattana",
                    "B va S javoblari to`g`ri",
                    "tallom"));
            list.add(new QuestionData(
                    "Ulotriksning suv tagida narsalarga birikkan qismi, ya`ni hujayrasi nima deyiladi?",
                    "xromosoma",
                    "spirogira",
                    "qattana",
                    "B va S javoblari to`g`ri",
                    "spirogira"));
            data.put(CATEGORIES.BIOLOGIYA, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Qaysi davrda toshga ishlov berish texnikasi va mehnat qurollari yasash usullari o’zgargan?",
                    "so'nggi paleolit",
                    "mezolit",
                    "o’rta paleolit",
                    "ilk paleolit",
                    "so'nggi paleolit"));
            list.add(new QuestionData(
                    "Kromanyon odam qaysi davrda yashagan?",
                    "so'nggi paleolit",
                    "mezolit",
                    "o’rta paleolit",
                    "ilk paleolit",
                    "so'nggi paleolit"));
            list.add(new QuestionData(
                    "O’zbekistonda so'nggi paleolit davriga oid odam manzilgohlari topilgan hududlarni aniqlang.",
                    "hamma javoblar to’g’ri",
                    "Farg’ona vodiysi",
                    "Samarqand shahri",
                    "Toshkent viloyati Ko’lbuloq manzili",
                    "hamma javoblar to’g’ri"));
            list.add(new QuestionData(
                    "Qachon odamlar takomillashgan kesuvchi, arralovchi, parmalovchi mehnat qurollari yasaydigan\n" +
                            "bo’lishgan?",
                    "25-30 ming yil avval",
                    "mil.avv.12-7 ming yilliklarda",
                    "5-4 ming yil avval",
                    "35-40 ming yil avval",
                    "25-30 ming yil avval"));
            list.add(new QuestionData(
                    "Insonlar qachondan taqinchoqlar yasay boshlaganlar?",
                    "ilk paleolit davridan",
                    "so'nggi paleolit davridan",
                    "mezolit davridan",
                    "o’rta paleolit davridan",
                    "so'nggi paleolit davridan"));
            list.add(new QuestionData(
                    "Eng qadimgi odamlar qachondan urug’ jamoalariga ajralib chiqishgan?",
                    "mezolit davridan",
                    "o’rta paleolit davridan",
                    "so'nggi paleolit davridan",
                    "ilk paleolit davridan",
                    "so'nggi paleolit davridan"));
            list.add(new QuestionData(
                    "Turar joylar qurilishi qaysi davrda ixtiro qilingan?",
                    "ilk paleolit davri",
                    "o’rta paleolit davri",
                    "so'nggi paleolit davri",
                    "mezolit davri",
                    "so'nggi paleolit davri"));
            list.add(new QuestionData(
                    "Inson qaysi davrda sun’iy olov hosil qilishni o’rganib olgan edi?",
                    "ilk paleolit davri",
                    "mezolit davri",
                    "o’rta paleolit davri",
                    "so'nggi paleolit davri",
                    "so'nggi paleolit davri"));
            list.add(new QuestionData(
                    "Mezolit davri qaysi -mingyilliklarni o’z ichiga oladi?",
                    "mil.avv.40-12 -mingyilliklar",
                    "mil.avv.12-7 -mingyilliklar",
                    "mil.avv.6/4 -mingyilliklar",
                    "mil.avv.100-40 -mingyilliklar",
                    "mil.avv.12-7 -mingyilliklar"));
            list.add(new QuestionData(
                    "Muzlik davri qachon poyoniga yetgan?",
                    "neolit davri boshlanishi bilan",
                    "so'nggi paleolit davri boshlanishi bilan",
                    "ilk paleolit davri boshlanishi bilan",
                    "mezolit davri boshlanishi bilan",
                    "mezolit davri boshlanishi bilan"));
            data.put(CATEGORIES.TARIX, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Milodan avvalgi VII- V asirlarda Zarafshon vodiysida qaysi davlat bo`lgan?",
                    "Marg`yona",
                    "So`g`diyona",
                    "Baqtrriya",
                    "Xorazm",
                    "So`g`diyona"));
            list.add(new QuestionData(
                    "Cho`llada necha mm yog`in yog`di?",
                    "100",
                    "350",
                    "300",
                    "70-90",
                    "100"));
            list.add(new QuestionData(
                    "O`rta Osiyoning Necha %qismida 3000 mm dan kam yog`n yog`di.",
                    "70-90",
                    "55-69",
                    "75-80",
                    "79-95",
                    "75-80"));
            list.add(new QuestionData(
                    "Daryolarga suv qayerdan keladi?",
                    "orildan",
                    "tog`lardan",
                    "dengizdan",
                    "okean va dengiz",
                    "tog`lardan"));
            list.add(new QuestionData(
                    "O`rta Osiyo daryolari to`yinishiga ko`ra necha guruhga bo`linadi?",
                    "3",
                    "5",
                    "4",
                    "2",
                    "4"));
            list.add(new QuestionData(
                    "Sirdaryoning havzasi necha kv.km.?",
                    "219",
                    "309",
                    "154",
                    "209",
                    "219"));
            list.add(new QuestionData(
                    "Vaxsh daryosida qaysi suv ombori qurilgan?",
                    "Boxtarma",
                    "To`xtag`ul",
                    "Nrak",
                    "Hovuzxon",
                    "Nrak"));
            list.add(new QuestionData(
                    "Orol dengizi 35 yil mobaynida  sathi necha metrga pasaydi? ",
                    "80km",
                    "130km",
                    "90m",
                    "16.5m",
                    "16.5m"));
            list.add(new QuestionData(
                    "Orol dengizida qaysi daryolar suvini quyadi ?",
                    "Amudaryo va Sirdaryo",
                    "Amudaryo va Norin",
                    "Sirdaryo va Qoradaryo",
                    "TJY",
                    "Amudaryo va Sirdaryo"));
            list.add(new QuestionData(
                    "Mineral va termal suvlar qanday suvlar?",
                    "shifobaxsh suvlar",
                    "sho`rsuvlar ",
                    "boloq suvlar",
                    "favvora tarzida otiladigan suvlar",
                    "shifobaxsh suvlar"));
            data.put(CATEGORIES.GEOGRAFIYA, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Ipga osilgan yuk chig‘ir yordamida tekis tezlanuvchan\n" +
                            "ko‘tarilmoqda. Agar chig‘ir burchak tezlanishi 2\n" +
                            "rad/s2, radiusi esa 10 cm bo‘lsa, yuk osilgan 10 m\n" +
                            "ip qancha vaqtda chig‘irga o‘rab tugatiladi (s)?",
                    "10",
                    "20",
                    "1",
                    "25",
                    "25"));
            list.add(new QuestionData(
                    "Birinchi jism 100 m masofani 5 s da tekis harakat qilib\n" +
                            "bosib o‘tdi. Ikkinchi jism esa 4,4 s da 10 % ko‘proq\n" +
                            "masofani bosib o‘tdi. Ikkinchi jismning tezligi birinchi\n" +
                            "jismnikidan necha foiz ko‘proq?",
                    "20",
                    "5",
                    "10",
                    "25",
                    "10"));
            list.add(new QuestionData(
                    "Moddiy nuqtaning berilgan sanoq sistemasidagi\n" +
                            "harakati x=7+4t va y= 5+3t tenglamalar bilan berilgan. Jism dastlabki 2 s ichida qanchaga ko‘chadi (m)?",
                    "14",
                    "19",
                    "10",
                    "13",
                    "13"));
            list.add(new QuestionData(
                    "Ikki jism bir vaqtning o‘zida, bir yo‘nalishda va bir\n" +
                            "xil υ tezlik bilan harakat boshlashdi: birinchi jism\n" +
                            "tekis, ikkinchi jism esa 2 m/s2 tezlanish bilan tekis tezlanuvchan. 5 s dan so‘ng ular orasidagi masofa necha\n" +
                            "metrga teng bo‘ladi?",
                    "30",
                    "25",
                    "20",
                    "15",
                    "30"));
            list.add(new QuestionData(
                    "Jism 4 s da 15 m, yana 6 s da 30 m masofa bosib o‘tgan\n" +
                            "bo‘lsa, uning o‘rtacha tezligi (m/s) qancha bo‘ladi?",
                    "4",
                    "5",
                    "6",
                    "4.5",
                    "4.5"));
            list.add(new QuestionData(
                    "Radiusi 8 m bo‘lgan aylana trayektoriya bo‘ylab tekis\n" +
                            "harakatlanayotgan jism 2 minut davomida aylanani 20\n" +
                            "marta o‘tdi. Jismning aylanish davrini (s) toping",
                    "6",
                    "10",
                    "4",
                    "5",
                    "10"));
            list.add(new QuestionData(
                    "20 m/s tezlik bilan yuqoriga tik otilgan jismning\n" +
                            "harakat boshlanganda 3 s o‘tgandagi bosib o‘tgan\n" +
                            "yo‘lni (m) toping.",
                    "30",
                    "50",
                    "20",
                    "25",
                    "30"));
            list.add(new QuestionData(
                    "Radiusi 4 m bo‘lgan aylana trayektoriya bo‘ylab tekis\n" +
                            "harakatlanayotgan jismning chiziqli tezligi 4 m/s ga\n" +
                            "teng. Jismning markazga intilma tezlanishini (m/s2)\n" +
                            "toping",
                    "4",
                    "6",
                    "8",
                    "2",
                    "8"));
            list.add(new QuestionData(
                    "36 km/h tezlik bilan gorizontal otilgan jismning uchish\n" +
                            "uzoqligi otish balandligiga teng bo‘lsa, jism qanday\n" +
                            "balandlikdan (m) otilgan?",
                    "20",
                    "17",
                    "25",
                    "15",
                    "17"));
            list.add(new QuestionData(
                    "Jism gorizontga π/6 burchak ostida 30 m/s tezlik bilan otildi. Trayektoriyaning eng yuqori nuqtasida jism\n" +
                            "tezligining moduli nimaga teng (m/s)?",
                    "24.2",
                    "26",
                    "30",
                    "20.3",
                    "26"));
            data.put(CATEGORIES.FIZIKA, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Ikki son yig`indisi shu sonlarning ikkinchisidan 27 taga katta. Birinchi son nechaga teng?",
                    "54",
                    "28",
                    "23",
                    "27",
                    "27"));
            list.add(new QuestionData(
                    "Do`konga har birida 25 tadan daftar bo`lgan bir nechta bog`lam  va yana 15 ta daftar keltirildi. Hammasi bo`lib 340ta daftar keltirilgan. Magazinga hammasi bo`lib necha bog`lam daftar keltirilgan?",
                    "12",
                    "13",
                    "10",
                    "23",
                    "23"));
            list.add(new QuestionData(
                    "To`liqsiz  bo`linma 21ga , bo`luvchi 89 ga , qoldiq 13 ga teng bo`lsa, bo`linuvchini toping. ",
                    "1882",
                    "1800",
                    "1982",
                    "1782",
                    "1800"));
            list.add(new QuestionData(
                    "To`g`ri to`rtburchakning eni 370 m, bo`yi undan 30 m ortiq. To`g`ri to`rtburchakning yuzini toping va uni gektar va arlarda ifodalang. ",
                    "140 ga 8 ar",
                    "14 ga 8 ar",
                    "18 ga 12 ar",
                    "14 ga 80 ar",
                    "140 ga 8 ar"));
            list.add(new QuestionData(
                    "To`g`ri burchakli  parallelepipedning hajmi 105 sm3 , eni 5sm, balandligi esa 3 sm. Parallelepipdning bo`yini toping. ",
                    "16",
                    "7",
                    "17",
                    "20",
                    "17"));
            list.add(new QuestionData(
                    "Ikki son yig`indisi shu sonlarning birinchisidan 328 taga katta. Ikkinchi son nechaga teng?  ",
                    "164",
                    "320",
                    "656",
                    "328",
                    "164"));
            list.add(new QuestionData(
                    "Bir nechta quti bor edi. Har biriga 24 tadan qalam solindi. Shunda 15 ta qalam qoldi. Qalamlar soni 159 ta bo`lsa, jami  qutilar soni nechta edi?  ",
                    "5",
                    "6",
                    "7",
                    "8",
                    "5"));
            list.add(new QuestionData(
                    "To`g`ri burchakli parallelepipedning hajmi 336 sm3 , uning bo`yi 8sm, balandligi 7sm. Parallelepipedning enini toping",
                    "6",
                    "7",
                    "6",
                    "8",
                    "6"));
            list.add(new QuestionData(
                    "Qo`shni burchaklar 1350  va  450 ga teng. Bu qo`shni burchaklar bissektrisalari tashkil qilgan burchakni toping.",
                    "86",
                    "75",
                    "90",
                    "80",
                    "75"));
            list.add(new QuestionData(
                    "Qavariq yigirmaburchakning nechta diagonali bor?",
                    "180",
                    "170",
                    "160",
                    "110",
                    "160"));
            data.put(CATEGORIES.MATEMATIKA, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();

            list.add(new QuestionData(
                    "O`zbekistonda  tabiiy holda o`sadigan yuksak o`simliklarning  necha turi borligi aniqlangan?",
                    "500000",
                    "45000",
                    "5000",
                    "31000",
                    "500000"));
            list.add(new QuestionData(
                    "Poyasining yuqori qismi qishda sovuq urib ketadigan ko`p yillik o`simliklar nima deyiladi?",
                    "2 yilik o`t",
                    "yarim buta",
                    "ko`p yillik o`t",
                    "daraxt",
                    "daraxt"));
            list.add(new QuestionData(
                    "Yeryong`oq o`simliklar hayotiy shaklining qaysi guruhiga mansub?",
                    "1 yilik o`t",
                    "yarim buta",
                    "ko`p yillik o`t",
                    "daraxt",
                    "1 yilik o`t"));
            list.add(new QuestionData(
                    "O`simliklarning yer osti vegrtativ organi?",
                    "meva",
                    "ildiz",
                    "poya",
                    "novda",
                    "ildiz"));
            list.add(new QuestionData(
                    "Urug`langan markaziy hujayradan nima hosil bo`ladi?",
                    "murtak",
                    "endosperma",
                    "tuguncha",
                    "chang donachalar",
                    "tuguncha"));
            list.add(new QuestionData(
                    "Meva necha qismdan iborat?",
                    "2",
                    "3",
                    "4",
                    "5",
                    "2"));
            list.add(new QuestionData(
                    "Sporangiy bandining uchida nima joylashadi?",
                    "gifa",
                    "mitseliy",
                    "mevatana",
                    "sporangiy",
                    "sporangiy"));
            list.add(new QuestionData(
                    "Qarag`ay qubbalari qancha vaqtda yetiladi",
                    "200",
                    "50",
                    "2",
                    "75",
                    "200"));
            list.add(new QuestionData(
                    "Ko`p hujayrali o`simliklar tanasi nima deyiladi?",
                    "xlorella",
                    "tallom",
                    "qattana",
                    "B va S javoblari to`g`ri",
                    "tallom"));
            list.add(new QuestionData(
                    "Ulotriksning suv tagida narsalarga birikkan qismi, ya`ni hujayrasi nima deyiladi?",
                    "xromosoma",
                    "spirogira",
                    "qattana",
                    "B va S javoblari to`g`ri",
                    "spirogira"));
            data.put(CATEGORIES.ZOOLOGIYA, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "She is a singer. She sings classical Uzbek songs. Who is person?",
                    "David Beckham     ",
                    "Munojat Yulchieva   ",
                    " Madonna   ",
                    "Yulduz",
                    "Munojat Yulchieva   "));
            list.add(new QuestionData(
                    "Who is nurse in Uzbek language?",
                    "bog`bon",
                    "fermer",
                    "hamshira",
                    "shofokor",
                    "hamshira"));
            list.add(new QuestionData(
                    "I want to … a doctor.",
                    "be",
                    "being",
                    "have",
                    "has",
                    "be"));
            list.add(new QuestionData(
                    "Anvar`s cousin … getting  married.",
                    "is",
                    "am",
                    "are",
                    "to",
                    "is"));
            list.add(new QuestionData(
                    "… pupils in your class?  There are 30.",
                    "How much          ",
                    "How many         ",
                    "What are",
                    "Was",
                    "How many         "));
            list.add(new QuestionData(
                    "I`m a Fotima and my sister is Zuxra. We are …  .",
                    "brothers",
                    "uncle",
                    "daughter",
                    "twins",
                    "twins"));
            list.add(new QuestionData(
                    "Twenty two minus fifteen?",
                    "7",
                    "5",
                    "8",
                    "10",
                    "7"));
            list.add(new QuestionData(
                    "Which word is verb?",
                    "yes",
                    "no",
                    "don`t know",
                    "have",
                    "have"));
            list.add(new QuestionData(
                    "… does  she work ? At   shoool   ",
                    "When",
                    "What",
                    "Where",
                    "Was",
                    "Where"));
            list.add(new QuestionData(
                    "Which words is job?",
                    "book",
                    "grey",
                    "teacher",
                    "boy",
                    "teacher"));
            data.put(CATEGORIES.INGLIZ, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Укажите ряд , где даны имена существительные общего рода.",
                    "Плакса, недотрога, задира",
                    "Фотография, село, деревня",
                    "Художник, писатель, актер",
                    "Учитель, артист, активист",
                    "Плакса, недотрога, задира"));
            list.add(new QuestionData(
                    "Укажите ряд, где даны имена существительные, которые употребляются только в единственном числе.\n",
                    "Памятник, книга, свитер",
                    "Молодёжь, сырье, свекла",
                    "Духи, шахматы, шорты",
                    "Рыба, корзина, чай",
                    "Молодёжь, сырье, свекла"));
            list.add(new QuestionData(
                    "Укажите ряд, где даны имена существительные, которые употребляются только во множественном числе.\n",
                    "Духи, шахматы, шорты",
                    "Памятник, книга, свитер",
                    "Молодёжь, сырье, свекла",
                    "Рыба, корзина, чай",
                    "Духи, шахматы, шорты"));
            list.add(new QuestionData(
                    "Сколько мальчиков было на корабле в рассказе Л. Н. Толстого «Акула»'",
                    "Двадцать        ",
                    "Двое",
                    "Три        ",
                    "Один",
                    "Двое"));
            list.add(new QuestionData(
                    "Кто помогал Л. Н.Толстому обучать крестьянских детей?",
                    "Дочери",
                    "Друг детства   ",
                    "Жена     ",
                    "Мама",
                    "Дочери"));
            list.add(new QuestionData(
                    "Как звали старого охотника из рассказа «Приёмыш»?",
                    "Дед Мазай      ",
                    "Тарас",
                    "Клим     ",
                    "Герасим",
                    "Тарас"));
            list.add(new QuestionData(
                    "Что случилось с «Приёмышем»?",
                    "Улетел",
                    "Убили охотники       ",
                    "Утонул",
                    "Заблудился",
                    "Улетел"));
            list.add(new QuestionData(
                    "Какой сказочный персонаж предстает перед нами в первых строках\n" +
                            "стихотворения «У лукоморья дуб зелёный»\n",
                    "Баба- Яга        ",
                    "Кот учёный",
                    "Русалка",
                    "Леший",
                    "Кот учёный"));
            list.add(new QuestionData(
                    "Укажите, какое местоимение можно вставить вместо точек в данном\n" +
                            "предложении.\n" +
                            "Хасан всегда готов ... помочь.\n",
                    "кому-либо       ",
                    "чему-либо",
                    "кем-то",
                    "кто-то",
                    "кому-либо       "));
            list.add(new QuestionData(
                    "Укажите ряд, где даны отрицательные местоимения.",
                    "кто-то, кто-либо, что-нибудь",
                    "Никто, ничто, ничего",
                    "Этот, эта, та",
                    "Тот, те, эти",
                    "Никто, ничто, ничего"));
            data.put(CATEGORIES.RUS, list);
        }

        {
            ArrayList<QuestionData> list = new ArrayList<>();
            list.add(new QuestionData(
                    "Orkestr  nima  ? ",
                    "dirijyor",
                    "Cholg’uchilar  jamoasi",
                    "o’lchov",
                    "TJY",
                    "Cholg’uchilar  jamoasi"));
            list.add(new QuestionData(
                    "O’zbek  xalq  cholg’ulari  nechta  guruhdan  tashkil  topgan ?",
                    "5",
                    "4",
                    "2",
                    "TJY",
                    "5"));
            list.add(new QuestionData(
                    "Birinchi  xalq  cholg’ulari  nechanchi  yilda  tashkil  tpogan     ?",
                    "1936",
                    "1960",
                    "1845",
                    "TJY",
                    "1936"));
            list.add(new QuestionData(
                    "Musiqada  nechta  tovush  bor ?",
                    "8",
                    "7",
                    "5",
                    "TJY",
                    "7"));
            list.add(new QuestionData(
                    "Damli  cholg’ularga  qaysilar  kiradi ? ",
                    "nay",
                    "rubob",
                    "doira",
                    "TJY",
                    "nay"));
            list.add(new QuestionData(
                    "Musiqada  nechta  kalit  bor ?",
                    "3",
                    "2",
                    "5",
                    "TJY",
                    "2"));
            list.add(new QuestionData(
                    "“Aziz   ustozlar”  qo’shig’I  bastakori  kim?",
                    "Sobir  Boboyev",
                    "D.Zokirov",
                    "D.Omonullayeva",
                    "TJY",
                    "Sobir  Boboyev"));
            list.add(new QuestionData(
                    "Yarim  nota  ichida   nechta  chorak  bor ?",
                    "4",
                    "2",
                    "1",
                    "TJY",
                    "1"));
            list.add(new QuestionData(
                    "Xo’r  nima  ? ",
                    "cholg’uchilar",
                    "kuylovchi",
                    "raqs  jamoa",
                    "TJY",
                    "kuylovchi"));
            list.add(new QuestionData(
                    "Xorda   nechta  ovoz  bor  ?",
                    "2",
                    "3",
                    "4",
                    "TJY",
                    "4"));
            data.put(CATEGORIES.MUSIQA, list);
        }
    }

    @Override
    public QuestionData getQuestionData(CATEGORIES category, int i) {
        return data.get(category).get(i);
    }
    @Override
    public CATEGORIES getCurrentCategory() {
        return current;
    }
    @Override
    public void setCurrentCategory(TestRepository.CATEGORIES currentCategory) {
        current = currentCategory;
    }
    @Override
    public int getQuestionCount() {
        return questionCount;
    }

    @Override
    public QuestionData getCurrentQuestionData() {
        return data.get(getCurrentCategory()).get(getQuestionCount());
    }

    @Override
    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public int getWrongCount() {
        return wrongCount;
    }

    @Override
    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

    @Override
    public int getRightCount() {
        return rightCount;
    }

    @Override
    public void setRightCount(int rightCount) {
        this.rightCount = rightCount;
    }
}
