/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class DataModel {
    private Integer Id;
    private String Judul;
    private String Genre;
    private String Penulis;
    private String Penerbit;
    private String Lokasi;
     private Integer Stock;
     
     public Integer getId(){
         return Id;
     }
     
     public void setId(Integer Id){
         this.Id = Id;
     }
     
      public String getJudul(){
         return Judul;
     }
     
     public void setJudul(String Judul){
         this.Judul = Judul;
     }
     
     public String getGenre(){
         return Genre;
     }
     
     public void setGenre(String Genre){
         this.Genre = Genre;
     }
     
     public String getPenulis(){
         return Penulis;
     }
     
     public void setPenulis(String Penulis){
         this.Penulis = Penulis;
     }
     
     public String getPenerbit(){
         return Penerbit;
     }
     
     public void setPenerbit(String Penerbit){
         this.Penerbit = Penerbit;
     }
     
     public String getLokasi(){
         return Lokasi;
     }
     
     public void setLokasi(String Lokasi){
         this.Lokasi = Lokasi;
     }
     public Integer getStock(){
         return Stock;
     }
     
     public void setStock(Integer Stock){
         this.Stock = Stock;
     }
    
}
