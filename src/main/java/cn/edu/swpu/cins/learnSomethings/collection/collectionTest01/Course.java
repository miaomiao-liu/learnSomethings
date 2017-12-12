package cn.edu.swpu.cins.learnSomethings.collection.collectionTest01;

/**
 * Created by miaomiao on 17-7-21.
 */
public class Course {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     *
     *List集合的contains方法：是根据equals为基础来判断集合中是否包含某个对象
     * Set集合的contains方法：是根据HashCode和equals共同判断的
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Course))
            return false;
        Course course = (Course) obj;
        if(this.getName() == null){
            if(course.getName()==null)
                return true;
            return false;
        }
        return this.getName().equals(course.getName());
    }
}
