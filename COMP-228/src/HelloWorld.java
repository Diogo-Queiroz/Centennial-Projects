class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello worlds!!");

        Student Diogo = new Student();
        Diogo.setName("Diogo Queiroz");
        Diogo.setId(301020);

        Student Lucas = new Student();
        Lucas.setName("Lucas Bitten");
        Lucas.setId(301021);

        Student Bernardo = new Student();
        Bernardo.setName("Bernardo Castro");
        Bernardo.setId(301022);

        System.out.println(Diogo.getName());
        System.out.println(Diogo.getId());
        System.out.println(Lucas.getName());
        System.out.println(Bernardo.getName());
    }
}

class Student {
    private String name;
    private int id;

    void setName(String name) {
        this.name = name;
    }
    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }
    int getId() {
        return id;
    }
}