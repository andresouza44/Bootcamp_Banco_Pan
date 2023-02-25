package Listas;

public class TemMedia {
    private String mes;
    private Double temperatura;

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public TemMedia(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "TemMedia{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
