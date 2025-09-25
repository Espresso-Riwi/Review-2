import java.util.*;

public class Main {

    public static void main(String[] args) {
        activity14();

    }

    static public void activity1(){
        Engine engine = new Engine();
        Fan fan = new Fan();

        ArrayList<Operable> operables = new ArrayList<>();
        operables.add(engine); operables.add(fan);

        for (Operable o : operables){
            o.start();
            o.stop();

        }
    }

    static public void activity2(){
        Multiplication m = new Multiplication();
        Addition a = new Addition();

        ArrayList<Calculable> calculables = new ArrayList<>();
        calculables.add(m); calculables.add(a);

        for (Calculable c : calculables){
            System.out.println(c.calculate(4,3));
        }
    }

    static public void activity3(){
        Square square = new Square();
        Circle circle = new Circle();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square); shapes.add(circle);

        for (Shape s : shapes){
            System.out.println(s.area(10));
        }
    }

    static public void activity4(){
        CsvProcess csvProcess = new CsvProcess();
        JsonProcess jsonProcess = new JsonProcess();
        csvProcess.execute();
        jsonProcess.execute();
    }

    static public void activity5(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "Water", 2500.0));
        products.add(new Product("2", "Chocolate", 2500.0));
        products.add(new Product("3", "Chips", 2500.0));
        products.add(new Product("4", "Coca-cola", 2500.0));
        products.add(new Product("5", "Beer", 2500.0));

        products.remove(3);
        products.getFirst().setName("Wootah");

        for (Product p : products){
            System.out.println("ID: "+p.getId()+"\nName: "+p.getName()+"\nPrice: "+p.getPrice()+"\n");
        }
    }

    static public void activity6(){
        ArrayList<String> words = new ArrayList<>();
        HashMap<String,Integer> wordCounter = new HashMap<>();

        words.add("Hello");
        words.add("Hi");
        words.add("Depends");
        words.add("Hello");
        words.add("Hello");
        words.add("Depends");
        words.add("Hello");

        int times;

        for (int i = 0; i < words.size(); i++) {
            times = 0;
            for (String word : words) {
                if (words.get(i).equals(word)) {
                    times += 1;
                }
                wordCounter.put(words.get(i), times);
            }
        }

        wordCounter.forEach((k, v) -> {
            if (v > 2){
                System.out.println("Word: "+k+"*"+" Times: "+v);
            }else {
                System.out.println("Word: "+k+" Times: "+v);
            }
        });
    }

    static public void activity7(){
        HashMap<String, User> userHashMap = new HashMap<>();
        User u1 = new User("1", "Guille");
        User u2 = new User("2", "Alex");
        userHashMap.put(u1.key(), u1);
        userHashMap.put(u2.key(), u2);

        userHashMap.forEach((k, v) -> System.out.println(k+"->"+v.getName()));

        userHashMap.get(u1.key());
        userHashMap.get(u2.key()).setName("Alex C");

        userHashMap.remove(u1.key());
        userHashMap.forEach((k, v) -> System.out.println(k+"->"+v.getName()));
    }

    static public void activity8(){
        ArrayList<Document> documents = new ArrayList<>();
        Book b1 = new Book("1984", 102);
        Magazine m1 = new Magazine("Sports", 84);

        documents.add(b1); documents.add(m1);

        for (Document d :  documents){
            if (d.pages() >= 100){
                System.out.println("Title: "+d.title+"\nPages: "+d.pages());
            }
        }
    }

    static public void activity9(){
        ArrayList<Formatter> formatters = new ArrayList<>();
        String name = "juAn";

        formatters.add(new UpperCase());
        formatters.add(new LowerCase());
        formatters.add(new TitleCase());

        for (Formatter f : formatters){
            System.out.println(f.format(name));
        }
    }

    static public void activity10(){
        HashMap<String, Runnable> router = new HashMap<>();
        router.put("/home", new Runnable() {
            @Override
            public void run() {
                System.out.println("Going to home");
            }
        });

        router.put("/about", new Runnable() {
            @Override
            public void run() {
                System.out.println("Going to about");
            }
        });

        router.put("/contact", new Runnable() {
            @Override
            public void run() {
                System.out.println("Going to contact");
            }
        });

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a route: ");
        String route = sc.nextLine();

        if (router.containsKey("/"+route)){
            router.get("/"+route).run();
        }else{
            System.out.println("Error 404");
        }
    }

    static public void activity11(){
        ArrayList<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee();
        HourlyEmployee h1 = new HourlyEmployee(6);

        employees.add(f1); employees.add(h1);

        for (Employee e : employees){
            System.out.println(e.monthlySalary());
        }
    }

    static public void activity12(){
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        dictionary.put("Hola", new ArrayList<>());

        dictionary.get("Hola").add("Hi");
        dictionary.get("Hola").add("Bonjour");
        dictionary.get("Hola").add("Ciao");

        dictionary.put("Adios", new ArrayList<>());

        dictionary.get("Adios").add("Bye");
        dictionary.get("Adios").add("Au revoir");
        dictionary.get("Adios").add("Addio");

        dictionary.put("Hambre", new ArrayList<>());

        dictionary.get("Hambre").add("Hunger");
        dictionary.get("Hambre").add("Faim");
        dictionary.get("Hambre").add("Fame");

        for (Map.Entry<String, ArrayList<String>> word : dictionary.entrySet()){
            System.out.print("\n"+word.getKey()+" : ");
            for (int i = 0; i < word.getValue().size(); i++) {
                if (word.getValue().size() - 1 == i){
                    System.out.print(word.getValue().get(i));
                }else{
                    System.out.print(word.getValue().get(i)+", ");
                }
            }
        }
    }

    static public void activity13(){
        StudentRepo studentRepo = new StudentRepo();
        Student s1 = new Student("123", "Carlos");

        studentRepo.save(s1);
        System.out.println(studentRepo.findById(s1.id).name);
        studentRepo.delete(s1.id);
    }

    static public void activity14(){
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Depends", 1));
        tasks.add(new Task("2", "Si", 9));
        tasks.add(new Task("3", "No", 6));
        tasks.add(new Task("4", "Who", 5));
        tasks.add(new Task("5", "Yeah", 7));
        tasks.add(new Task("6", "Right", 9));

        ArrayList<Task> tasks2 = new ArrayList<>();

        for (Task t : tasks){
            if (t.getPriority() >= 3){
                tasks2.add(t);
            }
        }

        tasks2.sort(Comparator.comparingInt(Task::getPriority).reversed());
        for (Task t : tasks2){
            System.out.println(t.getPriority());
        }
    }

    static public void activity15(){

    }
}
