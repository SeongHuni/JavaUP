package Modified3;

public class Students implements Comparable<Students> {
    private String name;
    private String address;
    private String phoneNumber;

    public Students(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int compareTo(Students o) {
        int compare = name.compareTo(o.name);
        if (compare == 0) {
            compare = address.compareTo(o.address);
            if (compare == 0) {
                return phoneNumber.compareTo(o.phoneNumber);
            }
        }
        return compare;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', address='" + address + "', phoneNumber='" + phoneNumber + "'}";
    }
}
