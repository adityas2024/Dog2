public class Owner {
    String name;
    int age;
    String address;
    String phone;
    Dog X;

    public Owner(String N, String A, String P, int age){

        this.name = N;
        this.address = A;
        this.phone = P;
        this.age = age;
    }
    public String toString(){
        return "The name of the owner is " + name +
                ", with address " + address +
                ", with phone number " + phone +
                " and is " + age + " years old." +
                "The owner's dog is " + X.toString();

    }

}

