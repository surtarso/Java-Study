package dio.jdbc;

import dio.jdbc.configuration.DB;
import dio.jdbc.dao.ClienteDAO;
import dio.jdbc.entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BuscarTodosClientesExecute {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DB.getConnection()){
            ClienteDAO clienteDAO = new ClienteDAO(connection); //instancia a conexao no DAO
            List<Cliente> clientes = clienteDAO.buscarTodosOsClientes();
            System.out.println(clientes);
        }
    }
}
