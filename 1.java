import java.util.Scanner;

class Staff {
    String StaffId, Name, Phone, Salary;
    Scanner input = new Scanner(System.in);

    void read() {
        System.out.print("Enter Staff Id: ");
        StaffId = input.nextLine();
        System.out.print("Enter Name: ");
        Name = input.nextLine();
        System.out.print("Enter Phone: ");
        Phone = input.nextLine();
        System.out.print("Enter Salary: ");
        Salary = input.nextLine();
    }

    void display() {
        System.out.printf("%-15s: %s\n", "STAFFID", StaffId);
        System.out.printf("%-15s: %s\n", "NAME", Name);
        System.out.printf("%-15s: %s\n", "PHONE", Phone);
        System.out.printf("%-15s: %s\n", "SALARY", Salary);
    }
}

class Teaching extends Staff {
    String Domain, Publication;

    void read() {
        super.read();
        System.out.print("Enter Domain: ");
        Domain = input.nextLine();
        System.out.print("Enter Publication: ");
        Publication = input.nextLine();
    }

    void display() {
        super.display();
        System.out.printf("%-15s: %s\n", "DOMAIN", Domain);
        System.out.printf("%-15s: %s\n", "PUBLICATION", Publication);
    }
}

class Technical extends Staff {
    String Skills;

    void read() {
        super.read();
        System.out.print("Enter Skills: ");
        Skills = input.nextLine();
    }

    void display() {
        super.display();
        System.out.printf("%-15s: %s\n", "SKILLS", Skills);
    }
}

class Contract extends Staff {
    String Period;

    void read() {
        super.read();
        System.out.print("Enter Period: ");
        Period = input.nextLine();
    }

    void display() {
        super.display();
        System.out.printf("%-15s: %s\n", "PERIOD", Period);
    }
}

class Staffdetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of staff details to be created: ");
        int n = input.nextInt();
        input.nextLine();  // Consume the newline character

        Teaching[] steach = new Teaching[n];
        Technical[] stech = new Technical[n];
        Contract[] scon = new Contract[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Teaching staff information:");
            steach[i] = new Teaching();
            steach[i].read();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Technical staff information:");
            stech[i] = new Technical();
            stech[i].read();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Contract staff information:");
            scon[i] = new Contract();
            scon[i].read();
        }

        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("\n TEACHING STAFF DETAILS: \n");
        for (int i = 0; i < n; i++) {
            steach[i].display();
        }
        System.out.println();
        System.out.println("\n TECHNICAL STAFF DETAILS: \n");
        for (int i = 0; i < n; i++) {
            stech[i].display();
        }
        System.out.println();
        System.out.println("\n CONTRACT STAFF DETAILS: \n");
        for (int i = 0; i < n; i++) {
            scon[i].display();
        }

        input.close();
    }
}
