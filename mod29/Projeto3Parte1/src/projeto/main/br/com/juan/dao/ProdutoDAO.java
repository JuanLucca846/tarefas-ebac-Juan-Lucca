package projeto.main.br.com.juan.dao;

import projeto.main.br.com.juan.domain.Cliente;
import projeto.main.br.com.juan.domain.Produto;
import projeto.main.br.com.juan.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO_2 (ID, CODIGO, NOME, COR, QUANTIDADE, VALOR) VALUES (nextval('SQ_PRODUTO_2'), ?, ?, ?, ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            stm.setString(2, produto.getNome());
            stm.setString(3, produto.getCor());
            stm.setInt(4, produto.getQuantidade());
            stm.setDouble(5, produto.getValor());
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Produto consultar(String codigo) throws Exception {
        Connection connection = null;
        ResultSet rs = null;
        PreparedStatement stm = null;
        Produto produto = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO_2 WHERE codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigo);
            rs = stm.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString(("nome")));
                produto.setCor(rs.getString("cor"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getDouble("valor"));
            }
            return produto;
        }catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO_2 WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        ResultSet rs = null;
        PreparedStatement stm = null;
        List<Produto> produtos = new ArrayList<>();
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO_2";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setCor(rs.getString("cor"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getDouble("valor"));
                produtos.add(produto);
            }
            return produtos;
        }catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE TB_PRODUTO_2 SET NOME = ?, COR = ?, QUANTIDADE = ?, VALOR = ? WHERE CODIGO = ? ";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getCor());
            stm.setInt(3, produto.getQuantidade());
            stm.setDouble(4, produto.getValor());
            stm.setString(5, produto.getCodigo());
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }
    }

