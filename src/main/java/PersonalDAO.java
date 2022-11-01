import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDAO {
    public static void newWorker(Personal worker) {
        Scanner sc = new Scanner(System.in);
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try (Connection conn = dbConnect.getConnection()) {
            try {
                String query = "INSERT INTO personal(name, surname, dni, dob, charge, email, phone, doa) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                statement = conn.prepareStatement(query);
                statement.setString(1, worker.getName());
                statement.setString(2, worker.getSurname());
                statement.setString(3, worker.getDni());
                statement.setString(4, worker.getDob());
                statement.setString(5, worker.getCharge());
                statement.setString(6, worker.getEmail());
                statement.setString(7, worker.getPhone());
                statement.setString(8, worker.getDoa());

                System.out.println("Update data? \n1->Yes\n0->Exit...");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        statement.executeUpdate();
                        System.out.println("Saved!");
                        break;
                    case 0:
                        break;
                }

                ConnectionDB.Close(resultSet, statement, conn);

            } catch (SQLException e) {
                System.out.println("Error en las operaciones a base de datos.");
                e.printStackTrace(System.out);
            }
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }

    }

    public static void newAddress(Adress address) {
        Scanner sc = new Scanner(System.in);
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        System.out.println("Enter the worker's  DNI: ");
        String dniWorker = sc.nextLine();
        Personal worker = GetRegister.getOneReg(dniWorker);

        try (Connection conn = dbConnect.getConnection()) {
            try {
                String query = "INSERT INTO direccion(calle, cardinal, numeracion, departamento, provincia, pais, codigopostal, IDpersonal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                statement = conn.prepareStatement(query);
                statement.setString(1, address.getStreet());
                statement.setString(2, address.getCardinal());
                statement.setString(3, address.getNumber());
                statement.setString(4, address.getCity());
                statement.setString(5, address.getState());
                statement.setString(6, address.getCountry());
                statement.setString(7, address.getCp());
                statement.setInt(8, worker.getId());

                System.out.println("Update data? \n1->Yes\n0->Exit...");
                int option = sc.nextInt();

                ConnectionDB.Close(resultSet, statement, conn);
            } catch (Exception e) {
                System.out.println("Error en las operaciones a base de datos.");
                e.printStackTrace(System.out);
            }
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
    }

    public static void workerUpdate(Personal worker) {
        Scanner sc = new Scanner(System.in);
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try (Connection conn = dbConnect.getConnection()) {

            String query = "UPDATE personal SET name = ?, surname = ?, dni = ?, dob = ?, charge = ?, email = ?, phone = ?, doa = ? WHERE dni = ?";
            statement = conn.prepareStatement(query);
            statement.setString(9, worker.getDni());

            System.out.println("Modify database: \n");
            System.out.println("Name: ");
            String name = sc.nextLine();
            statement.setString(1, name);
            System.out.println("Surname: ");
            String surname = sc.nextLine();
            statement.setString(2, surname);
            System.out.println("DNI: ");
            String dni = sc.nextLine();
            statement.setString(3, dni);
            System.out.println("Date of birth [dd/mm/yyyy]: ");
            String dob = sc.nextLine();
            statement.setString(4, dob);
            System.out.println("Charge: ");
            String charge = sc.nextLine();
            statement.setString(5, charge);
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            statement.setString(6, email);
            System.out.println("Phone: ");
            String phone = sc.nextLine();
            statement.setString(7, phone);
            System.out.println("Date of admission [dd/mm/yyyy]: ");
            String doa = sc.nextLine();
            statement.setString(8, doa);

            System.out.println("1->Update Data\n0->Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    statement.executeUpdate();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Updated Successfully!");
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("no valid option selected");
                    break;
            }
            ConnectionDB.Close(resultSet, statement, conn);
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
    }

    public static void ModifyAddress(Personal worker) {
        Scanner sc = new Scanner(System.in);
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try (Connection conn = dbConnect.getConnection()) {
            String query = "UPDATE direccion SET calle= ?,cardinal=?,numeracion=?,departamento=?,provincia=?,pais=?,codigopostal=? WHERE IDpersonal = ?";
            statement = conn.prepareStatement(query);
            statement.setInt(8, worker.getId());

            System.out.println("Modify database: \n");
            System.out.println("calle: ");
            String calle = sc.nextLine();
            statement.setString(1, calle);
            System.out.println("cardinal: ");
            String cardinal = sc.nextLine();
            statement.setString(2, cardinal);
            System.out.println("numeracion: ");
            String numeracion = sc.nextLine();
            statement.setString(3, numeracion);
            System.out.println("Departamento: ");
            String dpto = sc.nextLine();
            statement.setString(4, dpto);
            System.out.println("provincia: ");
            String prov = sc.nextLine();
            statement.setString(5, prov);
            System.out.println("Pais: ");
            String pais = sc.nextLine();
            statement.setString(6, pais);
            System.out.println("codigo postal: ");
            String cp = sc.nextLine();
            statement.setString(7, cp);

            System.out.println("1->Update Data\n0->Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    statement.executeUpdate();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Updated Successfully!");
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("no valid option selected");
                    break;
            }

            ConnectionDB.Close(resultSet, statement, conn);

        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
    }

    public static void findEntry(String find) {
        if (find.equals("1")) {
            ArrayList<Personal> workersList = GetRegister.getAllRegisters();
            for (Personal worker : workersList) {
                System.out.println(worker.toString());
                System.out.println("---------------------------------------");
            }
        } else {
            ArrayList<Personal> workersList = GetRegister.getRegisters(find);
            for (Personal worker : workersList) {
                System.out.println(worker.toString());
                System.out.println("---------------------------------------");
            }
        }
    }

    public static void deleteEntry(String workerDni) {
        Scanner sc = new Scanner(System.in);
        GetRegister.getOneReg(workerDni);
        ResultSet resultSet = null;

        System.out.println("Do you want to delete the entry?\n1->Yes\n0->No");
        int option = sc.nextInt();
        if (option == 1) {
            ConnectionDB dbConnect = new ConnectionDB();

            try (Connection conn = dbConnect.getConnection()) {
                PreparedStatement statement = null;
                try {
                    String query = "DELETE FROM personal WHERE dni = " + workerDni;
                    statement = conn.prepareStatement(query);

                    int countRowsUpdated = statement.executeUpdate();
                    if (countRowsUpdated != 0) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("it Can't be deleted");
                    }
                    ConnectionDB.Close(resultSet, statement, conn);
                } catch (SQLException e) {
                    System.out.println("Error en las operaciones a base de datos.");
                    e.printStackTrace(System.out);
                }
            } catch (SQLException e) {
                System.out.println("Error en las operaciones a base de datos.");
                e.printStackTrace(System.out);
            }
        }
    }
}

