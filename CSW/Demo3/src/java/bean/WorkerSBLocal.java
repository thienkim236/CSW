/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.ejb.Local;
import model.Worker;

/**
 *
 * @author lenovo
 */
@Local
public interface WorkerSBLocal {
       List<Worker>findAll();
    void addWorker(Worker worker);
}