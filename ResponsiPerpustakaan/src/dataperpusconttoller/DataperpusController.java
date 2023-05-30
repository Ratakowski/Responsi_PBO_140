/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataperpusconttoller;
import java.util.List;
import DAOdataperpus.DAODataPerpus;
import implement.DataPerpusImplement;
import model.*;
import responsiperpustakaan.MainFrame;
        
        
/**
 *
 * @author Lab Informatika
 */
public class DataperpusController {
    MainFrame frame;
    DataPerpusImplement implement;
    List<DataModel>dp;
    
    public DataperpusController(MainFrame frame){
        this.frame = frame;
        implement = new DAODataPerpus();
        dp = implement.getAll();
    }
    public void isitabel(){
        dp= implement.getAll();
        DataModel mp = new DataTabel(dp);
        frame.getTabelDataPerpus().setModel(mp)
    }
    public void insert(){
        DataModel dp = new DataModel();
        dp.setId(frame.getJtid()).getText();
        dp.setJudul(frame.getJtJudul()).getText();
        dp.setGenre(frame.getJtGenre()).getText();
        dp.setPenulis(frame.getJtPenulis()).getText();
        dp.setPenerbit(frame.getJtPenerbit()).getText();
        dp.setLokasi(frame.getJtLokasi()).getText();
        dp.setStock(frame.getJtStock()).getText();
        implement.update(dp);
     
    public void delete(){
        int Id = Integer.parseInt(frame.getJtid().gettext());
        implement.delete(dp);
    }
    }

