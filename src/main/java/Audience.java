import lombok.Getter;

/**
 * Created by yhkwon on 2020/09/15
 */

@Getter
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
