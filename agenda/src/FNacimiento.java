<<<<<<< Updated upstream:agenda/src/FNacimiento.java
public class FNacimiento {
    int dia;
    int mes;
    int ano;

    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public void Ano(int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

=======
public enum Fecha {
    ENERO(31, 1), FEBRERO(28, 2), MARZO(31, 3), ABRIL(30, 4),
    MAYO(31, 5), JUNIO(30, 6), JULIO(31, 7), AGOSTO(31, 8),
    SEPTIEMBRE(30, 9), OCTUBRE(31, 10), NOVIEMBRE(30, 11), DICIEMBRE(31, 12);

    private final int dias;
    private final int mes;

    Fecha(int dias, int mes) {
        this.dias = dias;
        this.mes = mes;
    }
>>>>>>> Stashed changes:agenda/src/Fecha.java

    public int getDias() {
        return dias;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d", dias, mes);
    }
}

