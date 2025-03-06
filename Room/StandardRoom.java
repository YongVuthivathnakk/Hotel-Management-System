package Room;


public class StandardRoom extends Room {
    StandardRoom(){ // constructor
        this.description = "Standard Room Overview:\n" +
                        "A cozy and budget-friendly standard hotel room designed for solo travelers or couples looking for comfort without breaking the bank. The room offers essential amenities, ensuring a pleasant stay at an affordable price.\n" + //
                        "\n" + 
                        "Sleeping Area:\n" + 
                        "\n" + 
                        "Full or Queen-sized bed with fresh linens and two pillows\n" + 
                        "Basic nightstand with a reading lamp\n" + 
                        "Blackout curtains for a good night's sleep\n" + 
                        "Work & Entertainment:\n" + 
                        "\n" + 
                        "Small desk with a chair (may be compact)\n" + 
                        "Flat-screen TV with limited cable channels\n" + 
                        "Complimentary Wi-Fi (may have moderate speed)\n" + 
                        "Amenities:\n" + 
                        "\n" +
                        "Mini-fridge (small, suitable for drinks and snacks)\n" + 
                        "Basic coffee maker with a few complimentary coffee/tea packets\n" + 
                        "Open wardrobe or small closet with a few hangers\n" + 
                        "Iron and ironing board (available upon request)\n" + 
                        "Bathroom:\n" + 
                        "\n" + 
                        "Private en-suite bathroom with a standing shower (bathtub may not be available)\n" + 
                        "Basic toiletries (soap, shampoo, and towels)\n" + 
                        "Hairdryer (available upon request in some hotels)\n" + 
                        "Climate Control & Lighting:\n" + 
                        "\n" + 
                        "Wall-mounted air conditioning or heating unit (may take time to adjust)\n" + 
                        "Moderate natural lighting with window views depending on the location";
        this.capacity = 2;
        this.roomType = "Standard Room";
        this.pricePerNight = 80;
        
    }    
}

