public class Test {
    public static String[] number1 = {"(84)-(0978489648)","(16)-(0978489568)","(00)-(0978444648)"};
    public static String[] number2 = {"(a4)-(0978489648)","(16)-(097849568)","(00)-(1978444648)","(0)-(0978444648)"};

    public static void main(String[] args) {
        ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();
        for (String number:number1
             ) {
            System.out.println("Number: " + number +" is " + validateNumberPhone.validate(number));

        }
        for (String number:number2
        ) {
            System.out.println("Number: " + number +" is " + validateNumberPhone.validate(number));

        }
    }
}
