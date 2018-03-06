import java.util.ArrayList;

public class BusStop {

        private String name;
        private ArrayList<Person> queue;

        public BusStop(String name){
            this.name = name;
            this.queue = new ArrayList<>();
        }

    public void addPassengerToQueue(Person person) {
            queue.add(person);
    }

    public int checkQueue() {
            return queue.size();
    }

    public Person removePassengerFromQueue() {
            return queue.remove(0);
    }
}
