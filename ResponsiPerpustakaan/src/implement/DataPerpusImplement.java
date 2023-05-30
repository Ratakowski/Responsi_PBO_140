/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import java.util.List;
import model.*;
/**
 *
 * @author Lab Informatika
 */
public interface DataPerpusImplement {
    public void insert(DataModel p);
    public void update(DataModel p);
    public void delete(int Id);
    public List<DataModel> getAll();
    
}
