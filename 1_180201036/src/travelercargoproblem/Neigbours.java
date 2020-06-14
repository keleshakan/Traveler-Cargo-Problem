/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelercargoproblem;

/**
 *
 * @author hakan
 */

public class Neigbours {
    public static String[][] neigbour = new String[][] {
        {"HATAY","OSMANİYE","KAHRAMANMARAŞ","KAYSERİ","NİĞDE","İÇEL"},
        {"ŞANLIURFA","DİYARBAKIR","MALATYA","KAHRAMANMARAŞ","GAZİANTEP"},
        {"ISPARTA","KONYA","ESKİŞEHİR","KÜTAHYA","UŞAK","DENİZLİ","BURDUR"},
        {"VAN","IĞDIR","KARS","ERZURUM","MUŞ","BİTLİS"},
        {"YOZGAT","TOKAT","SAMSUN","ÇORUM"},
        {"KONYA","AKSARAY","KIRŞEHİR","KIRIKKALE","ÇANKIRI","BOLU","ESKİŞEHİR"},
        {"İÇEL","KARAMAN","KONYA","ISPARTA","BURDUR","MUĞLA"},
        {"RİZE","ERZURUM","ARDAHAN"},
        {"MUĞLA","DENİZLİ","MANİSA","İZMİR"},
        {"İZMİR","MANİSA","KÜTAHYA","BURSA","ÇANAKKALE"},
        {"KÜTAHYA","ESKİŞEHİR","BOLU","SAKARYA","BURSA"},
        {"DİYARBAKIR","MUŞ","ERZURUM","ERZİNCAN","TUNCELİ","ELAZIĞ"},
        {"ŞİİRT","VAN","AĞRI","MUŞ","BATMAN"},
        {"ESKİŞEHİR","ANKARA","ÇANKIRI","ZONGULDAK","DÜZCE","SAKARYA","BİLECİK","KARABÜK"},
        {"MUĞLA","ANTALYA","ISPARTA","AFYONKARAHİSAR","DENİZLİ"},
        {"BALIKESİR","KÜTAHYA","BİLCİK","SAKARYA","KOCAELİ","YALOVA"},
        {"BALIKESİR","TEKİRDAĞ","EDİRNE"},
        {"ANKARA","KIRIKKALE","ÇORUM","KASTAMONU","BOLU","KARABÜK"},
        {"YOZGAT","AMASYA","SAMSUN","SİNOP","KASTAMONU","ÇANKIRI","KIRIKKALE"},
        {"MUĞLA","BURDUR","AFYONKARAHİSAR","UŞAK","MANİSA","AYDIN"},
        {"ŞANLIURFA","MARDİN","BATMAN","MUŞ","BİNGÖL","ELAZIĞ","MALATYA","ADIYAMAN"},
        {"ÇANAKKALE","TEKİRDAĞ","KIRIKKKALE"},
        {"DİYARBAKIR","BİNGÖL","TUNCELİ","ERZİNCAN","MALATYA"},
        {"ELAZIĞ","TUNCELİ","BİNGÖL","ERZURUM","BAYBURT","GÜMÜŞHANE","GİRESUN","SİVAS","MALATYA"},
        {"BİNGÖL","MUŞ","AĞRI","KARS","ARDAHAN","ARTVİN","RİZE","BAYBURT","ERZİNCAN"},
        {"AFYONKARAHİSAR","KONYA","ANKARA","BOLU","BİLECİK","KÜTAHYA"},
        {"KİLİS","ŞANLIURFA","ADIYAMAN","KAHRAMANMARAŞ","OSMANİYE","HATAY"},
        {"GÜMÜŞHANE","TRABZON","ERZİNCAN","SİVAS","ORDU"},
        {"ERZİNCAN","BAYBURT","TRABZON","GİRESUN"},
        {"VAN","ŞIRNAK"},
        {"GAZİANTEP","OSMANİYE","ADANA"},
        {"ANTALYA","KONYA","AFYONKARAHİSAR","BURDUR"},
        {"ADANA","NİĞDE","KONYA","KARAMAN","ANTALYA"},
        {"KOCAELİ","TEKİRDAĞ"},
        {"AYDIN","MANİSA","BALIKESİR"},
        {"AĞRI","IĞDIR","ARDAHAN","ERZURUM"},
        {"ÇORUM","SİNOP","ÇANKIRI","BARTIN","KARABÜK"},
        {"ADANA","KAHRAMANMARAŞ","SİVAS","YOZGAT","NEVŞEHİR","NİĞDE"},
        {"EDİRNE","TEKİRDAĞ"},
        {"NEVŞEHİR","YOZGAT","KIRIKKALE","ANKARA","AKSARAY"},
        {"YALOVA","İSTANBUL","BURSA","SAKARYA"},
        {"ANTALYA","KARAMAN","İÇEL","NİĞDE","AKSARAY","ANKARA","ESKİŞEHİR","AFYONKARAHİSAR","ISPARTA"},
        {"MANİSA","UŞAK","AFYONKARAHİSAR","ESKİEHİR","BİLECİK","BURSA","BALIKESİR"},
        {"KAHRAMANMARAŞ","ADIYAMAN","DİYARBAKIR","ELAZIĞ","ERZİNCAN","SİVAS"},
        {"İZMİR","AYDIN","DENİZLİ","UŞAK","KÜTAHYA","BALIKESİR"},
        {"GAZİANTEP","ADIYAMAN","MALATYA","SİVAS","KAYSERİ","ADANA","OSMANİYE"},
        {"ŞANLIURFA","DİYARBAKIR","BATMAN","ŞİİRT","ŞIRNAK"},
        {"ANTALYA","BURDUR","DENİZLİ","AYDIN"},
        {"DİYARBAKIR","BATMAN","BİTLİS","AĞRI","ERZURUM","BİNGÖL"},
        {"NİĞDE","KAYSERİ","YOZGAT","KIRŞEHİR","AKSARAY"},
        {"NEVŞEHİR","KAYSERİ","ADANA","İÇEL","KONYA","AKSARAY"},
        {"SAMSUN","TOKAT","GİRESUN","SİVAS"},
        {"ARTVİN","ERZURUM","BAYBURT","TRABZON"},
        {"DÜZCE","BOLU","BİLECİK","BURSA","KOCAELİ"},
        {"ORDU","TOKAT","AMASYA","ÇORUM","SİNOP"},
        {"VAN","BİTLİS","BATMAN","MARDİN","ŞIRNAK"},
        {"SAMSUN","ÇORUM","KASTAMONU"},
        {"KAYSERİ","KAHRAMANMARAŞ","MALATYA","ERZİNCAN","GİRESUN","ORDU","TOKAT","YOZGAT"},
        {"İSTANBUL","KIRKLARELİ","EDİRNE","ÇANAKKALE"},
        {"SİVAS","ORDU","SAMSUN","AMASYA","YOZGAT"},
        {"RİZE","BAYBURT","GÜMÜŞHANE","GİRESUN"},
        {"ELAZIĞ","BİNGÖL","ERZİNCAN"},
        {"GAZİANTEP","ADIYAMAN","DİYARBAKIR","MARDİN"},
        {"MANİSA","DENİZLİ","AFYONKARAHİSAR","KÜTAHYA"},
        {"HAKKARİ","ŞIRNAK","ŞİİRT","BİTLİS","AĞRI"},
        {"KAYSERİ","SİVAS","TOKAT","AMASYA","ÇORUM","KIRIKKALE","KIRŞEHİR","NEVŞEHİR"},
        {"BARTIN","BOLU","DÜZCE","KARABÜK"},
        {"NİĞDE","NEVŞEHİR","KIRŞEHİR","ANKARA","KONYA"},
        {"ERZİNCAN","ERZURUM","RİZE","TRABZON","GÜMÜŞHANE"},
        {"İÇEL","KONYA","ANTALYA"},
        {"KIRŞEHİR","YOZGAT","ÇORUM","ÇANKIRI","ANKARA"},
        {"MARDİN","ŞİİRT","BİTLİS","MUŞ","DİYARBAKIR"},
        {"MARDİN","ŞİİRT","VAN","HAKKARİ"},
        {"KASTAMONU","ZONGULDAK","KARABÜK"},
        {"KARS","ERZURUM","ARTVİN"},
        {"AĞRI","KARS"},
        {"KOCAELİ","BURSA"},
        {"ZONGULDAK","BARTIN","KASTAMONU","ÇANKIRI","BOLU"},
        {"GAZİANTEP"},
        {"GAZİANTEP","KAHRAMANMARAŞ","ADANA","HATAY"},
        {"ZONGULDAK","BOLU","SAKARYA"}
    };
}