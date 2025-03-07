Public class Registrant {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String birthDate;
    private String gender;
    private String school;
    private String major_1;
    private String major_2;

    public void register(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectMajor(String major1, String major2) {
        System.out.println("Selecting Majors");
    }

    public void getResult() {
        System.out.println("Getting Result");
    }

    public void cancel() {
        System.out.println("Cancelling Registration");
    }

    public void pay() {
        System.out.println("Paying for Registration");
    }

    public void printReceipt() {
        System.out.println("Printing Receipt");
    }
}
