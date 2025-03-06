package Booking;


public class ServiceBooking {
    protected String serviceType;
    protected int serviceQuantities;

    ServiceBooking(String serviceType, int serviceQuantities){
        this.serviceType = serviceType;
        this.serviceQuantities = serviceQuantities;
    }

    public String getService() {
        return serviceType;
    }

    public int getServiceQuantities() {
        return serviceQuantities;
    }

    
}
