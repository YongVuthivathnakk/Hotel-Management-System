package GUI;

import java.awt.Color;
import java.awt.Font;

public class BookingWindow {
    Frame frame = new Frame();
    public BookingWindow() {
        frame.getContentPane().setBackground(Color.darkGray);
        Label usernameLabel = new Label("Username");
        usernameLabel.setBounds(50, 50, 200, 40);
        TextInput userNameInput = new TextInput(50, 90);


        Label phoneNumberLabel = new Label("Phone Number");
        phoneNumberLabel.setBounds(600, 50, 200, 40);
        TextInput phoneNumberInput = new TextInput(600, 90);
        

        Label checkInDateLabel = new Label("Check-in Date");
        checkInDateLabel.setBounds(50, 150, 200, 40);
        TextInput checkIndateInput = new TextInput(50, 190);

        Label checkOutDateLabel = new Label("Check-out Date");
        checkOutDateLabel.setBounds(600, 150, 200, 40);
        TextInput checkOutDateInput = new TextInput(600, 190);

        Label roomTypeLabel = new Label("Room Type");
        roomTypeLabel.setBounds(50, 250, 200, 40);
        TextInput roomTypeInput = new TextInput(50, 290);



        Label roomQuantitiesLabel = new Label("Room Quantites");
        roomQuantitiesLabel.setBounds(600, 250, 200, 40);
        TextInput roomQuantitiesInput = new TextInput(600, 290);

        Label serviceLabel = new Label("Service");
        serviceLabel.setBounds(50, 350, 200, 40);
        TextInput serviceInput = new TextInput(50, 390);

        Label serviceQuantitiesLabel = new Label("Service Quantities");
        serviceQuantitiesLabel.setBounds(600, 350, 200, 40);
        TextInput serviceQuantitiesInput = new TextInput(600, 390);


        Label discountLabel = new Label("Discount");
        discountLabel.setBounds(50, 450, 200, 40);
        TextInput discountInput = new TextInput(50, 490);

        Button bookingButton = new Button("Booking", 400, 600, 400, 40);
        bookingButton.setFont(new Font("Serif", Font.PLAIN, 26));

        frame.add(usernameLabel);
        frame.add(userNameInput);
        frame.add(phoneNumberLabel);
        frame.add(phoneNumberInput);
        frame.add(checkInDateLabel);
        frame.add(checkIndateInput);
        frame.add(checkOutDateLabel);
        frame.add(checkOutDateInput);
        frame.add(roomTypeLabel);
        frame.add(roomTypeInput);
        frame.add(roomQuantitiesLabel);
        frame.add(roomQuantitiesInput);
        frame.add(serviceLabel);
        frame.add(serviceInput);
        frame.add(serviceQuantitiesLabel);
        frame.add(serviceQuantitiesInput);
        frame.add(discountLabel);
        frame.add(discountInput);
        frame.add(bookingButton);

        bookingButton.addActionListener(e -> {

        });
    }

    // private void addNewBooking(){
    //     String input;
    // }
}
