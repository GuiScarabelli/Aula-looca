package Entidades;

public class Computador {
    private String sistemaOperacional;
    private Long memoriaUso;
    private Long discoUso;

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Long getMemoriaUso() {
        return memoriaUso;
    }

    public void setMemoriaUso(Long memoriaUso) {
        this.memoriaUso = memoriaUso;
    }

    public Long getDiscoUso() {
        return discoUso;
    }

    public void setDiscoUso(Long discoUso) {
        this.discoUso = discoUso;
    }



}
