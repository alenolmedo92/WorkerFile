import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int opt = 0;

            do {
                System.out.println("****************************************************************");
                System.out.println("****************************************************************");
                System.out.println("Welcome to the Personal Data Base,\nWhat do you want to do?");
                System.out.println("1-> Enter a new Worker\n" +
                        "2-> Modify Worker Data\n" +
                        "3-> Search Worker Data\n" +
                        "4-> Delete Worker Data\n" +
                        "0-> Exit");
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        PersonalService.addEntry();
                        break;
                    case 2:
                        PersonalService.modifyEntry();
                        break;
                    case 3:
                        PersonalService.findEntry();
                        break;
                    case 4:
                        PersonalService.deleteEntry();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid option, try again.");
                        break;
                }
            } while (opt != 0);
        }

    }
