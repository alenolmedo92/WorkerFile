import java.sql.*;
import java.util.ArrayList;

public class GetRegister {
    public static ArrayList<Personal> getRegisters(String info) {
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        ArrayList<Personal> listedworkers = new ArrayList<Personal>();

        try (Connection conn = dbConnect.getConnection()) {
            String query = "SELECT * FROM personal WHERE dni = ? OR UPPER(surname) REGEXP CONCAT('^', ?)";
            statement = conn.prepareStatement(query);
            statement.setString(1, info);
            statement.setString(2, info);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Personal worker = new Personal();
                worker.setId(resultSet.getInt("id_personal"));
                worker.setName(resultSet.getString("name"));
                worker.setSurname(resultSet.getString("surname"));
                worker.setDni(resultSet.getString("dni"));
                worker.setDob(resultSet.getString("dob"));
                worker.setCharge(resultSet.getString("charge"));
                worker.setEmail(resultSet.getString("email"));
                worker.setPhone(resultSet.getString("phone"));
                worker.setDoa(resultSet.getString("doa"));
                listedworkers.add(worker);
            }
            for (Personal worker : listedworkers) {
                try {
                    String queryAdress = "SELECT * FROM direccion WHERE IDpersonal = ?";
                    statement = conn.prepareStatement(queryAdress);
                    statement.setInt(1, worker.getId());

                    resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        Adress adress = new Adress();

                        adress.setStreet(resultSet.getString("calle"));
                        adress.setCardinal(resultSet.getString("cardinal"));
                        adress.setNumber(resultSet.getString("numeracion"));
                        adress.setCity(resultSet.getString("departamento"));
                        adress.setState(resultSet.getString("provincia"));
                        adress.setCountry(resultSet.getString("pais"));
                        adress.setCp(resultSet.getString("codigopostal"));

                        worker.setAddress(adress);
                    }

                } catch (SQLException e) {
                    System.out.println("Error en las operaciones a base de datos.");
                    e.printStackTrace(System.out);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
        return listedworkers;
    }

    public static Personal getOneReg(String workerInfo) {
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        Personal worker = new Personal();
        Adress adress = new Adress();

        try (Connection conn = dbConnect.getConnection()) {
            try {
                String query = "SELECT * FROM personal WHERE dni = ? OR UPPER(surname) REGEXP CONCAT('^', ?)";
                statement = conn.prepareStatement(query);
                statement.setString(1, workerInfo);
                statement.setString(2, workerInfo);

                resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    worker.setId(resultSet.getInt("id_personal"));
                    worker.setName(resultSet.getString("name"));
                    worker.setSurname(resultSet.getString("surname"));
                    worker.setDni(resultSet.getString("dni"));
                    worker.setDob(resultSet.getString("dob"));
                    worker.setCharge(resultSet.getString("charge"));
                    worker.setEmail(resultSet.getString("email"));
                    worker.setPhone(resultSet.getString("phone"));
                    worker.setDoa(resultSet.getString("doa"));
                }

            } catch (SQLException e) {
                System.out.println("Error en las operaciones a base de datos.");
                e.printStackTrace(System.out);
            }
            try {
                String query = "SELECT * FROM direccion WHERE IDpersonal = ?";
                statement = conn.prepareStatement(query);
                statement.setInt(1, worker.getId());

                resultSet = statement.executeQuery();


                if (resultSet != null) {
                    while (resultSet.next()) {
                        adress.setStreet(resultSet.getString("calle"));
                        adress.setCardinal(resultSet.getString("cardinal"));
                        adress.setNumber(resultSet.getString("numeracion"));
                        adress.setCity(resultSet.getString("departamento"));
                        adress.setState(resultSet.getString("provincia"));
                        adress.setCountry(resultSet.getString("pais"));
                        adress.setCp(resultSet.getString("codigopostal"));
                    }
                }

            } catch (SQLException e) {
                System.out.println("Error en las operaciones a base de datos.");
                e.printStackTrace(System.out);
            }
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }

        worker.setAddress(adress);
        return worker;
    }

    public static ArrayList<Personal> getAllRegisters() {
        ConnectionDB dbConnect = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        ArrayList<Personal> workersList = new ArrayList<Personal>();

        try (Connection conn = dbConnect.getConnection()) {
            String query = "SELECT * FROM personal";
            statement = conn.prepareStatement(query);
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Personal worker = new Personal();
                worker.setId(resultSet.getInt("id_personal"));
                worker.setName(resultSet.getString("name"));
                worker.setSurname(resultSet.getString("surname"));
                worker.setDni(resultSet.getString("dni"));
                worker.setDob(resultSet.getString("dob"));
                worker.setCharge(resultSet.getString("charge"));
                worker.setEmail(resultSet.getString("email"));
                worker.setPhone(resultSet.getString("phone"));
                worker.setDoa(resultSet.getString("doa"));
                workersList.add(worker);
            }

            for (Personal worker : workersList) {
                try {
                    String queryAdress = "SELECT * FROM direccion WHERE IDpersonal = ?";
                    statement = conn.prepareStatement(queryAdress);
                    statement.setInt(1, worker.getId());

                    resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        Adress adress = new Adress();

                        adress.setStreet(resultSet.getString("calle"));
                        adress.setCardinal(resultSet.getString("cardinal"));
                        adress.setNumber(resultSet.getString("numeracion"));
                        adress.setCity(resultSet.getString("departamento"));
                        adress.setState(resultSet.getString("provincia"));
                        adress.setCountry(resultSet.getString("pais"));
                        adress.setCp(resultSet.getString("codigopostal"));

                        worker.setAddress(adress);
                    }

                } catch (SQLException e) {
                    System.out.println("Error en las operaciones a base de datos.");
                    e.printStackTrace(System.out);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
        return workersList;
    }
}