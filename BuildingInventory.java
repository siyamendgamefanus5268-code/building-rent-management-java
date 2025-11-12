package manager;

import entity.*;
import interfaces.*;

public class BuildingInventory implements IBuildingOperations {
    private Tenant[] tenants;

    public BuildingInventory() {
        tenants = new Tenant[1000];
    }

    public BuildingInventory(int size) {
        tenants = new Tenant[size];
    }

   
    public void addTenant(int tNo, Tenant t) {
        if (tNo >= 0 && tNo < tenants.length) {
            tenants[tNo] = t;
        }
    }

    
    public Tenant getTenant(int tNo) {
        return tenants[tNo];
    }

    
    public Tenant getTenantById(String id) {
        for (Tenant t : tenants) {
            if (t != null && t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

   
    public void removeTenant(int tNo) {
        tenants[tNo] = null;
    }
	
	public void removeTenantById(String id) {
        for (int i = 0; i < tenants.length; i++) {
            if (tenants[i] != null && tenants[i].getId().equals(id)) {
                tenants[i] = null;
                return;
            }
        }
    }


	

    
    public void showInventory() {
        System.out.println("------------ Tenant Inventory --------------");
        for (Tenant t : tenants) {
            if (t != null) {
                t.displayDetails();
            }
        }
        System.out.println("--------------------------------------------");
    }

   
    public String toString() {
        String allData = "";
        allData += "------------ Tenant Inventory --------------\n";
        for (int i = 0; i < tenants.length; i++) {
            if (tenants[i] != null) {
                allData += "~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
                allData += "Tenant No: " + i + "\n";
                allData += tenants[i].toString();
            }
        }
        allData += "--------------------------------------------\n";
        return allData;
    }


    public Tenant[] getAllTenants() {
        return tenants;
    }
}