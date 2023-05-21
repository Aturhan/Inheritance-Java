package WorkersProject;

public class Developer extends Employee {
    private String level;

    public Developer(int id, String name, String role, int salary, String level){
        super(id, name, role, salary);
        this.level = level;
    }

    

    @Override
    public void showInfos() {
        // TODO Auto-generated method stub
        super.showInfos();
        System.out.println("Developer level: " + level);
    }

    public void sendTask(String task){
        System.out.println(task + " Sended to " + getName());
    }



    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    

    
}
