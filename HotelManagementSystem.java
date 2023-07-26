import java.util.Scanner;

public class HotelManagementSystem {

    // Array to store hotel rooms

    private static String[][] rooms = new String[10][2];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args [])
    {
        //initialize hotel rooms

        for(int i=0;i<rooms.length;i++)
        {
            rooms[i][0]=String.valueOf(i+1);
            rooms[i][1]="Empty";
        }

        //Display Hotel Menu

        while(true){
            System.out.println("\nWelcome To Hotel Management System\n");
            System.out.println("1. Check-IN");
            System.out.println("2. Check-OUT");
            System.out.println("3. View Occupancy");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    checkIn();
                    break;
                case 2:
                    checkOut();
                    break;
                case 3:
                    viewOccupancy();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Choice, PLease Try Again\n");
                    break;
            }
        }
    }


    //Method to Check-In Guests

    private static void checkIn()
    {
        System.out.println("\nEnter Room Number\n");

        int roomNumber = sc.nextInt()-1;

        if (roomNumber >=0 && roomNumber< rooms.length)
        {
            if (rooms[roomNumber][1].equals("Empty"))
            {
                System.out.println("\nEnter Guest Name\n");
                String GuestName = sc.next();

                rooms[roomNumber][1] = GuestName;
                System.out.println("\n Check-In Successful.");
            } else {
                System.out.println("\n This Room Is Already Occupied");
            }
        }
            else
            {
                System.out.println("\n Invalid Room Number");
            }

        }

        private static void checkOut()
        {
            System.out.println("\n Enter Room Number");
            int roomNumber = sc.nextInt() - 1;

            if(roomNumber>=0 && roomNumber<rooms.length) {
                if (!rooms[roomNumber][1].equals("Empty")) {

                    System.out.println("\nGuest " + rooms[roomNumber][1] + " has checked out of room " + rooms[roomNumber][0]
                            + " .");
                    rooms[roomNumber][1] = "Empty";
                } else {
                    System.out.println("Sorry This Room Is Already Vacant");
                }
            }
            else
                {
                    System.out.println("Invalid Room Number,Please Try Again");
                }


    }

    private static void viewOccupancy()
    {

        System.out.println("\nRoom \tGuest");
        for(int i=0;i<=rooms.length;i++)
        {
            System.out.println(rooms[i][0] + "\t" + rooms[i][1] );
        }
    }
    }
