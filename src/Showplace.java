public class Showplace {
    private String name;
    private Double time;
    private Integer importance;

    public Showplace(String name, Double time, Integer importance) {
        this.name = name;
        this.time = time;
        this.importance = importance;
    }

    public Double getTime() {
        return this.time;
    }

    public Double valuePerTime(){
        return this.importance / this.time;
    }

    @Override
    public String toString() {
        return "Showplace{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", importance=" + importance +
                '}';
    }
}
