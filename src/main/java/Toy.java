/**
 * Класс, призванный хранить информацию об игрушке. Сравнивается по весу,
 * имеет скрытый показатель относительного шанса в текущем розыгрыше, по которому сравниваются игрушки в очереди
 * Обязательные аргументы конструкторов:
 * chanceWeight - вес вероятности, может быть вещественным числом
 * поле name - наименование игрушки
 * Необязательные:
 * id - по умолчанию присваивается id, равный общему числу уникальных игрушек-1
 * quantity - количество, по умолчанию ставится -1, отрицательные числа показывают, что игрушка не может закончиться
 */
public class Toy implements Comparable<Toy>{
    int id;
    static int idCount;
    double chanceWeight;
    String name;
    int quantity;

    private float chance;

    public Toy(int id, double chanceWeight, String name, int quantity) {
        this.id = id;
        this.chanceWeight = chanceWeight;
        this.name = name;
        this.quantity = quantity;
    }

    public Toy(double chanceWeight, String name, int quantity) {
        this(idCount++,chanceWeight,name,quantity);
    }

    public Toy(double chanceWeight, String name) {
        this(idCount++,chanceWeight,name,-1);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  String.format("id:%d %s, вероятность %.1f, кол-во %d ",this.id, this.name,this.chanceWeight,this.quantity );
    }

    public float getChance() {
        return chance;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }

    @Override
    public int compareTo(Toy o) {
        if(o.chance == this.chance){
            return 0;
        }
        return this.chance < o.chance ? -1 : 1;
    }
}
