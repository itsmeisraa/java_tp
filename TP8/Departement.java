import java.io.*;

public class Departement implements Serializable {
    String departmentName;
    DepartmentType type;

    enum DepartmentType {
        rh,
        si
    }
    class Employee implements Serializable {
        int id;
        String name;
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String toString() {
            return name + " " + id;
        }
    }
    public static void main(String[] args) {
        try {
            Departement d = new Departement();
            d.departmentName = "CS";
            d.type = DepartmentType.si;
            Departement.Employee e =
                    d.new Employee("Ali", 1);
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("department.ser")
                    );
            out.writeObject(d);
            out.writeObject(e);
            out.close();
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("department.ser")
                    );
            Departement d2 =
                    (Departement) in.readObject();
            Departement.Employee e2 =
                    (Departement.Employee)
                            in.readObject();
            in.close();
            System.out.println(d2.departmentName);
            System.out.println(d2.type);
            System.out.println(e2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}