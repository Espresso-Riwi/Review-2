import java.util.HashMap;

class StudentRepo implements Repo<Student>{

    HashMap<String, Student> studentHashMap = new HashMap<>();

    @Override
    public void save(Student student) {
        studentHashMap.put(student.id, student);
    }

    @Override
    public Student findById(String id) {
        return studentHashMap.get(id);
    }

    @Override
    public void delete(String id) {
        studentHashMap.remove(id);
    }
}