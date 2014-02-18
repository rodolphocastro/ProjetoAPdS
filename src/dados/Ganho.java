/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author alvesrc
 */
public class Ganho {
    private float valor;
    private String desc;
    private int dia, mes, ano;

    public Ganho(float valor, String desc, int dia, int mes, int ano) {
        this.valor = valor;
        this.desc = desc;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public String getDesc() {
        return desc;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    /**
     * Método para gerar um comando SQL contendo dia, mes, ano, desc e valor. Lembre-se de adicionar o usuário
     * @return String para os valores SQL a serem inseridos, só faltando o login.
     */
    public String gerarSQL(){
        String sql = "";
        sql = this.dia + ", " + this.mes + ", " + this.ano + ", '" + this.desc + "', " + this.valor + ", ";
        return sql;
    }
}
