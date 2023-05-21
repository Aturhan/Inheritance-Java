package WorkersProject;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tester for Empleyees Project!");
        System.out.println("****************************************");
        System.out.println("For Manager operations enter 1 || for Developer operations enter 2 || for Quit from program enter 0");
        System.out.println("*****************************************************************************************************");

        while(true){
            System.out.println("Please select one of the above operations: ");
            int operations = scan.nextInt();
            if(operations == 0){
                System.out.println("Quiting program");
                break;
             }
             else if(operations == 1){
                System.out.println("Please select a manager operation: 1 gives new authority || 2 shows infos || 0 quit from program");
                System.out.println("************************************************************************************************");
                while(true){
                    System.out.println("Select one of the above operations: ");
                    int manager_op = scan.nextInt();
                    if(manager_op == 0){
                        System.out.println("Quiting from manager program!");
                        break;
                    }else if(manager_op == 1){
                        Manager manager = new Manager(101,"Tyrion LANNISTER","Manager",5000,"Process of Projects");
                        System.out.print("Please enter an  authority:");
                        scan.nextLine();
                        String auth = scan.nextLine();
                        manager.giveAuthority(auth);
                    }else if(manager_op == 2){
                        Manager manager = new Manager(101,"Tyrion LANNISTER","Manager",5000,"Process of Projects");
                        manager.showInfos();
                    }
                    else{
                        System.out.println("Invalid operation!");
                    }
                }

             }
             else if(operations == 2){
                System.out.println("Please select a developer operation: 1 sends a new task || 2 shows infos || 0 quit from program");
                System.out.println("************************************************************************************************");
                while(true){
                    System.out.println("Select one of the above operations:");
                    int developer_op = scan.nextInt();
                    if(developer_op == 0){
                        System.out.println("Quiting from developer program");
                        break;
                    }else if(developer_op == 1){
                        Developer developer = new Developer(12,"Arya STARK","Developer",3000,"Senior");
                        System.out.print("Please give a new task: ");
                        scan.nextLine();
                        String task = scan.nextLine();
                        developer.sendTask(task);
                    }
                    else if(developer_op == 2){
                        Developer developer = new Developer(12,"Arya STARK","Developer",3000,"Senior");
                        developer.showInfos();
                    }
                    else{
                        System.out.println("Invalid operation!");
                    }
                }

             }else{
                System.out.println("Invalid operation");
             }

        }
    }
}
