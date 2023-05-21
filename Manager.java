package WorkersProject;

public class Manager extends Employee{

    private String authority;

    public Manager(int id, String name, String role,int salary,String authority){
        super(id, name, role, salary);
        this.authority= authority;
    }

    

    @Override
    public void showInfos() {
        // TODO Auto-generated method stub
        super.showInfos();
        System.out.println("Manager's authorities: " + authority);
    }

    public void giveAuthority(String newAuthority){
        System.out.println(newAuthority + " given to manager " + getName());
    }



    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

   
    
    
}
