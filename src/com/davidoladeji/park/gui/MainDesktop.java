package com.davidoladeji.park.gui;

import com.davidoladeji.park.service.ws.Booking;
import com.davidoladeji.park.service.ws.Carpark;
import com.davidoladeji.park.service.ws.ParkSOAPService;
import com.davidoladeji.park.service.ws.ParkService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Daveola on 3/26/2015.
 */
public class MainDesktop extends JFrame {

    ParkService pSerrvice = new ParkService();
    ParkSOAPService psService = pSerrvice.getParkSOAPServicePort();
    private JTextField carRegistrationTxt;
    private JLabel carRegistrationLbl;
    private JLabel carRegistrationResultLbl;
    private JLabel carEntryStatusResultLbl;
    private JButton findBookingBtn;

    public Carpark carpark;

    public boolean entryRequest;

    public boolean exitRequest;

    public MainDesktop() {
        super("Welcome to Safe Parking: Check Booking");


        setLayout(new FlowLayout());

        carRegistrationTxt = new JTextField();
        findBookingBtn = new JButton("Check Booking");

        carRegistrationLbl = new JLabel("Enter car Registration");
        carRegistrationResultLbl = new JLabel();

        carEntryStatusResultLbl = new JLabel();

        carRegistrationTxt.setSize(300, 80);
        carRegistrationResultLbl.setSize(300, 80);

        carRegistrationTxt.setColumns(10);

        carRegistrationResultLbl.setVisible(true);


        add(carRegistrationTxt);
        add(findBookingBtn);
        add(carRegistrationResultLbl);
        add(carEntryStatusResultLbl);


        findBookingBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                String carReg = carRegistrationTxt.getText();
//134567890
                Booking booking = psService.findByCarRegistrationAndCarpark(carReg, carpark);
                if (booking != null) {
                    if (booking.isActive()) {
                        System.out.println("Active Booking: " + booking.isActive());
                        carRegistrationResultLbl.setText("This car has a booking");
                        System.out.println("Entry Request:" + isEntryRequest());
                        if(isEntryRequest()){

                            System.out.println("Entry granted");
                            carEntryStatusResultLbl.setText("Entry granted");
                            psService.setGrantedEntry(true, booking);
                        }


                    } else if (!booking.isActive()) {
                        carRegistrationResultLbl.setText(" ");
                        System.out.print(booking.isActive());
                        carRegistrationResultLbl.setText("This booking is over");
                    } else {
                        carRegistrationResultLbl.setText(" ");
                        System.out.print(booking.isActive());
                        carRegistrationResultLbl.setText("Error I guess");
                    }
                } else if (booking == null) {

                    carRegistrationResultLbl.setText("No such booking");
                }


            }
        });


        setSize(300, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public boolean isEntryRequest() {
        return entryRequest;
    }

    public void setEntryRequest(boolean entryRequest) {
        this.entryRequest = entryRequest;
    }

    public boolean isExitRequest() {
        return exitRequest;
    }

    public void setExitRequest(boolean exitRequest) {
        this.exitRequest = exitRequest;
    }
}
