package com.davidoladeji.park.gui;


import com.davidoladeji.park.gui.MainDesktop;
import com.davidoladeji.park.service.ws.Carpark;
import com.davidoladeji.park.service.ws.ParkSOAPService;
import com.davidoladeji.park.service.ws.ParkService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StartUpDesktop extends JFrame{

    public Carpark carpark;
    ParkService pSerrvice = new ParkService();
    ParkSOAPService psService = pSerrvice.getParkSOAPServicePort();

    final List<Carpark> carparkList = psService.findAllCarparks();

    final JComboBox<String> combBoxCarList = new JComboBox<String>();
    String [] entryExitMessage = {"Entry", "Exit"};
    final JComboBox<String> combBoxExitOrEntry = new JComboBox<String>(entryExitMessage);

    JButton continueBtn = new JButton("Start");

    public StartUpDesktop() {
        super("Welcome to Safe Parking: Select Carpark");

        ParkService pSerrvice = new ParkService();

        ParkSOAPService psService = pSerrvice.getParkSOAPServicePort();


        for (int i = 0; i < carparkList.size(); i++) {
            combBoxCarList.addItem(carparkList.get(i).getCodename());

        }
        combBoxCarList.setSelectedIndex(1);

        add(combBoxCarList);
        add(combBoxExitOrEntry);
        add(continueBtn);

        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carpark = carparkList.get(combBoxCarList.getSelectedIndex());

                MainDesktop mainDesktop = new MainDesktop();
                //134567890
                mainDesktop.carpark = carpark;

                String entryStatus = combBoxExitOrEntry.getSelectedItem().toString();

                System.out.println(combBoxExitOrEntry.getSelectedItem().toString());

                if(entryStatus.equalsIgnoreCase("Entry")){
                    mainDesktop.setEntryRequest(true);

                }else if (entryStatus.equalsIgnoreCase("Exit")){
                    mainDesktop.setExitRequest(true);
                }else{
                    mainDesktop.setExitRequest(false);
                    mainDesktop.setEntryRequest(false);
                }


                mainDesktop.setVisible(true);

                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() - mainDesktop.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - mainDesktop.getHeight()) / 2);
                mainDesktop.setLocation(x, y);
            }
        });


    }

}