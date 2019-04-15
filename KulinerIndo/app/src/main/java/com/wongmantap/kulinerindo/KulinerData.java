package com.wongmantap.kulinerindo;

import java.util.ArrayList;

/**
 * Created by 0431260118 on 3/26/2019.
 */

public class KulinerData {
    public static String[][] data = new String[][]{
            {"Emping", "Kuliner Asal Serang", "https://i.ebayimg.com/images/g/3AoAAOSwAXhZ1vxC/s-l300.jpg"},
            {"Bakpia", "Kuliner Asal Jawa", "https://www.sumber.com/images/1_REDAKSI_SUMBER/Veve_Florencia/Jalan_Kuliner/basic_data/7_juli2017/Bakpia.jpg"},
            {"Cilok", "Kuliner Asal Jawa Barat", "https://cdns.klimg.com/merdeka.com/i/w/news/2017/09/04/883106/670x335/3-cara-membuat-cilok-dan-bumbu-kacang-cilok-yang-enak-dan-mudah.jpg"},
            {"Sate Bandeng", "Kuliner Asal Serang", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/1/16/4896156/4896156_fbb7664b-5e17-4b4b-abb0-b9918ed42dd5_391_391.jpg"},

    };

    public static ArrayList<Kuliner> getListData(){
        Kuliner kuliner = null;
        ArrayList<Kuliner> list = new ArrayList<>();
        for (String[] aData : data) {
            kuliner = new Kuliner();
            kuliner.setName(aData[0]);
            kuliner.setRemarks(aData[1]);
            kuliner.setPhoto(aData[2]);

            list.add(kuliner);
        }

        return list;
    }
}
