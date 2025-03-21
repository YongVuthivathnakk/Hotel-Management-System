package GUI;


import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Rooms.Room;

import java.awt.Color;
import java.awt.Font;

public class LoadRoomFromDatabase {
    Frame frame = new Frame();
    LoadRoomFromDatabase(){
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        JLabel heading = new JLabel("Room data");
        heading.setBounds(50, 50, 500, 40);
        heading.setFont(new Font("Serif", Font.PLAIN, 24));
        heading.setForeground(Color.WHITE);
        Room.readFromDatabase();

        DefaultTableModel tableModel = new DefaultTableModel(new String[] {"Room Type", "Room Number", "Price per Night", "Capacity"}, 0
        );


        for(Room room: Room.getRoomList().values()){
            tableModel.addRow(new Object[]{
                room.getClass().getSimpleName(), // Room Type
                room.getRoomNumber(),
                room.getPricePerNight(),
                room.getCapacity()
            });
        }

        JTable table = new JTable(tableModel);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.setRowHeight(30);
        table.setGridColor(Color.GRAY);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 100, 600, 300);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        scrollPane.setViewportBorder(null);
        frame.add(scrollPane);
        frame.add(heading);

    }
}
