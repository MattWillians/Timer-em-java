package timer;

public class Time {

    private int hora;
    private int minuto;
    private int segundo;

     public int getHora() {
        return hora;
    }

    public void setHora(int hora){
        if (hora > 0 && hora < 23){

            this.hora = hora;
        } else {
            
            System.out.println("Horario invalido!");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto <= 59 && minuto >= 0){
            this.minuto = minuto;
        } else {
            System.out.println("Minuto Não existe");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo <= 59 && segundo >= 0){
            this.segundo = segundo;
        } else {
            System.out.println("Segundo Não existe");
        }    }

        public void info(){
            System.out.printf("Horario atual: %d : %d : %d", hora,minuto,segundo);
        }
    
}
