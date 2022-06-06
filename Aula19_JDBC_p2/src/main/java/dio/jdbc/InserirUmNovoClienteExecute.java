package dio.jdbc;

import dio.jdbc.configuration.DB;
import dio.jdbc.dao.ClienteDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class InserirUmNovoClienteExecute {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DB.getConnection()){
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            clienteDAO.inserirNovoCliente("Marcela");
        }
    }
}
