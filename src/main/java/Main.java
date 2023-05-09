import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //инициализация списка игрушек разными методами
        ToyList toys1 = new ToyList();
        toys1.addToy(new Toy(25,"Плюшевый мишка"));
        toys1.addToyList(List.of(
                new Toy(5,"Велосипед",3),
                new Toy(10,"Паззл",5),
                new Toy(10,"Слинки",10)
        ));
        System.out.println(toys1);
        //инициализация очереди участников
        ParticipantQueue pq = new ParticipantQueue(List.of(
                new Participant("Женя"),
                new Participant("Петя"),
                new Participant("Света"),
                new Participant("Галя"),
                new Participant("Женя"),
                new Participant("Вася"),
                new Participant("Данила"),
                new Participant("Денис"),
                new Participant("Катя"),
                new Participant("Оля")
        ));
         /* //сам розыгрыш
        Raffle raf = new Raffle(pq,toys1);
        System.out.println(raf.currentToys.toString());
        raf.runRaffle();

          */
        //toys1.saveToFile();


        System.out.println("\nРозыгрыш с вероятностью проиграть\n");
        ParticipantQueue pqloss = new ParticipantQueue();
        for (int i = 1; i <= 10 ; i++){
            pqloss.addParticipant(new Participant());
        }
        Raffle raf2 = new Raffle(pqloss,toys1);
        raf2.setLossWeight(30);
        System.out.println(raf2.currentToys.toString());
        raf2.runRaffle();
    }

}
