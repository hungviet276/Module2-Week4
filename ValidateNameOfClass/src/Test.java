public class Test {
    public static String[] test1 = {"C0318G","A5648H","P6852I"};
    public static String[] test2 = {"M0318G"," P0323A","C456G","A*456I","P6582F"};

    public static void main(String[] args) {
        ValidateNameOfClass validateNameOfClass = new ValidateNameOfClass();
        for (String name:test1
             ) {
            System.out.println("Name: " + name +" is: " + validateNameOfClass.validate(name));

        }
        for (String name:test2
        ) {
            System.out.println("Name: " + name +" is: " + validateNameOfClass.validate(name));

        }
    }
}
