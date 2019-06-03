class Name {
 String firstname;
 String lastname;
public Name(String newFirstname, String newLastname) {
firstname = newFirstname;
 lastname = newLastname;
}
public String getFirstname() {
return firstname;
}
 public String getLastname() {
return lastname;
}
 public String getFirstLast() {
return firstname + " " + lastname;
}}
class Address {
String street;
String city;
String state;
String zip;
public Address(String newStreet, String newCity, String newState, String newZip) {
 street = newStreet;
city = newCity;
state = newState;
zip = newZip;
}
public String getStreet() {
return street; }
public String getCity() {
return city;}
public String getState() {
return state;}
public String getZip() {
return zip; }
 public String getFullAddress() {
 return street + "\n" + city + ", " + state + ", " + zip; }
}
class Employee {
 //fields
 private Name myName;
 private Address myAddress;
 private String AFM;
//constructor
public Employee(Name n, Address a, String newAFM) {
 myName = n;
 myAddress = a;
 AFM = newAFM;
 }
 public Name getName() {
 return myName; }
public Address getAddress() {
 return myAddress; }
 public String getAFM() {
 return AFM; }
}
class TestEmployee {
 public static void main(String[] args) {
 Name eponymia = new Name("Nikos", "Nikas");
 Address dieythinsi = new Address("Tsimiski 35", "Thessaloniki", "Greece", "56 700");
 String AFM = "123456789";
 Employee theEmployee = new Employee(eponymia, dieythinsi, AFM);
 System.out.println(theEmployee.getName().getFirstLast() + "\n" +
 theEmployee.getAddress().getFullAddress() + "\n" + theEmployee.getAFM());
}}