package main.java.br.com.juan.dao.factory;

import main.java.br.com.juan.domain.Produto;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProdutoFactory {


    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        prod.setAno(rs.getInt("ANO"));
        prod.setCor(rs.getString("COR"));
        return prod;
    }
}