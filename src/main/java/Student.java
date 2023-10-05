public class Student {
    private long id;
    private String name;
    private Clazz lopHoc;

    public Student(long id, String name, Clazz lopHoc) {
        this.id = id;
        this.name = name;
        this.lopHoc = lopHoc;
    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clazz getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(Clazz lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lopHoc=" + lopHoc +
                '}';
    }


}
