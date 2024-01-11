package business.Organization;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import business.Organization.CommunityServiceDepartmentOrganization;
import business.Organization.FireDepartmentOrganization;
import business.Organization.MedicalDepartmentOrganization;
import business.Organization.Organization;
import business.Organization.Organization.Type;
import business.Organization.PoliceDepartmentOrganization;
import business.Organization.PublicWorksDepartmentOrganization;
import business.Organization.YouthOrganization;
import java.util.ArrayList;

/**
 *
 * @author bhagtrivedi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.PoliceDepartment.getValue())){
            organization = new PoliceDepartmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.FireDepartment.getValue())){
            organization=new FireDepartmentOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.CommunityService.getValue())){
            organization=new CommunityServiceDepartmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.MedicalDepartment.getValue())){
            organization=new MedicalDepartmentOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.YouthOrganization.getValue())){
            organization=new YouthOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PublicWorksDepartment.getValue())){
            organization=new PublicWorksDepartmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}