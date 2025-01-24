// import java.io.*;

public class RoomList {
    public static Node head;
    
        static class Node {
            String roomNumber;
            String roomStatus;
            Node next;
            
            // Constructor
            Node(String newRoomNumber, String newRoomStatus) {
                roomNumber = newRoomNumber;
                roomStatus = newRoomStatus;
                next = null;
            }
    
        }

        public void insertInfo(String roomNum, String roomStat) {
            Node newNode = new Node(roomNum, roomStat);
            if(head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next; // Traverse to the end of the list
                }
                current.next = newNode; // Add the new node at the end
            }
        }

        public void printRoom() {
            Node current = head;
            while (current != null) {
                System.out.println("Room Number: " + current.roomNumber + ", Status: " + current.roomStatus);
                current = current.next; // Move to the next node
            }
        }
}

