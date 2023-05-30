/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTabelModel;
/**
 *
 * @author Lab Informatika
 */
public class DataTabel extends AbstractTabelModel {
    List<DataModel>dp;
    public.DataTabel(List<DataModel>dp){
        this.dp = dp;
    }
    @Override
public int getRowcount(){
    return dp.size();
}  
    @Override
public int getColummCount(){
    return 7;
}  
@Override
public StringgetColummName(int columm){
    switch(columm){
        case()
                return "Id"
        case 1
                return "Judul"
        case 2
                return "Genre"
        case 3
                return "Penulis"
        case 4
                return "Penerbit"
        case 5
                return "Lokasi"
        case 6
                return "Stock"
                return null;
    }
}




@Override
public Object getValueAt(int row, int columm){
    switch(columm){
        case()
                return dp.get(now).getId;
        case 1
                return dp.get(now).getJudul;
        case 2
                return dp.get(now).getGenre;
        case 3
                return dp.get(now).getPenulis;
        case 4
                return dp.get(now).getPenerbit;
        case 5
                return dp.get(now).getLokasi;
        case 6
                return dp.get(now).getStock;
                return null;
    }
}
}
