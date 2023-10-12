package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel {

    private List<Fornecedor> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "Email", "Código (5 numeros)", "Marca"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    // pega quantidade de linhas da tabela
    @Override
    public int getRowCount() {
        return dados.size();
    }

    // pega quantidade de colunas da tabela
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    // pega o objeto clicado
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getEmail();
            case 2:
                return dados.get(linha).getCodForn();
            case 3:
                return dados.get (linha).getMarca();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch (coluna)
        {
            case 0:
                dados.get(linha).setNome( (String) valor);
                break;
            case 1:
                dados.get(linha).setEmail( (String) valor);
                break;
            case 2:
                dados.get(linha).setCodForn(  Integer.parseInt((String) valor));
                break;
            case 3:
                dados.get (linha).setMarca( (String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
        
    }

    public void adicionaLinha(Fornecedor p) {
        // insere o produto p na coleção dados
        this.dados.add(p);
        // atualiza a tabela quando houver atualização de dados
        this.fireTableDataChanged();
    }

    public void removeLinha(int linha) {
        // remove o produto p da coleção dados
        this.dados.remove(linha);
        // atualiza a tabela removendo a linha escolhida
        this.fireTableRowsDeleted(linha, linha);
    }
    
    // metodo criado para atulização dos TextFields quando usuario clicar 
    // em uma linha da tabela
    public Fornecedor getDados (int linha){
        // retorna do produto que está na linha indicada
        return dados.get(linha);
    }

}
