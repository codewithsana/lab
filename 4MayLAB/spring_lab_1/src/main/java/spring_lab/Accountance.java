package spring_lab;


import org.springframework.stereotype.Component;

@Component
public class Accountance implements Employee {
 
    public void doWork() {
        System.out.println("Accountant is doing the books.");
    }
}

