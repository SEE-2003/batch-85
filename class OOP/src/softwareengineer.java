class softwareengineer {

    // Attributes
    private String name = "Akshan";
    private String programming_lanuage_expertise = "JAVA";
    private String favourite_coding_project = "FOODORDERINGSYSTEM";


    // Constructor
    softwareengineer(String name, String programming_lanuage_expertise, String favourite_coding_project) {
        this.name = name;
        this.programming_lanuage_expertise = programming_lanuage_expertise;
        this.favourite_coding_project = favourite_coding_project;
    }

    // Method
    public void coding() {
        System.out.println("Welcome to world of software engineering");
        System.out.println(name + programming_lanuage_expertise + favourite_coding_project);
    }

    public static void main(String[] args) {

        softwareengineer Akshan = new softwareengineer("Clark", "Java", "health department system");
        softwareengineer Sanojan = new softwareengineer("sdsd", "sas","ssa");


    }
}