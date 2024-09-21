import java.io.*;

class Employee implements Serializable {
    // serialVersionUID for version control
    private static final long serialVersionUID = 1L;

    String name;
    int age;
    transient String password; // 'transient' keyword prevents serialization of this field

    // Constructor
    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, "password123");

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Serialization: Employee object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialization: Employee object has been deserialized.");
            System.out.println("Deserialized Employee: " + deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
