/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.WorkQueue.LabTestWorkRequest;;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequest> organRequestList;
    private ArrayList<WorkRequest> organReportList;
    private ArrayList<WorkRequest> distributionList;
    private ArrayList<WorkRequest> artificialOrganRequestlist;
    
    private ArrayList<WorkRequest> organReportDocList;
    private ArrayList<WorkRequest> organReportHosList;

    public WorkQueue() {
        workRequestList = new ArrayList();
        organRequestList = new ArrayList();
        organReportList = new ArrayList();
        distributionList = new ArrayList();
        artificialOrganRequestlist = new ArrayList();
        organReportDocList = new ArrayList();
        organReportHosList = new ArrayList();
    }

    public ArrayList<WorkRequest> getOrganReportHosList() {
        return organReportHosList;
    }
    
    

    public ArrayList<WorkRequest> getOrganReportDocList() {
        return organReportDocList;
    }
    
    public ArrayList<WorkRequest> getArtificialOrganRequestlist() {
        return artificialOrganRequestlist;
    }

    public ArrayList<WorkRequest> getDistributionList() {
        return distributionList;
    }

    public ArrayList<WorkRequest> getOrganReportList() {
        return organReportList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getOrganRequestList() {
        return organRequestList;
    }

    @Override
    public String toString() {
        return "WorkQueue{" + "workRequestList=" + workRequestList + ", organRequestList=" + organRequestList + ", organReportList=" + organReportList + ", distributionList=" + distributionList + ", artificialOrganRequestlist=" + artificialOrganRequestlist + ", organReportDocList=" + organReportDocList + ", organReportHosList=" + organReportHosList + '}';
    }


    
    
    public WorkRequest searchDocReport(String keyword,String keyword2){
        for(WorkRequest request: organReportDocList){
            if(keyword.equals(request.getOrgan()) && keyword2.equals(request.getMessage())){
                return request;
            }
        }
        return null;
    }


    public WorkRequest search(String keyword, String keyword2) {
        for (WorkRequest request : organRequestList) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }
    


    public WorkRequest searchReport(String keyword) {
        for (WorkRequest request : organReportList) {
            if (keyword.equals(request.getMessage())) {
                return request;
            }
        }
        return null;
    }

    public WorkRequest searchDistribution(String keyword, String keyword2) {
        for (WorkRequest request : distributionList) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }

    public WorkRequest searchArtificial(String keyword, String keyword2) {
        for (WorkRequest request : artificialOrganRequestlist) {
            if (keyword.equals(request.getMessage()) && keyword2.equals(request.getOrgan())) {
                return request;
            }
        }
        return null;
    }

    public void removeLabRequest(WorkRequest workRequest) {
        LabTestWorkRequest r = (LabTestWorkRequest)workRequest;  
        workRequestList.remove(r);
    }

    public void removeOrganRequest(WorkRequest workRequest) {
        organRequestList.remove(workRequest);
    }

    public void removeOrganReport(WorkRequest workRequest) {
        organReportList.remove(workRequest);
    }
    
    public void removeDistributionList(WorkRequest workRequest) {
        distributionList.remove(workRequest);
    }
    
    public void removeartificialOrganRequest(WorkRequest workRequest) {
        artificialOrganRequestlist.remove(workRequest);
    }
}
