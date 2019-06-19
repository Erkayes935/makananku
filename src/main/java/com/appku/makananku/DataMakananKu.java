package com.appku.makananku;

import java.util.ArrayList;

public class DataMakananKu {
    public static String[][] datamakanan = new String[][]{
            {
                    "Pempek", "Makanan Favorit Pertama",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Pempek_Kuah_Cuko.jpg/330px-Pempek_Kuah_Cuko.jpg",
                    "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging " +
                            "ikan yang digiling lembut dan tepung kanji (secara salah kaprah sering " +
                            "disebut sebagai \"tepung sagu\"), serta beberapa komposisi lain seperti" +
                            "telur, bawang putih yang dihaluskan, penyedap rasa dan garam.",
                    "Makanan Khas Palembang",
                    "Daging ikan, tapioka, telur ayam, air matang, garam",
                    "Pempek kapal selam (pempek telur besar)\npempek telur kecil\npempek keriting\n" +
                            "pempek kulit\npempek tahu\npempek pistel\npempek udang\n " +
                            "pempek belah\npempek panggang\npempek lenggang"
            },
            {
                    "Mie Ayam", "Makanan Favorit Kedua",
                    "https://upload.wikimedia.org/wikipedia/commons/d/d2/Mi_ayam_biasa.JPG",
                    "Mi ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mi kuning " +
                            "direbus mendidih kemudian ditaburi saos kecap khusus beserta daging ayam " +
                            "dan sayuran",
                    "Makanan Nusantara",
                    "Mie Kuning, Sawi Hijau, Ayam Suwir, Kuah, Sedikit Minyak",
                    "Mie Ayam Original\nMie Ayam Jamur\nMie Ayam Bakso\nMie Ayam Pangsit"
            },
            {
                    "Ayam Bakar", "Makanan Favorit Ketiga",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Set_menu_Ayam_Bakar_Tempe_Tahu.jpg/408px-Set_menu_Ayam_Bakar_Tempe_Tahu.jpg",
                    "Ayam bakar adalah sebuah hidangan Asia Tenggara Maritim, terutama hidangan " +
                            "Indonesia atau Malaysia, dari ayam yang dipanggang di atas arang.",
                    "Makanan Nusantara",
                    "Ayam, Bawang Merah, Bawang Putih, Rempah - rempah",
                    "Ayam Bakar Original\nAyam Bakar Padang\nAyam Bakar Taliwang\nAyam Bakar Bumbu " +
                            "Rujak\nAyam Bakakak\nAyam Bakar Golek\nAyam Bakar Percik"
            }};

    public static ArrayList<MakananList> getListData() {
        MakananList makananList = null;
        ArrayList<MakananList> list = new ArrayList<>();
        for (int x = 0; x < datamakanan.length; x++) {
            makananList = new MakananList();
            makananList.setNama(datamakanan[x][0]);
            makananList.setPilihan(datamakanan[x][1]);
            makananList.setFoto(datamakanan[x][2]);
            makananList.setPenjelasan(datamakanan[x][3]);
            makananList.setKeterangan(datamakanan[x][4]);
            makananList.setBahan(datamakanan[x][5]);
            makananList.setJenis(datamakanan[x][6]);
            list.add(makananList);
        }
        return list;
    }
}
