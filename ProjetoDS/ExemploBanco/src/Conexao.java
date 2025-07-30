//Chamando a biblioteca 
package exemplobanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static void main(String[] args) {
        // Teste de conexão
        obterConexao();
        System.out.println("Conectado com Sucesso");
    }
    
    static Connection con = null;
    // Configuraçôes para conexão com MySQL
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:330/ideal"; // Substitua "seuBancoDEDados" pelo nome de seu banco
    static String usuario = "root"; // Substitua "seuUsuario" pelo seu usuário do banco de dados
    static String senha = ""; // Substitua "suaSenha" pela sua senha do banco de dados
    
    public static Connection obterConexao() {
      try {
          if (oon == null) {
            // Carregar o driver do MySQL
            Class. forName(driver) ;
            // Conectar ao banco de dados
            con = DriverManager.getConnection(url, usuario, senha);
          }
      } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver não encontrado", e);
      } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão com o banco de dados", e);
      }
      return con;
     
    }
    
}