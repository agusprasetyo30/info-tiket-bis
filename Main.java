package InfoTiket;
//package Locket;

import InfoTiket.Customer;
import InfoTiket.BusRoute;
import InfoTiket.TicketLocket;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        TicketLocket ticket = new TicketLocket();
        ticket.addCustomer("null", "null");
        Customer user = ticket.loginCustomer("null", "null");

        int menu = 0;
        while (menu != 3) {
            while (ticket.getCustomerId() != 0) {
                listMenuAfterLogin();
                int chooseMenu = scan.nextInt();
                switch (chooseMenu) {
                    case 1:
                        locket();
                        break;
                    case 2:
                        ticket.logout();
                        break;
                }
            }

            listMenuBeforeLogin();
            System.out.print("Your Choice: ");
            menu = scan.nextInt();
            loginForm(menu, ticket, user);
        }
    }

    private static void listMenuBeforeLogin() {
        System.out.println("\nLocket Bus");
        System.out.println("1. Registrasi");
        System.out.println("2. Login");
        System.out.println("3. Finish");
    }

    private static void listMenuAfterLogin() {
        System.out.println("\nChoice your option:");
        System.out.println("1. Locket");
        System.out.println("2. Logout");
        System.out.print("\nYour Choice:");
    }
    
    private static void loginForm(int menu, TicketLocket ticket, Customer customer) {
        switch (menu) {
            case 1:
                System.out.print("username:   ");
                scan.nextLine();
                String usernameRegister = scan.nextLine();
                System.out.print("password:   ");
                String passwordRegister = scan.nextLine();
                System.out.print("phone: ");
                String phoneRegister = scan.nextLine();
                ticket.addCustomer(usernameRegister, passwordRegister, phoneRegister);
                break;
            case 2:
                System.out.print("username: ");
                scan.nextLine();
                String usernamelogin = scan.nextLine();
                System.out.print("password: ");
                String passwordlogin = scan.nextLine();
                
                ticket.loginCustomer(usernamelogin, passwordlogin);
                
                if (ticket.getCustomerId() == 0) System.out.println("Username/Password salah"); 
                             
                break;
        }
    }

    private static void locket() {
        Scanner scanner = new Scanner(System.in);

        BusRoute route = new BusRoute();
        System.out.println("City");
        System.out.println("1. Metro");
        System.out.println("2. Jakarta");
        System.out.println("3. Bandung");
        System.out.println("4. Surabaya");
        System.out.println();
        System.out.print("Choice Departure City : ");
        int departure = scanner.nextInt();
        System.out.print("Choice Destination City : ");
        int destination = scanner.nextInt();
        if (departure == 1) {
            switch (destination) {
                case 2:
                    route.routeMetro(destination);
                    break;
                case 3:
                    route.routeMetro(destination);
                    break;
                case 4:
                    route.routeMetro(destination);
                    break;
                default:
                    System.out.println("Nothing");
                    break;
            }
        } else if (departure == 2) {
            switch (destination) {
                case 1:
                    route.routeJakarta(destination);
                    break;
                case 3:
                    route.routeJakarta(destination);
                    break;
                case 4:
                    route.routeJakarta(destination);
                    break;
                default:
                    System.out.println("Nothing");
                    break;
            }
        } else if (departure == 3) {
            switch (destination) {
                case 1:
                    route.routeBandung(destination);
                    break;
                case 2:
                    route.routeBandung(destination);
                    break;
                case 4:
                    route.routeBandung(destination);
                    break;
                default:
                    System.out.println("Nothing");
                    break;
            }
        } else if (departure == 4) {
            switch (destination) {
                case 1:
                    route.routeSurabaya(departure, destination);
                    break;
                case 2:
                    route.routeSurabaya(departure, destination);
                    break;
                case 3:
                    route.routeSurabaya(departure, destination);
                    break;
                default:
                    System.out.println("Nothing");
                    break;
            }
        } else {
            System.out.println("Nothing");
        }
    }
}
