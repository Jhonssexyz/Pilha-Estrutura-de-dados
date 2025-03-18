public class No {

    No proximo;
    String mes;

    No(String mes){
        this.proximo = null;
        this.mes = mes;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
        
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    }


