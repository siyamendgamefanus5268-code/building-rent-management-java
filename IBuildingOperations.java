package interfaces;

import entity.*;

public interface IBuildingOperations {

    public abstract void addTenant(int tNo, Tenant t);
    public abstract Tenant getTenant(int tNo);
    public abstract Tenant getTenantById(String id);
    public abstract void removeTenant(int tNo);
    public abstract void removeTenantById(String id); 
}