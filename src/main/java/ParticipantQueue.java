import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ParticipantQueue implements Iterator<Participant> {
    PriorityQueue<Participant> drawQueue;


    public ParticipantQueue(Collection<Participant> list) {
            this.drawQueue = new PriorityQueue<>(list.size());
            this.drawQueue.addAll(list);
    }

    @Override
    public boolean hasNext() {
        return !drawQueue.isEmpty();
    }

    @Override
    public Participant next() {
        return drawQueue.remove();
    }
}
