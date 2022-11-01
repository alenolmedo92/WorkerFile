import java.util.Scanner;

public class PersonalService {

    public static void addEntry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");

        System.out.println("What do you need to add?\n1->Worker Data\n2->Adress\n0->Exit");
        int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("New Worker Data Entry, please enter the following Worker's Information: ");
                    sc.nextLine();
                    System.out.println("Name: ");
                    String workerName = sc.nextLine();
                    System.out.println("Surname: ");
                    String workerSurname = sc.nextLine();
                    System.out.println("DNI: ");
                    String workerDni = sc.nextLine();
                    System.out.println("DOB [dd/mm/yyyy]: ");
                    String workerDob = sc.nextLine();
                    System.out.println("Charge: ");
                    String workerCharge = sc.nextLine();
                    System.out.println("Email: ");
                    String workerEmail = sc.nextLine();
                    System.out.println("Phone: ");
                    String workerPhone = sc.nextLine();
                    System.out.println("Date of Admission: ");
                    String workerDoa = sc.nextLine();

                    Personal worker = new Personal(workerName, workerSurname, workerDni, workerDob, workerCharge, workerEmail, workerPhone, workerDoa);
                    PersonalDAO.newWorker(worker);
                    break;
                case 2:
                    System.out.println("Address information: ");
                    sc.nextLine();
                    System.out.println("Street: ");
                    String workerStreet = sc.nextLine();
                    System.out.println("cardinal: ");
                    String workercardinal = sc.nextLine();
                    System.out.println("Numeration: ");
                    String workerNumeration = sc.nextLine();
                    System.out.println("City: ");
                    String workerCity = sc.nextLine();
                    System.out.println("State: ");
                    String workerState = sc.nextLine();
                    System.out.println("Country: ");
                    String workerCountry = sc.nextLine();
                    System.out.println("Zip Code");
                    String workerZipCode = sc.nextLine();

                    Adress address = new Adress(workerStreet, workercardinal, workerNumeration, workerCity, workerState, workerCountry, workerZipCode);
                    PersonalDAO.newAddress(address);
                    break;
                case 0:
                    break;
            }
            System.out.println("----------------------------------------------------------------");

    }

    public static void modifyEntry() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Worker's DNI to modify: ");
        String workerDni = sc.nextLine();
        Personal worker = GetRegister.getOneReg(workerDni);
        System.out.println(worker.toString());

        System.out.println("1->Update Worker's data\n2->Update Worker's address\n0->Exit'");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                PersonalDAO.workerUpdate(worker);
                break;
            case 2:
                PersonalDAO.ModifyAddress(worker);
                break;
            case 0:
                break;
            default:
                System.out.println("no valid option selected");
                break;
        }
    }

    public static void findEntry() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1->Find Workers\n0->Exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("1->Complete list\n>DNI or Surname:");
                sc.nextLine();
                String find = sc.nextLine();
                PersonalDAO.findEntry(find);
            case 0:
                break;
        }
    }

    public static void deleteEntry() {
        System.out.println("In order to Delete a Register, enter the Worker's DNi: ");
        Scanner sc = new Scanner(System.in);
        String workerDni = sc.nextLine();

        PersonalDAO.deleteEntry(workerDni);
    }
}
