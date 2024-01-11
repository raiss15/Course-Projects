/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;
    
    public WorkQueue(){
        workRequestList = new ArrayList();
    }
    public ArrayList<WorkRequest> getWorkRequestList(){
        return workRequestList;
    }
}
