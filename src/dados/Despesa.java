/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author alvesrc
 */
public class Despesa {
    private float valor;
    private String desc;
    private int dia, mes, ano;
    
    public Despesa(float valor, String desc, int dia, int mes, int ano) {
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
    
    public String gerarSQL(){
        String sql="";
        sql = this.dia+ " ," +this.mes+ " ," +this.ano+ " ,' "+ this.desc+"', " + this.valor + ", ";
        return sql;
    }
}
