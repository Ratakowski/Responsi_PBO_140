/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdataperpus;
import java.sql.*;
import java.util.*;
import penyambung.Connector;
import model.*;
import implement.DataPerpusImplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lab Informatika
 */
public class DAODataPerpus implements DataPerpusImplement {
    Connection connection;
    final String select ="select *from dataperpus;";
    final String insert = "INSERT INTO dataperpus (judul, genre, penulis, penerbit, lokasi, stock) VALUES (?, ?, ?, ?, ?, ?); ";
    final String update = "update data set judul=? genre=? penulis=? penerbit=? lokasi=? stock=? where id=?";
    
    public DAODataPerpus (){
        connection = Connector.connection();
    }
    
    @Override
    public void insert (DataModel p){
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert,statement.RETURN_GENERATED_KEYS);
            statement.setString(1,p.getJudul());
            statement.setString(2,p.getGenre());
            statement.setString(3,p.getPenulis());
            statement.setString(4,p.getPenerbit());
            statement.setString(5,p.getLokasi());
            statement.setInt(6,p.getStock());
            statement.executeUpdate();
            
            ResultSet rs = stament.getGeneratedKeys();
            while(rs.next()){
                p.setId(rs.getInt(1));
            }catch(SQLException ex){
                    ex.printStack.Trace();
                    }finally{
                            try{
                            statement.close();
                            
                            }catch(SQLException ex){
                    ex.printStack.Trace();             
        }
    }
    
}
        
@Override 
public void update (DataModel p){
        Prepared.Statement statement = null;
        try{
            statement = connection.preparedStatement(update);
            statement.setString(1,p.getJudul());
            statement.setString(2,p.getGenre());
            statement.setString(3,p.getPenulis());
            statement.setString(4,p.getPenerbit());
            statement.setString(5,p.getLokasi());
            statement.setInt(6,p.getId());
            statement.setInt(7,p.getStock());
            statement.executeUpdate();
                    
        }catch(SQLException ex){
                    ex.printStack.Trace();
                    }finally{
                            try{
                            statement.close();
                            
                            }catch(SQLException ex){
                    ex.printStack.Trace();           
        }
    }
    }

@Override
public void delete(int Id){
        PreparedStatement statement = null;
        try{
            statement = connection.preparedStatement(delete);
            statement.setInt(1,p.getId());
            statement.executeUpdate();
        }atch(SQLException ex){
                    ex.printStack.Trace();
                    }finally{
                            try{
                            statement.close();
                            
                            }catch(SQLException ex){
                    ex.printStack.Trace();   
        }
    }
                    
    }
@Override
public list<DataModel> getAll(){
        list<DataModel> dp=null;
        try{
           dp =new ArrayList<DataModel>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(select);
           while(rs.next()){
               DataModel hp = new DataModel
                       hp.setId(rs.getInt("id"));
                       hp.setJudul(rs.getString("judul"));
                       hp.setGenre(rs.getString("Genre"));
                      hp.setPenulis(rs.getString("Penulis"));
                       hp.setPenerbit(rs.getString("Penerbit"));
                       hp.setLokasi(rs.getString("Lokasi"));
                       hp.setStock(rs.getInt("Stock"));
                       
                       
           }
        }
    }