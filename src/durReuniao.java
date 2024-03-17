import java.time.LocalTime;         //implementa hora-minuto-segundo
import java.time.temporal.ChronoUnit;       //implementa manipulacao data/horaiii
import java.util.Scanner;       //entrada do usuario

public class durReuniao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);         //entrada do usuario

        System.out.println("Digite o horário de início da reunião (formato HH:MM):");
            String inicioTemp = entrada.nextLine();

        System.out.println("Digite o horário de término da reunião (formato HH:MM):");
            String fimTemp = entrada.nextLine();
        entrada.close();
        
        LocalTime iniciarTemp = LocalTime.parse(inicioTemp);        // Parse do horário de início e término
        LocalTime termTemp = LocalTime.parse(fimTemp);

        // Calcula a duração da reunião
        long minutes = ChronoUnit.MINUTES.between(iniciarTemp, termTemp);          //intervalo de tempo
            long hours = minutes / 60;
            minutes = minutes % 60;
        System.out.println("A reunião durou " + hours + " horas e " + minutes + " minutos.");
    }
}
